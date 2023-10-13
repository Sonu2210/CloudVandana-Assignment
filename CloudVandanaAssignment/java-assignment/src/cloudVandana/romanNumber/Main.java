package cloudVandana.romanNumber;

public class Main {

    public static void main(String[] args) {
        // Create an instance of the RomanToInteger class
        RomanToInteger romanToInteger = new RomanToInteger();

        // Define a Roman numeral string to convert
        String roman = "IX";

        // Call the romanToInteger method to convert the Roman numeral to an integer
        int integer = romanToInteger.romanToInteger(roman);

        // Print the result
        System.out.println("Roman number\t"+ roman +"\t converted to integer is\t"+ integer);
    }
}
