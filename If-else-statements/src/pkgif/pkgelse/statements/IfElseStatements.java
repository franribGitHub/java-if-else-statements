
package pkgif.pkgelse.statements;

import java.util.Scanner;


/**
 *
 * Name: Frankie Ribas
 * Period: 2
 * Project Name: If Else Statements
 * 
 */

public class IfElseStatements {

    private static Scanner kb = new Scanner(System.in);
    
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
    }
    
    
    public static void question1(){
        System.out.print("\nNumber > ");
        int num = kb.nextInt();
        if (num > 70) {
            System.out.println("Passing");
        } else {
            System.out.println("Not Passing");
        }
    }
    
    public static void question2(){
        System.out.print("\nNumber > ");
        int num = kb.nextInt();
        if (num <= 50) {
            System.out.println("Go");
        } else {
            System.out.println("Stop");
        }
    }
    
    public static void question3(){
        System.out.print("\nInteger > ");
        int num = kb.nextInt();
        if ((num % 2) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    
    public static void question4(){
        System.out.print("\nInteger > ");
        int num = kb.nextInt();
        if ((num % 5) == 0) {
            System.out.println("Multiple of 5");
        } else {
            System.out.println("Not a Multiple of 5");
        }
    }
    
    public static void question5(){
        System.out.print("\nNumber > ");
        int num = kb.nextInt();
        if (num < 10) {
            System.out.println("One Digit");
        } else if (num >= 100) {
            System.out.println("Three Digits");
        } else {
            System.out.println("Two Digits");
        }
    }
    
    public static void question6(){
        System.out.print("\nJersey Number > ");
        int jNum = kb.nextInt();
        if (jNum == 12 || jNum == 71 || jNum == 80) {
            System.out.println("That number is retired from the Seattle Seahawks!");
        }
    }
    
    public static void question7(){
        System.out.print("\nState > ");
        kb.nextLine();
        String state = kb.nextLine();
        if (state.equals("Washington") || state.equals("Oregon") || state.equals("Idaho")) {
            System.out.println("This state is in the PNW");
        } else {
            System.out.println("You should move to the PNW; it's great here!");
        }
    }
    
    public static void question8(){
        System.out.print("\nShort, Tall, Grande, or Venti > ");
        String size = kb.nextLine();
        if (size.equals("Short")) {
            System.out.println("8oz");
        } else if (size.equals("Tall")) {
            System.out.println("12oz");
        } else if (size.equals("Grande")) {
            System.out.println("16oz");
        } else if (size.equals("Venti")) {
            System.out.println("20oz");
        }
    }
    
    public static void question9(){
        System.out.print("\nRate of Pay (Dollars Per Hour) > ");
        double rate = kb.nextDouble();
        System.out.print("Hours Worked > ");
        int time = kb.nextInt();
        if (time > 40) {
            System.out.println("Gross Pay is $" + (40 * rate + (time - 40) * (rate * 1.5)));
        } else {
            System.out.println("Gross Pay is $" + (rate * time));
        }
    }
    
    public static void question10(){
        System.out.print("\nRate of Pay (Dollars Per Hour) > ");
        double rate = kb.nextDouble();
        System.out.print("Hours Worked > ");
        int time = kb.nextInt();
        if (time <= 40) {
            System.out.println("Gross Pay is $" + (rate * time));
        } else if (time <= 60) {
            System.out.println("Gross Pay is $" + (40 * rate + (time - 40) * (rate * 1.5)));
        } else {
            System.out.println("Please See Manager");
        }
    }
    
}
