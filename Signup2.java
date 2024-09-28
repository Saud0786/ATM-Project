package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener{
    String formno;
    JTextField textPan,textAdhar;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JRadioButton r1,r2,m1,m2;
    JButton next;
    Signup2(String formno){
        super("APPLICATION FORM ");
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
        labelFormNo.setFont(new Font("Raleway",Font.BOLD,22));
        labelFormNo.setBounds(600,10,150,30);
        add(labelFormNo);
        JLabel labelForm=new JLabel(formno);
        labelForm.setFont(new Font("Raleway",Font.BOLD,20));
        labelForm.setBounds(720,10,60,30);
        add(labelForm);


        JLabel label1=new JLabel("Page 2 :-");
        label1.setFont(new Font("Raleway",Font.BOLD,22));
        label1.setBounds(300,30,600,40);
        add(label1);

        JLabel label2=new JLabel("Additonal Details");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(300,60,600,40);
        add(label2);

        JLabel labelReligion=new JLabel("Religion :");
        labelReligion.setFont(new Font("Raleway",Font.BOLD,18));
        labelReligion.setBounds(100,120,100,30);
        add(labelReligion);
        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox=new JComboBox<>(religion);
        comboBox.setBackground(new Color(255, 201, 47));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);


        JLabel labelCategory=new JLabel("Category :");
        labelCategory.setFont(new Font("Raleway",Font.BOLD,18));
        labelCategory.setBounds(100,170,100,30);
        add(labelCategory);
        String category[]={"General","OBC","SC","ST","Other"};
        comboBox2=new JComboBox<>(category);
        comboBox2.setBackground(new Color(255, 201, 47));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);


        JLabel labelIncome=new JLabel("Income :");
        labelIncome.setFont(new Font("Raleway",Font.BOLD,18));
        labelIncome.setBounds(100,220,100,30);
        add(labelIncome);
        String income[]={"Null","<1,50,000","<2,50,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3=new JComboBox<>(income);
        comboBox3.setBackground(new Color(255, 201, 47));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);


        JLabel labelEducation=new JLabel("Education :");
        labelEducation.setFont(new Font("Raleway",Font.BOLD,18));
        labelEducation.setBounds(100,270,150,30);
        add(labelEducation);
        String Education[]={"Non-Graduate","Graduate","Post-Graduate","Master","Doctorate"};
        comboBox4=new JComboBox<>(Education);
        comboBox4.setBackground(new Color(255, 201, 47));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel labelOccupation=new JLabel("Occupation :");
        labelOccupation.setFont(new Font("Raleway",Font.BOLD,18));
        labelOccupation.setBounds(100,320,150,30);
        add(labelOccupation);
        String Occupation[]={"Salaried","Self-Employed","Business","Farmer","Student","Other"};
        comboBox5=new JComboBox<>(Occupation);
        comboBox5.setBackground(new Color(255, 201, 47));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);


        JLabel labelPan=new JLabel("PAN Number :");
        labelPan.setFont(new Font("Raleway",Font.BOLD,18));
        labelPan.setBounds(100,370,150,30);
        add(labelPan);
        textPan=new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,14));
        textPan.setBounds(350,370,320,30);
        add(textPan);

        JLabel labelAadhar=new JLabel("Aadhar Number :");
        labelAadhar.setFont(new Font("Raleway",Font.BOLD,18));
        labelAadhar.setBounds(100,420,170,30);
        add(labelAadhar);
        textAdhar=new JTextField();
        textAdhar.setFont(new Font("Raleway",Font.BOLD,14));
        textAdhar.setBounds(350,420,320,30);
        add(textAdhar);



        JLabel labelSenior=new JLabel("Senior Citizen :");
        labelSenior.setFont(new Font("Raleway",Font.BOLD,18));
        labelSenior.setBounds(100,470,170,30);
        add(labelSenior);
        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(255, 201, 47));
        r1.setBounds(350,470,60,30);
        add(r1);
        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(255, 201, 47));
        r2.setBounds(450,470,90,30);
        add(r2);
        ButtonGroup buttonGroup1 =new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);



        JLabel labelExistAc=new JLabel("Existing Account :");
        labelExistAc.setFont(new Font("Raleway",Font.BOLD,18));
        labelExistAc.setBounds(100,520,170,30);
        add(labelExistAc);
        m1=new JRadioButton("Yes");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(255, 201, 47));
        m1.setBounds(350,520,100,30);
        add(m1);
        m2=new JRadioButton("No");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(255, 201, 47));
        m2.setBounds(450,520,100,30);
        add(m2);
        ButtonGroup buttonGroup2=new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);


        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(580,620,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(800,750);
        setLocation(450,50);
        getContentPane().setBackground(new Color(255, 201, 47));
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String rel=(String)comboBox.getSelectedItem();
        String cate=(String)comboBox2.getSelectedItem();
        String inc=(String)comboBox3.getSelectedItem();
        String edu=(String)comboBox4.getSelectedItem();
        String occ=(String)comboBox5.getSelectedItem();

        String pan=textPan.getText();
        String aadhar=textAdhar.getText();

        String scitizen="";
        if(r1.isSelected()){
            scitizen="Yes";
        } else if (r2.isSelected()) {
            scitizen="No";
        }

        String eAccount="";
        if(m1.isSelected()){
            eAccount="Yes";
        } else if (m2.isSelected()) {
            eAccount="No";
        }
        try{
            if(textAdhar.getText().equals("") || textAdhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con c1=new Con();
                String q="insert into Signuptwo values ('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        }catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
