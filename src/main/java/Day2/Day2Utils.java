package Day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Day2Utils {
    static List<List<Integer>> extractInput(String filename) throws IOException {
        List<List<Integer>> results = new ArrayList<>();
        List<String> input = Files.readAllLines(Paths.get(filename));
        for (String line : input) {
            List<Integer> row = new ArrayList<>();
            for (String num : line.split(" ")) {
                row.add(Integer.parseInt(num));
            }
            results.add(row);
        }

        return results;
    }
}
