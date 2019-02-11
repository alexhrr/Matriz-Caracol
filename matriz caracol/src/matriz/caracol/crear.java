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
public class crear {

    public void generarachivo(int cantidad) {
        FileWriter escribir;
        File file = new File("archivo.txt");
        int valores = 0;
        ArrayList<Integer> matriz = new ArrayList<Integer>();
        String cadena = "";

        if (!file.exists()) {
            try {
                file.createNewFile();
                escribir = new FileWriter(file, true);
                PrintWriter imprimir = new PrintWriter(escribir);
                for (int i = 0; i < cantidad; i++) {
                    for (int j = 0; j < cantidad; j++) {
                        valores = (int) (Math.random() * 10) + 0;
                        cadena = cadena + valores+" ";
                    }
                    
                    imprimir.println(cadena);
                    cadena = "";

                }

                imprimir.close();
                escribir.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            };
        } else {
            try {
                file.delete();
                file.createNewFile();
                escribir = new FileWriter(file, true);
                PrintWriter imprimir = new PrintWriter(escribir);
                for (int i = 0; i < cantidad; i++) {
                    for (int j = 0; j < cantidad; j++) {
                        valores = (int) (Math.random() * 10) + 0;
                        cadena = cadena + valores+" ";
                    }
                    imprimir.println(cadena);
                    cadena = "";

                }

                imprimir.close();
                escribir.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            };

        }
    }
}
