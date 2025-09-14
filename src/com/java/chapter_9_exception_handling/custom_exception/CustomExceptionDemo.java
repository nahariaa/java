package com.java.chapter_9_exception_handling.custom_exception;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        int numer[] = { 4, 8, 15, 32 }; // 15 is the problem
        int denom[] = { 2, 0, 4, 4 };

        for (int i = 0; i < numer.length; i++) {
            try {
                if ((numer[i] % denom[i]) != 0)
                    throw new NonIntResultException(numer[i], denom[i]); // Throw custom exception

                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);

            } catch (ArithmeticException exc) {
                System.out.println("Can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("No matching element found.");
            } catch (NonIntResultException exc) { // Catch the custom exception
                System.out.println(exc);
            }
        }
    }
}
