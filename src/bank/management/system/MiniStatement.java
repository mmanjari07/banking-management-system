package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {
    JLabel label1,label2,label3,label4;
    JButton exit;
    String pin;

    MiniStatement(String pin){
        this.pin=pin;

        getContentPane().setBackground(new Color(223, 203, 246));
        setSize(500,650);
        setLocation(20,20);
        setLayout(null);



        label1 =new JLabel("Mini Statement");
        label1.setFont(new Font("Raleway",Font.BOLD,18));
        label1.setBounds(190,30,200,30);
        add(label1);


        label2 =new JLabel();
        label2.setBounds(150,75,400,20);
        add(label2);

        label3 =new JLabel();
        label3.setBounds(110,135,500,375);
        add(label3);

        label4 =new JLabel();
        label4.setBounds(115,510,400,25);
        add(label4);

        try{
            Connect c =new Connect();
            ResultSet resultSet=c.statement.executeQuery("select * from LogIn where  pin='"+pin+"' ");
            while (resultSet.next()){
                label2.setText("Card Number : " + resultSet.getString("CardNo").substring(0,4) + "xxxxxxxx" + resultSet.getString("CardNo").substring(12));
            }
        }catch (Exception e){
            e.printStackTrace();

        }


        try{
            int balance=0;
            Connect c=new Connect();
            ResultSet resultSet=c.statement.executeQuery("select * from Bank where Pin_no = '"+pin+"'");
            while (resultSet.next()) {

                label3.setText(label3.getText() + "<html>" + resultSet.getString("Date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("Type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("Amount") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"  + "<br><br><html>");

                if (resultSet.getString("Type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("Amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("Amount"));
                }
            }

            label4.setText("your total balance is Rs."+balance);

        }catch (Exception e){
            e.printStackTrace();
        }

        exit=new JButton("Exit");
        // cancel.setBackground(new Color(124, 248, 130));
        exit.setBounds(300,565,150,25);
        exit.setForeground(Color.black);
        exit.addActionListener(this);
        add(exit);


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }

    public static void main(String[] args) {
        new MiniStatement("");

    }
}
