public class PigLatin{
    private static String userInput;

    public static boolean isVowel(String s){
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
        if (PigLatin.isVowel(userInput.substring(0,1))){
            return PigLatin.startsVowel(s);
        }
        else{
            return PigLatin.startsTwoConsonant(s);

        }
        
        
    }

    public static String startsTwoConsonant(String s){
        if (isVowel(userInput.substring(0, 1)) == false){
            if(isVowel(userInput.substring(1,2))== false){
                String word = userInput.substring(2);
                return word + "ay";
            }
            else{
                return startsConsonant(s);
            }
            

        }
        else{
            return startsVowel(s);
        }
        
    }
            


    public static String convertSentence(String s){
        int wordNum1 = s.indexOf(" ");
        String word1 = s.substring(0, wordNum1);
        String wordHalf = s.substring(wordNum1+1);
        int wordNum2 = wordHalf.indexOf(" ");
        String word2 = s.substring(wordNum1+1, wordNum2);
        String word2Half = s.substring(wordNum2+1);
        int wordNum3 = word2Half.indexOf(" ");
        String word3 = s.substring(wordNum2+1, wordNum3);
        
        String pigOne = convertWord(word1);
        String pigTwo = convertWord(word2);
        String pigThree = convertWord(word3);

        return pigOne + " " + pigTwo + " " + pigThree;

    }
    public static void main (String [] args){
        
    
    
    }
}





        
    
            
    
    

