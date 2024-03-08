package Conditional_Statements;

import java.util.Scanner;

public class Signs {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the month : ");
        month = input.nextInt();

        System.out.print("Please enter the day   : ");
        day = input.nextInt();

        if (day>=1 && day<=31){
            switch (month){
                case 1:
                    if (day<=20){
                        System.out.println("Your sign is : CAPRİCORN!");
                    }else{
                        System.out.println("Your sign is : AQUARİUS!");
                    }
                    break;
                case 2:
                    if (day<=19){
                        System.out.println("Your sign is : AQUARİUS!");
                    }else{
                        System.out.println("Your sign is : PİSCES!");
                    }
                    break;
                case 3:
                    if (day<=20){
                        System.out.println("Your sign is : PİSCES!");
                    }else{
                        System.out.println("Your sign is : ARİES!");
                    }
                    break;
                case 4:
                    if (day<=20){
                        System.out.println("Your sign is : ARİES!");
                    }else{
                        System.out.println("Your sign is : TAURUS!");
                    }
                    break;
                case 5:
                    if (day<=21){
                        System.out.println("Your sign is : TAURUS!");
                    }else{
                        System.out.println("Your sign is : GEMİNİ!");
                    }
                    break;
                case 6:
                    if (day<=21){
                        System.out.println("Your sign is : GEMİNİ!");
                    }else{
                        System.out.println("Your sign is : CANCER!");
                    }
                    break;
                case 7:
                    if (day<=22){
                        System.out.println("Your sign is : CANCER!");
                    }else{
                        System.out.println("Your sign is : LEO!");
                    }
                    break;
                case 8:
                    if (day<=21){
                        System.out.println("Your sign is : LEO!");
                    }else{
                        System.out.println("Your sign is : VİRGO!");
                    }
                    break;
                case 9:
                    if (day<=23){
                        System.out.println("Your sign is : VİRGO!");
                    }else{
                        System.out.println("Your sign is : LİBRA!");
                    }
                    break;
                case 10:
                    if (day<=23){
                        System.out.println("Your sign is : LİBRA!");
                    }else{
                        System.out.println("Your sign is : SCORPİO!");
                    }
                    break;
                case 11:
                    if (day<=22){
                        System.out.println("Your sign is : SCORPİO!");
                    }else{
                        System.out.println("Your sign is : SAGİTTARİUS!");
                    }
                    break;
                case 12:
                    if (day<=22){
                        System.out.println("Your sign is : SAGİTTARİUS!");
                    }else{
                        System.out.println("Your sign is : CAPRİCORN!");
                    }
                    break;
                default:
                    System.out.println("Try again.");
                    break;
            }
        }else{
            System.out.println("Try again.");
        }
    }
}