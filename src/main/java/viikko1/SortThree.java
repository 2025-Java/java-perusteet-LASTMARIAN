package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int[] array = {a, b, c};
    
        for (int i = 0; i < 2; i++) {
            boolean swapped = false;
            for (int j = 0; j < 2 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    
        return array[0] + "," + array[1] + "," + array[2];
    }
}
