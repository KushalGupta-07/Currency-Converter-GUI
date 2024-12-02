// This is the main program of login page..
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
class loginpage extends JFrame implements ActionListener{
    JTextField t1;
    JPasswordField t2;
    JButton btn;
    JLabel lbl,lbl1,lbl2,lbl3,lbl4;
    JFrame f;
    public loginpage(){
        // Design a frame.
        f=new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
        f.setTitle("login page");
        f.setSize(270,300);
        f.setVisible(true);
        // Declareing component and set font of the label.
        t1=new JTextField(10);
        t2=new JPasswordField(10);
        btn=new JButton("Login");
        btn.setBackground(Color.decode("#006400"));;
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("TimesRoman",Font.BOLD,15));
        lbl=new JLabel();
        lbl1=new JLabel("Username:");
        lbl1.setFont(new Font("TimesRoman",Font.BOLD,15));
        lbl2=new JLabel("Password:");
        lbl2.setFont(new Font("TimesRoman",Font.BOLD,15));
        lbl3=new JLabel("Welcome Back!");
        lbl3.setFont(new Font("MV Boli",Font.PLAIN,15));
        lbl4=new JLabel("Login in your account.....");
        lbl4.setFont(new Font("MV Boli",Font.PLAIN,15));
        // Set position of component. 
        t1.setBounds(110,60,120,25);
        t2.setBounds(110,90,120,25);
        lbl.setBounds(160,100,140,50);
        lbl1.setBounds(30,50,140,50);
        lbl2.setBounds(30,90,140,30);
        lbl3.setBounds(30,05,140,30);
        lbl4.setBounds(30,25,180,30);
        btn.setBounds(30,140,200,30);
        // Add component to the frame.
        f.add(t1);
        f.add(t2);
        f.add(btn);
        f.add(lbl);
        f.add(lbl1);
        f.add(lbl2);
        f.add(lbl3);
        f.add(lbl4);
        // t2.setEchoChar('*');
        // Add event on the button.
        btn.addActionListener(this);
        btn.setMnemonic(KeyEvent.VK_ENTER);
    }
    public void actionPerformed(ActionEvent e){
        String uid=t1.getText();
        String pwd=t2.getText();
        if(e.getSource()==btn){
            if(uid.equals("kushalgupta") && pwd.equals("gupta27")){
                JOptionPane.showOptionDialog(null,"Login Successfully....","System.com",
                JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,
                null,null,0 );
                Converter frm=new Converter();
                f.dispose();
            }
            else
            lbl.setText("Invalid User");
        }
    }
}
class Converter extends JFrame implements ItemListener,ActionListener{
    Choice cb,cb1;
    JTextField t1,t2; 
    JLabel currencyImageLabel,currencyImageLabel1;
    Image img1,img2;
    Converter(){
        //Create a frame.
        JFrame frm=new JFrame();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setTitle("Currency Converter");
        frm.setSize(400,250);
        frm.setVisible(true);
        frm.setResizable(false);
        frm.setLayout(null);
        //for image of country
        try {
            img1 = ImageIO.read(new File("C://Users//HP//Desktop//gitdemo//Miniproject-java//Currencyimage//Indian Rupees.png"));
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        currencyImageLabel = new JLabel(new ImageIcon(img1));
        currencyImageLabel.setBounds(32, 50, img1.getWidth(null), img1.getHeight(null));
        //for another choise box.
        try {
            img2 = ImageIO.read(new File("C://Users//HP//Desktop//gitdemo//Miniproject-java//Currencyimage//Indian Rupees.png"));
        } 
        catch (IOException a) {
            a.printStackTrace();
        }
        currencyImageLabel1 = new JLabel(new ImageIcon(img2));
        currencyImageLabel1.setBounds(32, 80, img2.getWidth(null), img2.getHeight(null));
        //Declare a component.
        ImageIcon img=new ImageIcon("symbol.png");
        frm.setIconImage(img.getImage());
        String arr[]={"Indian Rupees","Pound sterling","US Doller","Russian Ruble","Singapore Dollar","Australian Dollar"};
        cb=new Choice();
        for(int i=0;i<arr.length;i++)
        cb.add(arr[i]);
        String arr1[]={"Indian Rupees","Pound sterling","US Doller","Russian Ruble","Singapore Dollar","Australian Dollar"};
        cb1=new Choice();
        for(int i=0;i<arr1.length;i++)
        cb1.add(arr[i]);  
        t1=new JTextField(14);       
        t2=new JTextField(14);       
        JLabel lbl=new JLabel("Exchange Rate"); 
        lbl.setFont(new Font("TimesRoman",Font.BOLD,15));
        JButton b=new JButton("Convert");
        //Set the position of component.
        cb.setBounds(80,50,0,0);
        cb1.setBounds(80,80,0,0);
        t1.setBounds(210,50,120,25);
        t2.setBounds(210,80,120,25);
        lbl.setBounds(160,3,140,50); 
        b.setBounds(123,120,140,30); 
        //Add component to the frame.
        frm.add(cb);
        frm.add(cb1);
        frm.add(t1);
        frm.add(t2);
        frm.add(lbl);
        frm.add(b);
        frm.add(currencyImageLabel);
        frm.add(currencyImageLabel1);
        //Add action listener to the button b.
        b.addActionListener(this);
        cb.addItemListener(this);
        cb1.addItemListener(this);
        //set mnemonic for 'convert button' pressed Alt+Enter.  
        b.setMnemonic(KeyEvent.VK_ENTER);

    }
    public void itemStateChanged(ItemEvent e) {
        // 1st choice
        String item = cb.getSelectedItem();
        try {
            img1 = ImageIO.read(new File("C://Users//HP//Desktop//gitdemo//Miniproject-java//Currencyimage//" + item + ".png"));
            currencyImageLabel.setIcon(new ImageIcon(img1));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        // 2nd choice
        String item1 = cb1.getSelectedItem();
        try {
            img2 = ImageIO.read(new File("C://Users//HP//Desktop//gitdemo//Miniproject-java//Currencyimage//" + item1 + ".png"));
            currencyImageLabel1.setIcon(new ImageIcon(img2));
        } catch (IOException x) {
            x.printStackTrace();
        }
    }
    
    public void actionPerformed(ActionEvent e){
        try{
        String item=cb.getSelectedItem();
        String item1=cb1.getSelectedItem();
        //convert to us doller
        if(item=="Indian Rupees"&&item1=="US Doller"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d/65.25);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Pound sterling"&&item1=="US Doller"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*1.275);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="US Doller"&&item1=="US Doller"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*1);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Russian Ruble"&&item1=="US Doller"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.011);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Singapore Dollar"&&item1=="US Doller"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.75);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Australian Dollar"&&item1=="US Doller"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.67);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        //convert to indian rupees
        if(item=="Indian Rupees"&&item1=="Indian Rupees"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*1);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Pound sterling"&&item1=="Indian Rupees"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*106.3363);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="US Doller"&&item1=="Indian Rupees"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*83.4511);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Russian Ruble"&&item1=="Indian Rupees"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.9247);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Singapore Dollar"&&item1=="Indian Rupees"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*61.758);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Australian Dollar"&&item1=="Indian Rupees"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*55.5238);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        //convert to england pound
        if(item=="Indian Rupees"&&item1=="Pound sterling"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.0094);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Pound sterling"&&item1=="Pound sterling"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*1);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="US Doller"&&item1=="Pound sterling"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.79);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Russian Ruble"&&item1=="Pound sterling"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.0087);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Singapore Dollar"&&item1=="Pound sterling"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.5808);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Australian Dollar"&&item1=="Pound sterling"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.5222);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        //convert to russian rebel
        if(item=="Indian Rupees"&&item1=="Russian Ruble"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*1.08);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Pound sterling"&&item1=="Russian Ruble"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*115.19);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="US Doller"&&item1=="Russian Ruble"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*90.44);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Russian Ruble"&&item1=="Russian Ruble"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*1);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Singapore Dollar"&&item1=="Russian Ruble"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*66.82);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Australian Dollar"&&item1=="Russian Ruble"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*60.25);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        //convert to singaporean doller
        if(item=="Indian Rupees"&&item1=="Singapore Dollar"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.016);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Pound sterling"&&item1=="Singapore Dollar"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*1.7218);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="US Doller"&&item1=="Singapore Dollar"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*1.3513);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Russian Ruble"&&item1=="Singapore Dollar"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.015);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Singapore Dollar"&&item1=="Singapore Dollar"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*1);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Australian Dollar"&&item1=="Singapore Dollar"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.8991);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        //convert to australian doller
        if(item=="Indian Rupees"&&item1=="Australian Dollar"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.018);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Pound sterling"&&item1=="Australian Dollar"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*1.9152);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="US Doller"&&item1=="Australian Dollar"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*1.503);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Russian Ruble"&&item1=="Australian Dollar"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*0.0165);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Singapore Dollar"&&item1=="Australian Dollar"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*1.1123);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
        if(item=="Australian Dollar"&&item1=="Australian Dollar"){
            double d=Double.parseDouble(t1.getText());
            double d1=(d*1);
            String str1=String.valueOf(d1);
            t2.setText(str1);
        }
    }
    catch(Exception f){
        System.out.println("Exception in thread 'AWT-EventQueue-0' java.lang.NumberFormatException: empty String: \nEnter a number on the textfield:");
    }
    }
public class login {
    public static void main(String []arg){
        loginpage loginpage=new loginpage();
    }
}
}