import org.junit.jupiter.api.Test;


class Tests {
    @Test
    public void Test1() {
        int[] arr = new int[]{5, 12, 7, 0};

        arr = Dialog.sortArray(arr, SortTypes.SORT1);
        for(int e: arr) {
            System.out.print(e + " ");
        }

        arr = new int[]{5, 12, 7, 0};

        arr = Dialog.sortArray(arr, SortTypes.SORT3);
        for(int e: arr) {
            System.out.print(e + " ");
        }
    }
}
