package in.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {

	public static void permute(String current, String remaining, List<String> result) {
        if (remaining.isEmpty()) {
            result.add(current);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                char c = remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                permute(current + c, newRemaining, result);
            }
        }
    }

    public static void main(String[] args) {
        String S = "ABC";
        List<String> result = new ArrayList<>();
        permute("", S, result);

        System.out.println("Permutations of " + S + ":");
        for (String permutation : result) {
            System.out.println(permutation);
        }
    }

}
