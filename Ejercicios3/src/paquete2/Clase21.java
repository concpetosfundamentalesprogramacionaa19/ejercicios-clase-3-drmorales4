/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Clase21 {
    
    public static void main(String[] args) {
        
        boolean bandera;
        int valor1 = 1;
        int valor2 = 10;
        
        bandera = valor1 < valor2;
        
        System.out.printf("Resulatado de bandera comparativo: %s\n", bandera); // resulatado de bandera comparativo
        
        bandera = (valor1 < valor2) & (valor1 > valor2); // Producto lógico – \AND (binario)
        
        System.out.printf("Resulatado en bandera con el AND: %s\n", bandera); // resulatado en bandera con el AND
        
        bandera = (valor1 < valor2) | (valor1 > valor2);
        
        System.out.printf("Por el OR si hay un verdadero y uno falso, es "
                + "verdadero: %s\n", bandera); // por el OR si hay un verdadero y uno falso, es verdadero
        
        bandera = !((valor1 < valor2) | (valor1 > valor2)); // Negación - NOT (unario)
        
        System.out.printf("Por la negacion es negativo al final: %s\n", bandera); // por la negacion "!" es negativo al final
                                                
    }
    
}
