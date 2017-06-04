package com.e16.tasksandsolutions.cardsinthedesk;

import java.util.Arrays;

public class CardsInTheDeck {

    public int solution(int[] inputArr) {
        int[] iterArr = new int[inputArr.length];
        System.arraycopy(inputArr, 0, iterArr, 0, iterArr.length);
        Arrays.sort(iterArr);
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < iterArr.length) {
            if (iterArr[i] <= inputArr[j]) {
                count ++;
                if (iterArr[i] == inputArr[j]) {
                    i++;
                }
            }
            if (j == inputArr.length - 1) {
                j = 0;
            } else {
                j++;
            }
        }

        return count;
    }
}
