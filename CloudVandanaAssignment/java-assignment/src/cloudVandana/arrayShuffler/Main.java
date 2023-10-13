package cloudVandana.arrayShuffler;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // an instance of the ArrayShuffler class
        ArrayShuffler arrayShuffler = new ArrayShuffler();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        //Shuffle the array using the ArrayShuffler instance
        arrayShuffler.shuffleTheArray(arr);
        //Print the shuffled array using Arrays.toString()
        System.out.println(Arrays.toString(arr));
    }
}

