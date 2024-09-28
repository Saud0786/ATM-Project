package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin="";
    JTextField textField;
    JButton deposit,back;
    Deposit(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon  i3 =new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        l3.add(label1);

        textField=new JTextField();
        textField.setBounds(460,230,320,25);
        textField.setForeground(Color.WHITE);
        textField.setBackground(new Color(20, 125, 185));
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        deposit=new JButton("Deposit");
        deposit.setBounds(700,362,150,35);
        deposit.setBackground(new Color(20, 125, 185));
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        l3.add(deposit);

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
        try{
            String amount =textField.getText();
            Date date=new Date();
            if(e.getSource()==deposit){
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you to Deposit");
                }else{
                    Con c1=new Con();
                    String q="insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')";
                    c1.statement.executeUpdate(q);
                    JOptionPane.showMessageDialog(null,"Rs."+amount+" Deposit successfully");
                    setVisible(false);
                    new main_screen(pin);
                }
            }else if (e.getSource()==back){
                setVisible(false);
                new main_screen(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
