package efgh.tests.firstround.lettersequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterSequence {

    static List<Integer> lengthEachScene(List<Character> inputList) {
        List<Integer> sequences = new ArrayList<>();
        int startShotPosition = 0;
        int endShotPosition = -1;
        for (int i = 0; i < inputList.size(); i++) {
            if (i > endShotPosition) {
                if(endShotPosition - startShotPosition >= 0){
                    sequences.add(endShotPosition - startShotPosition +1);
                }
                startShotPosition = i;
            }
            Character currentLabel = inputList.get(i);
            for (int j = inputList.size() -1; j >= i; j--) {
                if (inputList.get(j) == currentLabel) {
                    if(j >= endShotPosition) {
                        endShotPosition = j;
                    }
                }
            }
        }
        if(endShotPosition - startShotPosition >= 0){
            sequences.add(endShotPosition - startShotPosition +1);
        }

        return sequences;
    }

    public static void main(String args[]){
        Character[] inputStr = {'a','b','a','d','b'};

        System.out.println(lengthEachScene(Arrays.asList(inputStr)));
    }
}
