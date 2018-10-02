/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.buttonsamples;

import java.awt.FlowLayout;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class ButtonSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        //1. 建立 button，text 設定為 Find
        //2. 建立 icon
        //3. 設定 icon
        JButton button = new JButton("Find");
        button.setMnemonic('F');
        ImageIcon icon = new ImageIcon(new URL("http://www.stickpng.com/assets/images/58bf1d2de443f41d77c734a6.png"));
        ImageIcon icon1 = new ImageIcon(icon.getImage().getScaledInstance(25, 25,Image.SCALE_AREA_AVERAGING));
        button.setIcon(icon1);
        ////////////////////////////////////
        frame.add(button);
        frame.getRootPane().setDefaultButton(button);
        
        frame.setVisible(true);
    }
    
}
















