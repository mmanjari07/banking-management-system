package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    String pin;
    JTextField textField1;
    JButton deposit,cancel;
    Deposit(String pin){
        this.pin=pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm_machine.jpg"));
        Image i2=i1.getImage().getScaledInstance(1020,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image2 = new JLabel(i3);
        image2.setBounds(0,0,1270,640);
        add(image2);

        JLabel amount= new JLabel("Enter the amount you want to Deposit:");
        amount.setFont(new Font("Raleway",Font.BOLD,17));
        amount.setForeground(Color.WHITE);
        amount.setBounds(350,130,350,25);
        image2.add(amount);



        textField1= new JTextField();
        textField1.setBackground(new Color(208, 227, 208));
        textField1.setFont(new Font("Raleway",Font.BOLD,20));
        textField1.setBounds(340,170,350,30);
        image2.add(textField1);


        deposit=new JButton("Deposit");
        // deposit.setBackground(new Color(119, 131, 119));
        deposit.setBounds(570,300,140,25);
        deposit.setForeground(Color.black);
        deposit.addActionListener(this);
        image2.add(deposit);

        cancel=new JButton("Back");
        // cancel.setBackground(new Color(124, 248, 130));
        cancel.setBounds(570,335,140,25);
        cancel.setForeground(Color.black);
        cancel.addActionListener(this);
        image2.add(cancel);



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
            String amount = textField1.getText();
            Date date = new Date();
            if(e.getSource()==deposit){
                if(textField1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount you want to Deposit.");
                }else {
                    Connect connectB = new Connect();
                    connectB.statement.executeUpdate("insert into Bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. " +amount+ "Credited Successfully");
                    setVisible(false);
                    new Main_Class(pin);
                }
            } else if (e.getSource()==cancel) {
                setVisible(false);
                new Main_Class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();

        }

    }


    public static void main(String[] args) {
        new Deposit("");
    }

}
