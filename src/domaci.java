import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class domaci {
    static Scanner skener = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("pick a task: \n" +
                    "1 - Declare a String Value and print out it's length\n" +
                    "2 - Declare an array with 5 elements and populate it, Access the 5th element and print it\n" +
                    "NOTE --- I chose an int array ---\n" +
                    "3 - Display the remainder of the division between  25 and 4\n" +
                    "4 - Write three functions that compute the sum of the numbers in an array: using a for-loop, a for-each-loop, and a while-loop\n" +
                    "5 - write a method that iterates through an array or list of Strings and makes it lowercase\n" +
                    "6 - Declare an array of 10 elements, convert it to a list and print it.\n" +
                    "7 - use the try-cath-finally block and add a return statement in the catch and finally block. " +
                    "call the method and make sure and exception is thrown. which value is returned?\n" +
                    "8 - Write a program that checks if a given string is a Palindrome\n" +
                    "9 - Write a program that checks if a given number is a Prime Number");
            int zadatak = skener.nextInt();
            if (zadatak == 1){
                zadatak1();
            } else if (zadatak == 2) {
                zadatak2();
            } else if (zadatak == 3) {
                zadatak3();
            } else if (zadatak == 4) {
                System.out.println("noting to show, please take a look at the code");
            } else if (zadatak == 5) {
                System.out.println("enter the number of elements in the array");
                String [] niz = new String[skener.nextInt()];
                System.out.println("enter the elements");
                for (int i = 0; i < niz.length; i++) {
                    niz[i] = skener.next();
                }
                zadatak5(niz);
            } else if (zadatak == 6) {
                zadatak6();
            } else if (zadatak == 7) {
                zadatak7();
            } else if (zadatak == 8) {
                zadatak8();
            } else if (zadatak == 9) {
                zadatak9();
            }
        }
    }
        // 1.
        static void zadatak1() {
            String string = skener.next();
            System.out.println("duzina stringa je: " + string.length());
        }
        static void zadatak2() {
        // 2.
        int niz1[] = new int[5];
        System.out.println("unesi elemente petoclanog niza");
        for (int i = 0; i < niz1.length; i++) {
            niz1[i] = skener.nextInt();
        }
        System.out.println("peti element je: " + niz1[4]);
        }
        // 3.
        static void zadatak3() {
            System.out.println(25 % 4);
        }
        // 4.
        int forSum(int[] niz){
            int zbir = 0;
            for (int i = 0; i < niz.length; i++){
                zbir += niz[i];
            }
            return zbir;
        }
        int forEachSum(int[] niz){
            int zbir = 0;
            for (int elem:niz) zbir += elem;
            return zbir;
        }
        int whileSum(int[] niz){
            int i = 0;
            int zbir = 0;
            while (i < niz.length){
                zbir += niz[i];
            }
            return zbir;
        }

        // 5.
        static void zadatak5(String[] niz){
            for (int i = 0; i < niz.length; i++){
                niz[i] = niz[i].toLowerCase();
            }
            for (int i = 0; i < niz.length; i++){
                System.out.println(niz[i]);
            }
        }

        //6
        static void zadatak6() {
            int[] niz2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            List<Integer> list = new ArrayList<>();
            for (int elem : niz2) list.add(elem);
            System.out.println(list);
        }

        // 7.
        static int divideByZero ( int broj){
            broj = broj / 0;
            return broj;
        }
        static String zadatak7() {
            try {
                divideByZero(6);
            } catch (ArithmeticException e) {
                System.out.println("nije moguce deliti nulom");
                return ("nije moguce deliti nulom");

            } finally {
                System.out.println("ovo se izvrsava bez obzira da li se dogodio excepton ili ne");
                return ("ovo se izvrsava bez obzira da li se dogodio excepton ili ne");
            }
        }

        // 8.
        static void zadatak8() {
            String palindrom = skener.next();
            palindrom = palindrom.replaceAll("\\s", "");
            palindrom = palindrom.toLowerCase();
            Boolean isPalindrom = true;
            for (int i = 0; i < palindrom.length() / 2; i++) {
                if (palindrom.charAt(i) != palindrom.charAt(palindrom.length() - 1 - i)) {
                    isPalindrom = false;
                    break;
                }
            }
            System.out.println("da li je uneti string palindrom: " + isPalindrom);
        }
        // 9.
        static void zadatak9() {
            Boolean isPrime = true;
            int broj = skener.nextInt();
            if (broj < 1) {
                isPrime = false;
            }
            for (int i = 2; i < broj; i++) {
                if (broj % i == 0) {
                    isPrime = false;
                }
            }
            System.out.println("da li je uneti broj prost: " + isPrime);
        }
}
