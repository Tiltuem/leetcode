import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lhSetEvenNumbers = new LinkedList<>();

        lhSetEvenNumbers.add(2);
        lhSetEvenNumbers.add(4);
        lhSetEvenNumbers.add(3);
        lhSetEvenNumbers.add(3);
        lhSetEvenNumbers.add(10);
        deleteDuplicates(lhSetEvenNumbers);
        summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        System.out.println("a");
    }

    public static LinkedList<Integer> deleteDuplicates(LinkedList<Integer> head) {
        LinkedHashSet<Integer> linkedHashSet
                = new LinkedHashSet<>(head);
        head = new LinkedList<>(linkedHashSet);
        return head;
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        if (nums.length == 1) {
            result.add(String.valueOf(nums[0]));
            return result;
        }

        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            while (i + count < nums.length && nums[i] + count == nums[i + count]) {
                count++;
            }

            if (count == 1) {
                result.add(String.valueOf(nums[i]));
            } else {
                count += i - 1;
                result.add(nums[i] + "->" + nums[count]);
                i = count;
                count = 1;
            }
        }
        return result;
    }
}