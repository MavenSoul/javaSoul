package com.pu.javaBAsic;

import java.io.*;
import java.util.*;

public class StringSolution
{

   public static void main(String[] args)
 {
    Scanner scan=new Scanner(System.in);
    int T=scan.nextInt();
    scan.nextLine();//excaption handling

    
    String string[] = new String[T];
      
        for(int i = 0; i<T; i++)
        string[i] = scan.next();
       

    for(int l=0 ; l<T ; l++)
    {
        int len =   string[l].length();

        for(int j=0 ; j<len ; j=j+2)
        System.out.print(string[l].charAt(j)); 
        

        System.out.print(" ");

        for(int k=1 ; k<len ; k=k+2)
        System.out.print(string[l].charAt(k));  
        
        System.out.println(); 

    }
    
    scan.close();
           
       }

      

}
