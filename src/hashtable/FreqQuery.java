package hashtable;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.joining;


public class FreqQuery {


    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<int[]> queries) {
        Map<Integer, Integer> data = new HashMap<>();


        List<Integer> result = new ArrayList<>();
        for (int[] pair : queries) {


            switch (pair[0]) {
                case 1:
                    data.put(pair[1], data.getOrDefault(pair[1], 0) + 1);
                    break;
                case 2:
                    if (data.containsKey(pair[1])) {
                        data.put(pair[1], Math.min(pair[1] - 1, 0));
                    }
                    break;
                case 3:
                    Integer occ = pair[1];
                    result.add(data.values().stream().filter(e -> e.equals(occ)).findAny().map(any -> 1).orElse(0));
                    break;
            }
        }
        return result;


    }


    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int q = Integer.parseInt(bufferedReader.readLine().trim());
            List<int[]> queries = new ArrayList<>(q);
            Pattern p = Pattern.compile("^(\\d+)\\s+(\\d+)\\s*$");
            for (int i = 0; i < q; i++) {
                int[] query = new int[2];
                Matcher m = p.matcher(bufferedReader.readLine());
                if (m.matches()) {
                    query[0] = Integer.parseInt(m.group(1));
                    query[1] = Integer.parseInt(m.group(2));
                    queries.add(query);
                }
            }
            List<Integer> ans = freqQuery(queries);
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
                bufferedWriter.write(
                        ans.stream()
                                .map(Object::toString)
                                .collect(joining("\n"))
                                + "\n");
            }


        }
    }
}