/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maiusculominusculo;

/**
 *
 * @author Noa
 */
public class MaiusculoMinusculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Informe 5 palavras,  escrever cada uma delas em maiuscula e minuscula
        int cont = 0;
        
        
        while (cont < 5) {
        String palavra = Entrada.leiaString("Informe uma palavra: ");
        System.out.println("MAIUSCULA: " + palavra.toUpperCase());
        System.out.println("minuscula: " + palavra.toLowerCase());
        
        
        cont++;
        }
        
        
        
        System.exit(0);
    }
    
}
