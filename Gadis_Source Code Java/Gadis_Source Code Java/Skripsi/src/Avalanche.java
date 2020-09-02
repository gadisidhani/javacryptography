/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GadisIdhani
 */
import java.util.ArrayList;
import java.util.List;


public class Avalanche {
    public double avalanche(String bit1, String bit2){
        int count = 0;
        int selisih = Math.abs(bit1.length() - bit2.length());
        int kecil = 0;
        if (bit1.length() < bit2.length()){
            kecil = bit1.length();
        }else{
            kecil = bit2.length();
        }
        for(int i = 0; i < kecil; i++ ){
            if(bit1.charAt(i) != bit2.charAt(i)){
                count++;
            }
        }
        count = count + selisih;
        double total = (bit1.length()+bit2.length())/2;
        double avalanche = (count/total)*100;  
        return avalanche;
    }
}
