import java.util.HashSet;
import java.util.List;

public class sweeftproj {

    public static int evaluateExpression(String expression) {
        int result = 0, num = 0;
        boolean isAddition = true;

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if (c == '+' || c == '-' || i == expression.length() - 1) {
                result += isAddition ? num : -num;
                isAddition = (c == '+');
                num = 0;
            }
        }

        return result;
    }

    public static int numberOfHappyStrings(List<String> strings) {
        int happyCount = 0;

        for (String word : strings) {
            boolean isHappy = true;
            char previous = ' ';

            for (char letter : word.toCharArray()) {
                if (letter == previous) {
                    isHappy = false;
                    break;
                }
                previous = letter;
            }

            if (isHappy) happyCount++;
        }

        return happyCount;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public int[] findIntersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }

        int[] result = new int[common.size()];
        int i = 0;
        for (Integer num : common) {
            result[i++] = num;
        }

        return result;
    }

    public int lenOfLongSubarr(int[] array, int k) {
        int longest = 0;

        for (int i = 0; i < array.length; i++) {
            int currentSum = 0;

            for (int j = i; j < array.length; j++) {
                currentSum += array[j];

                if (currentSum == k) {
                    longest = Math.max(longest, j - i + 1);
                }
            }
        }

        return longest;
    }

    public boolean isValidSequence(int[] array, int[] sequence) {
        int index = 0;

        for (int num : array) {
            if (index < sequence.length && num == sequence[index]) {
                index++;
            }

            if (index == sequence.length) {
                return true;
            }
        }

        return false;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
