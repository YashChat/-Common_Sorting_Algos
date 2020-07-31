public class Part3 {
    private static int compares;
    private static int swaps;
    private static int[] array;

    public static void setArray(int[] a) {
        array = a;
    }

    public static int[] bubbleSort(int[] a) {
        array = a;
        compares = 0;
        swaps = 0;
        boolean swapped = false;
        for (int i = 0; i < a.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (less(j, j + 1) == false) {
                    swap(j, j + 1);
                    swapped = true;
                }
            }
            // As soon as there are no more swaps, already sorted.
            if (swapped == false) {
                break;
            }
        }
        return new int[] {compares, swaps};
    } // bubbleSort()

    public static int[] selectionSort(int[] a) {
        array = a;
        compares = 0;
        swaps =  0;
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (less(j, min)) {
                    min = j;
                }
            }
            swap(i,  min);
        }
        return new int[] {compares, swaps};
    } // selectionSort()

    public static int[] insertionSort(int[] a) {
        array = a;
        compares = 0;
        swaps = 0;
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            while (less(i, j) == true && j > 0) {
                swap(j, j + 1);
                j--;
            }

        }
        return new int[]{compares, swaps};
    } //insertionSort

    public static int[] mysterySort(int[] a) {
        array = a;
        compares = 0;
        swaps = 0;
        int m = array.length;
        foo3();
        while (m > 0) {
            swap(0, m-1);
            m--;
            foo2(0, m);
        }
        System.out.println("Compares mystery = " + compares);
        System.out.println("Swaps mystery = " + swaps);
        return new int[] {compares, swaps};
    } // mysterySort()

    public static int foo1(int k, int m) {
        int max  = 0;
        if (2*k + 1 >= m) {
            return k;
        }
        else if ((2*k + 2) >= m) {
            if (less(k, (2*k) + 1)) {
                swap(k, (2*k) + 1);
                return ((2*k) + 1);
            }
        }
        else if (less(k, (2*k) + 1) || less(k, (2 * k) + 2)) {
            if (less(2 * k + 1, 2 * k + 2 )) {
                max = (2 * k + 2);
            }
            else {
                max = (2 * k + 1);
            }
            swap(k, max);
            return max;
        }
        return 0;
    } // foo1()

    public static void foo2(int k, int m) {
        int new_k = foo1(k, m);
        while ((2*new_k + 1) < m) {
            new_k = foo1(new_k, m);
        }
    } // foo2()

    public static void foo3() {
        for (int i = (int)Math.floor(array.length/2); i >= 0; i--) {
            foo2(i, array.length);
        }
    } // foo3()

    //returns true if array[i] < array[j]
    //false else
    //NOTE: You can use !less for >=
    private static boolean less(int i, int j) {
        compares++;
        if(array[i] < array[j])
            return true;
        return false;
    }

    //swaps array[i] and array[j]
    private static void swap(int i, int j) {
        if(i == j)
            return;
        swaps++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}