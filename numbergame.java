import java.io.*;
import java.util.*;
class numbergame{

    public static void main(String[] args)
    {
        System.out.println("---------NUMBER GAME--------------");
       Scanner scn=new Scanner(System.in);
        int n = 1 + (int)(100 * Math.random());
        int r=5;
        int i;
        for( i=0; i<r;i++)
        {
           
            System.out.println("ENTER THE NUMBER BETWEEN 0 TO 100 :"  );
            int userinput=scn.nextInt();
            if(n==userinput)
            {
                System.out.println("!!!WOAH!!!  CORRECT GUESS");

            }
            else if(n>userinput)
            {
                System.out.println("OOPS!! TOO LOW, GUESS THE HIGHER NUMBER");

            }
            else {
                System.out.println("OOPS!!! TOO HIGH, GUESS THE SMALLER NUMBER");

            }
        }
        if(i==r)
        {
            System.out.println("your guesses are OVER!!!");
        }
       
    }
}