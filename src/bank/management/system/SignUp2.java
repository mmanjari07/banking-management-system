package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame  implements ActionListener {
    JComboBox comboBox1,comboBox2,comboBox3;
    JTextField textEmployeeId,textBusiness,textAnualIncome,textNetWorth;

    JRadioButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;

    JButton next;


    String formno;
    SignUp2(String formno){
        super("APPLICATION FORM");

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


        JLabel pageno2=new JLabel("PAGE NO:2" );
        pageno2.setBounds(490,35,400,12);
        pageno2.setFont(new Font("Raleway",Font.BOLD,12));
        add(pageno2);

        JLabel titel2=new JLabel("Qualifiacation And Occupation Details" );
        titel2.setBounds(360,55,400,25);
        titel2.setFont(new Font("Raleway",Font.BOLD,22));
        add(titel2);

        //-----------------------------------------------------------------------------------------------

        JLabel qualification= new JLabel("16.Educational Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,15));
        qualification.setBounds(110,110,250,25);
        add(qualification);

        String education[] = {"Null","upto 9th class passed","10th class passed","Non Graduate","Graduate","Post Graduate","computer Degree","Diploma","MCA","Doctrate","Others"};
        comboBox1= new JComboBox(education);
        comboBox1.setBackground(new Color(238, 185, 241));
        comboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox1.setBounds(350,110,450,25);
        add(comboBox1);

        JLabel occupationtype = new JLabel("17.Occupation Type service:");
        occupationtype.setFont(new Font("Raleway",Font.BOLD,15));
        occupationtype.setBounds(110,145,250,25);
        add(occupationtype);

        String occupation[] = {"Null","State govt.","central govt","Public sector Undertaking","Defence","Private Sector","Student","Business","Retired","House Wife","Farmer","Social worker","In politics","Others"};
        comboBox2 = new JComboBox(occupation);
        comboBox2.setBackground(new Color(238, 185, 241));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,145,450,25);
        add(comboBox2);

        JLabel employeeId = new JLabel("18.Employee id:");
        employeeId.setFont(new Font("Raleway",Font.BOLD,15));
        employeeId.setBounds(110,180,200,25);
        add(employeeId);

        textEmployeeId = new JTextField();
        textEmployeeId.setBackground(new Color(238, 185, 241));
        textEmployeeId.setFont(new Font("Raleway",Font.BOLD,10));
        textEmployeeId.setBounds(350,180,450,25);
        add( textEmployeeId);

        JLabel business = new JLabel("19.Type Of Business:");
        business.setFont(new Font("Raleway",Font.BOLD,15));
        business.setBounds(110,223,200,25);
        add(business);

        b1= new JRadioButton("Contractor");
        b1.setBackground(new Color(223, 203, 246));
        b1.setFont(new Font("Raleway",Font.BOLD,10));
        b1.setBounds(350,215,80,25);
        add(b1);

        b2= new JRadioButton("Industrialist");
        b2.setBackground(new Color(223, 203, 246));
        b2.setFont(new Font("Raleway",Font.BOLD,10));
        b2.setBounds(440,215,90,25);
        add(b2);

        b3 = new JRadioButton("Trade sect.");
        b3.setBackground(new Color(223, 203, 246));
        b3.setFont(new Font("Raleway",Font.BOLD,10));
        b3.setBounds(540,215,80,25);
        add(b3);

        b4 = new JRadioButton("Jeweller");
        b4.setBackground(new Color(223, 203, 246));
        b4.setFont(new Font("Raleway",Font.BOLD,10));
        b4.setBounds(630,215,70,25);
        add(b4);

        b5= new JRadioButton("Labour");
        b5.setBackground(new Color(223, 203, 246));
        b5.setFont(new Font("Raleway",Font.BOLD,10));
        b5.setBounds(710,215,80,25);
        add(b5);

        b6= new JRadioButton("Shop");
        b6.setBackground(new Color(223, 203, 246));
        b6.setFont(new Font("Raleway",Font.BOLD,10));
        b6.setBounds(350,250,60,25);
        add(b6);

        b7 = new JRadioButton("Import/Export customer");
        b7.setBackground(new Color(223, 203, 246));
        b7.setFont(new Font("Raleway",Font.BOLD,10));
        b7.setBounds(420,250,150,25);
        add(b7);

        b8 = new JRadioButton("other self-Employed");
        b8.setBackground(new Color(223, 203, 246));
        b8.setFont(new Font("Raleway",Font.BOLD,10));
        b8.setBounds(580,250,120,25);
        add(b8);


        /*ButtonGroup groupButtons = new ButtonGroup();
        groupButtons.add(b1);
        groupButtons.add(b2);
        groupButtons.add(b3);
        groupButtons.add(b4);
        groupButtons.add(b5);
        groupButtons.add(b6);
        groupButtons.add(b7);
        groupButtons.add(b8);*/


        JLabel otherBusiness= new JLabel("20.Other Business:");
        otherBusiness.setFont(new Font("Raleway",Font.BOLD,15));
        otherBusiness.setBounds(110,285,200,25);
        add(otherBusiness);

        textBusiness= new JTextField();
        textBusiness.setBackground(new Color(238, 185, 241));
        textBusiness.setFont(new Font("Raleway",Font.BOLD,10));
        textBusiness.setBounds(350,285,450,25);
        add( textBusiness);


        JLabel anualIncome= new JLabel("21.Anual Income:");
        anualIncome.setFont(new Font("Raleway",Font.BOLD,15));
        anualIncome.setBounds(110,320,200,25);
        add(anualIncome);

        textAnualIncome= new JTextField();
        textAnualIncome.setBackground(new Color(238, 185, 241));
        textAnualIncome.setFont(new Font("Raleway",Font.BOLD,10));
        textAnualIncome.setBounds(350,320,450,25);
        add( textAnualIncome);

        JLabel sourceIncome= new JLabel("22.Source of Income:");
        sourceIncome.setFont(new Font("Raleway",Font.BOLD,15));
        sourceIncome.setBounds(110,355,200,25);
        add(sourceIncome);

        String sourceOfIncome[] = {"Null","salary","Business Income","Agriculture","Investment","Others"};
        comboBox3 = new JComboBox(sourceOfIncome);
        comboBox3.setBackground(new Color(238, 185, 241));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,355,450,25);
        add(comboBox3);

        JLabel netWorth= new JLabel("23.Net Worth:");
        netWorth.setFont(new Font("Raleway",Font.BOLD,15));
        netWorth.setBounds(110,390,200,25);
        add(netWorth);

        textNetWorth= new JTextField();
        textNetWorth.setBackground(new Color(238, 185, 241));
        textNetWorth.setFont(new Font("Raleway",Font.BOLD,10));
        textNetWorth.setBounds(350,390,450,25);
        add( textNetWorth);

        JLabel existingAccount = new JLabel("24. Existing Account:");
        existingAccount.setFont(new Font("Raleway",Font.BOLD,15));
        existingAccount.setBounds(110,425,200,25);
        add(existingAccount);

        b9= new JRadioButton("yes");
        b9.setBackground(new Color(223, 203, 246));
        b9.setFont(new Font("Raleway",Font.BOLD,10));
        b9.setBounds(350,425,80,25);
        add(b9);

        b10= new JRadioButton("No");
        b10.setBackground(new Color(223, 203, 246));
        b10.setFont(new Font("Raleway",Font.BOLD,10));
        b10.setBounds(440,425,90,25);
        add(b10);

        ButtonGroup groupButtons2 = new ButtonGroup();
        groupButtons2.add(b9);
        groupButtons2.add(b10);

//---------------------------------------next--------------------------------------------------
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,10));
        next.setBounds(550,480,150,30);
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




        String qualification1=(String) comboBox1.getSelectedItem();
        String occupationType1=(String) comboBox2.getSelectedItem();
        String sourceOfIncome1=(String) comboBox3.getSelectedItem();


        String employeeid =textEmployeeId.getText();
        String business=textBusiness.getText();
        String anualIncome=textAnualIncome.getText();
        String networth=textNetWorth.getText();


        String businessType=null;
        if(b1.isSelected()){
            businessType="Contractor";
        } else if (b2.isSelected()) {
            businessType="Industrialist";
        }else if (b3.isSelected()) {
            businessType="Tread sect.";
        }else if (b4.isSelected()) {
            businessType="Jeweller";
        }else if (b5.isSelected()) {
            businessType="Labour";
        }else if (b6.isSelected()) {
            businessType="Shop";
        }else if (b7.isSelected()) {
            businessType="Import/Export customer";
        }else if (b8.isSelected()) {
            businessType="other self-Employed";
        }

        String existingAcc =null;
        if(b9.isSelected()){
            existingAcc="Yes";
        } else if (b10.isSelected()) {
            existingAcc="No";
        }

        try {
            if(comboBox1.getSelectedItem().equals("") || comboBox2.getSelectedItem().equals("") || textAnualIncome.getText().equals("") || textNetWorth.getText().equals("") ){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Connect connect2 = new Connect();
                String q2 = "insert into signup2 values('"+formno+"','"+qualification1+"','"+occupationType1+"','"+employeeid+"','"+businessType+"','"+business+"','"+anualIncome+"','"+sourceOfIncome1+"','"+networth+"','"+existingAcc+"')";
                System.out.println(q2);
                connect2.statement.executeUpdate(q2);
                new SignUp3(formno);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {

        new SignUp2("");
    }

}
