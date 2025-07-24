package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    String pin;
    JButton BackBE;
    JLabel balanceLabel;

    BalanceEnquiry(String pin){
        this.pin=pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm_machine.jpg"));
        Image i2=i1.getImage().getScaledInstance(1020,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image2 = new JLabel(i3);
        image2.setBounds(0,0,1270,640);
        add(image2);



        JLabel balanceC= new JLabel("current Balance:");
        balanceC.setFont(new Font("Raleway",Font.BOLD,17));
        balanceC.setForeground(Color.WHITE);
        balanceC.setBounds(430,130,700,35);
        image2.add(balanceC);


        JLabel balanceLabel= new JLabel();
        balanceLabel.setFont(new Font("Raleway",Font.BOLD,17));
        balanceLabel.setForeground(Color.WHITE);
        balanceLabel.setBounds(420,175,400,35);
        image2.add(balanceLabel);




        BackBE=new JButton("Back");
        // cancel.setBackground(new Color(124, 248, 130));
        BackBE.setBounds(570,335,140,25);
        BackBE.setForeground(Color.black);
        BackBE.addActionListener(this);
        image2.add(BackBE);



        int balance = 0;
        try{
            Connect c=new Connect();
            ResultSet resultSet =c.statement.executeQuery("select * from Bank where Pin_no = '"+pin+"'");
            while (resultSet.next()){
                if(resultSet.getString("Type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("Amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("Amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        balanceLabel.setText(""+balance);






        //------------------------------------------------------------------------------------------------------------
        getContentPane().setBackground(new Color(223, 203, 246));
        setLayout(null);
        setSize(1500,1000);
        setLocation(0,0);
        setVisible(true);


    }




    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Main_Class(pin);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
