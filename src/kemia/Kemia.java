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
        String input = Elem.ElemBekeres();
        ElemKereses(input);
        
        
        
    }

    private static void ElemKereses(String input) {
        System.out.println("6. feladat: Kereses");
        int szamlalo = 0;
        while (szamlalo < elemek.size() && !elemek.get(szamlalo).getVegyjel().equalsIgnoreCase(input)) {            
            szamlalo++;
            
        }
        
        if (szamlalo == elemek.size()) {
            System.out.println("\tNincs ilyen elem az adatforrasban!");
        }else{
            System.out.println("\tAz elem vegyjele: " +elemek.get(szamlalo).getVegyjel());
            System.out.println("\tAz elem neve: " +elemek.get(szamlalo).getNev());
            System.out.println("\tRendszama: " +elemek.get(szamlalo).getRendszam());
            System.out.println("\tFelfedezes eve: " +elemek.get(szamlalo).getEvszam());
            System.out.println("\tFelfedezo: " +elemek.get(szamlalo).getFelfedezo());
            
            
        }
        
        
        
    }
    
}
