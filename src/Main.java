public class Main {
    public static void main (String[] args){
        // Tableau à trier
        int[] numbers = new int[] {2, 8, 5, 9, 4, 1, 3, 6, 7};
        System.out.println("-- Intial values --");
        printArray(numbers);

        System.out.println();

        System.out.println("-- Sorted values -- ");

        // Bubble sort / tri à bulle
        //bubbleSort(numbers);

        // Insertion sort / tri par insertion
        insertionSort(numbers);

        printArray(numbers);
    }

    /**
     * Bubble sort / Tri à bulle
     */
    private static int[] bubbleSort(int[] arr) {

        boolean swapped = true;

        while(swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                // Mauvais ordre, il faut inverser
                if (arr[i] > arr[i + 1]) {

                    swapped = true;

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        return arr;
    }

    /**
     * Insertion sort / tri par insertion
     */
    private static int[] insertionSort(int[] arr) {

        // On commence au deuxième élément, car on considère le 1er comme déjà trié
        for (int i = 1; i < arr.length; i++) {
            int j = i;

            while ((j > 0) && (arr[j - 1] > arr[j])) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }

        return arr;
    }


    /**
     * Affichage du tableau
     */
    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
