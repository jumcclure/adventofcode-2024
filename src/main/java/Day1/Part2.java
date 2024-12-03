package Day1;

import static Day1.Day1Utils.extractInput;

import Day1.Day1Utils.Result;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Part2 {
    public static void main(String[] args) throws IOException {
        Result result = extractInput("src/main/resources/Day1/InputDay1.txt");
        System.out.println(execute(result.left(), result.right()));
    }

    private static int execute(List<Integer> left, List<Integer> right) {
        int similarity = 0;
        Map<Integer, Integer> rightCount = new HashMap<>();
        for (Integer integer : right) {
            rightCount.put(integer, rightCount.getOrDefault(integer, 0) + 1);
        }
        for (Integer integer : left) {
            similarity += integer * rightCount.getOrDefault(integer, 0);
        }
        return similarity;
    }
}
