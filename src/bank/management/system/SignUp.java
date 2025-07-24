package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {
    JRadioButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23;
    JButton next;
    JTextField textName,textDependers,textNameOf ,textGuardian,textRelationship,textCountry1,textreligion,textPhone,textEmail;
    JDateChooser dateChooser;
    Random ranNo = new Random();
    long fdigit4=(ranNo.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(fdigit4);
    SignUp(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Bank-PNG-File.png"));
        Image i2=i1.getImage().getScaledInstance(125,75,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(160,7,100,70);
        add(image);

        JLabel formNo1=new JLabel("APPLICATION FORM NO:" + first);
        formNo1.setBounds(290,7,500,25);
        formNo1.setFont(new Font("Raleway",Font.BOLD,25));
        add(formNo1);

        JLabel pageno1=new JLabel("PAGE NO:1" );
        pageno1.setBounds(390,35,400,18);
        pageno1.setFont(new Font("Raleway",Font.BOLD,18));
        add(pageno1);

        JLabel title1=new JLabel("Personal Details " );
        title1.setBounds(360,55,400,22);
        title1.setFont(new Font("Raleway",Font.BOLD,22));
        add(title1);
        //---------------------------------------------------------------------------------------


        JLabel labelName=new JLabel("1.Name: " );
        labelName.setBounds(150,85,150,25);
        labelName.setFont(new Font("Raleway",Font.BOLD,15));
        add(labelName);

        textName = new JTextField();
        textName.setBackground(new Color(238, 185, 241));
        textName.setFont(new Font("Raleway",Font.BOLD,10));
        textName.setBounds(300,85,500,25);
        add(textName);

        JLabel DOB=new JLabel("2.Date Of Birth: " );
        DOB.setBounds(150,120,150,25);
        DOB.setFont(new Font("Raleway",Font.BOLD,15));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,120,140,25);
        add(dateChooser);

        JLabel gender= new JLabel("3.Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,15));
        gender.setBounds(455,120,100,25);
        add(gender);

        b1 = new JRadioButton("Male");
        b1.setFont(new Font("Raleway",Font.BOLD,10));
        b1.setBounds(565,120,70,25);
        b1.setBackground(new Color(223, 203, 246));
        add(b1);

        b2 = new JRadioButton("Female");
        b2.setFont(new Font("Raleway",Font.BOLD,10));
        b2.setBounds(640,120,80,25);
        b2.setBackground(new Color(223, 203, 246));
        add(b2);

        b3 = new JRadioButton("Others");
        b3.setFont(new Font("Raleway",Font.BOLD,10));
        b3.setBounds(725,120,80,25);
        b3.setBackground(new Color(223, 203, 246));
        add(b3);

        ButtonGroup groupButtons = new ButtonGroup();
        groupButtons.add(b1);
        groupButtons.add(b2);
        groupButtons.add(b3);

        JLabel mStatus = new JLabel("4.Marital status:");
        mStatus.setFont(new Font("Raleway",Font.BOLD,15));
        mStatus.setBounds(150,155,150,25);
        add(mStatus);

        b4 = new JRadioButton("Married");
        b4.setFont(new Font("Raleway",Font.BOLD,10));
        b4.setBounds(300,155,80,25);
        b4.setBackground(new Color(223, 203, 246));
        add(b4);

        b5 = new JRadioButton("Unmarried");
        b5.setFont(new Font("Raleway",Font.BOLD,10));
        b5.setBounds(390,155,90,25);
        b5.setBackground(new Color(223, 203, 246));
        add(b5);
        b6 = new JRadioButton("Others");
        b6.setFont(new Font("Raleway",Font.BOLD,10));
        b6.setBounds(480,155,80,25);
        b6.setBackground(new Color(223, 203, 246));
        add(b6);

        ButtonGroup groupButtons1 = new ButtonGroup();
        groupButtons1.add(b4);
        groupButtons1.add(b5);
        groupButtons1.add(b6);

        JLabel dependers= new JLabel("5.No of Dependers:");
        dependers.setFont(new Font("Raleway",Font.BOLD,15));
        dependers.setBounds(570,155,150,25);
        add(dependers);

        textDependers = new JTextField();
        textDependers.setBackground(new Color(238, 185, 241));
        textDependers.setFont(new Font("Raleway",Font.BOLD,10));
        textDependers.setBounds(730,155,50,25);
        add(textDependers);

        JLabel nameOf= new JLabel("6.Name Of:");
        nameOf.setFont(new Font("Raleway",Font.BOLD,15));
        nameOf.setBounds(150,190,150,20);
        add(nameOf);

        JLabel extraInfo1= new JLabel("(please pick one)");
        extraInfo1.setFont(new Font("Raleway",Font.BOLD,9));
        extraInfo1.setBounds(160,211,150,18);
        add(extraInfo1);

        b7 = new JRadioButton("Father");
        b7.setFont(new Font("Raleway",Font.BOLD,10));
        b7.setBounds(300,190,70,25);
        b7.setBackground(new Color(223, 203, 246));
        add(b7);

        b8 = new JRadioButton("Mother");
        b8.setFont(new Font("Raleway",Font.BOLD,10));
        b8.setBounds(380,190,90,25);
        b8.setBackground(new Color(223, 203, 246));
        add(b8);

        b9 = new JRadioButton("Spouse");
        b9.setFont(new Font("Raleway",Font.BOLD,10));
        b9.setBounds(480,190,90,25);
        b9.setBackground(new Color(223, 203, 246));
        add(b9);

        ButtonGroup groupButtons2 = new ButtonGroup();
        groupButtons2.add(b7);
        groupButtons2.add(b8);
        groupButtons2.add(b9);


        textNameOf = new JTextField();
        textNameOf.setBackground(new Color(238, 185, 241));
        textNameOf.setFont(new Font("Raleway",Font.BOLD,10));
        textNameOf.setBounds(300,225,500,25);
        add(textNameOf);

        JLabel nameOfGuardian= new JLabel("7.Name Of Guardian:");
        nameOfGuardian.setFont(new Font("Raleway",Font.BOLD,14));
        nameOfGuardian.setBounds(155,258,150,17);
        add(nameOfGuardian);


        JLabel extraInfo2= new JLabel("(incase of Minor)");
        extraInfo2.setFont(new Font("Raleway",Font.BOLD,9));
        extraInfo2.setBounds(160,276,150,15);
        add(extraInfo2);

        textGuardian = new JTextField();
        textGuardian.setBackground(new Color(238, 185, 241));
        textGuardian.setFont(new Font("Raleway",Font.BOLD,10));
        textGuardian.setBounds(300,260,500,25);
        add(textGuardian);

        JLabel relationship= new JLabel("8.Relationship with guardian:");
        relationship.setFont(new Font("Raleway",Font.BOLD,15));
        relationship.setBounds(150,295,250,25);
        add(relationship);

        textRelationship = new JTextField();
        textRelationship.setBackground(new Color(238, 185, 241));
        textRelationship.setFont(new Font("Raleway",Font.BOLD,10));
        textRelationship.setBounds(390,295,410,25);
        add(textRelationship);

        JLabel nationality= new JLabel("9.Nationality:");
        nationality.setFont(new Font("Raleway",Font.BOLD,15));
        nationality.setBounds(150,330,100,25);
        add(nationality);

        b10 = new JRadioButton("Indian");
        b10.setFont(new Font("Raleway",Font.BOLD,10));
        b10.setBounds(300,330,70,25);
        b10.setBackground(new Color(223, 203, 246));
        add(b10);

        b11= new JRadioButton("Others");
        b11.setFont(new Font("Raleway",Font.BOLD,10));
        b11.setBounds(375,330,70,25);
        b11.setBackground(new Color(223, 203, 246));
        add(b11);


        ButtonGroup groupButtons3 = new ButtonGroup();
        groupButtons3.add(b10);
        groupButtons3.add(b11);



        JLabel country1= new JLabel("10.Country Name:");
        country1.setFont(new Font("Raleway",Font.BOLD,15));
        country1.setBounds(450,330,140,25);
        add(country1);

        textCountry1 = new JTextField();
        textCountry1.setBackground(new Color(238, 185, 241));
        textCountry1.setFont(new Font("Raleway",Font.BOLD,10));
        textCountry1.setBounds(600,330,200,25);
        add(textCountry1);

        JLabel religion = new JLabel("11.Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,15));
        religion.setBounds(150,365,150,25);
        add(religion);

        b12= new JRadioButton("Hindu");
        b12.setFont(new Font("Raleway",Font.BOLD,10));
        b12.setBounds(300,365,80,25);
        b12.setBackground(new Color(223, 203, 246));
        add(b12);

        b13= new JRadioButton("Muslim");
        b13.setFont(new Font("Raleway",Font.BOLD,10));
        b13.setBounds(390,365,90,25);
        b13.setBackground(new Color(223, 203, 246));
        add(b13);

        b14 = new JRadioButton("sikh");
        b14.setFont(new Font("Raleway",Font.BOLD,10));
        b14.setBounds(480,365,80,25);
        b14.setBackground(new Color(223, 203, 246));
        add(b14);

        b15 = new JRadioButton("christian");
        b15.setFont(new Font("Raleway",Font.BOLD,10));
        b15.setBounds(565,365,70,25);
        b15.setBackground(new Color(223, 203, 246));
        add(b15);

        b16 = new JRadioButton("others");
        b16.setFont(new Font("Raleway",Font.BOLD,10));
        b16.setBounds(640,365,80,25);
        b16.setBackground(new Color(223, 203, 246));
        add(b16);


        ButtonGroup groupButtons4 = new ButtonGroup();
        groupButtons4.add(b12);
        groupButtons4.add(b13);
        groupButtons4.add(b14);
        groupButtons4.add(b15);
        groupButtons4.add(b16);


       /* textreligion = new JTextField();
        textreligion.setBackground(new Color(238, 185, 241));
        textreligion.setFont(new Font("Raleway",Font.BOLD,10));
        textreligion.setBounds(700,365,100,25);
        add(textreligion);*/

        JLabel catagory = new JLabel("12.Catagory:");
        catagory.setFont(new Font("Raleway",Font.BOLD,15));
        catagory.setBounds(150,400,150,25);
        add(catagory);

        b17= new JRadioButton("General");
        b17.setFont(new Font("Raleway",Font.BOLD,11));
        b17.setBounds(300,400,80,25);
        b17.setBackground(new Color(223, 203, 246));
        add(b17);

        b18= new JRadioButton("SCBC");
        b18.setFont(new Font("Raleway",Font.BOLD,11));
        b18.setBounds(390,400,90,25);
        b18.setBackground(new Color(223, 203, 246));
        add(b18);

        b19 = new JRadioButton("OBC");
        b19.setBackground(new Color(223, 203, 246));
        b19.setFont(new Font("Raleway",Font.BOLD,11));
        b19.setBounds(480,400,80,25);
        b19.setBackground(new Color(223, 203, 246));
        add(b19);

        b20 = new JRadioButton("SC");
        b20.setBackground(new Color(223, 203, 246));
        b20.setFont(new Font("Raleway",Font.BOLD,11));
        b20.setBounds(565,400,70,25);
        b20.setBackground(new Color(223, 203, 246));
        add(b20);

        b21= new JRadioButton("ST");
        b21.setBackground(new Color(223, 203, 246));
        b21.setFont(new Font("Raleway",Font.BOLD,11));
        b21.setBounds(640,400,80,25);
        b21.setBackground(new Color(223, 203, 246));
        add(b21);

        ButtonGroup groupButtons5 = new ButtonGroup();
        groupButtons5.add(b17);
        groupButtons5.add(b18);
        groupButtons5.add(b19);
        groupButtons5.add(b20);
        groupButtons5.add(b21);

        JLabel disability= new JLabel("13.person with disability:");
        disability.setFont(new Font("Raleway",Font.BOLD,15));
        disability.setBounds(150,435,190,25);
        add(disability);

        b22 = new JRadioButton("YES");
        b22.setBackground(new Color(223, 203, 246));
        b22.setFont(new Font("Raleway",Font.BOLD,10));
        b22.setBounds(350,435,70,25);
        b22.setBackground(new Color(223, 203, 246));
        add(b22);

        b23= new JRadioButton("No");
        b23.setBackground(new Color(223, 203, 246));
        b23.setFont(new Font("Raleway",Font.BOLD,10));
        b23.setBounds(440,435,70,25);
        b23.setBackground(new Color(223, 203, 246));
        add(b23);

        ButtonGroup groupButtons6 = new ButtonGroup();
        groupButtons6.add(b22);
        groupButtons6.add(b23);


        JLabel phone = new JLabel("14.Phone No:");
        phone.setFont(new Font("Raleway",Font.BOLD,15));
        phone.setBounds(150,470,150,25);
        add(phone);

        textPhone = new JTextField();
        textPhone.setBackground(new Color(238, 185, 241));
        textPhone.setFont(new Font("Raleway",Font.BOLD,10));
        textPhone.setBounds(300,470,500,25);
        add( textPhone);

        JLabel email = new JLabel("15.Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,15));
        email.setBounds(150,505,150,25);
        add(email);

        textEmail = new JTextField();
        textEmail.setBackground(new Color(238, 185, 241));
        textEmail.setFont(new Font("Raleway",Font.BOLD,10));
        textEmail.setBounds(300,505,500,25);
        add(textEmail);




        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,10));
        next.setBounds(550,550,150,30);
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(223, 203, 246));
         setLayout(null);
         setSize(850,700);
         setLocation(240,25);
         setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name=textName.getText();

        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(b1.isSelected()){
            gender = "Male";
        } else if (b2.isSelected()) {
            gender = "Female";
        }else  if(b3.isSelected()){
            gender = "Others";
        }

        String marital = null;
        if(b4.isSelected()){
            marital = "Married";
        }else if(b5.isSelected()){
            marital = "unmarried";
        }else if(b6.isSelected()){
            marital = "others";
        }

        String nameof = null;
        if(b7.isSelected()){
            nameof = "Father";
        }else if(b8.isSelected()){
            nameof = "Mother";
        }else if(b9.isSelected()){
            nameof = "Spouse";
        }

        String nationality = null;
        if(b10.isSelected()){
            nationality= "Indian";
        }else if(b11.isSelected()){
            nationality= "Others";
        }



        String religion = null;
        if(b12.isSelected()){
            religion = "Hindu";
        }else if(b13.isSelected()){
            religion = "Muslim";
        }else if(b14.isSelected()){
            religion= "Sikh";
        }else if(b15.isSelected()){
            religion= "Christian";
        }else if(b16.isSelected()){
            religion= "others";
        }

        String catagory = null;
        if(b17.isSelected()){
            catagory = "General";
        }else if(b18.isSelected()){
            catagory = "SCBC";
        }else if(b19.isSelected()){
            catagory = "OBC";
        }else if(b20.isSelected()){
            catagory = "SC";
        }else if(b21.isSelected()){
            catagory = "ST";
        }

        String disability= null;
        if(b10.isSelected()){
            disability= "YES";
        }else if(b11.isSelected()){
            disability= "NO";
        }


        String dependers = textDependers.getText();
        String textnameOf= textNameOf.getText();
        String guardianName = textGuardian.getText();
        String relation = textRelationship.getText();
        String country1 = textCountry1.getText();
        //String religiontext= textreligion.getText();
        String phone = textPhone.getText();
        String email= textEmail.getText();


        try {
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Connect connect1 = new Connect();
                String q = "insert into signup values('"+formno+"','"+name+"','"+dob+"','"+gender+"','"+marital+"','"+dependers+"','"+nameof+"','"+textnameOf+"','"+guardianName+"','"+relation+"','"+nationality+"','"+country1+"','"+religion+"','"+catagory+"','"+disability+"','"+phone+"','"+email+"')";
                System.out.println(q);
                connect1.statement.executeUpdate(q);
                new SignUp2(first);
                setVisible(false);
            }

        }catch(Exception E){
           E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new SignUp();
    }
}
