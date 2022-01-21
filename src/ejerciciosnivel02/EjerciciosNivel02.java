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
    
    public boolean escaleraPalabras2(char[][] lista){
        for (int j=0; j<lista.length-1; j++){
            int contador = 0;
            for (int i=0; i<lista[0].length; i++){
                if(lista[j][i] != lista[j+1][i]){
                    contador++;
                }
            }
            System.out.println(contador);
        
            if (contador != 1){//si es distinto de uno return false
                               //porque se diferencian en más de un caracter
                    System.out.println("No hay escalera de palabras");
                    return false;
            }
        }
        return true;  
    }
    
    private int cadenaADN(String uno, String dos){
        int coste = 0;
        
        for(int i=0; i<uno.length();i++){
            if(uno.charAt(i)=='-' || dos.charAt(i)== '-'){
                coste+= 2;
            }else{
            
            if(uno.charAt(i)=='C' && dos.charAt(i)!='G'){
                coste++;
            }
            
            if(uno.charAt(i)=='G' && dos.charAt(i)!='C'){
                coste++;
            }
            
            if(uno.charAt(i)=='A' && dos.charAt(i)!='T'){
                coste++;
            }
            
            if(uno.charAt(i)=='T' && dos.charAt(i)!='A'){
                coste++;
            }
            }         
        }
        return coste;
    }
    
    
    public int strStr(String uno, String dos){
        int posicion = -1;
        
        for(int i=0; i<uno.length();i++){
            if(uno.charAt(i)==dos.charAt(0)){
                posicion = i;
                int j=0;
                while(j<dos.length() && i<uno.length() && uno.charAt(i) == dos.charAt(j)){
                    i++;
                    j++;
                }
                if (j == dos.length()){//ha encontrado la palabra del string 2
                    return posicion;
                }
                if(i == uno.length()){//se ha terminado la palabra 1 y no cabe la dos
                    return -1;
                }
                //si llega aquí es porque ha salido del while
                //porque las letras son distintas
                i = posicion;
                posicion = -1;   
            }  
        }
        return posicion;
    }
    
    public String RPN(String [] entrada){
        String [] pila = new String [100];
        int posicion = 0;
        
        for( int i=0; i<entrada.length; i++){
            if(entrada[i].equals("+")){
                Double.valueOf(pila[posicion]);
                pila[posicion-2] = String.valueOf(Double.valueOf(pila[posicion-1]) +  Double.valueOf(pila[posicion-2]));
            }
            if(entrada[i].equals("-")){
                pila[posicion-2] = String.valueOf(Double.valueOf(pila[posicion-1]) -  Double.valueOf(pila[posicion-2]));
            }
            if(entrada[i].equals("*")){
                pila[posicion-2] = String.valueOf(Double.valueOf(pila[posicion-1]) *  Double.valueOf(pila[posicion-2]));
            }
            if(entrada[i].equals("/")){
                pila[posicion-2] = String.valueOf(Double.valueOf(pila[posicion-1]) /  Double.valueOf(pila[posicion-2]));
            }
            else{
                pila[posicion] = entrada[i];
                posicion++;
            }
        }
        
        return pila[0];
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
    System.out.println(e.escaleraPalabras2(listaPalabras));
    System.out.println(e.cadenaADN("ACGTA","TGCA-"));
    System.out.println(e.strStr("HOLA_MUNDO","DO"));
        
        String[] numeros = 
            {"3","2","+","7","*","15","21","+","-"};
        System.out.println(e.RPN(numeros));
    }
    };
   
    

