
package demointerface;

import java.util.Scanner;

public class Arguments implements Main {
    
   float result;
   float a;
   float b;
   Scanner sc = new Scanner(System.in);
   
   public void input(){
     a=sc.nextFloat();
     b=sc.nextFloat();
   }
   
   public void sum(){
    result = a+b;
    
   } 
   public void Display(){
       System.out.println("THE SUM IS : "+result);
   }
}
