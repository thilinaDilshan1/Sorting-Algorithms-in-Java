public class BubleSort {
    public static void main(String[] args) {
        int array[] = { 45, 27, 56, 33, 21, 10 };
        int len = array.length;

        int count = 1;
        while (count != 0) {
            count = 0;
            for (int i = 0; i < len - 1; i++) {
                int key_index = i;
                if (array[i] > array[i + 1]) {
                    swap(array, key_index);
                    count++;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void swap(int array[], int i) {
        int temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
    }
}
