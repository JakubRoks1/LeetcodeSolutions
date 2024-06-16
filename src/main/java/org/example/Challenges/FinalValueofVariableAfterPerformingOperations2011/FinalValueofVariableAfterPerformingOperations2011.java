package org.example.Challenges.FinalValueofVariableAfterPerformingOperations2011;

public class FinalValueofVariableAfterPerformingOperations2011 {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String operation: operations) {
            char c = operation.charAt(1);
            res += (c == '+') ? 1 : (c == '-') ? -1 : 0;
        }
        return res;

    }
}
