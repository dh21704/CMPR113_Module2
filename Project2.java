
package com.mycompany.classexercise2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class cc2
{
    double score;
    String name;
    
    public void setScore(double s)
    {
        score = s;
    }
    
    public String setName(String n)
    {
        return name=n;
    }
    
    public double getScore()
    {
        return score;
    }
    
    public String getName()
    {
        return name;
    }
    
    public char getGrade()
    {
        char letterGrade;
        
        if (score >= 90)
        {
            letterGrade = 'A';
        }
        else if (score >= 80)
        {
            letterGrade = 'B';
        }
        else if (score >= 70)
        {
            letterGrade = 'C';
        }
        else if (score >= 60)
        {
            letterGrade = 'D';
        }
        else
        {
            letterGrade = 'F';
        }
        
        return letterGrade;
        
        
    }
}

class cc3 extends cc2
{
    int numQuestions;
    double pointsEach;
    int numMissed;
    
    //passing 2 arguments
    public cc3(int questions, int missed)
    {
        double numericScore;
        
        numQuestions = questions; //assigning the 1st argument
        numMissed = missed; //assigning the 2nd argument
        
        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);
        
        setScore(numericScore);
    }
    
    public double getPointsEach()
    {
        return pointsEach;
    }
    
    public int getNumMissed()
    {
        return numMissed;
    }
}

//Continuing from project #2 for Module 2 (Chapter 10 Inheritance) lab, create a JFrame that will allow
//the user to enter the student's last and first name, # of questions attempted, and the number of
//questions missed, and get the output.
class MainFramee extends JFrame
{
    JLabel lblLastName, lblFirstName, lblQA, lblQM;
    JTextField LastNameField, FirstNameField, QAField, QMField;
    JButton button;
    
    public MainFramee()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLayout(new java.awt.GridLayout(5,4));
        
        lblLastName = new JLabel("LastName: ");
        lblFirstName = new JLabel("FirstName: ");
        lblQA = new JLabel("Questions Attempted: ");
        lblQM = new JLabel("Questions Missed: ");
        
        LastNameField = new JTextField(7);
        FirstNameField = new JTextField(7);
        QAField = new JTextField(7);
        QMField = new JTextField(7);
        
        button = new JButton("submit");
        
        add(lblLastName);
        add(LastNameField);
        
        add(lblFirstName);
        add(FirstNameField);
        
        add(lblQA);
        add(QAField);
        
        add(lblQM);
        add(QMField);
        
        add(button);
        
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String lastName = LastNameField.getText();
                String firstName = FirstNameField.getText();
                
                String QA = QAField.getText();
                int questions = Integer.parseInt(QA);
                
                String QM = QMField.getText();
                int missed = Integer.parseInt(QM);
                
                
                System.out.println(lastName);
                System.out.println(firstName);
                System.out.println(questions);
                System.out.println(missed);

                double score;
                double pointsEach;
        

       
                pointsEach = 100.0 / questions;
                score = 100.0 - (missed * pointsEach);
                
                //setScore(numericScore);
                
                char letterGrade;
        
                if (score >= 90)
                {
                    letterGrade = 'A';
                }
                else if (score >= 80)
                {
                    letterGrade = 'B';
                }
                else if (score >= 70)
                {
                    letterGrade = 'C';
                }
                else if (score >= 60)
                {
                   letterGrade = 'D';
                }   
                else
                {
                  letterGrade = 'F';
                }
                
                System.out.println("Letter Grade: " + letterGrade);
                JOptionPane.showMessageDialog(rootPane, "Letter Grade: " + letterGrade);
                
            }
        }
        
        );
        

    }
}


public class Project2 extends JFrame{
     
    public static void main(String[] args)
    {
        
        String input;
        int questions;
        int missed;
        
        //input = JOptionPane.showInputDialog("# of questions? ");
        //questions = Integer.parseInt(input);
        
        //input = JOptionPane.showInputDialog("# of questions missed? ");
        //missed = Integer.parseInt(input);
        
        //cc3 exam = new cc3(questions, missed);
        
        //JOptionPane.showMessageDialog(null, "each question counts " + exam.getPointsEach()
        //+ "\n" + "the exam score is " + exam.getScore() + "\n" + "the exam is " + exam.getGrade());
    
        
        MainFramee n = new MainFramee();
        
        n.setVisible(true);
    }
}
