public class SortingAlgorithms {

    // 1. Bubble Sort (from class slides)
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 2. Selection Sort (from class slides)
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // 3. Insertion Sort (from class slides)
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Helper method to display arrays cleanly (matching class print loop)
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Array with 10 unsorted numbers
        int originalArr[] = {44, 38, 5, 47, 15, 36, 26, 27, 2, 46};

        System.out.print("Original Array: ");
        displayArray(originalArr);

        // Separate copy for Bubble Sort
        int bubbleArr[] = originalArr.clone();
        bubbleSort(bubbleArr);
        System.out.print("Sorted Array using bubble sort: ");
        displayArray(bubbleArr);

        // Separate copy for Selection Sort
        int selectionArr[] = originalArr.clone();
        selectionSort(selectionArr);
        System.out.print("Sorted Array using selection sort: ");
        displayArray(selectionArr);

        // Separate copy for Insertion Sort
        int insertionArr[] = originalArr.clone();
        insertionSort(insertionArr);
        System.out.print("Sorted Array using insertion sort: ");
        displayArray(insertionArr);
    }
}