
package javaapplication17;
import java.util.Random;
import java.util.Scanner;

public class JavaApplication17 {

    
    public static void main(String[] args) {
        String nextword = woorden();
        System.out.println(nextword.charAt(0));
        //System.out.println(nextword);
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
}


