/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz.caracol;

/**
 *
 * @author PROFESIONAL
 */
public class MatrizCaracol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad = (int) (Math.random() * 8) + 2;
        crear c = new crear();
        leer l= new leer();
        arreglar a=new arreglar();
        c.generarachivo(cantidad);
        String cadena=l.lectura("archivo.txt");
        a.arreglo(cadena,cantidad);
    }
}
