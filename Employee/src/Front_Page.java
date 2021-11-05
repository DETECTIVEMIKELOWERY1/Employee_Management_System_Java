

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Front_Page extends JFrame implements ActionListener{

    JLabel id,l1;
    JButton b;

    Front_Page(){

       super("Employee Management System");
       setBackground(Color.red);
       setLayout(null);

        b = new JButton("ENTER");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);


        b.setBounds(500,600,300,70);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);



        l1=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        l1.setBounds(80,25,1500,100);
        l1.setFont(new Font("serif",Font.PLAIN,70));
        l1.setForeground(Color.black);

        id.add(l1);
        id.add(b);
        add(id);


        getContentPane().setBackground(Color.cyan);

        setVisible(true);
        setSize(1300,700);
        setLocation(200,100);



    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            setVisible(false);
            new login();
        }
    }

    public static void main(String[] arg){
        Front_Page f = new Front_Page();
    }
}