package edu.dmacc.codedsm.hw7;

public class SumHundred {

    public static void main(String[] args) {

        int trackResult = 0;
        int count = 0;

        while (trackResult < 100) {

            trackResult = addAllThree(10, 10, trackResult);
            count++;
        }

        output(trackResult, count);

    }

    public static int addAllThree(int firstInput, int secondInput, int priorResult) {

        return firstInput + secondInput + priorResult;
    }

    public static void output(int finalResult, int iterations) {

        System.out.println("The first result greater than 100 was " + finalResult + " and took " + iterations + " to complete");

    }
}
