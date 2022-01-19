package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a;
        int b;

        System.out.println("coloque o primeiro número");
        a = scan.nextInt();
        System.out.println("coloque o segundo número");
        b = scan.nextInt();

        double somar = somar(a,b);
        double subtrair = subtrair(a,b);
        double multiplicar = multiplicar(a,b);
        double dividir = dividir(a,b);

        System.out.println("a soma é: "+somar);
        System.out.println("a subtração é: "+subtrair);
        System.out.println("a multiplicação é: "+multiplicar);
        System.out.println("a divisão é: "+dividir);
    }



    public static double somar(double a, double b)
    {
        return (a + b);
    }
    public static double subtrair(double a, double b)
    {
        return (a - b);
    }

    public static double multiplicar(double a, double b)
    {
        return (a * b);
    }
    public static double dividir(double a, double b)
    {
        return (a / b);
    }






}
