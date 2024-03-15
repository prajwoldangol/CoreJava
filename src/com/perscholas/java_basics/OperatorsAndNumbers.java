package com.perscholas.java_basics;

public class OperatorsAndNumbers {
    public static void main(String[] args) {
        //1 Write a program that declares an integer a variable x, assigns the value 2 to it,
        // and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
        // Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
        // Before printing the results, write a comment with the predicted decimal value and binary string.
        // Now, print out x in decimal form and in binary notation.
        //Perform the preceding exercise with the following values:
        //9
        //17
        //88

        int x = 2 ;
        // predicted binary value 10
        System.out.println( Integer.toBinaryString(x));
        x = x << 1 ;
        // predicted decimal value 4
        System.out.println(x);
        // predicted binary value 100
        System.out.println( Integer.toBinaryString(x));


        x = 9 ;
        // predicted binary value 1001
        System.out.println( Integer.toBinaryString(x));
        x = x << 1 ;
        // predicted decimal value 18
        System.out.println(x);
        // predicted binary value 10010
        System.out.println( Integer.toBinaryString(x));


        x = 17 ;
        // predicted binary value 10001
        System.out.println( Integer.toBinaryString(x));
        x = x << 1 ;
        // predicted decimal value 34
        System.out.println(x);
        // predicted binary value 1000010
        System.out.println( Integer.toBinaryString(x));

        x = 88 ;
        // predicted binary value 1011000
        System.out.println( Integer.toBinaryString(x));
        x = x << 1 ;
        // predicted decimal value 176
        System.out.println(x);
        // predicted binary value 10110000
        System.out.println( Integer.toBinaryString(x));

        System.out.println("=========================================");
        //2 . Write a program that declares a variable x, and assigns 150 to it, and prints out the binary string version of the number.
        // Now use the right shift operator (>>) to shift by 2 and assign the result to x.
        // Write a comment indicating what you anticipate the decimal and binary values to be.
        // Now print the value of x and the binary string.
        //Perform the preceding exercise with the following values:
        //225
        //1555
        //32456

        x = 150 ;
        // predicted binary value 10010110
        System.out.println( Integer.toBinaryString(x));
        x = x >> 2 ;
        // predicted decimal value 37
        System.out.println(x);
        // predicted binary value 100101
        System.out.println( Integer.toBinaryString(x));


        x = 225 ;
        // predicted binary value 11100001
        System.out.println( Integer.toBinaryString(x));
        x = x >> 2 ;
        // predicted decimal value 56
        System.out.println(x);
        // predicted binary value 111000
        System.out.println( Integer.toBinaryString(x));


        x = 1555 ;
        // predicted binary value 11000010011
        System.out.println( Integer.toBinaryString(x));
        x = x >> 2 ;
        // predicted decimal value 388
        System.out.println(x);
        // predicted binary value 110000100
        System.out.println( Integer.toBinaryString(x));

        x = 32456 ;
        // predicted binary value 111111011001000
        System.out.println( Integer.toBinaryString(x));
        x = x >> 2 ;
        // predicted decimal value 8114
        System.out.println(x);
        // predicted binary value 1111110110010
        System.out.println( Integer.toBinaryString(x));

        System.out.println(" =========================================");

        //3 Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to y.
        // Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
        // Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.

        x = 7 ;
        int y = 17;
        int z ;
        // result prediction is 1
        z = x & y ;

        System.out.println(z);
        // result prediction is 0001
        System.out.println( Integer.toBinaryString(z));
        System.out.println(" =========================================");
        // 4 Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y.
        // As before, write a comment that indicates what you predict the values to be before printing them out.

        // result prediction is  23
        z = x | y ;
        System.out.println(z);
        // result prediction is 10111
        System.out.println( Integer.toBinaryString(z));
        System.out.println(" =========================================");
        //Write a program that declares an integer variable, assigns a number,
        // and uses a postfix increment operator to increase the value.
        // Print the value before and after the increment operator.

        int i = 5 ;
        // before increment
        System.out.println(i);
        i++;
        // after increment expected result is 6.
        System.out.println(i);
        System.out.println(" =========================================");
        //Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
        // Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.

        int j = 1 ;
        // printing as is
        System.out.println(j);
        // method 1 increment by 1
        j ++ ;
        System.out.println(j);
        // method 2 increment by 1 ;
        ++ j ;
        System.out.println(j);
        // method 3 increment by 1
        j+=1;
        System.out.println(j);

        System.out.println(" =========================================");

        //Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
        // Create another variable sum and assign the value of ++x added to y, and print the result.
        // Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program.
        // Notice what the value of the sum is. The first configuration incremented x,
        // and then calculated the sum, while the second configuration calculated the sum, and then incremented x.

        x = 5;
        y = 8;
        // when ++x was used value 14 was printed and when x++ was used value 13 is printed
        int sum = x++ + y ;
        System.out.println(sum);
        
    }
}
