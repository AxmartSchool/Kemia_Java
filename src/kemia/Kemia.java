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
        
        ElemekSzama();
        OkoriElemekSzama();
        ElemBekeres();
        
        
    }

    private static void ElemekSzama() {
        
        System.out.println("3. feladat: Elemek szama: "+elemek.size());
        
    }

    private static void OkoriElemekSzama() {
        
        int okoriElemek = 0;
        while (elemek.get(okoriElemek).getEvszam() == 0) {
            okoriElemek++;
            
        }
        
        System.out.println("4. feladat: Felfedezesek szama az okorban: "+okoriElemek);
        
    }

    private static void ElemBekeres() throws IOException {
        String Input = Elem.ElemBekeres();
        
        
        
        
    }
    
}
