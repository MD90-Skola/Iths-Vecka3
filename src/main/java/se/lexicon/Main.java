package se.lexicon;

import java.util.Scanner;

// Vecka 3 - Lektion 3 -https://youtu.be/7AqccWNxHTs

// Metoder

//återanvända kod
// dela upp kod


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("skriv in 2 st, heltal så skriver jag ut summan av dom 2 talen.");
        int input = sc.nextInt();
        int input2 = sc.nextInt();

        add(input, input2);

/*
        String michel = "michel";
        greeting(michel);
*/


        //  System.out.println("hej1");
    }



/*
    static void greeting(){
        System.out.println("tja!");
    }

*/


    static void greeting(String name) {
        System.out.println("hej " + name);
        System.out.println("välkommen till programmering ");
    }

    static void add(int nr, int nr2) {
        System.out.println(nr + nr2);
    }


}