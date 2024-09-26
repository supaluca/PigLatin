import java.util.*;
public class PigLatin{
    private static String userInput;

    public boolean isVowel(String s){
        String letter = s;
        String vowel = "a"; String vowel2 = "e"; String vowel3 = "i"; String vowel4 = "o"; String vowel5 = "u";
        if (letter.equals(vowel) || letter.equals(vowel2) || letter.equals(vowel3) || letter.equals(vowel4) || letter.equals(vowel5)){
            return true;
        }
        else{
            return false;
        }
    }
    public static String startsVowel(String s){
        return s + "ay";  
    }
    public static String startsConsonant(String s){
        String word = userInput.substring(2);
        return word + userInput.substring(0,1) + "ay";
    }
    public static String convertWord(String s){
        PigLatin luca = new PigLatin();
        if (luca.isVowel(userInput.substring(0,1))){
            return luca.startsVowel(userInput);
        }
        else{
            return luca.startsConsonant(s);
        }
    }
    public static String startsTwoConsonant(String s){
        String word = userInput.substring(0,1);
        return userInput.substring(2) + word; 

        }
    }

