package Day2;


import static Day2.Day2Utils.extractInput;

import java.io.IOException;
import java.util.List;

public class Part1 {
    public static void main(String[] args) throws IOException {
        List<List<Integer>> reports = extractInput("src/main/resources/Day2/Input.txt");
        System.out.println("Answer:" + execute(reports));
    }

    private static int execute(List<List<Integer>> reports) {
        int totalSafeReports = 0;
        for (List<Integer> report : reports) {
            boolean safe = isReportSafe(report);
            if (safe) {
                totalSafeReports++;
            }
        }
        return totalSafeReports;
    }

    private static boolean isReportSafe(List<Integer> report) {
        final boolean reportIncreasing = report.get(0) < report.get(1);
        for (int i = 1; i < report.size(); i++) {
            int previousLevel = report.get(i - 1);
            int currentLevel = report.get(i);
            boolean sameDirection = reportIncreasing == previousLevel < currentLevel;
            boolean levelDifference = (Math.abs(previousLevel - currentLevel) >= 1) &&
                    (Math.abs(previousLevel - currentLevel) <= 3);
            if (!sameDirection || !levelDifference) {
                return false;
            }
        } return true;
    }
}
