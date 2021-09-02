public class BubbleSort implements ISort {

    public int[] sort(int[] arr) {
        int[] ans = new int[arr.length];
        if (arr.length - 1 >= 0) System.arraycopy(arr, 0, ans, 0, arr.length - 1);

        for (int i = 0; i < ans.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (ans[j] > ans[j + 1]) {
                    int temp = ans[j];
                    ans[j] = ans[j + 1];
                    ans[j + 1] = temp;
                }
            }
        }
        return ans;
    }
}
