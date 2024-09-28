package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdwal extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton withdrawal,back;
    Withdwal(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon  i3 =new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1=new JLabel("MAXIMUM WITHDRAWAL IS RS. 10,000");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        l3.add(label1);

        JLabel label2=new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(460,220,400,35);
        l3.add(label2);

        textField=new JTextField();
        textField.setBounds(460,260,320,25);
        textField.setForeground(Color.WHITE);
        textField.setBackground(new Color(20, 125, 185));
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        withdrawal=new JButton("WITHDRAWAL");
        withdrawal.setBounds(700,362,150,35);
        withdrawal.setBackground(new Color(20, 125, 185));
        withdrawal.setForeground(Color.WHITE);
        withdrawal.addActionListener(this);
        l3.add(withdrawal);

        back=new JButton("Back");
        back.setBounds(700,406,150,35);
        back.setBackground(new Color(20, 125, 185));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        l3.add(back);



        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

               if(e.getSource()==withdrawal) {
                   try {
                       String amount = textField.getText();
                       Date date = new Date();
                       if (textField.getText().equals("")) {
                           JOptionPane.showMessageDialog(null, "Please enter the Amount you want to Withdrawal");
                       } else {
                           Con c = new Con();
                           ResultSet resultSet = c.statement.executeQuery("select * from bank where pin='" + pin + "'");
                           int balance = 0;
                           while (resultSet.next()) {
                               if (resultSet.getString("type").equals("Deposit")) {
                                   balance += Integer.parseInt(resultSet.getString("amount"));
                               } else {
                                   balance -= Integer.parseInt(resultSet.getString("amount"));
                               }
                           }
                           if (balance < Integer.parseInt(amount)) {
                               JOptionPane.showMessageDialog(null, "Insufficient balance");
                               return;
                           }
                           c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Withdrawl','" + amount + "')");
                           JOptionPane.showMessageDialog(null, "Rs." + amount + "Debited Successfully");
                           setVisible(false);
                           new main_screen(pin);
                       }
                   } catch (Exception E) {
                       E.printStackTrace();

                   }
               }else if (e.getSource()==back) {
            setVisible(false);
            new main_screen(pin);
        }
    }

    public static void main(String[] args) {
        new Withdwal("");
    }
}
