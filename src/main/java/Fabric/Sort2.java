package Fabric;

public class Sort2 implements ISort {

    public int[] sort(int[] ans) {
        //int[] ans = new int[arr.length];
        //if (arr.length - 1 >= 0) System.arraycopy(arr, 0, ans, 0, arr.length - 1);

        int j = 0;
        int tmp;
        for(int i=0; i<ans.length; i++){
            j = i;
            for(int k = i; k<ans.length; k++){
                if(ans[j]>ans[k]){
                    j = k;
                }
            }
            tmp = ans[i];
            ans[i] = ans[j];
            ans[j] = tmp;
        }
        return ans;
    }
}
