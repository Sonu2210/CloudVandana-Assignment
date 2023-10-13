package cloudVandana.pangram;

public class PangramChecker {


    static boolean isPangram(String string) {
        /*

    Initialize an array of  integer of size 26
    here we will keep track of each letter if it occurred either in capital or small letter
    we will make the corresponding index in the array as 1, and we will also check if this index is already
    marked as 1 then don't mark it one and also make a counter which keeps tracks if all the places are filled in the array
     when each distinct character found we increase the counter and lastly check if its equal to 26 then it's pangram
    or else not

        */

        int[] arr = new int[26];
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            boolean flag1 = ((int) currentChar >= 65 && (int) currentChar <= 90);
            boolean flag2 = ((int) currentChar >= 97 && (int) currentChar <= 122);
            if (flag1 || flag2) {
                int numericValue = (int) currentChar - 65 + 1;
                if ((int) currentChar > 90) {
                    numericValue = (int) currentChar - 97 + 1;
                }

                if (arr[numericValue - 1] != 1) {
                    arr[numericValue - 1] = 1;
                    count++;
                }

            }
        }
        return count == 26;

    }


    public static void main(String[] args) {
        String string1 = "abCdefghijklmnopqrstUvwxyz"; //returns true
        String string2 = "The quick brown fox Jumps over the lazy dog";// returns true;
        String string3 = "cloud Vandana";//return false
        System.out.println(isPangram(string1));
        System.out.println(isPangram(string2));
        System.out.println(isPangram(string3));
    }
}
