package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,back;
    String pin;
        fastCash(String pin){
            this.pin=pin;
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
            Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
            ImageIcon  i3 =new ImageIcon(i2);
            JLabel l3 = new JLabel(i3);
            l3.setBounds(0,0,1550,830);
            add(l3);

            JLabel label1=new JLabel("SELECT WITHDRAWAL AMOUNT");
            label1.setForeground(Color.WHITE);
            label1.setFont(new Font("System",Font.BOLD,23));
            label1.setBounds(460,180,400,35);
            l3.add(label1);

            b1=new JButton("Rs. 100");
            b1.setBounds(410,274,150,35);
            b1.setBackground(new Color(36, 133, 143));
            b1.setForeground(Color.WHITE);
            b1.addActionListener(this);
            l3.add(b1);

            b2=new JButton("Rs. 1000");
            b2.setBounds(410,318,150,35);
            b2.setBackground(new Color(36, 133, 143));
            b2.setForeground(Color.WHITE);
            b2.addActionListener(this);
            l3.add(b2);

            b3=new JButton("Rs. 5000");
            b3.setBounds(410,362,150,35);
            b3.setBackground(new Color(36, 133, 143));
            b3.setForeground(Color.WHITE);
            b3.addActionListener(this);
            l3.add(b3);


            b4=new JButton("Rs. 500");
            b4.setBounds(700,274,150,35);
            b4.setBackground(new Color(36, 133, 143));
            b4.setForeground(Color.WHITE);
            b4.addActionListener(this);
            l3.add(b4);

            b5=new JButton("Rs. 2000");
            b5.setBounds(700,318,150,35);
            b5.setBackground(new Color(36, 133, 143));
            b5.setForeground(Color.WHITE);
            b5.addActionListener(this);
            l3.add(b5);

            b6=new JButton("Rs. 10000");
            b6.setBounds(700,362,150,35);
            b6.setBackground(new Color(36, 133, 143));
            b6.setForeground(Color.WHITE);
            b6.addActionListener(this);
            l3.add(b6);

            back=new JButton("BACk");
            back.setBounds(700,406,150,35);
            back.setBackground(new Color(36, 133, 143));
            back.setForeground(Color.WHITE);
            back.addActionListener(this);
            l3.add(back);



            setLayout(null);
            setSize(1550,1080);
            setLocation(0,0);
            setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            setVisible(false);
            new main_screen(pin);
        }else{
            String amount=((JButton)e.getSource()).getText().substring(4);
            Con c=new Con();
            Date date=new Date();
            try{
                ResultSet resultSet=c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance=0;
                while (resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance-=Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if(e.getSource() != back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs."+amount+" Debited Successfully");
                setVisible(false);
                new main_screen(pin);

            }catch (Exception E){
                E.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        new fastCash("");
    }
}
