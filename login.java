import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
 


public class login {
	JFrame LoginFrame;
	JPanel content , design;
	JLabel L_username, L_password, L_register, L_createhere, imglabel,imglabel2, title;
	JTextField T_username, T_password;
	JButton submit;
	
	ImageIcon rectangle1 = new ImageIcon("src/rectangle1.png");
	ImageIcon teacher1 = new ImageIcon("src/Formula-rafiki100px.jpg.png");
	
	public login() {
		Border design_border = BorderFactory.createLineBorder(Color.BLACK,1);
		
		LoginFrame = new JFrame();
		LoginFrame.setLayout(null);
		LoginFrame.setVisible(true);
		LoginFrame.setBounds(50,10,1000,650);
		LoginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		LoginFrame.setTitle("Login Here");
		LoginFrame.setResizable(false);
		LoginFrame.getContentPane().setBackground(Color.white);
		
		
		design = new JPanel();
        design.setLayout(null);
        design.setBounds(0,0,400,650);
        design.setBackground(new Color(0x3f5fff));
        //design.setBackground(Color.WHITE);
        //design.setSize(400,750);
        //design.setBorder(design_border);
        
        content = new JPanel();
        content.setLayout(null);
        content.setBounds(400,0,600,650);
       // content.setSize(880,750);
        content.setBackground(Color.white);
        
        imglabel = new JLabel();
        imglabel.setIcon(teacher1);
        imglabel.setBounds(0,130,368,336);
        
        imglabel2 = new JLabel();
        imglabel2.setIcon(rectangle1);
        imglabel2.setBounds(50,20,546,572);
       
        L_username = new JLabel("ENTER Login-ID");
        L_username.setBounds(100, 200, 200, 50);
        L_username.setBorder(design_border);
        L_username.setFont(new Font("Sahitya", Font.PLAIN, 15));
        L_username.setBorder(new EmptyBorder(10,0,0,0));
        
        L_password = new JLabel("PASSWORD");
        L_password.setBounds(100, 275, 200, 50);
        L_password.setFont(new Font("Sahitya", Font.PLAIN, 15));
        
        title = new JLabel("TEACHER LOGIN");
        //title.setText("TEACHER LOGIN");
        title.setFont(new Font("Elephant", Font.PLAIN, 30));
        title.setBounds(140,75,500,100);
        
        
        T_username = new JTextField();
        T_username.setLayout(null);
        T_username.setBounds(100, 240, 390, 30);
        
        T_password = new JTextField();
        T_password.setLayout(null);
        T_password.setBounds(100, 310, 390, 30);
        
        L_register = new JLabel("Dont have an account?");
        L_register.setBounds(230,450,150,30);
        L_register.setFont(new Font("Sahitya", Font.PLAIN, 15));
        
        L_createhere = new JLabel("CREATE HERE");
        L_createhere.setBounds(255,470,500,30);
        L_createhere.setFont(new Font("Sahitya", Font.PLAIN, 14));
        L_createhere.setForeground(Color.BLUE.darker());
        
        submit = new JButton("Submit");
        submit.setBounds(250,380,100,30);
        submit.setBorderPainted(false);
        submit.setFont(new Font("Sahitya", Font.PLAIN, 15));
        
        LoginFrame.add(design);
        LoginFrame.add(content);
      
        design.add(imglabel);
         
        content.add(T_username);
       	content.add(T_password);
		content.add(L_username);
		content.add(L_password);
		content.add(imglabel2);
		content.add(title);
		content.add(submit);
		content.add(L_createhere);
		content.add(L_register);
		
	}
	public static void main(String [] args) {
		new login();
	}
}