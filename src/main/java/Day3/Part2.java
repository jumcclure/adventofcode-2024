package Day3;

import static Day3.Day3Utils.extractInput;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part2 {
    public static void main(String[] args) throws IOException {
        String input = extractInput("src/main/resources/Day3/Input.txt");
        System.out.println("Answer:" + execute(input));
    }

    private static int execute(String memory) {
        int result = 0;
        boolean count = true;
        Pattern pattern = Pattern.compile("mul\\([0-9]+,[0-9]+\\)|don't\\(\\)|do\\(\\)");
        Matcher matcher = pattern.matcher(memory);
        while(matcher.find()) {
            String group = matcher.group();
            if (group.equals("don't()")) {
                count = false;
            } else if (group.equals("do()")) {
                count = true;
            } else if (count) {
                String numbers = group.substring(4, group.length() - 1);
                int[] numbersArray = List.of(numbers.split(",")).stream().mapToInt(Integer::parseInt).toArray();
                result += numbersArray[0] * numbersArray[1];
            }
        }
        System.out.println(memory);
        return result;
    }
}
