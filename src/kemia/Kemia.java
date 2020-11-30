/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemia;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Axmart
 */
public class Kemia {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<Elem> elemek;
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        elemek = Elem.Beolvasas();
        
        for (Elem elem : elemek) {
            System.out.println(elem.Evszam);
        }
        
        
        
    }
    
}
