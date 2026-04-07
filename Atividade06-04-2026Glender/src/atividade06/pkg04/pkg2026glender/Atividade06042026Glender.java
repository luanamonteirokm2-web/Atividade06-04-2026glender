/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade06.pkg04.pkg2026glender;
import java.util.Scanner;
/**
 *
 * @author Luana
 */
public class Atividade06042026Glender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Tamanho: ");
        n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        // lendo
        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        // invertendo
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            y[j] = x[i];
            j++;
        }

        // mostrando
        System.out.println("Invertido:");
        for (int i = 0; i < n; i++) {
            System.out.print(y[i] + " ");
        }}}

