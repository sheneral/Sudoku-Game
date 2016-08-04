import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.io.*;

public class SudokuGameModel extends GameModel{
   final int SIZE=9;

   SudokuGameModel(){
   
   
   }//constructor
   
   String[] getGame(int g){
      String[] game1 = {"","","1","","5","","9","","2","","","","","7","","","","1",
      "8","","","","","","","7","","3","1","","","9","6","","8","","","","7","2","4",
      "3","1","","","","9","","1","8","","","4","6","","5","","","","","","","8","4",
      "","","","1","","","","","1","","9","","2","","5","",""};
      
      String[] game2 = {"6","","","","","","","9","5","2","","","","","","7","","",
      "9","","","","","7","6","","4","","","","6","3","4","","","2","","","","8","","",
      "","","","7","","","","","","8","","","","","5","7","","6","","","3","","","3",
      "","8","5","","4","","","","","2","","","5","","8"};
      
      String[] game3 = {"7","","","3","4","2","","","","","6","2","1","","7","","",
      "","4","","5","6","","","","","","","7","","","","8","","","","","","","","",
      "","6","5","9","","","","","","","","2","","5","","","","","","","7","6","",
      "9","","","","","","","","","","1","","6","","9","3","4"};
      
      if(g==1){
         return(game1);
      } else if (g==2){
         return(game2);
      } else if (g==3){
         return(game3);
      } else{
         return(game1); //bogus return to catch exception in condition
      }//else
   }
   
   String[] getSolution(int g){
      String[] game1Sol = {"7","4","1","6","5","8","9","3","2","9","3","6","4","7","2",
      "8","5","1","8","2","5","9","3","1","6","7","4","3","1","4","5","9","6","2","8",
      "7","6","8","7","2","4","3","1","9","5","5","9","2","1","8","7","3","4","6",
      "2","5","3","7","6","9","4","1","8","4","6","8","3","1","5","7","2","9","1","7",
      "9","8","2","4","5","6","3"};
      
      String[] game2Sol = {"6","7","1","4","2","8","3","9","5","2","5","4","3","6","9",
      "7","8","1","9","3","8","1","5","7","6","2","4","5","8","9","6","3","4","1","7",
      "2","3","1","6","8","7","2","4","5","9","7","4","2","5","9","1","8","3","6","8",
      "2","5","7","4","6","9","1","3","1","6","3","9","8","5","2","4","7","4","9","7",
      "2","1","3","5","6","8"};
      
      String[] game3Sol = {"7","1","9","3","4","2","5","6","8","8","6","2","1","5","7",
      "4","9","3","4","3","5","6","8","9","7","1","2","9","7","6","5","2","8","3","4",
      "1","1","2","8","4","7","3","6","5","9","3","5","4","9","1","6","8","2","7","5",
      "4","3","8","9","1","2","7","6","6","9","7","2","3","4","1","8","5","2","8","1",
      "7","6","5","9","3","4"};
      
      if(g==1){
         return(game1Sol);
      } else if (g==2){
         return(game2Sol);
      } else if (g==3){
         return(game3Sol);
      } else{
         return(game1Sol); //bogus return to catch exception in condition
      }//else
   }
   
   boolean compareArray(String[] arr1, String[] arr2){
      boolean result = Arrays.equals(arr1,arr2);
      return(result);
   }
   

   void takeTurn(int t){
   
   } 
   
   int getRows(){
      return(SIZE);
   }
   
   int getCols(){
      return(SIZE);
   }
  
   
   void display(){
   }  
   
   boolean gameOverStatus(){
      return false; //doesn't really do anything
   }
   
   String reportWinner(){
      return("Correct! ");
   }
  
   
}//class