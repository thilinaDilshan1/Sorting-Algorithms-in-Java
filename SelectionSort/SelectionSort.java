public class SelectionSort {
    public static void main(String[] args) {
        int array[] = { 45, 27, 56, 33, 21, 10 };
        int len = array.length;

        for (int i = 0; i < 6; i++) {
            int min = array[i];
            int min_index = i;
            for (int j = i; j < len; j++) {
                if (min > array[j]) {
                    min = array[j];
                    min_index = j;
                }
            }
            swap(i, min_index, array);
        }
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void swap(int key_index, int min_index, int array[]) {
        int temp = array[key_index];
        array[key_index] = array[min_index];
        array[min_index] = temp;
    }
}
