import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teacher_main_interface { // primary color = 0x002233
    JFrame f;
    JTextField search,t_date, t_code, t_rollno, t_date2, tfilepath, tviewroll;
    JLabel logo,dsa,s,l_date, subject_name, roll_no, l_date2, lfilepath, imglabel, viewatt, viewroll, attis,imglable0, imglabel2, imglabel3;
    ImageIcon img1;
    ImageIcon teacher = new ImageIcon("src/Seminar-rafiki-resized.png");
    ImageIcon line = new ImageIcon("src/line1.png");
    ImageIcon linehori1 = new ImageIcon("src/line_hori_1.png");
    ImageIcon wave = new ImageIcon("src/wave.png");
    JPanel opt,note, attendance, inst_notice, attentitle, header;
	JButton bgencode, bmanualatte, bviewatte;
    JButton bnotes,batendance,btest,bassignment,bresult,binstantNotice,back,searchicon, submit, gen_code, mark_present;
    JButton upload;
    JPanel pgencode, pmanualatte, pviewatte;
    JTextArea notice_area;
    JButton post, reset_notice;
    Border bordertextarea = BorderFactory.createLineBorder(Color.black, 1);
    
    teacher_main_interface(){

         f = new JFrame();
         f.setLayout(null);
         //f.getContentPane().setBackground(new Color(0xFFDAB9));
         //f.(new Color(0xFBC4AB));
         f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         
         imglabel = new JLabel();
         imglabel.setIcon(teacher);
         imglabel.setBounds(20,180,350,350);
         
         imglabel2 = new JLabel();
         imglabel2.setIcon(line);
         imglabel2.setBounds(420,50,350,350);
         
         imglabel3 = new JLabel();
         imglabel3.setIcon(linehori1);
         imglabel3.setBounds(20,90,700,10);
         
         imglable0 = new JLabel();
         imglable0.setIcon(wave);
         imglable0.setBounds(0,0,1000,150);
         
         
         header = new JPanel();
         header= new JPanel();
         header.setLayout(null);
         header.setBackground(new Color(0x002233));//new Color(0xFFDAB9)
         header.setBounds(00,0,1000,150);
         header.setVisible(true);
         
         
         attendance = new JPanel();
         attendance.setLayout(null);
         attendance.setBackground(Color.white);//new Color(0xFFDAB9)
         attendance.setBounds(300,150,700,500);
         attendance.setBorder(new BorderUIResource.BevelBorderUIResource(4));
         attendance.setVisible(true);
         
         inst_notice = new JPanel();
         inst_notice.setLayout(null);
         inst_notice.setBackground(Color.white);
         inst_notice.setBounds(300,150,700,500);
         inst_notice.setBorder(new BorderUIResource.BevelBorderUIResource(4));
         inst_notice.setVisible(false);
         
         note = new JPanel();
         note.setLayout(null);
         note.setBackground(Color.white);
         note.setBounds(300,150,700,500);
         note.setBorder(new BorderUIResource.BevelBorderUIResource(4));
         note.setVisible(false);

         search = new JTextField();
         search.setBounds(900,44,276,120-64);
         search.setBorder(null);
         search.setFont(new Font("MV BOLLI",Font.PLAIN,30));

         dsa = new JLabel("DSA");
         dsa.setFont(new Font("Product Sans",Font.BOLD,20));
         dsa.setOpaque(true);
         dsa.setBackground(new Color(0xFBC4AB));
         dsa.setSize(203,76);
         dsa.setLocation(200,30);
        // dsa.setBounds(200,30,500,80);
         
         subject_name = new JLabel("DSA");
         subject_name.setFont(new Font("Product Sans",Font.BOLD,50));
         subject_name.setBounds(130,30,200,100);
         subject_name.setForeground(Color.white);    
         
         back = new JButton("BACK");
         back.setBounds(20,55,90,50);
         back.setBorder(null);
         back.setBackground(Color.white);
         back.setFocusable(false);

         logo = new JLabel();
         logo.setIcon(img1);
         logo.setOpaque(true);
         logo.setBounds(20,45,120,120);

         opt = new JPanel();
         opt.setLayout(null);
         opt.setBounds(0,150,300,500);
         opt.setBackground(new Color(0x002233));//new Color(0xFFDAB9)
         //opt.setBorder(opt_border);

         bnotes = new JButton("Notes");
         bassignment = new JButton("Assignment");
         batendance = new JButton("Attendance");
         btest = new JButton("Test");
         bresult = new JButton("Result");
         binstantNotice = new JButton("Instant Notice");
         
         bnotes.setBorderPainted(false);
         bassignment.setBorderPainted(false);
         binstantNotice.setBorderPainted(false);
         bresult.setBorderPainted(false);
         batendance.setBorderPainted(false);
         btest.setBorderPainted(false);

         bnotes.setBounds(0,170,300,50);
         batendance.setBounds(0,30,300,50);
         bassignment.setBounds(0,310,300,50);
         bresult.setBounds(0,240,300,50);
         //btest.setBounds(4,385,340,90);
         binstantNotice.setBounds(0,100,300,50);

         bresult.setBackground(new Color(0x002233));//new Color(0xF08080)
         binstantNotice.setBackground(new Color(0x002233));
         bassignment.setBackground(new Color(0x002233));
         batendance.setBackground(Color.white);
         btest.setBackground(new Color(0x002233));
         bnotes.setBackground(new Color(0x002233));
         
         bresult.setFont(new Font("Product Sans", Font.BOLD, 20));
         bnotes.setFont(new Font("Product Sans", Font.BOLD, 20));
         binstantNotice.setFont(new Font("Product Sans", Font.BOLD, 20));
         batendance.setFont(new Font("Product Sans", Font.BOLD, 20));
         bassignment.setFont(new Font("Product Sans", Font.BOLD, 20));
         
         bassignment.setHorizontalAlignment(SwingConstants.CENTER);
         bnotes.setHorizontalAlignment(SwingConstants.CENTER);
         binstantNotice.setHorizontalAlignment(SwingConstants.CENTER);
         batendance.setHorizontalAlignment(SwingConstants.CENTER);
         bresult.setHorizontalAlignment(SwingConstants.CENTER);
         

         binstantNotice.setForeground(Color.white);
         bnotes.setForeground(Color.white);
         bassignment.setForeground(Color.white);
         bresult.setForeground(Color.white);
         batendance.setForeground(new Color(0x002233));
         
         
         bassignment.setFocusable(false);
         batendance.setFocusable(false);
         binstantNotice.setFocusable(false);
         bresult.setFocusable(false);
         btest.setFocusable(false);
         bnotes.setFocusable(false);
         
         attentitle = new JPanel();
         attentitle.setBounds(0, 0, 700,100);
         attentitle.setBackground(Color.white);
         attentitle.setLayout(null);
         
         pgencode= new JPanel();
         pgencode.setLayout(null);
         pgencode.setBackground(Color.white);//new Color(0xFFDAB9)
         pgencode.setBounds(0,100,700,400);
         pgencode.setBorder(new BorderUIResource.BevelBorderUIResource(4));
         pgencode.setVisible(true);
         
         pmanualatte= new JPanel();
         pmanualatte.setLayout(null);
         pmanualatte.setBackground(Color.white);//new Color(0xFFDAB9)
         pmanualatte.setBounds(0,100,700,400);
         pmanualatte.setBorder(new BorderUIResource.BevelBorderUIResource(4));
         pmanualatte.setVisible(false);
         
         pviewatte = new JPanel();
         pviewatte.setLayout(null);
         pviewatte.setBackground(Color.white);//new Color(0xFFDAB9)
         pviewatte.setBounds(0,100,700,400);
         pviewatte.setBorder(new BorderUIResource.BevelBorderUIResource(4));
         pviewatte.setVisible(false);
        
         bgencode = new JButton("Generate Code");
         bgencode.setBounds(10,40,150,50);
         bgencode.setBorderPainted(false);
         bgencode.setFocusable(false);
         bgencode.setBackground(Color.white);
         bgencode.setForeground(Color.black);
         bgencode.setFont(new Font("Product Sans", Font.PLAIN, 16));
        
         bmanualatte = new JButton("Manual Attendance");
         bmanualatte.setBounds(145,40,180, 50);
         bmanualatte.setBorderPainted(false);
         bmanualatte.setFocusable(false);
         bmanualatte.setBackground(Color.white);
         bmanualatte.setForeground(new Color(0x646464));
         bmanualatte.setFont(new Font("Product Sans", Font.PLAIN, 16));
         
         bviewatte= new JButton("View Attendance");
         bviewatte.setBounds(310,40,160, 50);
         bviewatte.setBorderPainted(false);
         bviewatte.setFocusable(false);
         bviewatte.setBackground(Color.white);
         bviewatte.setForeground(new Color(0x646464));
         bviewatte.setFont(new Font("Product Sans", Font.PLAIN, 16));
         
         l_date = new JLabel("Enter current date : ");
         l_date.setBounds(50,50,200,30);
         l_date.setFont(new Font("Product Sans", Font.PLAIN, 18));
       
         gen_code = new JButton("Generate Code");
         gen_code.setBounds(50,100,150,30);
         gen_code.setBorderPainted(false);
         gen_code.setFont(new Font("Product Sans", Font.PLAIN, 16));
         
         t_date = new JTextField();
         t_date.setBounds(300, 50, 100, 30);
         t_date.setFont(new Font("Product Sans", Font.PLAIN, 15));
         
         t_code = new JTextField();
         t_code.setLayout(null);
         t_code.setBounds(300, 100, 100, 30);
         t_code.setFont(new Font("Product Sans", Font.PLAIN, 15));
         
         submit = new JButton("Reset Code");
         submit.setBounds(180,170,150,30);
         submit.setBorderPainted(false);
         submit.setFont(new Font("Product Sans", Font.PLAIN, 16));
         
         l_date2 = new JLabel("Enter date : ");
         l_date2.setBounds(50,50,200,30);
         l_date2.setFont(new Font("Product Sans", Font.PLAIN, 18));
         
         t_date2 = new JTextField();
         t_date2.setBounds(300, 50, 100, 30);
         t_date2.setFont(new Font("Product Sans", Font.PLAIN, 15));
         
         roll_no = new JLabel("Enter roll no of Student");
         roll_no.setBounds(50,100,200,30);
         roll_no.setFont(new Font("Product Sans", Font.PLAIN, 18));
         
         t_rollno = new JTextField();
         t_rollno.setBounds(300, 100, 100, 30);
         t_rollno.setFont(new Font("Product Sans", Font.PLAIN, 15));
         
         mark_present = new JButton("Mark Present");
         mark_present.setBounds(180,170,150,30);
         mark_present.setBorderPainted(false);
         mark_present.setFont(new Font("Product Sans", Font.PLAIN, 16));
         
         viewatt = new JLabel("Know Attendance of student:");
         viewatt.setBounds(50,00,300,30);
         viewatt.setFont(new Font("Product Sans", Font.PLAIN, 18));
         
         viewroll = new JLabel("Roll Number");
         viewroll.setBounds(50,50,200,30);
         viewroll.setFont(new Font("Product Sans", Font.PLAIN, 18));
         
         tviewroll = new JTextField();
         tviewroll.setBounds(300,50,200,30);
         tviewroll.setFont(new Font("Product Sans", Font.PLAIN, 18));
         
         attis = new JLabel("Attendance is 73.333%");
         attis.setBounds(80,120,200,30);
         attis.setFont(new Font("Product Sans", Font.PLAIN, 18));
         
         attentitle.add(bgencode);
         attentitle.add(bmanualatte);
         attentitle.add(bviewatte);
         attentitle.add(imglabel3);
         
       //notes componants
         lfilepath = new JLabel("Enter Path of file folder");
         lfilepath.setBounds(10,10,500,50);
         lfilepath.setFont(new Font("Product Sans", Font.PLAIN, 16));
         
         tfilepath = new JTextField();
         tfilepath.setBounds(10,70,500,50);
         tfilepath.setFont(new Font("Product Sans", Font.PLAIN, 16));
         
         upload = new JButton("Upload");
         upload.setBounds(200,130,100,50);
         upload.setFocusable(false);
         upload.setFont(new Font("Product Sans", Font.PLAIN, 16));
         
         note.add(lfilepath);
         note.add(tfilepath);
         note.add(upload);
         //notes componants end
         
       //Instant Notice Componants
         {
        	 notice_area = new JTextArea();
        	 notice_area.setBounds(90,10,500,250);
        	 notice_area.setBorder(bordertextarea);
        	 notice_area.setText("//Type the message you want to convey to students");
        	 notice_area.setFont(new Font("Product Sans", Font.PLAIN, 16));
        	 notice_area.setLineWrap(true);
        	 notice_area.setWrapStyleWord(true);
        	 JScrollPane scrollPane = new JScrollPane(notice_area);
        	 
        	 post = new JButton("POST");
        	 post.setBounds(90,260,100,30);
        	 post.setFocusable(false);
        	 post.setFont(new Font("Product Sans", Font.PLAIN, 16));
        	 
        	 reset_notice = new JButton("RESET");
        	 reset_notice.setBounds(210,260,100,30);
        	 reset_notice.setFocusable(false);
        	 reset_notice.setFont(new Font("Product Sans", Font.PLAIN, 16));
        	 
        	 inst_notice.add(notice_area); 
        	 inst_notice.add(post);
        	 inst_notice.add(reset_notice);
        	 inst_notice.add(scrollPane);
         }
         //instant notice end
         
         opt.add(bnotes);
         //opt.add(bassignment);
         opt.add(batendance);
         opt.add(btest);
         //opt.add(bresult);
         opt.add(binstantNotice);
         //opt.add(att_cover);
         //opt.add(notes_cover);
         opt.add(imglabel);
         
         attendance.add(attentitle);
         attendance.add(pgencode);
         attendance.add(pmanualatte);
         attendance.add(pviewatte);
         
         pgencode.add(l_date);
         pgencode.add(t_date);
         pgencode.add(t_code);
         pgencode.add(submit);
         pgencode.add(gen_code);
         
         pmanualatte.add(roll_no);
         pmanualatte.add(t_rollno);
         pmanualatte.add(t_date2);
         pmanualatte.add(l_date2);
         pmanualatte.add(mark_present);
         
         pviewatte.add(viewatt);
         //pviewatte.add(imglabel2);
         pviewatte.add(viewroll);
         pviewatte.add(tviewroll);
         pviewatte.add(attis);
         
         f.setBounds(200,50,1000,650);
         f.setResizable(true);

         f.add(opt);
        // f.add(logo);
         header.add(back);
         header.add(subject_name);
         header.add(imglable0);
        // f.add(search);
        // f.add(searchicon);
         f.add(header);
         f.add(note);
         f.add(attendance);
         f.add(inst_notice);
         //f.add(pgencode);
         f.setVisible(true);
         
         batendance.addActionListener(new ActionListener() {

 			@Override
 			public void actionPerformed(ActionEvent e) {
 				// TODO Auto-generated method stub
 				if(!attendance.isVisible()) {
 					attendance.setVisible(true);
 					note.setVisible(false);
 					inst_notice.setVisible(false);
 					
  					batendance.setBackground(Color.white);
  					batendance.setForeground(new Color(0x002233));
  					
  					bnotes.setBackground(new Color(0x002233));
  					bnotes.setForeground(Color.white);
  					
  					binstantNotice.setBackground(new Color(0x002233));
   					binstantNotice.setForeground(Color.white);
 				}
// 				
 			}
         	 
          });
          
          bnotes.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  				// TODO Auto-generated method stub
  				if(!note.isVisible()) {
  					note.setVisible(true);
  					attendance.setVisible(false);
  					inst_notice.setVisible(false);
  					
  					bnotes.setBackground(Color.white);
  					bnotes.setForeground(new Color(0x002233));
  					
  					batendance.setBackground(new Color(0x002233));
  					batendance.setForeground(Color.white);
  					
  					binstantNotice.setBackground(new Color(0x002233));
   					binstantNotice.setForeground(Color.white);
  				}
  			}
          	 
           });
          
          binstantNotice.addActionListener(new ActionListener() {

   			@Override
   			public void actionPerformed(ActionEvent e) {
   				// TODO Auto-generated method stub
   				if(!inst_notice.isVisible()) {
   					
   					inst_notice.setVisible(true);
   					note.setVisible(false);
   					attendance.setVisible(false);
   					
   					binstantNotice.setBackground(Color.white);
   					binstantNotice.setForeground(new Color(0x002233));
   					
   					bnotes.setBackground(new Color(0x002233));
   					bnotes.setForeground(Color.white);
   					
   					batendance.setBackground(new Color(0x002233));
   					batendance.setForeground(Color.white);
   				}
   			}
           	 
            });
          
          bgencode.addActionListener(new ActionListener() {

   			@Override
   			public void actionPerformed(ActionEvent e) {
   				// TODO Auto-generated method stub
   				if(!pgencode.isVisible()) {
   					pgencode.setVisible(true);
   					pmanualatte.setVisible(false);
   					pviewatte.setVisible(false);
   					
    					
   					bgencode.setForeground(Color.black);
//					
//					bnotes.setBackground(new Color(0x002233));
   					bviewatte.setForeground(new Color(0x646464));
//					
//					binstantNotice.setBackground(new Color(0x002233));
 					bmanualatte.setForeground(new Color(0x646464));
   				}
//   				
   			}
           	 
            });
         
          bmanualatte.addActionListener(new ActionListener() {

   			@Override
   			public void actionPerformed(ActionEvent e) {
   				// TODO Auto-generated method stub
   				if(!pmanualatte.isVisible()) {
   					pmanualatte.setVisible(true);
   					pgencode.setVisible(false);
   					pviewatte.setVisible(false);
   					
//    					batendance.setBackground(Color.white);
    				bmanualatte.setForeground(Color.black);
//					
//					bnotes.setBackground(new Color(0x002233));
					bgencode.setForeground(new Color(0x646464));
//					
//					binstantNotice.setBackground(new Color(0x002233));
 					bviewatte.setForeground(new Color(0x646464));
   				}
//   				
   			}
           	 
            });
          
          bviewatte.addActionListener(new ActionListener() {

   			@Override
   			public void actionPerformed(ActionEvent e) {
   				// TODO Auto-generated method stub
   				if(!pviewatte.isVisible()) {
   					pviewatte.setVisible(true);
   					pmanualatte.setVisible(false);
   					pgencode.setVisible(false);
   					
//    					batendance.setBackground(Color.white);
    					bviewatte.setForeground(Color.black);
//    					
//    					bnotes.setBackground(new Color(0x002233));
    					bgencode.setForeground(new Color(0x646464));
//    					
//    					binstantNotice.setBackground(new Color(0x002233));
     					bmanualatte.setForeground(new Color(0x646464));
   				}
//   				
   			}
           	 
            });
         
    }
    
	public static void main(String args [])
    {
    	new teacher_main_interface ();
    }
}


