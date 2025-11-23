import java.util.Arrays;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target){
        int k = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != target) {
                k++;
            }
        }
        return k;
    }
}
