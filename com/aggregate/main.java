package com.aggregate;

import java.text.NumberFormat;
import java.util.Scanner;

public class main{
    public static void main(String[] args){
        final int JAMB_SCORE = 400;
        float CAND_JAMB_SCORE = 0;
        int sittings = 0;
        int O_LEVEL = 0;

        Scanner scanner  = new Scanner(System.in);

        // when true it returns the CAND_JAMB_SCORE
        while (true){
            System.out.print("Your Jamb Score: ");
            float CAND_SCORE = scanner.nextFloat();
            if (CAND_SCORE >= 140 && CAND_SCORE <= 400){
                // formula of converting the Jamb score to the school formulated score i.e !> 60
            
                CAND_JAMB_SCORE = (CAND_SCORE/JAMB_SCORE) * 60;
                break;
            }
            System.out.println("Enter a valid Jamb Score: ");

        }

        // when true it returns The siitings value
        while (true) {
            System.out.print("Enter your sitting(s) score ( 10 for 1 sitting(s) and 6 for 2 sittings(s) ): ");
            int sitting = scanner.nextInt();
            if (sitting == 10 || sitting == 6) {
                sittings = sitting;
                break;

            }
            System.out.println("Enter a value between 10 and 6");
        }

        // when true it returns O_level value
        while (true) {
            System.out.print("Enter your O\'Level Score: ");
            int OLEVEL = scanner.nextInt();
            if (OLEVEL >= 5 && OLEVEL <= 30){
                O_LEVEL = OLEVEL;
                break;
            }
            System.out.println("Enter a value between 5 and 30");
        }

        // The formula for the total aggregate point
        double aggregateValue = (CAND_JAMB_SCORE + sittings + O_LEVEL)/100;

        

        // converts the value to a string in percentage format
        //Note this method will round the value to a whole number
       String aggregateValueFormat = NumberFormat.getPercentInstance().format(aggregateValue);
        System.out.println("Your Aggregate Score is: " + aggregateValueFormat);
    }
}