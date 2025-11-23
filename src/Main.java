
public class Main {
    public static void main(String[] args) {
        //Task1 TwoSum
        /*
        Solution solution = new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        int [] nums2 = {3,2,4};
        int target2 = 6;
        int [] nums3 = {3,3};
        int target3 = 6;
        solution.twoSum(nums,target);
        solution.twoSum(nums2,target2);
        solution.twoSum(nums3,target3);
         */
        // Task 2 IsPalindrome
        /*
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(10));
        */
        /*
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("LVIII"));
         */
        //Task 3 RomanToInteger
        /*
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String [] str = {""};
        longestCommonPrefix.longestCommonPrefix(str);
         */
        //Task 4 ValidParentheses
        /*
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()"));
        validParentheses.isValid("()[]{}");
        System.out.println(validParentheses.isValid("([)]"));
        System.out.println(validParentheses.isValid("([])"));
         */
        //Task 5 Merge Two Sorted Lists
        /*
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        mergeTwoLists.mergeTwoLists();
        */
        //Task6 Remove duplicates
        /*
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1,1,2});
        */
        //Task7 Remove Element
        /*
        RemoveElement removeElement = new RemoveElement();
        removeElement.removeElement(new int[]{3,2,2,3}, 3);
        removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
         */
        //Task 8 SearchInsertPosition
        SearchInsertPosition   searchInsertPosition = new SearchInsertPosition();
        searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 5);
        searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2);
        searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 7);
    }
}

