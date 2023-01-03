import java.util.Arrays;
import java.util.Collections;

public class IntArray {

    private int[] array;

    public IntArray() {
        array = new int[10];
        int max = 100;
        int min = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min)) + min;
        }
    }

    public IntArray(int count) {
        array = new int[count];
        int max = 100;
        int min = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min)) + min;
        }
    }

    public IntArray(int[] newArray) {
        this.array = newArray;
    }

    public void sort(int number) {
        if (number > 0) {
            Arrays.sort(array);
        } else {
            int[] sortedDesc = Arrays.stream(array)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
            array = sortedDesc;
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}

