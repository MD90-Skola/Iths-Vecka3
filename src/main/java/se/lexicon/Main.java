package se.lexicon;
import java.util.Arrays;


// Vecka 3 - Lektion 2 -  https://youtu.be/CiJBFWYO8sg

// Array
// Vad är det ?
// när är det bra att använda?


// arrays kan bara inehålla en tip exempel "strin eller int" går ej blanda
// när man skapar en array så bestämmer man hur många platser som ska finnas ( går ej endra)
// man kan ändra värdet


// skapa en array när jag vet vilka värden som ska sparas
public class Main {
    public static void main(String[] args) {

        // array börjar alltid på noll 0
        String[] classList = {"Robin", "Sofie", "Daniel", "Bob", "lotta"};
        System.out.println(classList[0]);


        // skapa en array när jag inte vet vilka värden jag vill spara i min array

        String[] classList2 = new String[3];
        //   System.out.println(classList[5]);

        // skriv ut alla värden i min array genom att använda for loop
        for (int i = 0; i < classList.length; i++) {
            System.out.println(classList[i]);
        }


        System.out.println(Arrays.toString(classList));
    }
}