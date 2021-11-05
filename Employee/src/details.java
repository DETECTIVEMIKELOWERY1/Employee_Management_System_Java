import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class details extends JFrame implements ActionListener{


    JLabel l1;
    JButton b1,b2,b3,b4;

    details(){
        new JFrame("Employee Detail");
        setBackground(Color.white);
        setLayout(null);



        l1 = new JLabel("Employee Details");
        l1.setBounds(210,20,200,40);
        l1.setFont(new Font("serif",Font.BOLD,25));
        l1.setForeground(Color.black);
        add(l1);

        b1=new JButton("Add");
        b1.setBounds(190,80,100,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        add(b1);


        b2=new JButton("Update");
        b2.setBounds(310,80,150,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        add(b2);

        b3=new JButton("Attendance");
        b3.setBounds(190,140,140,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        add(b3);

        b4=new JButton("Salary");
        b4.setBounds(350,140,135,40);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.addActionListener(this);
        add(b4);





        setVisible(true);
        setSize(600,500);
        setLocation(450,200);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            setVisible(false);
            new Update_employee();
        }

        if(ae.getSource()==b3){
            setVisible(false);
            new Attendance();
        }
        if(ae.getSource()==b4){
            setVisible(false);
            new Salary();
        }


    }

    public static void main(String[ ] arg){
        details d = new details();
    }
}