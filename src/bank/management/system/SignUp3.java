package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener {


    JComboBox comboBox1,comboBox2;
    JTextField textDocumentNo,textIdIssuedBy,textAdharNo,textPanNo,textAddress1,textAddress2,textCity1,textCity2,textDistrict1,textDistrict2,textState1,textState2,textPin1,textPin2,textCountry1,textCountry2;

    JRadioButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;

    JDateChooser dateChooser2,dateChooser3;
    String formno;

    JButton next;

    //-------------------------------Constructor---------------------------------------------------
    SignUp3(String formno) {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Bank-PNG-File.png"));
        Image i2 = i1.getImage().getScaledInstance(125, 75, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(160, 7, 100, 70);
        add(image);

        this.formno = formno;

        JLabel formNo = new JLabel("FORM NO:");
        formNo.setFont(new Font("Raleway", Font.BOLD, 14));
        formNo.setBounds(600, 8, 70, 15);
        add(formNo);

        JLabel formtext = new JLabel(formno);
        formtext.setFont(new Font("Raleway", Font.BOLD, 14));
        formtext.setBounds(675, 8, 200, 15);
        add(formtext);


        JLabel pageno3 = new JLabel("PAGE NO:4");
        pageno3.setBounds(450, 35, 400, 12);
        pageno3.setFont(new Font("Raleway", Font.BOLD, 12));
        add(pageno3);


        JLabel titel3=new JLabel("Identity proof,Address Details" );
        titel3.setBounds(360,55,400,25);
        titel3.setFont(new Font("Raleway",Font.BOLD,22));
        add(titel3);

        //-------------------------------------------Identity Proof----------------------------------------------------

        JLabel adharNo = new JLabel("29.Adhar No:");
        adharNo.setFont(new Font("Raleway",Font.BOLD,15));
        adharNo.setBounds(100,110,120,25);
        add(adharNo);

        textAdharNo = new JTextField();
        textAdharNo.setBackground(new Color(238, 185, 241));
        textAdharNo.setFont(new Font("Raleway",Font.BOLD,10));
        textAdharNo.setBounds(240,110,180,25);
        add( textAdharNo);

        JLabel PanNo = new JLabel("30.Pan No:");
        PanNo.setFont(new Font("Raleway",Font.BOLD,15));
        PanNo.setBounds(470,110,120,25);
        add(PanNo);

        textPanNo = new JTextField();
        textPanNo.setBackground(new Color(238, 185, 241));
        textPanNo.setFont(new Font("Raleway",Font.BOLD,10));
        textPanNo.setBounds(590,110,180,25);
        add( textPanNo);


        JLabel edocument = new JLabel("31.Whether submitted document is equivalant e-document:");
        edocument.setFont(new Font("Raleway",Font.BOLD,15));
        edocument.setBounds(100,145,470,25);
        add(edocument);

        String eDocumentType[] = {"yes","no"};
        comboBox1 = new JComboBox(eDocumentType);
        comboBox1.setBackground(new Color(238, 185, 241));
        comboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox1.setBounds(590,145,180,25);
        add(comboBox1);

        JLabel idtype= new JLabel("32.Proof of Id:");
        idtype.setFont(new Font("Raleway",Font.BOLD,15));
        idtype.setBounds(100,180,120,25);
        add(idtype);

        String Documenttype[] = {"Null","Passport","Voter-ID","Driving Licence","Adhar No","Kyc","Others"};
        comboBox2= new JComboBox(Documenttype);
        comboBox2.setBackground(new Color(238, 185, 241));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(240,180,150,25);
        add(comboBox2);

        JLabel DocumentNo = new JLabel("33.Document No:");
        DocumentNo.setFont(new Font("Raleway",Font.BOLD,15));
        DocumentNo.setBounds(400,180,150,25);
        add(DocumentNo);

        textDocumentNo = new JTextField();
        textDocumentNo.setBackground(new Color(238, 185, 241));
        textDocumentNo.setFont(new Font("Raleway",Font.BOLD,10));
        textDocumentNo.setBounds(560,180,210,25);
        add(textDocumentNo);

        JLabel issuedby= new JLabel("34.Issued By:");
        issuedby.setFont(new Font("Raleway",Font.BOLD,15));
        issuedby.setBounds(100,215,100,25);
        add(issuedby);

        textIdIssuedBy= new JTextField();
        textIdIssuedBy.setBackground(new Color(238, 185, 241));
        textIdIssuedBy.setFont(new Font("Raleway",Font.BOLD,10));
        textIdIssuedBy.setBounds(210,215,110,25);
        add( textIdIssuedBy);

        JLabel issuedDate= new JLabel("35.Issued Date:");
        issuedDate.setFont(new Font("Raleway",Font.BOLD,15));
        issuedDate.setBounds(325,215,120,25);
        add(issuedDate);

        dateChooser2 = new JDateChooser();
        //dateChooser2.setBackground(new Color(235, 195, 245));
        dateChooser2.setForeground(new Color(26, 25, 25));
        dateChooser2.setBounds(450,215,90,25);
        add(dateChooser2);

        JLabel expireDate= new JLabel("36.Expiry Date:");
        expireDate.setFont(new Font("Raleway",Font.BOLD,15));
        expireDate.setBounds(555,215,110,25);
        add(expireDate);

        dateChooser3 = new JDateChooser();
        // dateChooser3.setBackground(new Color(235, 195, 245));
        dateChooser3.setForeground(new Color(26, 25, 25));
        dateChooser3.setBounds(680,215,90,25);
        add(dateChooser3);


        //--------------------------------Current Address------------------------------------------------

        JLabel address1 = new JLabel("37.Current address:");
        address1.setFont(new Font("Raleway",Font.BOLD,15));
        address1.setBounds(100,250,150,25);
        add(address1);

        textAddress1 = new JTextField();
        textAddress1.setBackground(new Color(238, 185, 241));
        textAddress1.setFont(new Font("Raleway",Font.BOLD,10));
        textAddress1.setBounds(260,250,510,25);
        add(textAddress1);

        JLabel city1= new JLabel("38.City/Village:");
        city1.setFont(new Font("Raleway",Font.BOLD,15));
        city1.setBounds(100,285,120,25);
        add(city1);

        textCity1 = new JTextField();
        textCity1.setBackground(new Color(238, 185, 241));
        textCity1.setFont(new Font("Raleway",Font.BOLD,10));
        textCity1.setBounds(230,285,210,25);
        add(textCity1);

        JLabel district1= new JLabel("39.District:");
        district1.setFont(new Font("Raleway",Font.BOLD,15));
        district1.setBounds(450,285,100,25);
        add(district1);

        textDistrict1 = new JTextField();
        textDistrict1.setBackground(new Color(238, 185, 241));
        textDistrict1.setFont(new Font("Raleway",Font.BOLD,10));
        textDistrict1.setBounds(560,285,210,25);
        add(textDistrict1);

        JLabel state1= new JLabel("40.State:");
        state1.setFont(new Font("Raleway",Font.BOLD,15));
        state1.setBounds(100,320,65,25);
        add(state1);

        textState1 = new JTextField();
        textState1.setBackground(new Color(238, 185, 241));
        textState1.setFont(new Font("Raleway",Font.BOLD,10));
        textState1.setBounds(175,320,145,25);
        add(textState1);

        JLabel pin1= new JLabel("41.Pin:");
        pin1.setFont(new Font("Raleway",Font.BOLD,15));
        pin1.setBounds(330,320,53,25);
        add(pin1);

        textPin1 = new JTextField();
        textPin1.setBackground(new Color(238, 185, 241));
        textPin1.setFont(new Font("Raleway",Font.BOLD,10));
        textPin1.setBounds(390,320,140,25);
        add(textPin1);

        JLabel country1= new JLabel("42.Country:");
        country1.setFont(new Font("Raleway",Font.BOLD,15));
        country1.setBounds(540,320,85,25);
        add(country1);

        textCountry1 = new JTextField();
        textCountry1.setBackground(new Color(238, 185, 241));
        textCountry1.setFont(new Font("Raleway",Font.BOLD,10));
        textCountry1.setBounds(630,320,140,25);
        add(textCountry1);

        JLabel addresstype1 = new JLabel("43.Address Type:");
        addresstype1.setFont(new Font("Raleway",Font.BOLD,15));
        addresstype1.setBounds(100,355,150,25);
        add(addresstype1);

        b1= new JRadioButton("Residental");
        b1.setBackground(new Color(223, 203, 246));
        b1.setFont(new Font("Raleway",Font.BOLD,12));
        b1.setBounds(265,355,100,25);
        add(b1);

        b2= new JRadioButton("Business");
        b2.setBackground(new Color(223, 203, 246));
        b2.setFont(new Font("Raleway",Font.BOLD,12));
        b2.setBounds(375,355,100,25);
        add(b2);

        b3 = new JRadioButton("Registered Office");
        b3.setBackground(new Color(223, 203, 246));
        b3.setFont(new Font("Raleway",Font.BOLD,12));
        b3.setBounds(485,355,130,25);
        add(b3);

        b4 = new JRadioButton("Unspecified");
        b4.setBackground(new Color(223, 203, 246));
        b4.setFont(new Font("Raleway",Font.BOLD,12));
        b4.setBounds(625,355,100,25);
        add(b4);


        ButtonGroup groupButtons = new ButtonGroup();
        groupButtons.add(b1);
        groupButtons.add(b2);
        groupButtons.add(b3);
        groupButtons.add(b4);





        //-----------------------------------Permant Address---------------------------





        JLabel address2 = new JLabel("44.Permant address:");
        address2.setFont(new Font("Raleway",Font.BOLD,15));
        address2.setBounds(100,390,170,25);
        add(address2);

        textAddress2 = new JTextField();
        textAddress2.setBackground(new Color(238, 185, 241));
        textAddress2.setFont(new Font("Raleway",Font.BOLD,10));
        textAddress2.setBounds(275,390,497,25);
        add(textAddress2);

        JLabel city2= new JLabel("45.City/Village:");
        city2.setFont(new Font("Raleway",Font.BOLD,15));
        city2.setBounds(100,425,120,25);
        add(city2);

        textCity2 = new JTextField();
        textCity2.setBackground(new Color(238, 185, 241));
        textCity2.setFont(new Font("Raleway",Font.BOLD,10));
        textCity2.setBounds(230,425,210,25);
        add(textCity2);

        JLabel district2= new JLabel("46.District:");
        district2.setFont(new Font("Raleway",Font.BOLD,15));
        district2.setBounds(450,425,100,25);
        add(district2);

        textDistrict2 = new JTextField();
        textDistrict2.setBackground(new Color(238, 185, 241));
        textDistrict2.setFont(new Font("Raleway",Font.BOLD,10));
        textDistrict2.setBounds(560,425,210,25);
        add(textDistrict2);

        JLabel state2= new JLabel("47.State:");
        state2.setFont(new Font("Raleway",Font.BOLD,15));
        state2.setBounds(100,460,65,25);
        add(state2);

        textState2 = new JTextField();
        textState2.setBackground(new Color(238, 185, 241));
        textState2.setFont(new Font("Raleway",Font.BOLD,10));
        textState2.setBounds(175,460,145,25);
        add(textState2);

        JLabel pin2= new JLabel("48.Pin:");
        pin2.setFont(new Font("Raleway",Font.BOLD,15));
        pin2.setBounds(330,460,53,25);
        add(pin2);

        textPin2= new JTextField();
        textPin2.setBackground(new Color(238, 185, 241));
        textPin2.setFont(new Font("Raleway",Font.BOLD,10));
        textPin2.setBounds(390,460,140,25);
        add(textPin2);

        JLabel country2= new JLabel("49.Country:");
        country2.setFont(new Font("Raleway",Font.BOLD,15));
        country2.setBounds(540,460,85,25);
        add(country2);

        textCountry2 = new JTextField();
        textCountry2.setBackground(new Color(238, 185, 241));
        textCountry2.setFont(new Font("Raleway",Font.BOLD,10));
        textCountry2.setBounds(630,460,140,25);
        add(textCountry2);

        JLabel addressType2= new JLabel("50.Address Type:");
        addressType2.setFont(new Font("Raleway",Font.BOLD,15));
        addressType2.setBounds(100,495,150,25);
        add(addressType2);

        b5= new JRadioButton("Residental");
        b5.setBackground(new Color(223, 203, 246));
        b5.setFont(new Font("Raleway",Font.BOLD,12));
        b5.setBounds(265,495,100,25);
        add(b5);

        b6= new JRadioButton("Business");
        b6.setBackground(new Color(223, 203, 246));
        b6.setFont(new Font("Raleway",Font.BOLD,12));
        b6.setBounds(375,495,100,25);
        add(b6);

        b7 = new JRadioButton("Registered Office");
        b7.setBackground(new Color(223, 203, 246));
        b7.setFont(new Font("Raleway",Font.BOLD,12));
        b7.setBounds(485,495,130,25);
        add(b7);

        b8 = new JRadioButton("Unspecified");
        b8.setBackground(new Color(223, 203, 246));
        b8.setFont(new Font("Raleway",Font.BOLD,12));
        b8.setBounds(625,495,100,25);
        add(b8);

        ButtonGroup groupButtons1 = new ButtonGroup();
        groupButtons1.add(b5);
        groupButtons1.add(b6);
        groupButtons1.add(b7);
        groupButtons1.add(b8);





        //-------------------------Next button_____________

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,10));
        next.setBounds(520,550,150,30);
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.addActionListener(this);
        add(next);

        //---------------------------------------------------------------------------




        getContentPane().setBackground(new Color(223, 203, 246));
        setLayout(null);
        setSize(850,700);
        setLocation(240,25);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String issuedDate1 = ((JTextField)dateChooser2.getDateEditor().getUiComponent()).getText();
        String expireDate1 = ((JTextField)dateChooser3.getDateEditor().getUiComponent()).getText();

        String edocument1=(String) comboBox1.getSelectedItem();
        String documentType1=(String) comboBox2.getSelectedItem();



        String documentNo =textDocumentNo.getText();
        String idIssuedBy=textIdIssuedBy.getText();
        String adharNo=textAdharNo.getText();
        String pan=textPanNo.getText();
        String address11 =textAddress1.getText();
        String city11=textCity1.getText();
        String district11=textDistrict1.getText();
        String state11=textState1.getText();
        String pin11=textPin1.getText();
        String country11=textCountry1.getText();
        String address22=textAddress2.getText();
        String city22=textCity2.getText();
        String district22=textDistrict2.getText();
        String  state22=textState2.getText();
        String pin22=textPin2.getText();
        String country22=textCountry2.getText();




        String addressType11 =null;
        if(b1.isSelected()){
            addressType11 ="Residental";
        } else if (b2.isSelected()) {
            addressType11 ="Business";
        } else if (b3.isSelected()) {
            addressType11 ="Registered Office";
        }else if (b4.isSelected()) {
            addressType11 ="Unspecified";
        }


        String addressType22 =null;
        if(b5.isSelected()){
            addressType22 ="Residental";
        } else if (b6.isSelected()) {
            addressType22="Business";
        } else if (b7.isSelected()) {
            addressType22 ="Registered Office";
        }else if (b8.isSelected()) {
            addressType22 ="Unspecified";
        }



        try {
            if(textAdharNo.getText().equals("") || textPanNo.getText().equals("") || textPin1.getText().equals("") || textPin2.getText().equals("") ) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                Connect connect3 = new Connect();
                String q3= "insert into signup3 values('"+formno+"','"+adharNo+"','"+pan+"','"+edocument1+"','"+documentType1+"','"+documentNo+"','"+idIssuedBy+"','"+issuedDate1+"','"+expireDate1+"','"+address11+"','"+city11+"','"+district11+"','"+state11+"','"+pin11+"','"+country11+"','"+addressType11+"','"+address22+"','"+city22+"','"+district22+"','"+state22+"','"+pin22+"','"+country22+"','"+addressType22+"')";
                System.out.println(q3);
                connect3.statement.executeUpdate(q3);
                new SignUp4(formno);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }




    }

    public static void main(String[] args) {

        new SignUp3("");
    }




}
