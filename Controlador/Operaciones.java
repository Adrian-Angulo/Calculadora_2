/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Adrian Castillo
 */
public class Operaciones {
    

    public String evaluar(String string) {
        int resultado;
        int numeros [] = new int[100];
        if(string.contains("+")){
            String[] partes = string.split("\\+");
            for (int i = 0; i < partes.length; i++){
            numeros[i]= Integer.parseInt(partes[i]);
            }
        resultado = numeros[0]+numeros[1];
        return resultado+"";
        //System.out.println("la suma es"+resultado);
        }
        else if(string.contains("-")){
            String[] partes = string.split("\\-");
            for (int i = 0; i < partes.length; i++){
            numeros[i]= Integer.parseInt(partes[i]);
        }
        resultado = numeros[0]-numeros[1];
        return resultado+"";
        //System.out.println("la resta es"+resultado);
        }
        else if(string.contains("x")){
            String[] partes = string.split("x");
            for (int i = 0; i < partes.length; i++){
            numeros[i]= Integer.parseInt(partes[i]);
        }
        resultado = numeros[0]*numeros[1];
        return resultado+"";
        //System.out.println("la multiplicacion es"+resultado);
        }
        else if(string.contains("/")){
            String[] partes = string.split("\\/");
            for (int i = 0; i < partes.length; i++){
            numeros[i]= Integer.parseInt(partes[i]);
        }
        resultado = numeros[0]/numeros[1];
        return resultado+"";
        //System.out.println("la divicion es"+resultado);
        }
        else{
            System.out.println("no existe valor");
        }
            return "";
        
    }
}
