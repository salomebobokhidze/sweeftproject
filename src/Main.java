import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            sweeftproj sweeftproj1 = new sweeftproj();

            String expression = "3+2-4+6";
            int result = sweeftproj.evaluateExpression(expression);
            System.out.println("Evaluate Expression: " + result);

            List<String> strings = new ArrayList<>();
            strings.add("abc");
            strings.add("aabb");
            strings.add("abab");
            int happyCount = sweeftproj.numberOfHappyStrings(strings);
            System.out.println("Number of Happy Strings: " + happyCount);

            sweeftproj.ListNode head = new sweeftproj.ListNode(1);
            head.next = new sweeftproj.ListNode(2);
            head.next.next = new sweeftproj.ListNode(3);

            sweeftproj.ListNode reversedHead = sweeftproj1.reverseList(head);

            System.out.print("Reversed List: ");
            sweeftproj.ListNode current = reversedHead;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();

            int[] nums1 = {1, 2, 2, 1};
            int[] nums2 = {2, 2};
            int[] intersection = sweeftproj1.findIntersection(nums1, nums2);
            System.out.print("Intersection: ");
            for (int num : intersection) {
                System.out.print(num + " ");
            }
            System.out.println();

            int[] array = {6, 2, 2, 3, 4, 1};
            int k = 8;
            int longestSubarrLength = sweeftproj1.lenOfLongSubarr(array, k);
            System.out.println("Longest Subarray Length: " + longestSubarrLength);

            int[] array2 = {5, 1, 9, 3, 7};
            int[] sequence = {1, 3, 7};
            boolean isValid = sweeftproj1.isValidSequence(array2, sequence);
            System.out.println("Is Valid Sequence: " + isValid);
        }
    }