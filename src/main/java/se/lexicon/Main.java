package se.lexicon;

// Vecka 3 - Lektion 1 -  https://www.youtube.com/watch?v=vJxaoGQ1dnQ

// vad är ett block?
// varför indentering?
// få mer förståelse


public class Main {
    public static void main(String[] args) {

        int nr1 = 10;
        int nr2 = 15;

        if (nr1 > nr2){
            int nr3 = nr1 + nr2;

        }
        // vi kommer inte åt vår INT nr 3 eftersom den inte existerar utanför vår if sats och dess kodblock
        int nr4 = nr3;


        if(nr1 != nr2){
            System.out.println("hej");
        }






    }
}