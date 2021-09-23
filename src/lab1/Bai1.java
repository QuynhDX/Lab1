/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import com.sun.glass.events.KeyEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class Bai1{  
    
    JLabel dau,cuoi;
    JFrame mainFrame =new JFrame();
    
    
    public Bai1(){
        mainFrame.setTitle("Ví dụ Java Swing");
        mainFrame.setSize(400, 400);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setResizable(false);
        
        dau = new JLabel("Control in action: CheckBox",JLabel.CENTER);

        cuoi = new JLabel("",JLabel.CENTER);
        mainFrame.add(dau);
        checkbox();
        mainFrame.add(cuoi);
        
        
        
    }
    public static void main(String[] args) {
        Bai1 b = new Bai1();
        b.mainFrame.setVisible(true);
    }
    public void checkbox(){
        final JCheckBox apple = new JCheckBox("Apple");
        final JCheckBox mango = new JCheckBox("Mango");
        final JCheckBox peer = new JCheckBox("Peer");
        apple.setMnemonic(KeyEvent.VK_A);
        mango.setMnemonic(KeyEvent.VK_M);
        peer.setMnemonic(KeyEvent.VK_P);
        apple.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                cuoi.setText("Apple CheckBox: " + (e.getStateChange()==1?"Checked":"Unchecked"));
            }
        });
        mango.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                cuoi.setText("Mango CheckBox: " + (e.getStateChange()==1?"Checked":"Unchecked"));
            }
        });
        peer.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                cuoi.setText("Peer CheckBox:" +(e.getStateChange()==1?"Checked":"Unchecked"));
            }
        });
        mainFrame.add(apple);
        mainFrame.add(mango);
        mainFrame.add(peer);
    }
    
    
}
