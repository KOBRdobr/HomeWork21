/**
 * @author Nail Zinnurov
 * cobratms@gmail.com
 * on 06.10.2018
 */

public class Main {
    public static void main(String[] args) {

        toLeftFirstVersion();
        toLeftSecondVersion();

        reverseArray();
    }

    private static void reverseArray() {
        int[] toReverse = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for(int i = 0; i < toReverse.length / 2; i++) {
            toReverse[i] = toReverse[i] ^ toReverse[toReverse.length - (i + 1)];
            toReverse[toReverse.length - (i + 1)] = toReverse[i] ^ toReverse[toReverse.length - (i + 1)];
            toReverse[i] = toReverse[i] ^ toReverse[toReverse.length - (i + 1)];


        }
        showArray(toReverse);
    }

    private static void toLeftSecondVersion() {
        int[][] secondArr = getArray();

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 5; j++) {
                if(j != 4) secondArr[i][j] = secondArr[i][j + 1];
                else secondArr[i][j] = 0;
            }
        }

        showArray(secondArr);
    }

    private static void toLeftFirstVersion() {

        int[][] firstArr = getArray();

        for (int i = 0; i < 2; i++) {
            int j = 0;
            for (; j < 4; j++) {
                firstArr[i][j] = firstArr[i][j + 1];
            }
            if(i == 0) firstArr[0][4] = firstArr[1][0];
            else firstArr[i][j] = 0;
        }

        showArray(firstArr);

    }

    private static int[][] getArray() {

        int[][] arr = new int[2][5];
        int number = 1;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = number++;
            }
        }
        return arr;
    }

    private static void showArray(int[][] arr) {
        int[][] abc = arr;
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(abc[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void showArray(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
