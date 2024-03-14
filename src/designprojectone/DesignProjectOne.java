/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.*;
import java.text.*;
/***************************************************
*
*  Program:
*  Author: 
*  Date: 
*  Description:
****************************************************/

/**************** IPO CHART ************************
*INPUT:
*number of students per project type
*
*PROCESSING:
* calculate cost for basic project kit
* calculate extra costs for different project types
* determine if 5% discount should be applied and find total cost
* 
*
*OUTPUT:
* Display total cost
* display cost per student
*
****************************************************/
  
/**************** TEST CASES ************************
*Test      Input            Desired Output
*1         0, 0, 0          there are no students
*2         10, 10, 10       $1950, $65
*3         15, 20, 0        $2200, $62.86
*4         100, 100, 100    $18350, $61.17
*
*
*
***************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Write Pseudocode FIRST as comments and THEN write the code
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
  //CONSTANTS
        final int BASIC_COST = 50;
        
  //VARIABLES
        int arduinoNum, raspberryPiNum, vrNum, totalNumStudents;
        double totalCost = 0;
  //CODE
  
  
        //Input number of students doing arduino
        System.out.print("Enter the number of students doing arduino: ");
        arduinoNum = input.nextInt();
        
        //Input number of students doing raspberry pi
        System.out.print("\nEnter the number of students doing raspberry Pi: ");
        raspberryPiNum = input.nextInt();
        
        //Input number of students doing vr
        System.out.print("\nEnter the number of students doing VR: ");
        vrNum = input.nextInt();
        
        //Find total number of students
        totalNumStudents = arduinoNum + raspberryPiNum + vrNum;
        
        
        if(totalNumStudents <= 0) {
            System.out.println("\nInvalid number of students.");
        }
        else {
            //Calculate cost for basic project kits
            totalCost += totalNumStudents * BASIC_COST;
            
             //If number of students is greater than 100, apply 5% discount
            if (totalNumStudents >= 100) {
                totalCost *= 0.95;
            }
            
            //Calculate additional costs for arduino projects
            if (arduinoNum > 15) {
                totalCost += arduinoNum * 9;
            }
            else totalCost += arduinoNum * 10;
            
            //Calculate additional costs for raspberry pi projects
            if (raspberryPiNum > 20) {
                totalCost += raspberryPiNum * 12;
            }
            else totalCost += raspberryPiNum * 15;
            
            //Calculate additional costs for vr projects
            totalCost += vrNum * 20;
            
           
            
            //Display total cost
            System.out.println("\nThe total cost is: $" + df.format(totalCost));
            //Divide total cost among number of students
            totalCost /= totalNumStudents;
            //Display cost per student. 
            System.out.println("The cost per student is: $" + df.format(totalCost));
        }

        
    }
    
}
