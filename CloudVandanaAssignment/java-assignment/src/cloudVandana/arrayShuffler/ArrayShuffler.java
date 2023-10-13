package cloudVandana.arrayShuffler;

public class ArrayShuffler {
    //the shuffleTheArray function accepts an array of int type and modifies the same array
    void shuffleTheArray(int[] arr) {

        // Loop through the entire array
        for (int i = 0; i < arr.length; i++) {

            // Generate a random index between i (inclusive) and the last index (arr.length - 1)
            int randomIndex = (int) (Math.random() * (arr.length - 1));

            // Swap the current element (at index i) with the element at the random index
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;

        }

    }
}
