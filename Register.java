import javax.swing.*;
import java.awt.*;

public class Register {

    JFrame f;
    JTextField tname,temail,tpass,tcompass,tuserid,tphone,tRollno,tdiv;
    JLabel lname,lemail,lpass,lcompass,luserid,lphone,lRollno,ldiv, L_register, imglabel1, imglabel2;
    JLabel logo,bk,Register;
    ImageIcon img1;
    ImageIcon img,img2;
    JPanel info,design;
    JButton bCreateAcc, submit, L_create;

    public Register(){
    	
    	ImageIcon rectangle1 = new ImageIcon("src/rectangle2.png");
    	ImageIcon student1 = new ImageIcon("src/Login-rafiki-resized.png");

    	imglabel1 = new JLabel();
        imglabel1.setIcon(rectangle1);
        imglabel1.setBounds(75,20,546,572);
    	
        imglabel2 = new JLabel();
        imglabel2.setIcon(student1);
        imglabel2.setBounds(0,130,350,350);
        
        Register = new JLabel();
        Register.setText("REGISTER");
        Register.setFont(new Font("Elephant",Font.PLAIN,30));
        Register.setBackground(Color.white);
        Register.setOpaque(true);
        Register.setBounds(225,75,200,148-118);
        
        lRollno = new JLabel("Roll No");
        lemail = new JLabel("Email Id");
        lname = new JLabel("Name");
        ldiv = new JLabel("Division");
        lcompass = new JLabel("Confirm Password");
        lpass = new JLabel("Password");
        lphone = new JLabel("Phone Number");
        luserid = new JLabel("User-Id");

        tname = new JTextField();
        tRollno = new JTextField();
        temail = new JTextField();
        tuserid = new JTextField();
        tdiv = new JTextField();
        tcompass= new JTextField();
        tpass = new JTextField();
        tphone = new JTextField();

//        tname.setBorder(null);
//        tpass.setBorder(null);
//        tRollno.setBorder(null);
//        tuserid.setBorder(null);
//        tdiv.setBorder(null);
//        tphone.setBorder(null);
//        tcompass.setBorder(null);
//        temail.setBorder(null);

        lname.setBounds(100,100,200,50);
        luserid.setBounds(100,190,200,50);
        ldiv.setBounds(100,280,200,50);
        lpass.setBounds(100,370,200,50);

        lemail.setBounds(360,100,140,50);
        lphone.setBounds(360,190,140,50);
        lRollno.setBounds(360,280,140,50);
        lcompass.setBounds(360,370,140,50);
        
        tname.setBounds(100,140,200,39);
        tuserid.setBounds(100,230,200,39);
        tdiv.setBounds(100,320,200,39);
        tpass.setBounds(100,410,200,39);

        temail.setBounds(360,140,200,39);
        tphone.setBounds(360,230,200,39);
        tRollno.setBounds(360,320,200,39);
        tcompass.setBounds(360,410,200,39);
        
        lname.setFont(new Font("Sahitya", Font.PLAIN, 18));
        luserid.setFont(new Font("Sahitya", Font.PLAIN, 15));
        ldiv.setFont(new Font("Sahitya", Font.PLAIN, 18));
        lpass.setFont(new Font("Sahitya", Font.PLAIN, 18));
        lemail.setFont(new Font("Sahitya", Font.PLAIN, 18));
        lphone.setFont(new Font("Sahitya", Font.PLAIN, 18));
        lRollno.setFont(new Font("Sahitya", Font.PLAIN, 18));
        lcompass.setFont(new Font("Sahitya", Font.PLAIN, 18));
        tname.setFont(new Font("Sahitya", Font.PLAIN, 18));
        tuserid.setFont(new Font("Sahitya", Font.PLAIN, 18));
        tdiv.setFont(new Font("Sahitya", Font.PLAIN, 18));
        tpass.setFont(new Font("Sahitya", Font.PLAIN, 18));
        temail.setFont(new Font("Sahitya", Font.PLAIN, 18));
        tphone.setFont(new Font("Sahitya", Font.PLAIN, 18));
        tRollno.setFont(new Font("Sahitya", Font.PLAIN, 18));
        tcompass.setFont(new Font("Sahitya", Font.PLAIN, 18));
        
        bCreateAcc = new JButton("Create Account");
        bCreateAcc.setBorder(null);
        bCreateAcc.setFont(new Font("Sahitya", Font.PLAIN, 15));
        bCreateAcc.setBounds(280,470,100,35);
        bCreateAcc.setFocusable(false);
        
        L_register = new JLabel("Already have an account?");
        L_register.setBounds(245,500,250,30);
        L_register.setFont(new Font("Product Sans", Font.PLAIN, 15));
        
        L_create = new JButton("Sign-in");
        L_create.setBounds(285,525,100,30);
        L_create.setFont(new Font("Product Sans", Font.PLAIN, 14));
        L_create.setForeground(Color.BLUE.darker());
        L_create.setBackground(Color.white);
        L_create.setBorderPainted(false);
        L_create.setFocusable(false);
        
        f = new JFrame();
        f.setLayout(null);
        f.getContentPane().setBackground(new Color(0xFBC4AB));
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        design = new JPanel();
        design.setLayout(null);
        design.setBounds(0,0,350,650);
        design.setBackground(new Color(0xec2525));

        info = new JPanel();
        info.setLayout(null);
        info.setBounds(350,0,650,650);
        info.setBackground(Color.white);
        
        design.add(imglabel2);
        
        info.add(bCreateAcc);
        info.add(Register);

        info.add(tname);
        info.add(tRollno);
        info.add(tdiv);
        info.add(tcompass);
        info.add(tpass);
        info.add(temail);
        info.add(tphone);
        info.add(tuserid);

        info.add(lname);
        info.add(lRollno);
        info.add(lcompass);
        info.add(ldiv);
        info.add(lemail);
        info.add(lpass);
        info.add(luserid);
        info.add(lphone);
        info.add(imglabel1);
       
        info.add(L_register);
        info.add(L_create);

        f.setBounds(200,50,1000,650);
        f.add(design);
        f.add(info);
        f.setVisible(true);

    }
    public static void main(String args[]) {
    	new Register();
    }
}