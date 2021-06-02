// Time Complexity:  O(logN)
// Space Complexity: O(1)

public class Main {
    
    static int findMissingElement(int[] nums){
        int low = 0; int high = nums.length - 1; int mid;
        
        while(low<= high){
            mid = low + (high - low)/2;
            if(nums[mid] != mid){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;          
    }
    
    public static void main(String[] args) {
        int[] input = {0,1,2,4,5,6,7,8,9};
        int[] input2 = {1,2,3,4};
        int[] input3 = {1};
        int[] input4 = {0,1,2,3,4,5};
        System.out.println(findMissingElement(input));
        System.out.println(findMissingElement(input2));
        System.out.println(findMissingElement(input3));
        System.out.println(findMissingElement(input4));
    }
}
