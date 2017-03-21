
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wellington.silva10
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);    
       
       // Entrada
        System.out.println("x1:");
        double x1 = leitor.nextDouble();
        System.out.println("x2:");
        double x2 = leitor.nextDouble();
        System.out.println("c:");
        double c = leitor.nextDouble();
        
        //System.out.println("x1:");
        //double x1 = Double.parseDouble(leitor.nextLine());
        //System.out.println("x2:");
        //double x2 = Double.parseDouble(leitor.nextLine());
        //System.out.println("c:");
        //double c = Double.parseDouble(leitor.nextLine());
        
       //Processamento
       double soma = x1 + x2;
       double produto = x1 * x2;
       double a = c / produto;
       double b = -(a * soma);
       
       //Saídas
       //System.out.println(a + 
               //" x^2 + "
               //+ b + 
               //" x + "
               //+ c + 
               //" = 0");

       System.out.println(a + " x^2 + " + b + " x + " + c + " = 0");
       
       
    }
    
}
