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
public class ex3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nom, cognom;
        int max = 100;
        String correu[] = new String[max];
        boolean finalitzar = false;
        do{
            System.out.print("Nom: ");
            nom = entrada.nextLine();
            if(nom.length() > 0){
                finalitzar = false;
            }else{
                finalitzar = true;
                break;
            }
            System.out.print("Cognom: ");
            cognom = entrada.nextLine();
            System.out.printf("%s%s%s%s@copernic.cat%n" ,nom.charAt(0) ,cognom.charAt(0), cognom.charAt(1), cognom.charAt(2));
            System.out.println();
        }while(!finalitzar);
        System.out.println("FINALITZAT");
    }
}
