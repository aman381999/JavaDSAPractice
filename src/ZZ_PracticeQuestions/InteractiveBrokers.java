package ZZ_PracticeQuestions;

public class InteractiveBrokers {
    public static void main(String[] args) {
        double[] input1 = {0, 1000.0};
        double[] input2 = {0.1, 0.5};
        System.out.println(calculateTax(input1, input2, 2000.0)); // Expected output: 600.0
    }

    public static double calculateTax(double[] input1, double[] input2, double input3) {
//        if (bracketCutoffs.length != bracketRates.length) {
//            throw new IllegalArgumentException("Bracket cutoffs and rates must have the same length.");
//        }

        double tax = 0.0;
        double endInput2 = input1[input1.length-1];
        double income = input3;

        for (int i = 0; i < input1.length; i++) {

            if(income > endInput2){
                income -= endInput2;
                tax += endInput2*input2[i];
            } else {
                tax += income*input2[i];
            }
        }

        return tax;
    }
}
