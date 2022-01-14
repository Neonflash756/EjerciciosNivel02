/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel02;

/**
 *
 * @author Alex Cobos López
 */
public class EjerciciosNivel02 {
    
    public boolean escaleraPalabras(char[][] listaPalabras){
        
        for(int i=0;i<listaPalabras.length-1; i++){
            int contador = 0;
            for(int j=0;j<listaPalabras[0].length; j++){
                if(listaPalabras[i][j] != listaPalabras[i+1][j]){
                    contador++;
                }
                
            }
            if (contador != 1){//si es distinto de uno return false
                               //porque se diferencian en más de un caracter
                return false;
            }
            
        }
        return true;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char [][] listaPalabras = {
            {'P', 'A', 'T', 'A'}, 
            {'P', 'A', 'T', 'O'}, 
            {'R', 'A', 'T', 'O'}, 
            {'R', 'A', 'M', 'O'}, 
            {'G', 'A', 'M', 'O'}, 
            {'G', 'A', 'T', 'O'}, 
            {'M', 'A', 'T', 'O'}
        };
        EjerciciosNivel02 e = new EjerciciosNivel02();
        e.escaleraPalabras(listaPalabras);
    System.out.println(e.escaleraPalabras(listaPalabras));
    }
   
    
}
