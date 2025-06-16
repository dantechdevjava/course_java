package model;

public class MethodVarArgsModel {
    public void printNumbers(int... numbers) {
        // Numbers is Array

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
