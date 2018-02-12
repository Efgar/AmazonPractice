package efgh.tests.firstround.substringk;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED

import java.util.ArrayList;
import java.util.List;

public class SubstringK {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static List<String> subStringsKDist(String inputStr, int num) {
        List<String> matches = new ArrayList<>();
        if(num > inputStr.length()){
            return matches;
        }
        for(int i = 0; i <= inputStr.length() - num; i++){
            String aux = "";
            for(int j = i; j < i + num; j++){
                String indexChar = String.valueOf(inputStr.charAt(j));
                if(aux.contains(indexChar)){
                    break;
                }
                aux += indexChar;
            }
            if(aux.length() == num && !matches.contains(aux)){
                matches.add(aux);
            }
        }
        return matches;
    }

    public static void main(String args[]){
        String inputStr = "abcdab";
        int num = 2;

        System.out.println(subStringsKDist(inputStr, num));
    }
}
