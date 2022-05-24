
public class InsertionSort {
    public static void main(String[] args) {
        int array[] = { 45, 27, 56, 33, 21, 10 };
        int len = array.length;
        for (int i = 1; i < len; i++) {
            int index = i;
            while (array[index] < array[index - 1]) {
                swap(index, array);
                if (index > 1) {
                    index--;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void swap(int i, int array[]) {
        int temp = array[i];
        array[i] = array[i - 1];
        array[i - 1] = temp;
    }

}