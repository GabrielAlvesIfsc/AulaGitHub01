/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubgabriel;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author IFSC
 */
public class GitHubGabriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String a;
        
        
        System.out.println("digite sue nome elemento: ");
        a = scan.nextLine();
        System.out.println("\nProcessando...\n");
        System.out.println("Seu Nome é: "+ a);
        System.out.println(a + ", Bem Vindo ao GitHub! ");
       
        
        
    }
    
}
