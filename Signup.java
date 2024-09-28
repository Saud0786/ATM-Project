package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JButton next;
    JRadioButton r1,r2,m1,m2,m3;
    JTextField textName,textFname,textEmail,textMs,textAd,textCity,textPin,textState;
    JDateChooser dateChooser;

    Random ran=new Random();
    long firs4=(ran.nextLong()%9000L)+1000L;
    String first = " "+Math.abs(firs4);
    Signup(){
        // tittle
        super("APPLICATION FORM");

        // image import
        // bank png
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon  i3 =new ImageIcon(i2);
        // level
        JLabel image1 = new JLabel(i3);
        image1.setBounds(25,10,100,100);
        add(image1);
        // APPLICATION FORM NO.
        JLabel label1= new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        // Page 1
        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(340,60,600,40);
        add(label2);

        // personal details
        JLabel label3 =new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        //Name
        JLabel labelName=new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);
        //name fill box
        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);


        // father name
        JLabel lebelfName=new JLabel("Father's Name :");
        lebelfName.setFont(new Font("Raleway",Font.BOLD,20));
        lebelfName.setBounds(100,240,200,30);
        add(lebelfName);
        //name fill box
        textFname=new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);


        // date of birth
        JLabel DOB=new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);
        // date chooser
        dateChooser =new JDateChooser();
        dateChooser.setBackground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);


        // gender
        JLabel labelG =new JLabel("Gender :");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);
        // male and female
        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);
        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);
       // button group solve problem of select male and female
        ButtonGroup buttonGroup1 =new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        // Email
        JLabel labelM=new JLabel("Email Adress :");
        labelM.setFont(new Font("Raleway",Font.BOLD,20));
        labelM.setBounds(100,390,200,30);
        add(labelM);
        // Email box
        textEmail =new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        //marital status
        JLabel labelMs=new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);
        // marital box
        m1=new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,100,30);
        add(m1);
        m2=new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,100,30);
        add(m2);
        m3=new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(640,440,100,30);
        add(m3);

        // button group solve problem of select male and female
        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);
        buttonGroup2.add(m3);


        // Adress
        JLabel labelAdress=new JLabel("Address :");
        labelAdress.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdress.setBounds(100,490,200,30);
        add(labelAdress);
        // Email box
        textAd =new JTextField();
        textAd.setFont(new Font("Raleway",Font.BOLD,14));
        textAd.setBounds(300,490,400,30);
        add(textAd);

        // City
        JLabel labelCity=new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);
        // City box
        textCity =new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        // PIN code
        JLabel labelPIN=new JLabel("Pin Code :");
        labelPIN.setFont(new Font("Raleway",Font.BOLD,20));
        labelPIN.setBounds(100,590,200,30);
        add(labelPIN);
        // Pin code box
        textPin =new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        // State
        JLabel labelState=new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);
        // Pin code box
        textState =new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        //next page button
        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name =textName.getText();
        String fname=textFname.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        } else if (r1.isSelected()) {
            gender="Female";
        }
        String email=textEmail.getText();
        String martial=null;
        if(m1.isSelected()){
            martial="Married";
        } else if (m2.isSelected()) {
            martial="Unmarried";
        } else if (m3.isSelected()) {
            martial="Other";
        }
        String address=textAd.getText();
        String city=textCity.getText();
        String pincode=textPin.getText();
        String state=textState.getText();
        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con con1= new Con();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"'," +
                        "'"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
