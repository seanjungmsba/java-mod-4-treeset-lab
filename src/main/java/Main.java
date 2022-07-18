import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 4, 5, 2, 34, 36, 5, 4, 23, 45, 6, 8, 56, 34, 37 };
        ArrayList<Integer> res = getNums(numbers);
        System.out.println(res); // [34, 36, 37, 45, 56]
    }

    public static ArrayList<Integer> getNums(int[] nums) {

        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            //if (nums[i] > 25) <- this can be used in lieu of line 18
            numbers.add(nums[i]);
        }
        numbers = (TreeSet<Integer>)numbers.tailSet(25);
        ArrayList<Integer> filteredNumbers = new ArrayList<>(numbers);
        return filteredNumbers; // [34, 36, 37, 45, 56]

    }

}