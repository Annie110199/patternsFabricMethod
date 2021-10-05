package Fabric;

public class Dialog {

    public static int[] sortArray(int[] arr, SortTypes type){
        ISort sort;
        switch (type){
            case SORT1:
                sort = new Sort1();
            case SORT2:
                sort = new Sort2();
            case SORT3:
                sort = new BubbleSort();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return sort.sort(arr);
    }

}
