# TreeSet Lab

## Instructions

Given an array of numbers, find all the numbers that are greater than 25.

Write the method `getNums` that takes in an array of integers and return an
ArrayList containing the numbers that are greater than 25.

```java
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 5, 2, 34, 36, 5, 4, 23, 45, 6, 8, 56, 34, 37 };
        ArrayList<Integer> res = getNums(numbers);
        System.out.println(res); // [34, 36, 37, 45, 56]
    }

    public static ArrayList<Integer> getNums(int[] nums) {
        // your code here
    }
}
```
