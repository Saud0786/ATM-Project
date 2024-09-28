package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;


public class mini extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2;
    mini(String pin){
        this.pin=pin;
        setLayout(null);
        setSize(400,600);
        getContentPane().setBackground(new Color(255,204,204));
        setLocation(20,20);

        JLabel label1=new JLabel();
        label1.setBounds(20,140,400,250);
        add(label1);

        JLabel label2=new JLabel("Saud Bank");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3=new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4=new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);

        JLabel label5=new JLabel("Date / Time");
        label5.setFont(new Font("System",Font.BOLD,14));
        label5.setBounds(50,110,200,20);
        add(label5);

        JLabel label6=new JLabel("Type");
        label6.setFont(new Font("System",Font.BOLD,14));
        label6.setBounds(200,110,200,20);
        add(label6);

        JLabel label7=new JLabel("Amount");
        label7.setFont(new Font("System",Font.BOLD,14));
        label7.setBounds(250,110,200,20);
        add(label7);

        JLabel label8=new JLabel("--------------------------------------------------------------------------------------");
        label8.setFont(new Font("System",Font.BOLD,14));
        label8.setBounds(0,125,450,5);
        add(label8);

        JLabel label9=new JLabel("--------------------------------------------------------------------------------------");
        label9.setFont(new Font("System",Font.BOLD,14));
        label9.setBounds(0,100,450,5);
        add(label9);

        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyy");
        String formattedDate= sdf.format(date);
        JLabel label10=new JLabel(formattedDate);
        label10.setBounds(300,40,100,20);
        add(label10);

        Date date1= new Date();
        // SimpleDateFormat object banayein
        SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss a");
        // Time ko format karein
        String formattedTime = sdf2.format(date1);
        JLabel label11=new JLabel(formattedTime);
        label11.setBounds(300,55,100,20);
        add(label11);

        JLabel label12=new JLabel("Thank you .......");
        label12.setFont(new Font("System",Font.BOLD,15));
        label12.setBounds(270,450,100,20);
        add(label12);

        b2= new JButton("Back");
        b2.addActionListener(this);


        try{
            Con c=new Con();
            ResultSet resultSet=c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number: "+resultSet.getString("card_number").substring(0,4)+"XXXXXXXX"+resultSet.getString("card_number").substring(12));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {

            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
            int balance = 0;
            while (resultSet.next()) {
                label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs. "+balance);
        }catch (Exception e){
            e.printStackTrace();
        }

        b1=new JButton("Exit");
        b1.setBounds(20,500,100,25);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Back");
        b2.setBounds(200,500,100,25);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            setVisible(false);
        } else if (e.getSource()==b2) {
            new main_screen(pin);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new mini("");
    }
}
