import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        String[] numberStrings = {"10", "20", "30", "40"};
        List<Integer> integerList = new ArrayList<>();

        // Parsing strings into Integer objects (Autoboxing)
        for (String number : numberStrings) {
            integerList.add(Integer.parseInt(number));
        }

        // Calculating sum (Unboxing happens automatically)
        int sum = 0;
        for (Integer num : integerList) {
            sum += num;  // Unboxing Integer to int
        }

        System.out.println("Sum of integers: " + sum);
    }
}
