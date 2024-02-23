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
    private int numActual;
    

    public HiloBack(JLabel lbNum) {
        this.lbNum = lbNum;
        listanum = new ArrayList<>();
    }

    public int getNumActual() {
        return numActual;
    }
    

    public void setLbNum(JLabel lbNum) {
        this.lbNum = lbNum;
    }

    public int getNBack (int n){
        
       return listanum.get(listanum.size()-n);
    }
    
    @Override
    public void run() {
        
        
        while (true) {
            try {
                numActual = new Random().nextInt(0, 9);
                listanum.add(numActual);
                lbNum.setText("");
                sleep(1000);
                lbNum.setText(String.valueOf(numActual));
                sleep(5000);
            } catch (InterruptedException ex) {

            }
        }
        
    }

}
