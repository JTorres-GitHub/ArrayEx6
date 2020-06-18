import java.util.Arrays;

public class ArrayEx6 {
	public static int[] maxElement3(int[] nums){
		int maxEl = 0;
		
		if(nums[0] > nums[2])
			maxEl = nums[0];
		else
			maxEl = nums[2];
		int[] newArr = new int[]{maxEl, maxEl, maxEl};
		
		return newArr;
	}
	
	public static void main(String[] arg){
		int[] array1 = new int[]{1, 2, 3};
		int[] array2 = new int[]{11, 5, 9};
		int[] array3 = new int[]{2, 11, 3};
		
		System.out.println(Arrays.toString(maxElement3(array1)));
		System.out.println(Arrays.toString(maxElement3(array2)));
		System.out.println(Arrays.toString(maxElement3(array3)));
	}
}
