package com.company;

import javafx.css.Match;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputNumber;
        //
        Random ran = new Random();
        int x = ran.nextInt(10);
        //System.out.println(x);
        int attempt = 0,  userAnswer=0;

        while(true){


            inputNumber = new Scanner(System.in);
            int userNum = inputNumber.nextInt();
            attempt++;

            if(userNum==x) {
                System.out.println("Вы выиграли! \n повторить игру? 1 -да, 0 - выйти");
                userAnswer = inputNumber.nextInt();
                if(userAnswer==1){
                    x = ran.nextInt(10);
                    attempt=0;
                    //System.out.println(x);
                }
                else if (userAnswer==0)  {
                    break;
                }
            }
            else {
                System.out.println("Попробуй еще");
            }

            if(attempt==3) {
                System.out.println("Вы проиграли!\\n повторить игру? 1 -да, 0 - выйти");
                userAnswer = inputNumber.nextInt();
                if(userAnswer==1){
                    x = ran.nextInt(10);
                    attempt=0;
                   // System.out.println(x);
                }
                else if (userAnswer==0)  {
                    break;
                }
            }


        }

    }
}
