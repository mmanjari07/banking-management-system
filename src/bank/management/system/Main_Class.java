package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Class extends JFrame implements ActionListener {

    JButton diposite,withdrawl,fastcash,miniStmnt,pinchange,balanceInq,exit;

    String pin;

    Main_Class(String pin){

        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm_machine.jpg"));
        Image i2=i1.getImage().getScaledInstance(1020,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image2 = new JLabel(i3);
        image2.setBounds(0,0,1270,640);
        add(image2);



        JLabel transactionType= new JLabel("Please Select Your Transaction Type");
        transactionType.setFont(new Font("Raleway",Font.BOLD,17));
        transactionType.setForeground(Color.WHITE);
        transactionType.setBounds(350,130,350,25);
        image2.add(transactionType);

        //------------------------------------------------------

        diposite=new JButton("Diposite");
        // deposit.setBackground(new Color(119, 131, 119));
        diposite.setBounds(308,240,135,25);
        diposite.setForeground(Color.black);
        diposite.addActionListener(this);
        image2.add(diposite);

        withdrawl=new JButton("Cash Withdrawl");
        // deposit.setBackground(new Color(119, 131, 119));
        withdrawl.setBounds(570,240,135,25);
        withdrawl.setForeground(Color.black);
        withdrawl.addActionListener(this);
        image2.add(withdrawl);

        //-----------------------------------------------------------------------------


        fastcash=new JButton("Fast Cash");
        // deposit.setBackground(new Color(119, 131, 119));
        fastcash.setBounds(308,270,135,25);
        fastcash.setForeground(Color.black);
        fastcash.addActionListener(this);
        image2.add(fastcash);

        miniStmnt=new JButton("Mini Statement");
        // deposit.setBackground(new Color(119, 131, 119));
        miniStmnt.setBounds(570,270,135,25);
        miniStmnt.setForeground(Color.black);
        miniStmnt.addActionListener(this);
        image2.add(miniStmnt);

        //-----------------------------------------------------------------------------------------

        pinchange=new JButton("Change Pin");
        // deposit.setBackground(new Color(119, 131, 119));
        pinchange.setBounds(308,300,135,25);
        pinchange.setForeground(Color.black);
        pinchange.addActionListener(this);
        image2.add(pinchange);

        balanceInq=new JButton("Balance Enquery");
        // deposit.setBackground(new Color(119, 131, 119));
        balanceInq.setBounds(570,300,135,25);
        balanceInq.setForeground(Color.black);
        balanceInq.addActionListener(this);
        image2.add(balanceInq);

        //-------------------------------------------------------------------------------

        exit=new JButton("Exit");
        // deposit.setBackground(new Color(119, 131, 119));
        exit.setBounds(570,330,135,25);
        exit.setForeground(Color.black);
        exit.addActionListener(this);
        image2.add(exit);





    //--------------------------------------------------------------------------------------------------------------------
        getContentPane().setBackground(new Color(223, 203, 246));
        setLayout(null);
        setSize(1500,1000);
        setLocation(0,0);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==diposite){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==withdrawl) {
            new  Withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==fastcash) {
            new  FastCash(pin);
            setVisible(false);
        }else if(e.getSource()==miniStmnt) {
            new  MiniStatement(pin);
            setVisible(false);
        }  else if (e.getSource()==pinchange) {
            new PinChange(pin);
            setVisible(false);
        }else if (e.getSource()== balanceInq) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==exit) {
            System.exit(0);
        }

    }
    public static void main(String[] args) {
        new Main_Class("");
    }


}
