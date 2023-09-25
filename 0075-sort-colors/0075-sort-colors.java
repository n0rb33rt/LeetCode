class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(nums, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapify(nums, i, 0);
        }
    }


    void heapify(int arr[], int n, int i) {
        int largest = i; 
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        if (leftChild < n && arr[leftChild] > arr[largest]) 
            largest = leftChild;
      
        if (rightChild < n && arr[rightChild] > arr[largest]) 
            largest = rightChild;
        

      
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}
