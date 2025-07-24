package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp4 extends JFrame implements ActionListener {
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JTextField textCardNo,textPinNo;

    JRadioButton b1,b2,b3,b4;

    JButton cancel,submit;
    String formno;

    SignUp4( String formno){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Bank-PNG-File.png"));
        Image i2=i1.getImage().getScaledInstance(125,75,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(160,7,100,70);
        add(image);

        this.formno = formno;

        JLabel formNo=new JLabel("FORM NO:" );
        formNo.setFont(new Font("Raleway",Font.BOLD,14));
        formNo.setBounds(600,8,70,15);
        add(formNo);

        JLabel formtext=new JLabel( formno);
        formtext.setFont(new Font("Raleway",Font.BOLD,14));
        formtext.setBounds(675,8,200,15);
        add(formtext);


        JLabel pageno4=new JLabel("PAGE NO:4" );
        pageno4.setBounds(490,35,400,12);
        pageno4.setFont(new Font("Raleway",Font.BOLD,12));
        add(pageno4);

        JLabel titel4= new JLabel("Account Details");
        titel4.setBounds(400, 55, 400, 25);
        titel4.setFont(new Font("Raleway", Font.BOLD, 22));
        add(titel4);
        //........................................................................................................
        JLabel accType = new JLabel("25.Account Type:");
        accType.setFont(new Font("Raleway",Font.BOLD,15));
        accType.setBounds(130,110,200,25);
        add(accType);


        b1= new JRadioButton("Saving Account");
        b1.setBackground(new Color(223, 203, 246));
        b1.setFont(new Font("Raleway",Font.BOLD,12));
        b1.setBounds(180,145,150,25);
        add(b1);

        b2= new JRadioButton("Fixed Deposit Account");
        b2.setBackground(new Color(223, 203, 246));
        b2.setFont(new Font("Raleway",Font.BOLD,12));
        b2.setBounds(380,145,180,25);
        add(b2);

        b3 = new JRadioButton("Current Account");
        b3.setBackground(new Color(223, 203, 246));
        b3.setFont(new Font("Raleway",Font.BOLD,12));
        b3.setBounds(180,180,150,25);
        add(b3);

        b4 = new JRadioButton("Recurring Deposit Account");
        b4.setBackground(new Color(223, 203, 246));
        b4.setFont(new Font("Raleway",Font.BOLD,12));
        b4.setBounds(380,180,200,25);
        add(b4);


        ButtonGroup groupButtons = new ButtonGroup();
        groupButtons.add(b1);
        groupButtons.add(b2);
        groupButtons.add(b3);
        groupButtons.add(b4);

        JLabel  cardno= new JLabel("26.Card Number:");
        cardno.setFont(new Font("Raleway",Font.BOLD,15));
        cardno.setBounds(130,220,200,25);
        add(cardno);

        JLabel specifictext = new JLabel("(Your twelve digit card number)");
        specifictext.setFont(new Font("Raleway",Font.BOLD,10));
        specifictext.setBounds(130,245,200,10);
        add(specifictext);

        textCardNo= new JTextField();
        textCardNo.setBackground(new Color(238, 185, 241));
        textCardNo.setFont(new Font("Raleway",Font.BOLD,10));
        textCardNo.setBounds(350,230,400,25);
        add( textCardNo);

        JLabel  pinno= new JLabel("27. PIN:");
        pinno.setFont(new Font("Raleway",Font.BOLD,15));
        pinno.setBounds(130,265,200,25);
        add(pinno);

        JLabel specifictext1 = new JLabel("(4 digit password)");
        specifictext1.setFont(new Font("Raleway",Font.BOLD,10));
        specifictext1.setBounds(130,290,200,10);
        add(specifictext1);

        textPinNo= new JTextField();
        textPinNo.setBackground(new Color(238, 185, 241));
        textPinNo.setFont(new Font("Raleway",Font.BOLD,10));
        textPinNo.setBounds(350,280,400,25);
        add( textPinNo);


        JLabel serviceType = new JLabel("28.Services Required:");
        serviceType.setFont(new Font("Raleway",Font.BOLD,15));
        serviceType.setBounds(130,320,200,25);
        add(serviceType);


        c1=new JCheckBox("ATM card");
        c1.setBackground(new Color(223, 203, 246));
        c1.setFont(new Font("Raleway",Font.BOLD,13));
        c1.setBounds(240,355,150,20);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(223, 203, 246));
        c2.setFont(new Font("Raleway",Font.BOLD,13));
        c2.setBounds(440,355,180,20);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(223, 203, 246));
        c3.setFont(new Font("Raleway",Font.BOLD,13));
        c3.setBounds(240,390,150,20);
        add(c3);

        c4=new JCheckBox("EMail Alerts");
        c4.setBackground(new Color(223, 203, 246));
        c4.setFont(new Font("Raleway",Font.BOLD,13));
        c4.setBounds(440,390,180,20);
        add(c4);

        c5=new JCheckBox("Cheque Book");
        c5.setBackground(new Color(223, 203, 246));
        c5.setFont(new Font("Raleway",Font.BOLD,13));
        c5.setBounds(240,425,150,20);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(223, 203, 246));
        c6.setFont(new Font("Raleway",Font.BOLD,13));
        c6.setBounds(440,425,180,20);
        add(c6);

        c7=new JCheckBox("I here by declares that the above entered details correct tothe best of my Knowledge.");
        c7.setBackground(new Color(223, 203, 246));
        c7.setFont(new Font("Raleway",Font.BOLD,10));
        c7.setBounds(130,455,500,15);
        add(c7);


        //-----------------------------------------------------Cancel Button------------------------------------------------

        cancel=new JButton("Cancel");
        cancel.setBounds(190,500,150,30);
        cancel.setBackground(Color.white);
        cancel.setForeground(Color.black);
        cancel.addActionListener(this);
        add(cancel);


        //---------------------------------------------------Submit Button------------------------------------------------------------
        submit=new JButton("Submit");
        submit.setBounds(490,500,150,30);
        submit.setBackground(Color.white);
        submit.setForeground(Color.black);
        submit.addActionListener(this);
        add(submit);

        //--------------------------------------------------------------------------------------------------------------------------------------------



        getContentPane().setBackground(new Color(223, 203, 246));
        setLayout(null);
        setSize(850,700);
        setLocation(240,25);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random ran=new Random();
        long first7=(ran.nextLong() % 90000000L) + 1324567000000000L;
        String cardNo =""+Math.abs(first7);
        long first3=(ran.nextLong() % 9000L) + 1000L;
        String pinNo=""+Math.abs(first3);


        String accType=null;
        if(b1.isSelected()){
            accType ="Saving Account";
        } else if (b2.isSelected()) {
            accType ="Fixed Deposit Account";
        }else if (b3.isSelected()) {
            accType ="Current Account";
        }else if (b4.isSelected()) {
            accType ="Recurring Deposit Account";
        }

        String serviceType="";
        if(c1.isSelected()){
            serviceType +="ATM card";
        } else if (c2.isSelected()) {
            serviceType +="Internet Banking";
        }else if (c3.isSelected()) {
            serviceType +="Mobile Banking";
        }else if (c4.isSelected()) {
            serviceType="EMail Alerts";
        }else if (c5.isSelected()) {
            serviceType += "Cheque Book";
        }else if (c6.isSelected()) {
            serviceType += "E-Statement";
        }



        try {
            if( e.getSource()==submit){
              if(accType.equals("")) {
                  JOptionPane.showMessageDialog(null, "Fill all the fields");
              }
              else {
                  Connect connect4 = new Connect();
                  String q4 = "insert into signup4 values('"+formno+"','"+accType+"','"+cardNo+"','"+pinNo+"','"+serviceType+"')";
                  String ql = "insert into LogIn values('"+formno+"','"+cardNo+ "','"+pinNo+"')";
                  System.out.println(q4);
                  System.out.println(ql);
                  connect4.statement.executeUpdate(q4);
                  connect4.statement.executeUpdate(ql);
                  JOptionPane.showMessageDialog(null, "card Number: " + cardNo + "\n Pin : " + pinNo);
                  new Deposit(pinNo);
                  setVisible(false);
              }
            }
            else if (e.getSource()==cancel){
                System.exit(0);
            }

        }catch(Exception E){
            E.printStackTrace();
        }


    }


    //--------------------------------------------Main method-----------------------------------------------------------
    public static void main(String[] args) {

        new SignUp4("");
    }
}
