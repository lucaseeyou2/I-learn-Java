
/*
Java is a popular language lauched 20 years ago it is used by most modern computers. 
It is used about everywhere and nobody seems to notice... exept me perhaps. 
*/

// Hey, im a comment, I can tell you more about this code but can't do much on my own 

/* 
* Im also a comment, but I can go 
* in 
* muliple 
* lines, you understand :) now lets get into the code : 
*/



                                // INTRODUCTION


/*
*   the following code prints out 'Hello world'; 
*   equivalent to console.log('Hello World'); 
*   Here, the file name should match the class  
*/

public class HelloWorld {
  // inside the brackets are the domain, or parts of the class

  // Here is the main part of the script
  public static void main(String[] args) {

    // Here, System.out.printl("[string]") will print out the requested string 
    System.out.println("Hello World!");

    // String variable message declared here
    String message = "Welcome !";

    // variables must be mentionned as [type] [name] = [type];
    System.out.println(message);

    /*
     * The types of current variables types are : String : a string, or text 
     * int : or integre, number that is without decimals but can be negatives 
     * float : numbers that have decimals 
     * char : unlike string, its a single character with single quotes (' ') 
     * bolean : value must be [true] or [false], bolean's only 2 values
     */

    final int o = 64;
    System.out.println(o + 64);

    /*
     * This statement looks like a variable but isnt the word final describes it as
     * final (or perfect in some sense) thus it canot be modified, and is like a js
     * constant
     */

    int a = 5, b = 6, c = 7;
    System.out.println(a * b * c);

    /*
     * You see that I have declared multiple integers here only using once the int
     * This is beacause of the multiple declarations function that works with every
     * single files.
     */

    String m = "Dec"; // (1)
    String month = "December"; // (2)

    System.out.println("We are in the month of" + m + "also named" + month);

    /*
     * This is a dumb example of what im trying to explain. Here one variable is named 
     * 'm' and the other is named 'month'. Try to use easily interpreted names to easly 
     * recognise what is what in a line of block of code.
     */


                                // PRIMITIVE VALUES 
    /*
    Contents :
      byte, short, int, long, float, double, bolean, char
    */
     byte d = 60; 
     System.out.println("I have waited " + d + " minutes"); 

     /*
     * Here this d is nor a int nor a float. Its a byte. This byte here is a primitive
     * data type, that can only contain the numbers between -128 and 127, 0 included 
     * resulting in a total of 256 possible different values. Their size is 1 byte. 
     */

     short e = 29999; 
     System.out.println("My best score is " + e);

     /*
     * Short here contains all of the numbers that are between -32,768 to 32,767, thus,
     * can store 65,536 different values, again, including that specific number 0. It is 
     * nor like the others and is worth 2 bytes of storage. 
     */
  };
};
