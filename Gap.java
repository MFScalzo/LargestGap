import java.util.Arrays;

class Gap {
    public static void main(String args[]) {
        int[] arr1 = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        int[] arr2 = {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7};
        int[] arr3 = {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9};

        Gap obj = new Gap();

        System.out.println(Arrays.toString(arr1));
        System.out.println(obj.largestGap(arr1));

        System.out.println(Arrays.toString(arr2));
        System.out.println(obj.largestGap(arr2));

        System.out.println(Arrays.toString(arr3));
        System.out.println(obj.largestGap(arr3));
    }

    // Solution Function
    public int largestGap(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int gap = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 == arr.length) {
                break;
            }

            if (arr[i+1] - arr[i] > gap) {
                gap = arr[i+1] - arr[i];
            }
        }

        return gap;
    }
}