/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.e2.ivanpacheco;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class ex1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int preu, descompte, articles = 0;
        char IVA;
        double iva = 0, preuAmbIva, preuFinal, preuTotal = 0;
        boolean finalitzar = true;
        
        do{
           System.out.print("Preu article: ");
           preu = entrada.nextInt();
           if(preu > 0){
               finalitzar = false;
           }else{
               finalitzar = true;
               break;
           }
           entrada.nextLine();
           System.out.print("IVA: ");
           IVA = entrada.nextLine().charAt(0);
           if(IVA == 'G'){
               iva = 0.21;
           }else if(IVA == 'R'){
               iva = 0.10;
           }else if(IVA == 'S'){
               iva = 0.04;
           }
           System.out.print("Descompte: ");
           descompte = entrada.nextInt();
           preuAmbIva = (preu + (double)(preu * iva));
           preuFinal = (preuAmbIva - (preuAmbIva*descompte/100));
           System.out.printf("Preu final: %.2f%n" ,preuFinal);
           articles++;
           preuTotal += preuFinal;
           System.out.println("");
        }while(!finalitzar);
        System.out.printf("Articles totals: %d%n" ,articles);
        System.out.printf("Preu total: %.2f%n" ,preuTotal);
        System.out.print("\nPrem ENTER per finalitzar ...");
        entrada.nextLine();
        entrada.nextLine();
    }
}
