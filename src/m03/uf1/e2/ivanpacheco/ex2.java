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
public class ex2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String frase;
        frase = entrada.nextLine();
        String paraula[] = frase.split(" ");
        boolean correcto = false;
        System.out.print("");
        for(int i = 0; i < paraula.length; i++){
            if(paraula[i].charAt(paraula.length) == paraula[i+1].charAt(0)){
                correcto = true;
            }else{
                correcto = false;
                break;
            }
        }
        if(correcto = true){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}
