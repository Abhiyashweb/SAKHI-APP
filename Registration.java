import javax.swing.*;
import java.awt.*;
import java.sql.*;
 

@SuppressWarnings("serial")
class Registration extends JFrame  {

    Container c;
    JLabel title,pswd, username, gender, utypelabel, dob,add,res;
	JTextField tusername,tpswd;
    JRadioButton male,female,farmer,buyer;
    ButtonGroup gengp, utype;
	JComboBox<?> date,  month,year;
	JTextArea tadd,tout,resadd;
	JCheckBox term;
	JButton sub,reset;
    String dates[]= { "1", "2", "3", "4", "5","6", "7", "8", "9", "10","11", "12", "13", "14", "15", "16", "17", "18", "19", "20","21", "22", "23", "24", "25","26", "27", "28", "29", "30","31" };

    private String months[]= { "Jan", "feb", "Mar", "Apr",  "May", "Jun", "July", "Aug","Sup", "Oct", "Nov", "Dec" };
    private String years[]
        = { "1995", "1996", "1997", "1998",

            "1999", "2000", "2001", "2002",

            "2003", "2004", "2005", "2006",

            "2007", "2008", "2009", "2010",

            "2011", "2012", "2013", "2014",

            "2015", "2016", "2017", "2018",

            "2019" };
		Connection conn;
		Statement stmt;
		ResultSet rs;
 
    @SuppressWarnings("unchecked")
	Registration()
    {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
 
        username = new JLabel("Username");
        username.setFont(new Font("Arial", Font.PLAIN, 20));
        username.setSize(100, 20);
        username.setLocation(100, 100);
        c.add(username);
 
        tusername = new JTextField();
        tusername.setFont(new Font("Arial", Font.PLAIN, 15));
        tusername.setSize(190, 20);
        tusername.setLocation(200, 100);
        c.add(tusername);
 
        pswd = new JLabel("Password");
        pswd.setFont(new Font("Arial", Font.PLAIN, 20));
        pswd.setSize(100, 20);
        pswd.setLocation(100, 150);
        c.add(pswd);
 
        tpswd = new JPasswordField();
        tpswd.setFont(new Font("Arial", Font.PLAIN, 15));
        tpswd.setSize(150, 20);
        tpswd.setLocation(200, 150);
        c.add(tpswd);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
 
		utypelabel = new JLabel("User Type");
        utypelabel.setFont(new Font("Arial", Font.PLAIN, 20));
        utypelabel.setSize(100, 20);
        utypelabel.setLocation(100, 250);
        c.add(utypelabel);
		
		farmer = new JRadioButton("As a Farmer");
        farmer.setFont(new Font("Arial", Font.PLAIN, 15));
        farmer.setSelected(true);
        farmer.setSize(75, 20);
        farmer.setLocation(200, 250);
        c.add(farmer);

        buyer = new JRadioButton("As a Buyer");
        buyer.setFont(new Font("Arial", Font.PLAIN, 15));
        buyer.setSelected(false);
        buyer.setSize(80, 20);
        buyer.setLocation(275, 250);
        c.add(buyer);

        utype = new ButtonGroup();
        utype.add(farmer);
        utype.add(buyer);
		
        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 300);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 300);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 300);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 300);
        c.add(year);
 
        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 350);
        c.add(add);
 
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 350);
        tadd.setLineWrap(true);
        c.add(tadd);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 500);
        c.add(term);
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 550);
//        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 550);
//        reset.addActionListener(this);
        c.add(reset);
 
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);
 
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }
	
	public void setDBConnection() 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniprojectschema","root","");
			stmt = conn.createStatement();
			
		} 
		catch(Exception e)
		{
			System.out.println(e);
		} 
	}
	
	public void closeDB()
	{
		try {
			stmt.close();
			conn.close();
		} 
		catch(Exception e)
		{
			System.out.println(e);
		} 
	}
	
	public void adduser(String tusername, String tpswd, String utype, String gengp, String dob, String tadd)
	{
		try {
			stmt.executeUpdate("INSERT INTO registration VALUES('" + tusername+ "', '" + tpswd+ "', '" + utype+ "', '" + gengp+ "', '" + dob+ "', '" + tadd+ "');");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	
////    public void actionPerformed(ActionEvent e)
////    {
////        if (e.getSource() == sub) {
////			this.setDBConnection();
////            if (term.isSelected()) {
////                String data1;
////                String data
////                    = "Username : "
////                      + tusername.getText() + "\n"
////                      + "Password : "
////                      + tpswd.getText() + "\n";
////                if (male.isSelected())
////                    data1 = "Male"
////                            + "\n";
////                else
////                    data1 = "Female"
////                            + "\n";
////                String data2
////                    = (String)year.getSelectedItem()
////                      + "/" + (String)date.getSelectedItem()
////                      + "/" + (String)month.getSelectedItem()
////                      + "\n";
////				String data3;
////				if (farmer.isSelected())
////                    data3 = "Farmer"
////                            + "\n";
////                else
////                    data3 = "Buyer"
////                            + "\n";
////                String data4 = "Address : " + tadd.getText();
////                tout.setText(data + "Gender : " + data1 + "DOB : " + data2 + "User Type: " + data3 + data4);
////                tout.setEditable(false);
////                JOptionPane.showMessageDialog(this,"Registration Successfully","Message",JOptionPane.INFORMATION_MESSAGE);
////				this.adduser(tusername.getText(), tpswd.getText(), data1, data2, tadd.getText(), data3);
//////				if(farmer.isSelected())
////////					new FarmerScreen();
////////				else 
////////					new BuyerScreen();
//////            }
////            else {
////                tout.setText("");
////                resadd.setText("");
////                res.setText("Please accept the"
////                            + " terms & conditions..");
////            }
////			this.closeDB();
////        }
//        else if (e.getSource() == reset) {
//            String def = "";
//            tusername.setText(def);
//            tadd.setText(def);
//            tpswd.setText(def);
//            res.setText(def);
//            tout.setText(def);
//            term.setSelected(false);
//            date.setSelectedIndex(0);
//            month.setSelectedIndex(0);
//            year.setSelectedIndex(0);
//            resadd.setText(def);
//        }
////    }
}