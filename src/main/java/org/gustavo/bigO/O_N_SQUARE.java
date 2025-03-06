package org.gustavo.bigO;

public class O_N_SQUARE {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                System.out.println(n + " " + j);
            }
        }
    }
}
