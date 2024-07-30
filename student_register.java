//package JavaMin;
import javax.swing.*;
import java.awt.*;

public class student_register {

    JFrame f;
    JTextField tname,temail,tpass,tcompass,tuserid,tphone,tbranch,tdiv;
    JLabel lname,lemail,lpass,lcompass,luserid,lphone,lbranch,ldiv;
    JLabel logo,bk,Register,s;
    ImageIcon img1;
    ImageIcon img,img2;
    JPanel info,design;
    JButton bCreateAcc;

    public student_register(){

        img1 = new ImageIcon("src/img_1.png");
        img = new ImageIcon("src/img_2.png");
        img2 = new ImageIcon("src/img.png");

        lbranch = new JLabel("Branch");
        lemail = new JLabel("Email Id");
        lname = new JLabel("Name");
        ldiv = new JLabel("Division");
        lcompass = new JLabel("Confirm Password");
        lpass = new JLabel("Password");
        lphone = new JLabel("Phone Number");
        luserid = new JLabel("User-Id");

        tname = new JTextField();
        tbranch = new JTextField();
        temail = new JTextField();
        tuserid = new JTextField();
        tdiv = new JTextField();
        tcompass= new JTextField();
        tpass = new JTextField();
        tphone = new JTextField();
//
//        tname.setBorder(null);
//        tpass.setBorder(null);
//        tbranch.setBorder(null);
//        tuserid.setBorder(null);
//        tdiv.setBorder(null);
//        tphone.setBorder(null);
//        tcompass.setBorder(null);
//        temail.setBorder(null);

        tname.setBounds(100,170,200,39);
        tuserid.setBounds(100,270,200,39);
        tbranch.setBounds(100,370,200,39);
        tpass.setBounds(100,470,200,39);

        temail.setBounds(360,141,200,39);
        tphone.setBounds(360,141+95,200,39);
        tdiv.setBounds(360,141+190,200,39);
        tcompass.setBounds(360,141+285,200,39);

        lname.setBounds(100,130,140,50);
        luserid.setBounds(100,230,140,50);
        lbranch.setBounds(100,330,140,50);
        lpass.setBounds(100,430,140,50);

        lemail.setBounds(360,111,140,29);
        lphone.setBounds(360,111+95,140,29);
        ldiv.setBounds(360,111+190,140,29);
        lcompass.setBounds(360,111+285,140,29);

        f = new JFrame();
        f.setLayout(null);
        f.getContentPane().setBackground(new Color(0xFBC4AB));
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        design = new JPanel();
        design.setLayout(null);
        design.setBounds(0,0,350,650);
        design.setBackground(new Color(0xFFDAB9));

        info = new JPanel();
        info.setLayout(null);
        info.setBounds(350,0,1165-585,650);
        info.setBackground(Color.WHITE);

        s = new JLabel("Already have an account?");
        s.setOpaque(true);
        s.setBounds(1275,64,57,57);

//        tname = new JTextField();
//        tname.setBounds(975,64,276,120-64);
//        tname.setFont(new Font("MV BOLLI",Font.PLAIN,30));


        Register = new JLabel();
        Register.setText("REGISTER");
        Register.setFont(new Font("SANS_SERIF",Font.PLAIN,35));
        Register.setBackground(new Color(0xFFDAB9));
        Register.setOpaque(true);
        Register.setBounds(197,48,967-585-197,148-118);

//        bk = new JLabel();
//        bk.setIcon(img);
//        bk.setBackground(new Color(0,0,0,0));
//        bk.setOpaque(true);


//          logo = new JLabel();
//        logo.setOpaque(true);
//        logo.setBounds(160,30,120,120);

        bCreateAcc = new JButton("Create Account");
        bCreateAcc.setBorder(null);
        bCreateAcc.setBackground(Color.pink);
        bCreateAcc.setBounds(206,497,185,31);
        bCreateAcc.setFocusable(false);

        info.add(bCreateAcc);
        info.add(Register);

        info.add(tname);
        info.add(tbranch);
        info.add(tdiv);
        info.add(tcompass);
        info.add(tpass);
        info.add(temail);
        info.add(tphone);
        info.add(tuserid);

        info.add(lname);
        info.add(lbranch);
        info.add(lcompass);
        info.add(ldiv);
        info.add(lemail);
        info.add(lpass);
        info.add(luserid);
        info.add(lphone);

        f.setBounds(0,0,1000,650);
        f.add(design);
        f.add(info);
        f.setVisible(true);

    }
    public static void main(String [] args) {
		new student_register();
	}
}