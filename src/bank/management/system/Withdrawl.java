package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {
    String pin;
    JTextField textFieldW;
    JButton withdrawl,BackW;

    Withdrawl(String pin){
        this.pin=pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm_machine.jpg"));
        Image i2=i1.getImage().getScaledInstance(1020,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image2 = new JLabel(i3);
        image2.setBounds(0,0,1270,640);
        add(image2);



        JLabel amountW= new JLabel("Enter your amount:");
        amountW.setFont(new Font("Raleway",Font.BOLD,17));
        amountW.setForeground(Color.WHITE);
        amountW.setBounds(430,130,350,25);
        image2.add(amountW);

        JLabel conditionW= new JLabel("(Maximum withdrawl is 15000)");
        conditionW.setFont(new Font("Raleway",Font.BOLD,12));
        conditionW.setForeground(Color.WHITE);
        conditionW.setBounds(420,157,350,15);
        image2.add(conditionW);



        textFieldW= new JTextField();
        textFieldW.setBackground(new Color(208, 227, 208));
        textFieldW.setFont(new Font("Raleway",Font.BOLD,20));
        textFieldW.setBounds(340,183,350,30);
        image2.add(textFieldW);


        withdrawl=new JButton("Withdraw");
        // deposit.setBackground(new Color(119, 131, 119));
        withdrawl.setBounds(570,300,140,25);
        withdrawl.setForeground(Color.black);
        withdrawl.addActionListener(this);
        image2.add(withdrawl);

        BackW=new JButton("Back");
        // cancel.setBackground(new Color(124, 248, 130));
        BackW.setBounds(570,335,140,25);
        BackW.setForeground(Color.black);
        BackW.addActionListener(this);
        image2.add(BackW);



        //------------------------------------------------------------------------------------------------------------
        getContentPane().setBackground(new Color(223, 203, 246));
        setLayout(null);
        setSize(1500,1000);
        setLocation(0,0);
        setVisible(true);



    }











    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String amountw = textFieldW.getText();
            Date date = new Date();
            if(e.getSource()==withdrawl){
                if(textFieldW.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount you want to Deposit.");
                }else {
                    Connect connectW = new Connect();
                    ResultSet resultSet=connectW.statement.executeQuery("select * from Bank where Pin_no = '"+pin+"'");
                    int balance=0;
                    while (resultSet.next()){
                        if(resultSet.getString("Type").equals("Deposit")){
                            balance += Integer.parseInt(resultSet.getString("Amount"));
                        }else {
                            balance -= Integer.parseInt(resultSet.getString("Amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amountw)){
                        JOptionPane.showMessageDialog(null,"Insufficient Balance");
                        return;
                    }
                    connectW.statement.executeUpdate("insert into Bank values('"+pin+"','"+date+"','Withdrawl','"+amountw+"')");
                    JOptionPane.showMessageDialog(null,"Rs. " +amountw+ "Debited Successfully");
                    setVisible(false);
                    new Main_Class(pin);
                }
            } else if (e.getSource()==BackW) {
                setVisible(false);
                new Main_Class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();

        }

    }

    public static void main(String[] args) {

        new Withdrawl("");

    }
}
