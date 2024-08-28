/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classexercise2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MainFrame extends JFrame {
     
     JLabel lblLastname ,lblFirstname;
     JTextField txtLastname, txtFirstname;
     JButton btnSubmit;
     
     public MainFrame()
     {
         super ("Employees");
         //Closes the JFrame
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         setSize(400, 300);
                                    //3 rows and 2 columns
         setLayout(new java.awt.GridLayout(3,2));
         
         JLabel lblLastname = new JLabel("Lastname");
         JLabel lblFirstname = new JLabel("Firstname");
         
         JTextField txtLastname = new JTextField(7);
         JTextField txtFirstname = new JTextField(7);
         
         JButton btnSubmit = new JButton ("Submit");
         
         //adding the objects or tools to the frame
         add(lblLastname);
         add(txtLastname);
         
         add(lblFirstname);
         add(txtFirstname);
         
         add(btnSubmit);
         
         btnSubmit.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
             {
              
         //Click button calls the Second Frame        
         SecondaryFrame sf = new SecondaryFrame
        (txtLastname.getText(),txtFirstname.getText());
                 
         sf.setVisible(true);
         
        //mainFrame.setVisible(false);
             }
         });
       
     }
}
class SecondaryFrame extends JFrame{
    public SecondaryFrame(String lastname, String firstname)
    {
        super ("Secondary Frame");
        //Closes the JFrame
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(300,200);
         setLayout(new java.awt.GridLayout(3,2));
         
         JLabel output = new JLabel("Hello " + lastname +
                 "----" + firstname);
         
         add(output);
         
    }
}
public class c4{
    public static void main(String[] args) {
        
        MainFrame mainFrame = new MainFrame();
        
        mainFrame.setVisible(true);
    }
}
