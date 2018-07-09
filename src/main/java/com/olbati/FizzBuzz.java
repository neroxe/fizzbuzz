package com.olbati;

import com.google.common.base.Preconditions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FizzBuzz {

    private static Map<Integer, String> config = new HashMap<>();

    static {
        config.put(3, "Fizz");
        config.put(5, "Buzz");
        config.put(7, "Toy");
    }

    /*
    public String processOld(int input) {

        Preconditions.checkArgument(input >= 1);
        Preconditions.checkArgument(input <= 100);

        if (isDivisibleBy3(input) && isDivisibleBy5(input)) {
            return "FizzBuzz";
        }
        if (isDivisibleBy3(input)) {
            return "Fizz";
        }
        if (isDivisibleBy5(input)) {
            return "Buzz";
        }
        return Integer.toString(input);
    }
    */

    public String process(int input) {

        Preconditions.checkArgument(input >= 1);
        Preconditions.checkArgument(input <= 100);

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : config.entrySet()) {
            if (isDivisibleByKey(input, entry.getKey())) {
                result.append(entry.getValue());
            }
        }

        if (result.length() == 0) {
            result.append(Integer.toString(input));
        }
        return result.toString();
    }


    private boolean isDivisibleByKey(int input, int key) {
        return input % key == 0;
    }

    /*
    private boolean isDivisibleBy5(int input) {
        return input % 5 == 0;
    }

    private boolean isDivisibleBy3(int input) {
        return input % 3 == 0;
    }
    */
}
