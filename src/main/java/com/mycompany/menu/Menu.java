package com.mycompany.menu;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

Scanner teclado2 = new Scanner(System.in);


Locale.setDefault(Locale.US);
int pedido,quantidade;
double total;
String avance = " ";

System.out.println("Bem vindo ao menu:\n"
        + "Pedido          Produto         Valor\n"
        + "1         | Cachorro quente | R$ 4.00\n"
        + "2         |     X-Salada    | R$ 4.50\n"
        + "3         |     X-bacon     | R$ 5.00\n"
        + "4         | Torrada Simples | R$ 2.00\n"
        + "5         |   Refrigerante  | R$ 3.00\n"
        + " Pressione enter ");



avance = teclado2.nextLine();
System.out.println("informe o número do pedido:");


pedido = teclado2.nextInt();
System.out.println("Informe a Quantidade:");

quantidade = teclado2.nextInt();

if 
(pedido == 1){
total = quantidade * 4.00;
    System.out.printf("Valor total R$ %.2f", total);
}

if 
(pedido ==2){
total = quantidade * 4.50;
System.out.printf("Valor total R$ %.2f", total);
}

if 
(pedido ==3){
total = quantidade * 5.00;
System.out.printf("Valor total R$ %.2f", total);
}

if 
(pedido ==4){
total = quantidade * 2.00;
System.out.printf("Valor total R$ %.2f", total);
}

if 
(pedido ==5){
total = quantidade * 3.00;
System.out.printf("Valor total R$ %.2f", total);
}

}
        


    }

