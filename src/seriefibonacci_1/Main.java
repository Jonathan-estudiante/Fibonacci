/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci_1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\033[32m==Ingrese hasta que número quiere mostrar su serie==\033[0m");
        int n = sc.nextInt();
        
        SerieFibonacci_1 r = new SerieFibonacci_1();
        r.Fibonacci(n);
        r.Serie(n);

    }
}
