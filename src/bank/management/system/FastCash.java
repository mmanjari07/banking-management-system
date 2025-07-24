package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;

    String pin;
    FastCash(String pin){
        this.pin=pin;



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm_machine.jpg"));
        Image i2=i1.getImage().getScaledInstance(1020,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image2 = new JLabel(i3);
        image2.setBounds(0,0,1270,640);
        add(image2);



        JLabel transactionType= new JLabel("Select Withdrawl Amount");
        transactionType.setFont(new Font("Raleway",Font.BOLD,17));
        transactionType.setForeground(Color.WHITE);
        transactionType.setBounds(385,150,350,25);
        image2.add(transactionType);

        //------------------------------------------------------

        b1=new JButton("Rs. 100");
        // deposit.setBackground(new Color(119, 131, 119));
        b1.setBounds(308,240,125,25);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        image2.add(b1);

        b2=new JButton("Rs. 500");
        // deposit.setBackground(new Color(119, 131, 119));
        b2.setBounds(580,240,125,25);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        image2.add(b2);

        //-----------------------------------------------------------------------------


        b3=new JButton("Rs. 2000");
        // deposit.setBackground(new Color(119, 131, 119));
        b3.setBounds(308,270,125,25);
        b3.setForeground(Color.black);
        b3.addActionListener(this);
        image2.add(b3);

        b4=new JButton("Rs. 5000");
        // deposit.setBackground(new Color(119, 131, 119));
        b4.setBounds(580,270,125,25);
        b4.setForeground(Color.black);
        b4.addActionListener(this);
        image2.add(b4);

        //-----------------------------------------------------------------------------------------

        b5=new JButton("Rs. 10000");
        // deposit.setBackground(new Color(119, 131, 119));
        b5.setBounds(308,300,125,25);
        b5.setForeground(Color.black);
        b5.addActionListener(this);
        image2.add(b5);

        b6=new JButton("Rs. 15000");
        // deposit.setBackground(new Color(119, 131, 119));
        b6.setBounds(580,300,125,25);
        b6.setForeground(Color.black);
        b6.addActionListener(this);
        image2.add(b6);

        //-------------------------------------------------------------------------------

        b7=new JButton("Back");
        // deposit.setBackground(new Color(119, 131, 119));
        b7.setBounds(580,330,125,25);
        b7.setForeground(Color.black);
        b7.addActionListener(this);
        image2.add(b7);





        //--------------------------------------------------------------------------------------------------------------------
        getContentPane().setBackground(new Color(223, 203, 246));
        setLayout(null);
        setSize(1500,1000);
        setLocation(0,0);
        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==b7){
            setVisible(false);
            new Main_Class(pin);
        }else{
            String amount=((JButton)e.getSource()).getText().substring(4);
            Connect c=new Connect();
            Date date=new Date();
            try {
                ResultSet resultSet=c.statement.executeQuery("select * from Bank where Pin_no = '"+pin+"'");
                int balance=0;
                while (resultSet.next()){
                    if(resultSet.getString("Type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("Amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("Amount"));
                    }
                }
                if (e.getSource()!=b7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into Bank values('"+pin+"','"+date+"','Withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. " +amount+ "Debited Successfully");
            }catch(Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new Main_Class(pin);
        }


    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
