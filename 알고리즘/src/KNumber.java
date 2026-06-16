import java.util.Arrays;

public class KNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int idx = 0; idx < commands.length; idx++) {
            int i =  commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];

            int[] sliced = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(sliced);
            answer[idx] = sliced[k - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        KNumber sol = new KNumber();
        System.out.println(Arrays.toString(sol.solution(
                new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}
                )));
    }
}
