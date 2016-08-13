
package javaswingapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaSwingApplication extends JFrame {

    JLabel label1,label2,label3;
    
    JTextField text1,text2,text3;
    
    JButton add,sub,mul,div;
    
    JPanel panel;
    
    
    public JavaSwingApplication(){
        Initialize();
        
    }
    
    public JavaSwingApplication(String text){
        this.setTitle(text);
    }
    
    private void Initialize(){
        this.setSize(700,700);
        this.setLayout(null);
        
        JavaSwingApplication jsf= new JavaSwingApplication("Calculator");
        
        label1 = new JLabel();
        label1.setText("Number1");
        label1.setBounds(100, 50, 150, 30);
        add(label1);
        
        text1 = new JTextField();
        text1.setBounds(300,50,150,30);
        this.add(this.text1);
        
        label2 = new JLabel();
        label2.setText("Number2");
        label2.setBounds(100, 100, 150, 30);
        add(label2);
        
        text2 = new JTextField();
        text2.setBounds(300,100,150,30);
        this.add(this.text2);
        
        label3 = new JLabel();
        label3.setText("Result");
        label3.setBounds(100, 150, 150, 30);
        add(label3);
        
        text3 = new JTextField();
        text3.setBounds(300,150,150,30);
        this.add(this.text3);
        
        add = new JButton("Add");
        add.setBounds(200,200,150,30);
        this.add(this.add);
        
        
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
             
             int a =Integer.parseInt(text1.getText());
             int b=Integer.parseInt(text2.getText());
             
             text3.setText((JTextField)a+b);
            
             
             
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        sub = new JButton("Sub");
        sub.setBounds(400,200,150,30);
        this.add(this.sub);
        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        
        
        
        
        
        
    }
    
    
   
    
    
    
    public static void main(String[] args) {
        JavaSwingApplication jsa = new JavaSwingApplication();
        jsa.setVisible(true);
    }
    
}
