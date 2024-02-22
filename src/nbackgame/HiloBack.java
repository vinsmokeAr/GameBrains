/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nbackgame;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Arleth
 *
 */

public class HiloBack extends Thread {

    private List<Integer> listanum;
    private JLabel lbNum;

    public HiloBack(JLabel lbNum) {
        this.lbNum = lbNum;
        listanum = new ArrayList<>();
    }

    public void setLbNum(JLabel lbNum) {
        this.lbNum = lbNum;
    }

    @Override
    public void run() {
        int numTemp=0;
        
        while (true) {
            try {
                numTemp = new Random().nextInt(0, 9);
                listanum.add(numTemp);
                lbNum.setText("");
                sleep(1000);
                lbNum.setText(String.valueOf(numTemp));
                sleep(2000);
            } catch (InterruptedException ex) {

            }
        }

    }

}
