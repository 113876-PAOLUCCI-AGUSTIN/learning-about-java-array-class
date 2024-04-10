/**
 * An array is a container object that holds a fixed number of values of a single type.
 * The length of an array is established when the array is created. After creation,
 * its length is fixed.
 * Each item in an array is called an element, and each element is accessed by its numerical index.
 * Numbering begins with 0.
 * SOURCE: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 */

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println("---- DECLARING ----");

        // DECLARATION >>  Only a reference of an array is created. NO ACTUAL ARRAY EXISTS!
        String[] theRollingStones;

        // INSTANTIATING with NEW
        // Here I create the array or give memory to the array. You must specify the type and number of elements to allocate.
        theRollingStones = new String[5];

        // INSERTING AN ELEMENT.
        theRollingStones[0] = "Mick Jagger";     //1 - INDEX:0
        theRollingStones[1] = "Keith Richards";  //2 - INDEX:1
        theRollingStones[2] = "Ronnie Wood";     //3 - INDEX:2
        theRollingStones[3] = "Charlie Watts";   //4 - INDEX:3
        theRollingStones[4] = "Brian Jones";   //4 - INDEX:3
        // IMPORTANT: Length : 5 from indexes 0 to 4.

        System.out.println("The Rolling Stones are...");
        for (String cantoRodado : theRollingStones) {
            System.out.println(cantoRodado);
        }
        System.out.println("The first element of the array: " + theRollingStones[0]);
        System.out.println("The last element of the array: " + (theRollingStones[4]));

        // DECLARING ARRAY LITERAL.
        String[] theBeatles = { "John","Paul","George","Ringo" };
        System.out.println("\nand The Beatles are...");
        for (int i = 0; i < theBeatles.length; i++) {
            String theBeatle = theBeatles[i];
            System.out.println(theBeatle);
        }

        // OTHER EXAMPLE.
        Integer[] myNumbs = {65, -1, 3, 316, 50};
        // CHANGING VALUE TO A SPECIFIC INDEX:
        myNumbs[3] = 32;
        myNumbs[2] = 5;

        // ACCESSING JAVA ARRAY ELEMENTS USING FOREACH LOOP. IA shortcut: iter
        System.out.println("\n---- ACCESSING WITH FOREACH LOOP ----");
        for (Integer i : myNumbs) {
            System.out.print(i + " ");
        }

        // ACCESSING JAVA ARRAY ELEMENTS USING FOR LOOP.
        // IA shortcut: itar
        System.out.println("\n---- ACCESSING WITH FOR LOOP ----");
        for (int i = 0; i < myNumbs.length; i++) {
            System.out.print(myNumbs[i] + " ");
        }

        // ACCESSING JAVA ARRAY ELEMENTS IN REVERSE MODE.
        // IA shortcut: ritar
        System.out.println("\n---- ACCESSING IN REVERSE ORDER WITH FOR LOOP ----");
        for (int i = myNumbs.length - 1; i >= 0; i--) {
            System.out.print(myNumbs[i] + " ");
        }

        System.out.println("\n---- ARRAYS.SORT() ----");
        Arrays.sort(myNumbs);
        for (Integer i : myNumbs) {
            System.out.print(i + " ");
        }

        System.out.println("\n---- ARRAYS.SORT() + COLLECTIONS.REVERSE ORDER() ----");
        Arrays.sort(myNumbs, Collections.reverseOrder());
        for (Integer i : myNumbs) {
            System.out.print(i + " ");
        }

        System.out.println("\n---- PRACTICE:  ----");
        // CREATING A 5 INTEGER NUMBERS ARRAY.
        Integer[] myFiveLuckyNumbers = new Integer[5]; // Every element is null.

        for (int i = 0  ; i < myFiveLuckyNumbers.length; i++) {
            System.out.print(myFiveLuckyNumbers[i] + " ");
        }
        System.out.println("\n---- ARRAYS.FILL() ----");
        // FILING ALL ELEMENTS WITH ZERO IN THIS EXAMPLE.
        Arrays.fill(myFiveLuckyNumbers,0); // VALUE
        // ACCESSING
        for (Integer num : myFiveLuckyNumbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n---- FILLING WITH RANDOM NUMBERS:  ----");
        for (int i = 0; i < myFiveLuckyNumbers.length; i++) {
            myFiveLuckyNumbers[i] = (int)(Math.random()*100);
        }
        // ACCESSING WITH FOREACH LOOP.
        for (Integer numb : myFiveLuckyNumbers) {
            System.out.print(numb + " ");
        }
    }
}
