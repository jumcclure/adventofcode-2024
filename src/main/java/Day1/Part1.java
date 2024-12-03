package Day1;

import static Day1.Day1Utils.extractInput;
import static java.lang.Math.abs;

import Day1.Day1Utils.Result;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Part1 {

    public static void main(String[] args) throws IOException {
        Result result = extractInput("src/main/resources/Day1/InputDay1.txt");
        System.out.println(execute(result.left(), result.right()));
    }

    private static int execute(List<Integer> left, List<Integer> right) {
        List<Integer> distance = new ArrayList<>();
        left = left.stream().sorted().toList();
        right = right.stream().sorted().toList();
        for (int i = 0; i < left.size(); i++) {
            distance.add(abs(left.get(i)- right.get(i)));
        }

        int totalDistance = distance.stream().mapToInt(Integer::intValue).sum();
        return totalDistance;
    }
}
