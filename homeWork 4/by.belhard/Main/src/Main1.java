public class Main1 {
    public static void main(String[] args) {

        int[] random = {5, 6, 5, 4, 6, 8, 8, 9, 3, 25, 6, 23};

        IntArray array = new IntArray(random);
        IntArray array1 = new IntArray(15);
        IntArray array2 = new IntArray();

        array.sort(4);

        for (int i : array.getArray()) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : array1.getArray()) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : array2.getArray()) {
            System.out.print(i + " ");
        }
    }
}
