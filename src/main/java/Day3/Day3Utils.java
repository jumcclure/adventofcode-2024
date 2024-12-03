package Day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Day3Utils {
    static String extractInput(String filename) throws IOException {
        String output = "";
        List<String> input = Files.readAllLines(Paths.get(filename));
        for(String line : input) {
            output += line;
        }
        return output;
    }
}
