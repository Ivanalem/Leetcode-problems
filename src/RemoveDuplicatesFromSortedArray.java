import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // индекс для записи следующего уникального элемента

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {  // нашли новый уникальный элемент
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(k);

        return k;
    }
}
