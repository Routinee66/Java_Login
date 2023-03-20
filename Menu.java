/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author danie
 */
class Menu extends JFrame implements ActionListener{
    private JFrame frame;
    private JPanel panel;
    private JLabel lbluser, lblpass;
    private JTextField formuser;
    private JPasswordField formpass;
    private JButton login, reset;
    
    public Menu(){
        frame = new JFrame("Coba Login");
        
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        panel = new JPanel();
        frame.add(panel,  BorderLayout.CENTER);
        panel.setLayout(null);
        
        susun();
        
        frame.setVisible(true);
    }
    
    void susun(){
        lbluser = new JLabel("User");
        lbluser.setBounds(20, 15, 250, 30);
        
        lblpass = new JLabel("Password");
        lblpass.setBounds(20, 60, 250, 30);
        
        formuser = new JTextField(30);
        formuser.setBounds(100, 15, 150, 30);
        
        formpass = new JPasswordField(30);
        formpass.setBounds(100, 60, 150, 30);
        
        login = new JButton("Login");
        login.setBounds(30, 105, 100, 30);
        
        reset = new JButton("Reset");
        reset.setBounds(135, 105, 100, 30);
        
        panel.add(lbluser);
        panel.add(lblpass);
        panel.add(formuser);
        panel.add(formpass);
        panel.add(login);
        panel.add(reset);
        
        login.addActionListener(this);
        reset.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        String username, password;
        
        if(e.getSource() == login){
            // System.out.println("Username : " + formuser.getText());
            //System.out.println("Password : " + formpass.getText());
            
            username = formuser.getText();
            password = new String(formpass.getPassword());
            
            if(username.equals("admin") && password.equals("password")){
                JOptionPane.showMessageDialog(null, "Login Berhasil");
                
                new PanelLogin();
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Login Gagal");
            }
        }
        
        else if(e.getSource() == reset){
            formuser.setText("");
            formpass.setText("");
        }
        
    }
}
