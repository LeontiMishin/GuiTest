/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20guitest;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class SPTV20GuiTest extends JFrame{
    private JLabel jLabelTitle;
    private JTextField jTextFieldNewTitle;
    private JButton jButtonSetTitle;
   

    public SPTV20GuiTest() {
        initComponents();
    }
    private void initComponents() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(480,290));
        setLocationRelativeTo(null);
        jLabelTitle = new JLabel("Hello SPTV20!");
        jLabelTitle.setMinimumSize(new Dimension(480,27));
        jLabelTitle.setMaximumSize(new Dimension(480,27));
        jLabelTitle.setPreferredSize(new Dimension(480,27));
        jLabelTitle.setHorizontalAlignment(JLabel.CENTER);
        jLabelTitle.setAlignmentY(Component.CENTER_ALIGNMENT);
        
        JPanel jPanelTitle = new JPanel();
        jPanelTitle.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanelTitle.setLayout(new FlowLayout());
        jPanelTitle.setMinimumSize(new Dimension(480,50));
        jPanelTitle.setMaximumSize(jPanelTitle.getMinimumSize());
        jPanelTitle.setPreferredSize(jPanelTitle.getMaximumSize());
        jPanelTitle.setAlignmentY(Component.CENTER_ALIGNMENT);
        jPanelTitle.add(jLabelTitle);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().add(jPanelTitle);
        jTextFieldNewTitle = new JTextField();
        jTextFieldNewTitle.setText("");
        getContentPane().add(jTextFieldNewTitle);
        jTextFieldNewTitle.setMaximumSize(new Dimension(300,27));
        jButtonSetTitle=new JButton();
        jButtonSetTitle.setText("Новый заголовок");
        jButtonSetTitle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabelTitle.setText(jTextFieldNewTitle.getText());
            }
        });
        jButtonSetTitle.setMinimumSize(new Dimension(200,27));
        jButtonSetTitle.setMaximumSize(new Dimension(200,27));
        jButtonSetTitle.setPreferredSize(new Dimension(200,27));
        jButtonSetTitle.setAlignmentY(CENTER_ALIGNMENT);
        jButtonSetTitle.setVerticalAlignment(JButton.CENTER);
        JPanel jPanelButton = new JPanel();
        jPanelButton.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanelButton.setMinimumSize(new Dimension(480,50));
        jPanelButton.setMaximumSize(jPanelButton.getMinimumSize());
        jPanelButton.setPreferredSize(jPanelButton.getMinimumSize());
        
        jPanelButton.add(jButtonSetTitle);
        getContentPane().add(jPanelButton);
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SPTV20GuiTest().setVisible(true);
            }
        });
    }

    
}
