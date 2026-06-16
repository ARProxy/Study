import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class DontLikeSame {
    //[1,1,3,3,0,1,1]
    public List<Integer> solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && arr[i + 1] == arr[i]) {
                continue;
            }
            result.add(arr[i]);
        }
        return result;
    }

    public int[] solution1(int[] arr) {
        int[] temp = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                temp[count++] = arr[i];
            }
        }
        return Arrays.copyOf(temp, count);
    }

    public int[] solution2(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        DontLikeSame sol = new DontLikeSame();
        System.out.println(Arrays.toString(sol.solution1(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
}
