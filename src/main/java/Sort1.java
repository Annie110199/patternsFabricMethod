public class Sort1 implements ISort{

    public int[] sort(int[] ans) {

        for (int i = 0; i<ans.length;++i)
            for (int j = 0; j<i;++j){
                if(ans[i]<ans[j]){
                    int t = ans[i];
                    ans[i] = ans[j];
                    ans[j] = t;
                }
            }
        return ans;
    }
}
