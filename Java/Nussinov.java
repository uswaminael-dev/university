import java.util.ArrayList;

public class Nussinov {

    static final String rna = "GCGCAGAAUAAUGCAGCC";

    static final int SIZE = rna.length();

    static int[][] scoreTable = new int[SIZE][SIZE];

    static ArrayList<int[]> basePairs = new ArrayList<>();

    static boolean isComplement(char x, char y) {

        return (x == 'A' && y == 'U') ||
               (x == 'U' && y == 'A') ||

               (x == 'G' && y == 'C') ||
               (x == 'C' && y == 'G') ||

               // Wobble pair
               (x == 'G' && y == 'U') ||
               (x == 'U' && y == 'G');
    }


    static void buildMatrix() {

        for (int gap = 1; gap < SIZE; gap++) {
            for (int i = 0; i < SIZE - gap; i++) {
                int j = i + gap;
                int option1 = scoreTable[i + 1][j];
                int option2 = scoreTable[i][j - 1];
                int option3 = scoreTable[i + 1][j - 1];

                if (isComplement(rna.charAt(i), rna.charAt(j))) {
                    option3++;
                }

                int option4 = 0;

                for (int k = i + 1; k < j; k++) {
                    option4 = Math.max(
                            option4,
                            scoreTable[i][k] + scoreTable[k + 1][j]
                    ); }

                scoreTable[i][j] = Math.max(
                        Math.max(option1, option2),
                        Math.max(option3, option4)
                );}}}


    static void recoverPairs(int i, int j) {

        if (i >= j) {
            return;
        }

        if (scoreTable[i][j] == scoreTable[i + 1][j]) {
            recoverPairs(i + 1, j);
        }

        else if (scoreTable[i][j] == scoreTable[i][j - 1]) {
            recoverPairs(i, j - 1);
        }

        else if (isComplement(rna.charAt(i), rna.charAt(j)) &&
                scoreTable[i][j] == scoreTable[i + 1][j - 1] + 1) {
            basePairs.add(new int[]{i, j});
            recoverPairs(i + 1, j - 1);
        }

        else {
            for (int k = i + 1; k < j; k++) {

                if (scoreTable[i][j] ==
                        scoreTable[i][k] + scoreTable[k + 1][j]) {
                    recoverPairs(i, k);
                    recoverPairs(k + 1, j);
                    break;}}}}


    static String createDotBracket() {
        char[] structure = new char[SIZE];
        for (int i = 0; i < SIZE; i++) {
            structure[i] = '.';
        }

        for (int[] pair : basePairs) {
            structure[pair[0]] = '(';
            structure[pair[1]] = ')';
        }

        return new String(structure);
    }

    static void printScoreTable() {
        System.out.println("\nDynamic Programming Matrix:\n");
        System.out.print("      ");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%4d", i + 1);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%4d ", i + 1);
            for (int j = 0; j < SIZE; j++) {
                if (j < i) {
                    System.out.print("    ");
                }
                else {
                    System.out.printf("%4d", scoreTable[i][j]);
                }}
            System.out.println();}
    }


    public static void main(String[] args) {
        System.out.println("RNA Sequence:");
        System.out.println(rna);

        buildMatrix();
        printScoreTable();
        recoverPairs(0, SIZE - 1);

        System.out.println("\nPredicted Base Pairs:\n");
        for (int[] p : basePairs) {
            System.out.println(
                    "(" + (p[0] + 1) + ", " + (p[1] + 1) + ")  -->  " +
                    rna.charAt(p[0]) + "-" + rna.charAt(p[1])
            );
        }

        System.out.println("\nMaximum Number of Pairs:");
        System.out.println(scoreTable[0][SIZE - 1]);
        String structure = createDotBracket();
        System.out.println("\nDot-Bracket Structure:");
        System.out.println(structure);
    }
}

