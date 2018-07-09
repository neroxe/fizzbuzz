package com.olbati;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_input_when_input_is_not_divisible_by_3_or_5() {
        assertThat(fizzBuzz.process(1)).isEqualTo("1");
        assertThat(fizzBuzz.process(2)).isEqualTo("2");
        assertThat(fizzBuzz.process(8)).isEqualTo("8");
        assertThat(fizzBuzz.process(11)).isEqualTo("11");
    }

    @Test
    public void should_return_Fizz_when_input_is_divisible_by_3() {
        assertThat(fizzBuzz.process(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.process(6)).isEqualTo("Fizz");
        assertThat(fizzBuzz.process(9)).isEqualTo("Fizz");
        assertThat(fizzBuzz.process(12)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_Buzz_when_input_is_divisible_by_5() {
        assertThat(fizzBuzz.process(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.process(10)).isEqualTo("Buzz");
        assertThat(fizzBuzz.process(20)).isEqualTo("Buzz");
        assertThat(fizzBuzz.process(25)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_Buzz_when_input_is_divisible_by_7() {
        assertThat(fizzBuzz.process(7)).isEqualTo("Toy");
        assertThat(fizzBuzz.process(14)).isEqualTo("Toy");
        assertThat(fizzBuzz.process(28)).isEqualTo("Toy");
    }

    @Test
    public void should_return_FizzBuzz_when_input_is_divisible_by_3_and_5() {
        assertThat(fizzBuzz.process(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.process(30)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.process(45)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.process(60)).isEqualTo("FizzBuzz");
    }

    @Test
    public void should_return_FizzBuzz_when_input_is_divisible_by_3_and_7() {
        assertThat(fizzBuzz.process(21)).isEqualTo("FizzToy");
        assertThat(fizzBuzz.process(42)).isEqualTo("FizzToy");
    }

    @Test
    public void should_return_FizzBuzz_when_input_is_divisible_by_5_and_7() {
        assertThat(fizzBuzz.process(35)).isEqualTo("BuzzToy");
        assertThat(fizzBuzz.process(70)).isEqualTo("BuzzToy");
    }


    @Test (expected = IllegalArgumentException.class)
    public void should_throw_exception_when_input_is_lesser_than_1() {
        fizzBuzz.process(0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void should_throw_exception_when_input_is_greater_than_100() {
        fizzBuzz.process(101);
    }


}
