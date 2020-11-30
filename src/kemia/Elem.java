/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Axmart
 */
public class Elem {
    
    int Evszam ;
    String Nev;
    String Vegyjel;
    int Rendszam;
    String Felfedezo;

    public int getEvszam() {
        return Evszam;
    }

    public String getNev() {
        return Nev;
    }

    public String getVegyjel() {
        return Vegyjel;
    }

    public int getRendszam() {
        return Rendszam;
    }

    public String getFelfedezo() {
        return Felfedezo;
    }

    public Elem(String[] tomb) {
        
        if (tomb[0].contains("Ókor")) {
            this.Evszam = 0;
        }else{
            
        this.Evszam = Integer.parseInt(tomb[0]) ;
        
        }
        
        this.Nev = tomb[1];
        this.Vegyjel = tomb[2];
        this.Rendszam = Integer.parseInt(tomb[3]);
        this.Felfedezo = tomb[4];
    }
    
    
    public static ArrayList<Elem> Beolvasas() throws FileNotFoundException, IOException{
        ArrayList<Elem> output = new ArrayList<>();
        
         System.setProperty("file.encoding", "UTF-8");
        BufferedReader fileReader = new BufferedReader(new FileReader("felfedezesek.csv"));
        
        String sor = fileReader.readLine();
        
        while((sor =fileReader.readLine())!= null){
            
            
            output.add(new Elem(sor.split(";")));
            
        }
        
        
        fileReader.close();
        
        
        
        return output;
        
    }
    
    
    
}
