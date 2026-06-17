import java.util.HashSet;
import java.util.Set;
//문제 풀이 시간 : 10분
//자료 구조 Set 이용
public class Pokemon {
    public int solution(int[] nums) {
        // N -> N/2
        //종류에 따라 번호 : 같은 종류의 포켓몬은 같은 번호
        //nums 2로 나누고 그 값을 골라야함.
        int num = nums.length / 2;

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        return Math.min(num, set.size());
    }
}
