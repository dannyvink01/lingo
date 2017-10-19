
package javaapplication17;
import java.util.Random;
import java.util.Scanner;

public class JavaApplication17 {
public static boolean run = true;
    
    public static void main(String[] args) {
        
        while (run){
            String nextword = woorden();
            System.out.println(nextword.charAt(0));
            System.out.println(nextword);
            for (int i = 0; i < 5; i++){
                String guessedWord = guess();
                char letter;
                letter = guessedWord.charAt(0);
                compareLetter1(letter, nextword);
                letter = guessedWord.charAt(1);
                compareLetter2(letter, nextword);
                letter = guessedWord.charAt(2);
                compareLetter3(letter, nextword);
                letter = guessedWord.charAt(3);
                compareLetter4(letter, nextword);
                letter = guessedWord.charAt(4);
                compareLetter5(letter, nextword);
                if (guessedWord.charAt(0) == nextword.charAt(0)){
                    if (guessedWord.charAt(1) == nextword.charAt(1)){
                        if (guessedWord.charAt(2) == nextword.charAt(2)){
                            if (guessedWord.charAt(3) == nextword.charAt(3)){
                                if (guessedWord.charAt(4) == nextword.charAt(4)){
                                    System.out.println("Great Job!");
                                    break;
                                }
                            }
                        }  
                    }
                }
            }
            continuegame();
        }
    }
    
    public static String woorden() {
        Random randomgenerator = new Random();
        int randomNumber = randomgenerator.nextInt(21);
        String[] woordjes = {"kazen","appel","broer","cavia","bloed","droom","engel","dozen","dwerg","bezem","brand","drugs","disco","meeuw","films","hobby","roman","riool","koken","radar","kater","storm"};
        String nextword = woordjes[randomNumber];
        return nextword;
    }  
    
    public static String guess(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Try guess the 5 letter word");
        String guessedWord = sc.nextLine();
        while(guessedWord.length() != 5){
            System.out.println("This word does not contain 5 letters\nTry again!");
            guessedWord = sc.nextLine();
        }
        return guessedWord;
    }
    
    public static void compareLetter1(char letter, String nextword){
        if (letter == nextword.charAt(0)){
            System.out.print("0");
        }else{
            if (letter == nextword.charAt(1)){
                System.out.print("x");
            }else{
                if (letter == nextword.charAt(2)){
                    System.out.print("x");
                }else{
                    if (letter == nextword.charAt(3)){
                        System.out.print("x");
                    }else{
                        if (letter == nextword.charAt(4)){
                            System.out.print("x");
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
    
    public static void compareLetter2(char letter, String nextword){
        if (letter == nextword.charAt(1)){
            System.out.print("0");
        }else{
            if (letter == nextword.charAt(0)){
                System.out.print("x");
            }else{
                if (letter == nextword.charAt(2)){
                    System.out.print("x");
                }else{
                    if (letter == nextword.charAt(3)){
                        System.out.print("x");
                    }else{
                        if (letter == nextword.charAt(4)){
                            System.out.print("x");
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
    
    public static void compareLetter3(char letter, String nextword){
        if (letter == nextword.charAt(2)){
            System.out.print("0");
        }else{
            if (letter == nextword.charAt(1)){
                System.out.print("x");
            }else{
                if (letter == nextword.charAt(0)){
                    System.out.print("x");
                }else{
                    if (letter == nextword.charAt(3)){
                        System.out.print("x");
                    }else{
                        if (letter == nextword.charAt(4)){
                            System.out.print("x");
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
    
    public static void compareLetter4(char letter, String nextword){
        if (letter == nextword.charAt(3)){
            System.out.print("0");
        }else{
            if (letter == nextword.charAt(1)){
                System.out.print("x");
            }else{
                if (letter == nextword.charAt(2)){
                    System.out.print("x");
                }else{
                    if (letter == nextword.charAt(0)){
                        System.out.print("x");
                    }else{
                        if (letter == nextword.charAt(4)){
                            System.out.print("x");
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
    
    public static void compareLetter5(char letter, String nextword){
        if (letter == nextword.charAt(4)){
            System.out.println("0");
        }else{
            if (letter == nextword.charAt(1)){
                System.out.println("x");
            }else{
                if (letter == nextword.charAt(2)){
                    System.out.println("x");
                }else{
                    if (letter == nextword.charAt(3)){
                        System.out.println("x");
                    }else{
                        if (letter == nextword.charAt(0)){
                            System.out.println("x");
                        }else{
                            System.out.println(" ");
                        }
                    }
                }
            }
        }
    }
    
    public static void continuegame(){
        System.out.println("\nDo you want to try again? \n1: yes \t2: no \n(type in 1 or 2)");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        while (choice != 1 && choice != 2){
            System.out.println("invalid choice");
                choice = sc.nextInt();
            }
        if (choice == 1){
        }
        if (choice == 2){
            run = false;
        }
    }
}


