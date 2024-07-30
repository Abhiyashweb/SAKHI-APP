import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pcpf_main {
    JFrame f;
    JTextField search,t_date, t_code;
    JLabel logo,dsa,s,l_date,l_code, subject_name, lfilepath, imglabel;
    ImageIcon student = new ImageIcon("src/Formula-amico_resized.png");
    JPanel opt,note, attendance, inst_notice;
    JButton bnotes,batendance,btest,bassignment,bresult,binstantNotice,back,searchicon, submit;
    JTable table;
    
    JTextField tfilepath;
    JButton upload;
    
    JTextArea notice_area;
    JButton post, reset_notice;
    
    Border bordertextarea = BorderFactory.createLineBorder(Color.black, 1);
    
    pcpf_main(){
    	
         f = new JFrame();
         f.setLayout(null);
         //f.getContentPane().setBackground(new Color(0xFFDAB9));
         //f.(new Color(0xFBC4AB));
         f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         
         imglabel = new JLabel();
         imglabel.setIcon(student);
         imglabel.setBounds(50,180,350,350);

         attendance = new JPanel();
         attendance.setLayout(null);
         attendance.setBackground(Color.white);//new Color(0xFFDAB9)
         attendance.setBounds(300,150,700,500);
         attendance.setBorder(new BorderUIResource.BevelBorderUIResource(4));
         attendance.setVisible(false);
         
         
         note = new JPanel();
         note.setLayout(null);
         note.setBackground(Color.white);
         note.setBounds(300,150,700,500);
         note.setBorder(new BorderUIResource.BevelBorderUIResource(4));
         note.setVisible(true);
         
         inst_notice = new JPanel();
         inst_notice.setLayout(null);
         inst_notice.setBackground(Color.white);
         inst_notice.setBounds(300,150,700,500);
         inst_notice.setBorder(new BorderUIResource.BevelBorderUIResource(4));
         inst_notice.setVisible(false);

//         s = new JLabel();
//         s.setIcon(img2);
//         s.setOpaque(true);
//         s.setBounds(1275,44,57,57);

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
         
         subject_name = new JLabel("POC");
         subject_name.setFont(new Font("Product Sans",Font.BOLD,50));
         subject_name.setBounds(130,30,200,100);
         
         searchicon = new JButton("Search");
         searchicon.setBorder(null);
         searchicon.setFocusable(false);
         searchicon.setBackground(Color.pink);
         searchicon.setBounds(1193,48,50,50);
        // searchicon.setIcon(img);
        // searchicon.setBackground(new Color(0,0,0,0));
         //searchicon.setOpaque(true);

         back = new JButton("BACK");
         back.setBounds(20,55,90,50);
         back.setBorder(null);
        back.setBackground(Color.white);
        // back.setIcon(img);
         back.setFocusable(false);

//         logo = new JLabel();
//         logo.setIcon(img1);
//         logo.setOpaque(true);
//         logo.setBounds(20,45,120,120);

         opt = new JPanel();
         opt.setLayout(null);
         opt.setBounds(0,150,300,500);
         opt.setBackground(new Color(0xfd5252));//new Color(0xFFDAB9)
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

         bnotes.setBounds(0,30,300,50);
         batendance.setBounds(0,100,300,50);
         bassignment.setBounds(0,310,300,50);
         bresult.setBounds(0,240,300,50);
         //btest.setBounds(4,385,340,90);
         binstantNotice.setBounds(0,170,300,50);


         bresult.setBackground(new Color(0xfd5252));//new Color(0xF08080)
         binstantNotice.setBackground(new Color(0xfd5252));
         bassignment.setBackground(new Color(0xfd5252));
         batendance.setBackground(new Color(0xfd5252));
         btest.setBackground(new Color(0xfd5252));
         bnotes.setBackground(Color.white);
         
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
         bnotes.setForeground(new Color(0xfd5252));
         bassignment.setForeground(Color.white);
         bresult.setForeground(Color.white);
         batendance.setForeground(Color.white);
         
         
         bassignment.setFocusable(false);
         batendance.setFocusable(false);
         binstantNotice.setFocusable(false);
         bresult.setFocusable(false);
         btest.setFocusable(false);
         bnotes.setFocusable(false);
         
         l_date = new JLabel("Enter current date : ");
         l_date.setBounds(50,80,200,30);
         l_date.setFont(new Font("Product Sans", Font.PLAIN, 18));
         
         l_code = new JLabel("Enter code given by Teacher :");
         l_code.setBounds(50,130,250,30);
         l_code.setFont(new Font("Product Sans", Font.PLAIN, 18));
         
         t_date = new JTextField();
         t_date.setLayout(null);
         t_date.setBounds(300, 80, 100, 30);
         t_date.setFont(new Font("Product Sans", Font.PLAIN, 15));
         
         t_code = new JTextField();
         t_code.setLayout(null);
         t_code.setBounds(300, 130, 100, 30);
         t_code.setFont(new Font("Product Sans", Font.PLAIN, 15));
         
         submit = new JButton("Mark Present");
         submit.setBounds(200,200,200,30);
         submit.setBorderPainted(false);
         submit.setFont(new Font("Product Sans", Font.PLAIN, 16));

         opt.add(bnotes);
         //opt.add(bassignment);
         opt.add(batendance);
         opt.add(btest);
         //opt.add(bresult);
         opt.add(binstantNotice);
         opt.add(imglabel);

         f.setBounds(200,50,1000,650);
         f.setResizable(true);

         f.add(opt);
        // f.add(logo);
         f.add(back);
         //f.add(dsa);
         f.add(subject_name);
         //f.add(search);
        // f.add(searchicon);
         f.add(note);
         f.add(attendance);
         f.add(inst_notice);
         f.setVisible(true);

         
         attendance.add(l_date);
         attendance.add(l_code);
         attendance.add(t_date);
         attendance.add(t_code);
         attendance.add(submit);
         
         //note
//         JScrollPane scrollPane_1 = new JScrollPane();
// 		scrollPane_1.setBounds(68, 47, 299, 177);
// 		f.getContentPane().add(scrollPane_1);
// 		
// 		JScrollPane scrollPane = new JScrollPane();
// 		scrollPane_1.setViewportView(scrollPane);
// 		
// 		table = new JTable();
// 		table.setModel(new DefaultTableModel(
// 			new Object[][] {
// 			},
// 			new String[] {
// 				"File ID", "File Name"
// 			}
// 		) {
// 			Class[] columnTypes = new Class[] {
// 				Integer.class, String.class
// 			};
// 			public Class getColumnClass(int columnIndex) {
// 				return columnTypes[columnIndex];
// 			}
// 		});
// 		scrollPane.setViewportView(table);
// 		note.add(scrollPane);
// 		note.add(table);
 		//note end
         
         
         //Instant Notice Componants
         {
        	 notice_area = new JTextArea();
        	 notice_area.setBounds(90,10,500,250);
        	 notice_area.setBorder(bordertextarea);
        	 //notice_area.setText("");
        	 notice_area.setFont(new Font("Product Sans", Font.PLAIN, 16));
        	 
        	 post = new JButton("Refresh");
        	 post.setBounds(90,260,100,30);
        	 post.setFocusable(false);
        	 post.setFont(new Font("Product Sans", Font.PLAIN, 16));
        	 
        	 inst_notice.add(notice_area); 
        	 inst_notice.add(post);
     
         }
         //Instant Notice Componants end
         
         batendance.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(!attendance.isVisible()) {
					attendance.setVisible(true);
					note.setVisible(false);
					inst_notice.setVisible(false);
					
 					batendance.setBackground(Color.white);
 					batendance.setForeground(new Color(0xfd5252));
 					
 					bnotes.setBackground(new Color(0xfd5252));
 					bnotes.setForeground(Color.white);
 					
 					binstantNotice.setBackground(new Color(0xfd5252));
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
 					bnotes.setForeground(new Color(0xfd5252));
 					
 					batendance.setBackground(new Color(0xfd5252));
 					batendance.setForeground(Color.white);
 					
 					binstantNotice.setBackground(new Color(0xfd5252));
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
  					binstantNotice.setForeground(new Color(0xfd5252));
  					
  					bnotes.setBackground(new Color(0xfd5252));
  					bnotes.setForeground(Color.white);
  					
  					batendance.setBackground(new Color(0xfd5252));
  					batendance.setForeground(Color.white);
  				}
  			}
          	 
           });
         
         
    }
    public static void main(String args [])
    {
    	new pcpf_main ();
    }
}


