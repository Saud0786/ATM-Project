package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_screen extends JFrame implements ActionListener {
    JButton deposit,fastCash,PinChange,CashWithDrawl,MiniStatement,BalanceEnquiry,exit;
    String pin;
    main_screen(String pin){
        this.pin=pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon  i3 =new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1=new JLabel("Please Select Your Transaction");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,24));
        label1.setBounds(460,180,400,35);
        l3.add(label1);

        deposit=new JButton("Deposit");
        deposit.setBounds(410,274,150,35);
        deposit.setBackground(new Color(36, 133, 143));
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        l3.add(deposit);

        fastCash=new JButton("FAST CASH");
        fastCash.setBounds(410,318,150,35);
        fastCash.setBackground(new Color(36, 133, 143));
        fastCash.setForeground(Color.WHITE);
        fastCash.addActionListener(this);
        l3.add(fastCash);

        PinChange=new JButton("PIN CHANGE");
        PinChange.setBounds(410,362,150,35);
        PinChange.setBackground(new Color(36, 133, 143));
        PinChange.setForeground(Color.WHITE);
        PinChange.addActionListener(this);
        l3.add(PinChange);


        CashWithDrawl=new JButton("CASH WITHDRAWAL");
        CashWithDrawl.setBounds(700,274,150,35);
        CashWithDrawl.setBackground(new Color(36, 133, 143));
        CashWithDrawl.setForeground(Color.WHITE);
        CashWithDrawl.addActionListener(this);
        l3.add(CashWithDrawl);

        MiniStatement=new JButton("MINI STATEMENT");
        MiniStatement.setBounds(700,318,150,35);
        MiniStatement.setBackground(new Color(36, 133, 143));
        MiniStatement.setForeground(Color.WHITE);
        MiniStatement.addActionListener(this);
        l3.add(MiniStatement);

        BalanceEnquiry=new JButton("BALANCE ENQUIRY");
        BalanceEnquiry.setBounds(700,362,150,35);
        BalanceEnquiry.setBackground(new Color(36, 133, 143));
        BalanceEnquiry.setForeground(Color.WHITE);
        BalanceEnquiry.addActionListener(this);
        l3.add(BalanceEnquiry);

        exit=new JButton("EXIT");
        exit.setBounds(700,406,150,35);
        exit.setBackground(new Color(36, 133, 143));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        l3.add(exit);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==deposit){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==exit) {
            System.exit(0);
            new main_screen(pin);
        } else if (e.getSource()==CashWithDrawl) {
            new Withdwal(pin);
            setVisible(false);
        } else if (e.getSource()==BalanceEnquiry) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==fastCash) {
            new fastCash(pin);
            setVisible(false);
        } else if (e.getSource()==PinChange) {
            setVisible(false);
            new changePin(pin);
        } else if (e.getSource()==MiniStatement) {
            setVisible(false);
            new mini(pin);
        }
    }

    public static void main(String[] args) {
        new main_screen("");
    }
}
