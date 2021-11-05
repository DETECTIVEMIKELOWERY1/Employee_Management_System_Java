import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Add_Employee implements ActionListener{

    JFrame f;
    JLabel id1,id2,id3,id4,id5,id6,id7,id8,id9,lab,lab1;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JButton b,b1;

    Add_Employee(int i){}

    Add_Employee(){
        f = new JFrame("Add Employee");
        f.setBackground(Color.white);
        f.setLayout(null);





        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        f.add(id1);

        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        f.add(t1);

        id2 = new JLabel("Gender");
        id2.setBounds(400,150,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        f.add(id2);

        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        f.add(t2);

        id3= new JLabel("Address");
        id3.setBounds(50,200,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        f.add(id3);

        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        f.add(t3);

        id4= new JLabel("Age");
        id4.setBounds(400,200,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        f.add(id4);

        t4=new JTextField();
        t4.setBounds(600,200,150,30);
        f.add(t4);

        id5= new JLabel("Date Of Birth");
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        f.add(id5);

        t5=new JTextField();
        t5.setBounds(200,250,150,30);
        f.add(t5);

        id6= new JLabel("Post");
        id6.setBounds(400,250,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        f.add(id6);

        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        f.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,300,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        f.add(id7);

        t7=new JTextField();
        t7.setBounds(200,300,150,30);
        f.add(t7);

        id8= new JLabel("Phone");
        id8.setBounds(400,300,100,30);
        id8.setFont(new Font("serif",Font.BOLD,20));
        f.add(id8);

        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        f.add(t8);


        id9 = new JLabel("New Employee Details");
        id9.setBounds(320,30,500,50);
        id9.setFont(new Font("serif",Font.ITALIC,25));
        id9.setForeground(Color.black);
        f.add(id9);







        lab=new JLabel();
        lab.setBounds(200,450,250,200);
        f.add(lab);

        lab1=new JLabel("");
        lab1.setBounds(600,450,250,200);
       f.add(lab1);

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,550,150,40);

        f.add(b);

        b1=new JButton("Cancel");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);

        f.add(b1);

        b.addActionListener(this);
        b1.addActionListener(this);

        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
    }

    public void actionPerformed(ActionEvent ae){

        String n = t1.getText();
        String g = t2.getText();
        String a = t3.getText();
        String age = t4.getText();
        String dob = t5.getText();
        String post = t6.getText();
        String e = t7.getText();
        String ph = t8.getText();
        String qry = "insert into employee values(null,'"+n+"','"+g+"','"+a+"','"+age+"','"+dob+"','"+post+"','"+e+"','"+ph+"')";


        if(ae.getSource() == b){
            try{
                conn c = new conn();

                c.s.executeUpdate(qry);
                JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
                f.setVisible(false);
                new details();
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            new details();
        }
    }
    public static void main(String[ ] arg){
        new Add_Employee();
    }
}