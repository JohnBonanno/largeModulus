/*
############################
takes a second to run, click
 run once and wait a moment 
############################


*/
import java.util.Scanner;


public class modulus{

     public static void main(String []args){

          Scanner kbd = new Scanner(System.in);

          System.out.print("please enter a value for a: ");

          float a = kbd.nextFloat();  //read from STDIN
          System.out.print("");       // \newline
            
          System.out.print("please enter a value for k: ");

          int k = kbd.nextInt(); //read the next integer on the keyboard //into variable: a
          System.out.print("");

          System.out.print("please enter a value for m: ");
                
          float m = kbd.nextFloat();
          System.out.print("");

          float returnVal = mod(a,k,m); //calls method 'mod' and passes the 
                                          //parameters a,k and m of the
                                          //datatype float

          System.out.println( a + "^" + k + " modulus " + "("+ m + ")"+ " = " + returnVal );

}

    public static float mod(float a, int k, float m){     
    
        float b = 1;  // set b to one

        while (k >= 1) // while k is greater than or equal to 1 do:
        {
                if ((k % 2) == 1)  //if k is odd
                {
                	System.out.println("odd");
                    b = (float) ((b * a) % m); // sum = sum*sum
                      //###unconditionally takes k/2 and truncates decimal
                }
 
        a = (a * a) % m;            //a = a^2 % m -- factor out base
        k = (int) Math.floor(k/2); //###unconditional -- reduce exponent corresponding                            //to change in base
                                 //### if even k/2==floor(k/2)
System.out.println("a:" + a + "k" + k + "m" + m + "b" + b);

        }//done

        return b; //ret
    

    }//end modulus method


}//EOF