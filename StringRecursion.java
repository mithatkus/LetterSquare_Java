import java.util.*;

public class StringRecursion {

    /*
    printWithSpaces: uses recursion to print the individual characters in the string str, separated by spaces
    */

    public static void printWithSpaces(String str){
        if (str.length() == 0 || str == null){
            System.out.println();
            return;
        }
        else{
            System.out.print(str.charAt(0) + " ");
            printWithSpaces(str.substring(1));
            
        }
    }

    /*
    reflect: takes a string str and use recursion to create and return a “reflected” version of the string in which the 
    original string is followed by the characters of the string in reverse order
    */

    public static String reflect(String str){
        String init = "";
        if(str.length() == 0 || str == null){
            return "";
        }
        char first = str.charAt(0);
        String h = init + first;
        return h + "" + reflect(str.substring(1)) + str.charAt(0);
    }

    /*
    numDiff: take two strings str1 and str2 and use recursion to determine and return the number of differences between the 
    two strings
    */

    public static int numDiff(String str1, String str2){
        if (str1.length() == 0 || str2.length() == 0){
            if (str1.length() >= str2.length()){
                int dif1 = str1.length() - str2.length();
                return dif1;
            }
            else{
                int dif2 = str2.length() - str1.length();
                return dif2;
            }
        }
        else{
            int rest = numDiff(str1.substring(1),str2.substring(1));
            if (str1.charAt(0) != str2.charAt(0)){
                return rest + 1;
            }
            else{
                return rest;
            }

        }
    }

    /*
    indexOf: use recursion to find and return the index of the first occurrence of the character ch in the string str, or -1 if 
    ch does not occur in str
    */

    public static int indexOf(char ch, String str){
        if (str.length() == 0 || str == null){
            return -1;
        }
        else if (str.charAt(0) == ch){
            return 0;
        }
        else{
            int rest = indexOf(ch, str.substring(1));
            if (rest == -1){
                return -1;
            }
            else{
                return rest + 1;
            }
        }
    }

    public static void main(String args[]){
        String word = "method";
        System.out.println(reflect(word));
    }
    
}
