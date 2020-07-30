/* Change the following comments to the values for what they indicate:
 * Martha Gonzalez
 * CSCI 1302
 * Assignment 1
 * june 14 2020
*/

import java.util.Random; //needed to generate the random numbers
import java.util.Scanner; //needed to get user input
import java.util.ArrayList; 
import java.util.Arrays;

public class GonzalezMAssignment1{
    public static void main(String[] args){ 
        // Don't forget to:
        // Get the size of the array from the user (this will be the # rows and columns)
        Scanner scan = new Scanner(System.in);
        System.out.print("How big should the array be?");
        int size = scan.nextInt();
                
        // Create a 2D array based on that size
        int[][] number = new int [size][size];
        
        
        // declaring 1D Arrays 
        int[]sumRow = new int[number.length];
        int[]sumCol = new int[number.length];
       
        // Fill it with random 0s and 1s (see below)
        // This code will generate the random 0s and 1s
        Random rand = new Random(); // creates a random number generator
        //The following line of code will generate a random integer between 0 and 1.
        // It needs to be used to store these values in the 2D array, 
        // so make sure that you put it in an appropriate place in the code to do so
        rand.nextInt(2);
        
        int largestRow=sumRow[0];
        int largestCol=sumCol[0];
        
        int indexRow=0;
        int indexCol=0;

        for(int row =0; row<number.length;row++){  
            for (int col=0;col < number[0].length; col++){
                                       
             number[row][col] = rand.nextInt(2);
             // Count the number of 1s in each row (or sum the row) and compare
             // Repeat for columns
             sumRow [row] += number[row][col];
             sumCol [col] += number[row][col];
                            
        // store the highest rows (yes there could be multiple) and columns in their respective array lists
        // Repeat this for columns too
        // Output the results
         
            if(sumRow[row] > largestRow){
            largestRow=sumRow[row];
            indexRow = row;
            

            }
            
            if(sumCol[col] > largestCol){
            largestCol=sumCol[col];
            indexCol = col;
            }
            }}    
               
        
               
          // Create two ArrayLists (these won't be parallel)
      ArrayList<Integer> listRow = new ArrayList<Integer>();
        
       int maxRow = indexRow;
       for(int row =0; row<sumRow.length;row++){
          if (indexRow > maxRow) {  //if array element found greater than max then clear array list 
          listRow.clear();
          maxRow = indexRow;   //update the max
             }
          if (indexRow == maxRow) //if row element is equal to max store index in array list
          listRow.add(indexRow);
              }
        //printing array list for row
       System.out.print("The largest row/s: ");  
      for (int row = 0; row < listRow.size(); row++)    
         System.out.print(listRow.get(indexRow) + " ");
         System.out.println();
                 
     //column arraylist      
     ArrayList<Integer> listCol = new ArrayList<Integer>();
       int maxCol = largestCol;
       for(int col =0; col<number.length;col++){
          if (largestCol > maxCol) {  //if array element found greater than max then clear array list 
          listCol.clear();
          maxCol = largestCol;   //update the max
             }
          if (largestCol == maxCol) //if row is equal to max store index in array list
          listCol.add(largestCol);
          }
          
          //printing array list for columns
       System.out.print("The largest column/s: ");  
     for (int col = 0; col < listCol.size(); col++)   
          System.out.print(listCol.get(largestCol) + " ");
           System.out.println();

      
      
      // Print the 2D array
         System.out.println("The array you created");
        for(int row =0; row<number.length;row++){
            for(int col=0;col < number[0].length; col++){
            System.out.println(number[row][col] + " ");
            }
            
        System.out.println();
                }
      }
    
}