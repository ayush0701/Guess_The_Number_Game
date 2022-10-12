package com.company;

import java.util.Random;
import java.util.Scanner;

class Game {
    public int userinput;
    public int computerinput;
    public int noofguesses = 0;

    public int getNoofguesses() {
        return noofguesses;
    }

    public void setNoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }

    Game(){
        Random rand = new Random();
        computerinput = rand.nextInt(100);
    }
    void takeuserinput(){
        System.out.println(" guess the number ");
        Scanner sc = new Scanner(System.in);
        userinput= sc.nextInt();
    }
    boolean iscorrectguess(){
        noofguesses ++;
        if(userinput == computerinput){
            System.out.format(" the guess number is right and that number is %d\n the no of guesses is %d ",computerinput,noofguesses);
            return true;
        }
        else
        if(userinput<computerinput){
            System.out.println(" to low");
        }
        else
        if(userinput>computerinput){
            System.out.println(" too high");
        }
        return false;
    }


}
public class Main {

    public static void main(String[] args) {

                boolean b = false;
                Game a = new Game();
                while(!b){
                    a.takeuserinput();
                    b=a.iscorrectguess();
                }



            }
        }
