package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
       JLabel label1,label2,label3;
       JTextField textField;
       JPasswordField passwordfield;
       JButton button1,button2,button3;
       Login(){
           super("Bank Management System");

           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Bank-PNG-File.png"));
           Image i2=i1.getImage().getScaledInstance(125,75,Image.SCALE_DEFAULT);
           ImageIcon i3 = new ImageIcon(i2);
           JLabel image = new JLabel(i3);
           image.setBounds(350,20,100,100);
           add(image);

           ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/atmcard.jpg"));
           Image ii2=ii1.getImage().getScaledInstance(101,101,Image.SCALE_DEFAULT);
           ImageIcon ii3 = new ImageIcon(ii2);
           JLabel image2 = new JLabel(ii3);
           image2.setBounds(630,355,105,105);
           add(image2);

           label1 =new JLabel("WELCOME TO ATM");
           label1.setForeground(Color.WHITE);
           label1.setFont(new Font("AvantGrade",Font.BOLD,38));
           label1.setBounds(230,125,450,40);
           add(label1);

           label2 =new JLabel("Card No: ");
           label2.setFont(new Font("Raleway",Font.BOLD,28));
           label2.setForeground(Color.WHITE);
           label2.setBounds(150,190,375,30);
           add(label2);

           textField = new JTextField(15);
           textField.setBounds(325,190,230,30);
           textField.setFont(new Font("Arial",Font.BOLD,14));
           add(textField);

           label3 =new JLabel("PIN: ");
           label3.setFont(new Font("Raleway",Font.BOLD,28));
           label3.setForeground(Color.WHITE);
           label3.setBounds(150,250,375,30);
           add(label3);

           passwordfield =new JPasswordField(15);
           passwordfield.setBounds(325,250,230,30);
           passwordfield.setFont(new Font("Arial",Font.BOLD,28));
           add(passwordfield);


           button1 =new JButton("SIGN IN");
           button1.setFont(new Font("Arial",Font.BOLD,14));
           button1.setForeground(Color.WHITE);
           button1.setBackground(Color.BLACK);
           button1.setBounds(340,300,100,30);
           button1.addActionListener(this);
           add(button1);



           button2 =new JButton("CLEAR");
           button2.setFont(new Font("Arial",Font.BOLD,14));
           button2.setForeground(Color.WHITE);
           button2.setBackground(Color.BLACK);
           button2.setBounds(450,300,100,30);
           button2.addActionListener(this);
           add(button2);



           button3 =new JButton("SIGN UP");
           button3.setFont(new Font("Arial",Font.BOLD,14));
           button3.setForeground(Color.WHITE);
           button3.setBackground(Color.BLACK);
           button3.setBounds(340,350,210,30);
           button3.addActionListener(this);
           add(button3);




           ImageIcon bi1 = new ImageIcon(ClassLoader.getSystemResource("icon/olb-background.png"));
           Image bi2=bi1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
           ImageIcon bi3 = new ImageIcon(bi2);
           JLabel bImage = new JLabel(bi3);
           bImage.setBounds(0,0,850,480);
           add(bImage);


           setLayout(null);
           setSize(850,510);
           setLocation(240,25);
           //setUndecorated(true);
           setVisible(true);
      }
      @Override
      public void actionPerformed(ActionEvent e){
           try{
               if(e.getSource() == button1){
                   Connect c=new Connect();
                   String cardNo=textField.getText();
                   String pin=passwordfield.getText();
                   String q="select * from LogIn where CardNo = '"+cardNo+"' and pin='"+pin+"' ";
                   ResultSet resultSet = c.statement.executeQuery(q);
                   if (resultSet.next()) {
                       setVisible(false);
                       new Main_Class(pin);
                   } else {
                       JOptionPane.showMessageDialog(null,"Incorrect Card Number Or pin.");
                   }

               }else if(e.getSource() == button2){
                  textField. setText("");
                  passwordfield.setText("");
               }else if(e.getSource() == button3){
                   new SignUp();
                   setVisible(false);
               }
           }catch (Exception E){
               E.printStackTrace();
           }
      }
    public static void main(String[] args) {

           new Login();
    }
}
