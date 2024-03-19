package com.SOF304.yennth.Lab.Lab3.B3;

import java.util.List;

public class B3_AverageCalculator {
    public double calculateAverage(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new ArithmeticException("Cannot calculate average of an empty list");
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.size();
    }
}