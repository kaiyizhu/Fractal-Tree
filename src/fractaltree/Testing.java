/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractaltree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaiyi
 */
public class Testing
{

    public static void main(String args[])
    {
        Random r = new Random();
        //System.out.println(r.nextInt(10) + 5);
        File file = new File("texr.txt");
        try
        {
            PrintWriter p = new PrintWriter(file);
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
        }
        int count = 0;
        Scanner scan = null;
        try
        {
            scan = new Scanner(file);
        } catch (FileNotFoundException ex)
        {

        }
        //TODO: Test Arrays.sort with comparables
/*
        while (scan.hasNext())
        {
            count++;
        }
         */
        String[] comp = new String[16];
        for (int i = 0; i < comp.length; i++)
        {
            comp[i] = scan.nextLine();
            
            
        }
            for (int i = 0; i < comp.length; i++)
        {
        Arrays.sort(comp);
        System.out.println(comp[i]);
        }
            
            
    }
    
    public static void binary(int value){
        int max = 0;
        int min = 0;
        while(min< max){
            int mid = (min+max)/2;
            if (value > 0){
                max = mid-1;
            }
            else if(value < 0){
                min = mid+ 1;
            }
            else{
                System.out.println("Success! 100%");
            }
        }
    }
    //Make binary and linear searches
    //Make a printwriter that can rewrite stuff
    //Know how to use a splitter and assign stuff to an array
    //Known how to get length of a file***ASK
}
