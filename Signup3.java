package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    Signup3(String formno){
        super("APPLICATION FORM");

        // image import
        // bank png
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon  i3 =new ImageIcon(i2);
        // level
        JLabel image1 = new JLabel(i3);
        image1.setBounds(150,5,100,100);
        add(image1);
         this.formno=formno;
        JLabel labelFormNo=new JLabel("Form No :");
        labelFormNo.setFont(new Font("Raleway",Font.BOLD,20));
        labelFormNo.setBounds(600,10,150,30);
        add(labelFormNo);
        JLabel labelForm=new JLabel(formno);
        labelForm.setFont(new Font("Raleway",Font.BOLD,22));
        labelForm.setBounds(700,10,60,30);
        add(labelForm);



        JLabel label1=new JLabel("Page 3 :-");
        label1.setFont(new Font("Raleway",Font.BOLD,22));
        label1.setBounds(300,30,600,40);
        add(label1);

        JLabel label2=new JLabel("Account Details");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(300,60,600,40);
        add(label2);

        JLabel labelACType=new JLabel("Account Type :");
        labelACType.setFont(new Font("Raleway",Font.BOLD,18));
        labelACType.setBounds(100,140,200,30);
        add(labelACType);

        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,180,150,30);
        add(r1);
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(350,180,200,30);
        add(r2);
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(100,220,150,30);
        add(r3);
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,220,250,30);
        add(r4);
        ButtonGroup buttonGroup1 =new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);


        JLabel labelCard=new JLabel("Card Number :");
        labelCard.setFont(new Font("Raleway",Font.BOLD,18));
        labelCard.setBounds(100,290,150,30);
        add(labelCard);
        JLabel labelDigit=new JLabel("(Your 16-digit Card number)");
        labelDigit.setBounds(100,320,200,15);
        add(labelDigit);
        JLabel labelCardNo=new JLabel("XXXX-XXXX-XXXX-4841");
        labelCardNo.setFont(new Font("Raleway",Font.BOLD,18));
        labelCardNo.setBounds(350,290,250,30);
        add(labelCardNo);
        JLabel labelUnderCardNo=new JLabel("(It would appear on ATM Card/Cheque Book and Statement)");
        labelUnderCardNo.setBounds(350,320,350,15);
        add(labelUnderCardNo);

        JLabel labelPin=new JLabel("PIN :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,18));
        labelPin.setBounds(100,360,150,30);
        add(labelPin);
        JLabel labelPinDigit=new JLabel("(4-digit password)");
        labelPinDigit.setBounds(100,390,200,15);
        add(labelPinDigit);
        JLabel labelPinNo=new JLabel("XXXX");
        labelPinNo.setFont(new Font("Raleway",Font.BOLD,18));
        labelPinNo.setBounds(350,360,100,30);
        add(labelPinNo);


        JLabel labelServices=new JLabel("Services Required :");
        labelServices.setFont(new Font("Raleway",Font.BOLD,18));
        labelServices.setBounds(100,440,230,30);
        add(labelServices);

        c1=new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        c1.setBackground(new Color(215,252,252));
        c1.setBounds(100,490,150,30);
        add(c1);
        c2=new JCheckBox("Mobile Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        c2.setBackground(new Color(215,252,252));
        c2.setBounds(100,530,150,30);
        add(c2);
        c3=new JCheckBox("Cheque Book");
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        c3.setBackground(new Color(215,252,252));
        c3.setBounds(100,570,150,30);
        add(c3);
        c4=new JCheckBox("Internet Banking");
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        c4.setBackground(new Color(215,252,252));
        c4.setBounds(350,490,150,30);
        add(c4);
        c5=new JCheckBox("EMAIL Alerts");
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        c5.setBackground(new Color(215,252,252));
        c5.setBounds(350,530,150,30);
        add(c5);
        c6=new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,14));
        c6.setBackground(new Color(215,252,252));
        c6.setBounds(350,570,150,30);
        add(c6);


        c7=new JCheckBox("I hereby declare that the above entered details correct to the best of my knowledge",true);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBackground(new Color(215,252,252));
        c7.setBounds(100,640,500,30);
        add(c7);

        submit=new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(300,690,100,30);
        submit.addActionListener(this);
        add(submit);
        cancel=new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(500,690,100,30);
        cancel.addActionListener(this);
        add(cancel);





        setLayout(null);
        setSize(800,780);
        setLocation(450,40);
        getContentPane().setBackground(new Color(215,252,252));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String acType="";
         if(r1.isSelected()){
             acType="Saving Account";
         } else if (r2.isSelected()) {
             acType="Fixed Deposit Account";
         } else if (r3.isSelected()) {
             acType="Current Account";
         } else if (r4.isSelected()) {
             acType="Recurring Deposit Account";
         }

         Random ran=new Random();
         long first7=(ran.nextLong()%90000000L)+ 1409963000000000L;
         String cardno=""+Math.abs(first7);

         long first3=(ran.nextLong() % 9000L)+ 1000L;
         String pin =""+Math.abs(first3);

         String fac="";
         if(c1.isSelected()){
             fac+="ATM CARD ";
         } else if (c2.isSelected()) {
             fac+="Mobile Banking ";
         } else if (c3.isSelected()) {
             fac+="Cheque Book ";
         }else if (c4.isSelected()){
             fac+="Internet Banking ";
         } else if (c5.isSelected()) {
             fac+="EMAIL Alerts ";
         } else if (c6.isSelected()) {
             fac+="E-Statement ";
         }

         try{
             if(e.getSource()==submit){
                 if(acType.equals("")){
                     JOptionPane.showMessageDialog(null,"Fill all the field");
                 }else{
                     Con c1=new Con();
                     String q1="insert into signup3 values('"+formno+"','"+acType+"','"+cardno+"','"+pin+"','"+fac+"')";
                     String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                     c1.statement.executeUpdate(q1);
                     c1.statement.executeUpdate(q2);
                     JOptionPane.showMessageDialog(null,"Card number: "+cardno +"\n Pin no :"+pin);
                     new Deposit(pin);
                     setVisible(false);
                 }
             } else if (e.getSource()==cancel) {
                 setVisible(false);
             }
         }catch (Exception E){
             E.printStackTrace();
         }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
