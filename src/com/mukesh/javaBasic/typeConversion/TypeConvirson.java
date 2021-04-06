package com.mukesh.javaBasic.typeConversion;

import com.mukesh.javaBasic.introduction_to_java.HelloWorld;

public class TypeConvirson {

    public static void main(String[] args) {

        String[] arguments = new String[] {"NI"};
        HelloWorld.main(arguments);


        //here start
                int variableOne = 10;
                float variableTwo = variableOne;
                System.out.println(variableOne);
                System.out.println(variableTwo);
                // Here, a variable of data type having smaller range is automatically
                // accommodated in a variable of data type having bigger range. This is
                // known as widening.

                // When we try to accommodate a variable of data type having bigger
                // range into a data type having smaller range, it leads to an error.
                float variableThree = 12.5f;
                float variableFour = variableThree; // comment this line or fix the error
                // to execute the code successfully
                System.out.println(variableThree);
                System.out.println(variableFour); // comment this line or fix the error
                // to execute the code successfully

                // Since our assignment is leading to loss of data, we need to
                // explicitly specify that the data needs to be converted to a data type
                // having smaller range.
                // This is known as explicit typecasting.
                int variableFive = (int) variableThree;
                System.out.println(variableFive);
            }

}
