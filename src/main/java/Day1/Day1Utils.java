package Day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Day1Utils {
    static Result extractInput(String filename) throws IOException {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        List<String> input = Files.readAllLines(Paths.get(filename));
        for (String line : input) {
            String[] split = line.split(" {3}");
            left.add(Integer.parseInt(split[0]));
            right.add(Integer.parseInt(split[1]));
        }
        Result result = new Result(left, right);
        return result;
    }

    record Result(List<Integer> left, List<Integer> right) {
    }
}
