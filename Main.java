public class Main {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 4, 5, 6 };
        int n, m;
        int count = 0;
        int counts = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != 0) {
                count++;
            }
        }
        for (int j = 0; j < nums2.length; j++) {
            if (nums2[j] != 0) {
                counts++;
            }
        }
        m = count;
        n = counts;
        int x = m + n;
        int[] arr = new int[x];
        for (int k = 0; k < nums1.length; k++) {
            if (nums1[k] != 0) {
                arr[k] = nums1[k];
            }
        }
        for (int l = nums1.length; l < x; l++) {
            if (nums2[l - nums1.length] != 0) {
                arr[l] = nums2[l - nums1.length];
            }
        }
        for (int num : arr) {
            System.out.print("Merged array:" + num + " ");
        }
    }

}
