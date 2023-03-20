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
class PanelLogin extends JFrame implements ActionListener{
    public PanelLogin(){
        JFrame frame = new JFrame("Sudah Login");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        JPanel newpanel = new JPanel();
        //frame.add(newpanel);
        newpanel.setLayout(null);

        JLabel label = new JLabel("Berhasil Login!");
        label.setBounds(100, 20, 100, 100);
        newpanel.add(label);
        
        JButton logout = new JButton("Logout");
        logout.setBounds(105, 90, 75, 30);
        newpanel.add(logout);
        
        frame.add(newpanel,  BorderLayout.CENTER);
        frame.setVisible(true);
        
        logout.addActionListener(this);
    
    }
    
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Berhasil Logout!");
        new Menu();
    }
}
