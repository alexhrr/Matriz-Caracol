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
public class arreglar {
    public void arreglo(String cadena,int tamaño){
        String nueva="";      
        char matriz[][]=new char [tamaño][tamaño];
        int contador=0;
        for (int i = 0; i <tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j]=cadena.charAt(contador);
                System.out.print(matriz[i][j]);contador++;
                contador++;
            }
            System.out.println(" ");
        }
        
        System.out.println("\n Matriz en caracol:\n");
        int n=tamaño;
        
           
        
        int a=0;
        int b=n-1;
        
        for(int j=0; j< matriz.length;j++){
            
        
        for(int i=a; i<=b;i++){
            System.out.print(matriz [a][i]+" ");
        }
        
        for(int i=a+1; i<=b;i++){
            System.out.print(matriz [i][b]+" ");
        }
        
        for(int i=b-1; i>=a; i--){
            System.out.print(matriz [b][i]+" ");
        }
        
        for(int i=b-1; i>=a+1; i--){
            System.out.print(matriz [i][a]+" ");
        }
        a++;b--;
        }
       
    }
    
    
}
