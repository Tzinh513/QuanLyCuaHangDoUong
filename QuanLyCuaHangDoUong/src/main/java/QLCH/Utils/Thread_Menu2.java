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
public class Thread_Menu2 extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i <= x; i++) {
                Thread.sleep(1);
                pnlListMenu.setSize(i, 810);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    int x = 218;
    JPanel pnlListMenu;

    public Thread_Menu2(JPanel pnlListMenu) {
//        this.x = x;
        this.pnlListMenu = pnlListMenu;
    }



}
