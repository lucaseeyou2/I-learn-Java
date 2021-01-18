
/* 
  Special thanks to W3school's,
*/

/*
* Java is a popular language lauched 20 years ago it is used by most modern computers. 
* It is used about everywhere and nobody seems to notice... exept me perhaps. (and other
* devellopers that use it constantly in work)
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
     * The types of current variables types are : String : a string, or text int :
     * or integre, number that is without decimals but can be negatives float :
     * numbers that have decimals char : unlike string, its a single character with
     * single quotes (' ') bolean : value must be [true] or [false], bolean's only 2
     * values
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

    System.out.println("We are in the month of " + m + " also named" + month);

    /*
     * This is a dumb example of what im trying to explain. Here one variable is
     * named 'm' and the other is named 'month'. Try to use easily interpreted names
     * to easly recognise what is what in a line of block of code.
     */

    // PRIMITIVE VALUES
    /*
     * Contents : byte, short, int, long, float, double, bolean, char
     */
    byte d = 60;
    System.out.println("I have waited " + d + " minutes");

    /*
     * Here this d is nor a int nor a float. Its a byte. This byte here is a
     * primitive data type, that can only contain the numbers between -128 and 127,
     * 0 included resulting in a total of 256 possible different values. Their size
     * is 1 byte.
     */

    short e = 29999;
    System.out.println("My best score is " + e);

    /*
     * Short here contains all of the numbers that are between -32,768 to 32,767,
     * thus, can store 65,536 different values, again, including that specific
     * number 0. It is nor like the others and is worth 2 bytes of storage.
     */

    int f = -2000000000;
    System.out.println("Before on earth, when there where" + f + " humains...");

    /*
     * It only gets bigger huh ? Well yes. The int, as you alreadly know it stores
     * numbers but itself has some restrictions. For example it can only store
     * numbers between -2,147,483,648 and 2,147,483,647 giving it a total amount of
     * 4,294,967,296 numbers to choose from. It is worth 4 bytes of storage.
     */

    long g = 1700000000l;
    System.out.println(g);

    /*
     * Ok no more examples. But, the long primitive data type contains numbers
     * within the range of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
     * Giving it a total of 18,446,744,073,709,551,615 possible different outcomes.
     * It is worth 8 bytes of storage. It can also end with the token "l".
     */

    float h = 5.432f;
    System.out.println("I ate " + h + "% of a pie today");

    /*
     * float are numbers that are with decimal values. But, you have to make sure
     * that the token "f" is at the end of the following number you are trying to
     * illustrate.
     */

    double i = 5.63827;
    System.out.println(i / 4);
    /*
     * double is the way for illustrating decimal values. They can be any. This
     * choice is mosty more used than the float, beacause it offers more numbers to
     * pick from, the token "f" can also be added to the following, but the token
     * "d" is expected.
     */

    boolean j = true;
    boolean k = false;

    System.out.println(j);
    System.out.println(k);

    /*
     * Here, you see the only two values for boleans, true and false. These
     * describes two possible outcomes, true and false. These values can be used to
     * describe when a block of code must run or musn't.
     */

    char l = 'A';
    System.out.println(l);

    /*
     * Here char is the only type of values using single quotes, the others MUST use
     * double quotes or won't be considered as string for example. Note that char
     * can only store one character, so any other will cause an error. Character in
     * this sense are any unicode or ASCII valid characters like 1 2 $ % ect. Worth
     * 2 bytes. Numbers are also accepted.
     */

    // Casting

    short n = 2;
    double p = n;
    System.out.println(p);

    /*
     * This is an example of casting. You can cast by assigning a smaller value, for
     * example a short and then, assign a greater or smaller value to cast it. The
     * value will be converted to the smaller or bigger value. The notations will
     * aslo be saved. This example presents automatic casting
     */

    long q = 472345874;
    int r = (int) q;
    System.out.println(r);

    /*
     * This is an example that has a manual casting syntax. Im here converting long
     * to int. So now this has the same principles as the one mentionned beforhand.
     * Note that the only difference is how you do it, the result are the same.
     */

    // Operators

    /*
    * Contents : 
    Addition Operator, Substraction Operator, 
    */

    int s = 100 + 400;
    int t = s + 400;
    int u = t + s;
    System.out.println(u);

    /*
     * Our first operator is the addition operator, used to add two or more values
     * described with the symbol '+'. As you seen earlier, it can aslo combine
     * strings with other variables together.
     */

     int v = 762343; 
     int w = 765345 - v; 
     int x = v - w;
     System.out.println(x); 

     /*
     * Our second operator is the substraction operator. It can be used to substract 
     * two values. This also works with variables. It is defined with the "-" symbol.
     */

     int y = 23874; 
     int z = y * 23984; 
     int aa = y * z; 
     System.out.println(aa); 

     /*
     * The thrid operator is the multiplication operator, have a rôle to multiply two 
     * values. It is expressed using the symbol "*". It also works with other numbers. 
     */

     int ab = 29384; 
     int ac = 23984/ab; 
     int ad = ab/ac; 
     System.out.println(ad);

     /*
     * The forth operator is the division operator, it is used to divide two or more 
     * numbers. It is expressed with the "/" symbol. Works with variables (numbers).
     */

     int ae = 6;
     int af = 7;
     System.out.println(af % ae); 

     /*
     * Ok, I know that the last variables seemed like first grade math but this is simple
     * as well. It is not a pourcentage, but more of a remainder. So its like the division 
     * operator but results into the division remainder. Call it with the symbol '%'.
     * For example, the following code will result  1
     */
    
        int ag = 8;
    System.out.println(ag++);

    /*
     * This is the incremental operator. It simply adds the value 1 to the specified
     * variable or number. It may seem useless but has a usage in different types of
     * loops. It is declared with the "++" symbol (combined).
     */

     int ah = 8; 
     System.out.println(ah--);

     /*
     * This decremental operator is expressed with the "--" operator. Like the
     * incremental operator, it substracts a value of 1 to a variable or a number. 
     * It also can be used on loops. 
     */

     // ASSIGNEMENT OPERATORS 

     int ai = 9;
     System.out.println(ai); 

     /*
     * Here what have I done ? Well I have assigned a value to a variable. The variable
     *  "ai" has now the value of 9. You've seen me do that before but maybe didn't
     * realise it. 
     */

     ai +=8; 
     System.out.println(ai);

     /*
     * Here I have added the value 8 to my pre-existing value of ai. This creates
     * something like ai = ai + 8, for this example. Use the symbol "+=" to use this.
     */
  };
};
