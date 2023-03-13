package javaprograme;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data: Input a Decimal Number : 5
 * Expected Output Binary number is: 101
 */
public class DecimalToBinary17 {
    public static void main(String[] args) {

        // decimal number
        int decimal = 5;

        // convert decimal to binary
        String binary = Integer.toBinaryString(decimal);
        System.out.println(decimal + " in decimal = " + binary + " in binary.");
    }


}
