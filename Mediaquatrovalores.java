package com.mycompany.quadradoj;
import java.util.Scanner;

/* @author Wolfgang */
public class Mediaquatrovalores {
    public static void main(String[] args){
        
        Float n1, n2, n3, n4, media;
        
        Scanner read = new Scanner(System.in);        
        System.out.println("Digite o primeiro valor");
        n1 = read.nextFloat();
        System.out.println("Digite o segundo valor");
        n2 = read.nextFloat();
        System.out.println("Digite o terceiro valor");
        n3 = read.nextFloat();
        System.out.println("Digite o quarto valor");
        n4 = read.nextFloat();
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média dos valores é: " + media);
        
        
        
        read.close();
    }
    
}
