/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCH.Utils;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author AD
 */
public class Thread_Menu extends Thread {

    @Override
    public void run() {
        
        try {

            for (int i = 218; i >= 0; i--) {
                Thread.sleep(1);
                pnlListMenu.setSize(i, 810);

                a++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    int a = 0;
    JPanel pnlListMenu;

    public Thread_Menu( JPanel pnlListMenu) {
//        this.a = a;
        this.pnlListMenu = pnlListMenu;
    }


    
}
