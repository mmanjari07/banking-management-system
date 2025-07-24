package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;

    PinChange(String pin){
        this.pin=pin;



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm_machine.jpg"));
        Image i2=i1.getImage().getScaledInstance(1020,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image2 = new JLabel(i3);
        image2.setBounds(0,0,1270,640);
        add(image2);



        JLabel pinText= new JLabel("Change Your Pin");
        pinText.setFont(new Font("Raleway",Font.BOLD,17));
        pinText.setForeground(Color.WHITE);
        pinText.setBounds(430,125,350,25);
        image2.add(pinText);

        //-----------------------------------------------------------------------------------------

        JLabel newpin= new JLabel("Enter your New PIN:");
        newpin.setFont(new Font("Raleway",Font.BOLD,15));
        newpin.setForeground(Color.WHITE);
        newpin.setBounds(340,165,350,20);
        image2.add(newpin);


        p1 =new JPasswordField(15);
        p1.setBackground(new Color(208, 227, 208));
        p1.setFont(new Font("Arial",Font.BOLD,17));
        p1.setBounds(350,190,300,25);
        p1.setForeground(Color.black);
        image2.add(p1);


        //-----------------------------------------------------------------------------------------------

        JLabel repin= new JLabel("ReEnter your New PIN:");
        repin.setFont(new Font("Raleway",Font.BOLD,15));
        repin.setForeground(Color.WHITE);
        repin.setBounds(340,220,350,20);
        image2.add(repin);


        p2 =new JPasswordField(15);
        p2.setBackground(new Color(208, 227, 208));
        p2.setFont(new Font("Arial",Font.BOLD,17));
        p2.setBounds(350,245,300,25);
        p1.setForeground(Color.black);
        image2.add(p2);





     //---------------------------------------------------------------------------------------------
        b1=new JButton("Change PIN");
        // deposit.setBackground(new Color(119, 131, 119));
        b1.setBounds(570,300,140,25);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        image2.add(b1);


        b2=new JButton("Back");
        // cancel.setBackground(new Color(124, 248, 130));
        b2.setBounds(570,335,140,25);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        image2.add(b2);




     //----------------------------------------------------------------------------------------
        getContentPane().setBackground(new Color(223, 203, 246));
        setLayout(null);
        setSize(1500,1000);
        setLocation(0,0);
        setVisible(true);


    }



    @Override
    public void actionPerformed(ActionEvent e) {
        try {

            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if (!pin1.equals(pin2)) {
                JOptionPane.showMessageDialog(null, "Entered pins do not match");
                return;
            }
            if (e.getSource() == b1) {

                if (p1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                    return;
                }
                if (p2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
                    return;
                }

                Connect c = new Connect();
                String q1 = "update signup4 set pin = '"+pin1+"'  where pin = '"+pin+"' ";
                String q2 = "update LogIn set pin = '"+pin1+"'    where pin = '"+pin+"' ";
                String q3 = "update Bank set Pin_no = '"+pin1+"'  where Pin_no  = '"+pin+"' ";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "Pin changed successfully");
                setVisible(false);
                new Main_Class(pin);


            } else if (e.getSource()==b2) {
                new Main_Class(pin);
                setVisible(false);

            }

        } catch(Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new PinChange("");

    }
}
