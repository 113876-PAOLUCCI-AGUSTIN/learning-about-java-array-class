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
import java.util.Scanner;

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

        //
        // CREATING AND INITIALIZING AN ARRAY.
        Integer[] myFirstArray = new Integer[25];


        // CREATING AN INSTANCE OF THE ARRAY.
        Integer[] mySecondArray = {2, 4, 7, 98, 32, 77, 81, 62, 45, 71}; //

        // To get the length of the array, we use the length property
        System.out.println(mySecondArray.length);

        // FIRST: INDEX 0.
        Integer firstElement = mySecondArray[0];
        System.out.println(firstElement);

        // LAST: LENGTH - 1.
        Integer lastElement = mySecondArray[mySecondArray.length - 1];
        System.out.println(lastElement);

        mySecondArray[1] = null;
        mySecondArray[8] = null;

        // ACCESSING ELEMENTS.
        for (int i = 0; i < mySecondArray.length; i++) {
            System.out.print(mySecondArray[i] + " ");
        }

        Integer[] myThirdArray = new Integer[10];

        // FILLING WITH i.
        for (int i = 0; i < myThirdArray.length; i++) {
            myThirdArray[i] = i;
        }

        // ACCESSING WITH FOR LOOP.
        System.out.println("\nACCESSING WITH FOR LOOP");
        for (int i = 0; i < myThirdArray.length; i++) {
            System.out.print(myThirdArray[i] + " ");
        }

        // ACCESSING WITH FOR EACH LOOP
        System.out.println("\nACCESSING WITH FOR EACH LOOP");
        for (Integer i : myThirdArray) {
            System.out.print(myThirdArray[i] + " ");
        }

        System.out.println("---- BOOK EXERCISE 1 Page 241 ----");
        int[] sample = {2, 4, 7, 98, 32, 77, 81, 62, 45, 71};
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the number you want to find: ");
        int electedNumber = input.nextInt();
        for (int i = 0; i < sample.length; i++) {
            if (sample[i] == (electedNumber)) {
                System.out.println("Match found at element: " + i);
                break;
            } else {
                System.out.println("Match not found");
            }
        }

        // Finding the Smallest Number in an Array.
        Integer[] mySecondSample = {14, 28, 15, 89, 46, 25, 94, 33, 82, 11, 37, 59, 68,
                27, 16, 45, 24, 33, 72, 51};

        int sm = mySecondSample[0];
        for (int i = 0; i < mySecondSample.length; i++) {
            if (mySecondSample[i] < sm) {
                sm = mySecondSample[i];
            }
        }
        System.out.println(sm);

        // SORTING AN ARRAY.
        System.out.println("\nASC");
        Arrays.sort(mySecondSample);
        for (Integer i : mySecondSample) {
            System.out.print(i + " ");
        }

        // SORTING AN ARRAY.
        System.out.println("\nDSC...Reverse mode....");
        Arrays.sort(mySecondSample, Collections.reverseOrder());
        for (int i = 0; i < mySecondSample.length; i++) {
            System.out.print(mySecondSample[i] + " ");
        }

        // COPYING AN ARRAY.
        Integer[] myRRA = Arrays.copyOf(mySecondSample, 9);

        for (int i = 0; i < myRRA.length; i++) {
            System.out.println(" | " + myRRA[i]);
        }
        // FILLING AN ARRAY
        Arrays.fill(mySecondSample,0);

        System.out.println(mySecondSample.length);
        for (Integer i : mySecondSample) {
            System.out.print(i+ " - ");
        }

        System.out.println("\n---- MULTIDIMENSIONAL ARRAYS [ROW] [COLUMN] ----");
        int[][] myDoMulti = {{ 1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myDoMulti[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(myDoMulti));

        int[] intArray = { 1, 2, 3 };

        int[] cloneArray = intArray.clone();

    }
}
