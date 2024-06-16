package org.example.Challenges.PermutationDifferencebetweenTwoStrings3146;

public class PermutationDifferencebetweenTwoStrings3146 {
    public int findPermutationDifference(String s, String t) {
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int indexInS = s.indexOf(c);
            int indexInT = t.indexOf(c);
            diff += Math.abs(indexInS - indexInT);
        }
        return diff;
    }
}
