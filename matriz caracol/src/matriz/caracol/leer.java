/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz.caracol;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author PROFESIONAL
 */
public class leer {

    public String lectura(String direccion) {
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                temp = temp + bfRead;
            }
            texto = temp;
        } catch (Exception e) {
            System.out.println("no se encontro archivo");
        };
        return texto;        
    }
    
}
