package cloudVandana.romanNumber;

public class RomanToInteger {

    // Helper method to get the integer value of a Roman numeral character
    private int romanValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    // Method to convert a Roman numeral to an integer
    public int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = romanValue(currentChar);

            // Check if there is a next character
            if (i < s.length() - 1) {
                char nextChar = s.charAt(i + 1);
                int nextValue = romanValue(nextChar);

                // If the current value is less than the next value, subtract it; otherwise, add it
                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                // If there is no next character, add the current value to the result
                result += currentValue;
            }
        }

        return result;
    }
}
