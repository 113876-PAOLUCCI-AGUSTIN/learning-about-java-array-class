/**
 * An array is a container object that holds a fixed number of values of a single type.
 * The length of an array is established when the array is created. After creation,
 * its length is fixed.
 * Each item in an array is called an element, and each element is accessed by its numerical index.
 * Numbering begins with 0.
 * Source: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 */

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

        // DECLARING ARRAY LITERAL.
        String[] theBeatles = { "John","Paul","George","Ringo" };

        // OTHER EXAMPLE.
        Integer[] myNumbersArray = {65, -1, 3, 316, 50};
        myNumbersArray[0] = 32;
        myNumbersArray[2] = 5;
    }
}
