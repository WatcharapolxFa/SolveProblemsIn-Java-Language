import java.util.Random;

public class MergetwoSortedLists {

    /**
     * @param args the command line arguments
     */
    void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays /
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /* A utility function to print array of size n */

    // Driver code
    public static void main(String args[]) {
        System.out.print("Enter list1: ");
        Random rd = new Random();
        // String[] valueString = line.split(" ");
        int[] list1 = new int[5];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = rd.nextInt(100);
            System.out.print(list1[i] + " ");
        }
        System.out.println("");
        System.out.print("Enter list2: ");
        // line = scanner.nextLine();
        // valueString = line.split(" ");
        int[] list2 = new int[4];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = rd.nextInt(100);
            System.out.print(list2[i] + " ");
        }
        System.out.println("");
        int[] sortedList = merge(list1, list2);
        MergetwoSortedLists ob = new MergetwoSortedLists();
        ob.sort(sortedList, 0, sortedList.length - 1);

        System.out.print("The merged list is ");
        for (int i : sortedList) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] merge(int[] list1, int[] list2) {
        int leftLen = list1.length;
        int rightLen = list2.length;
        int[] sortedList = new int[leftLen + rightLen];
        int sortedIndex = 0, left = 0, right = 0;

        while (left < leftLen && right < rightLen) {
            if (list1[left] < list2[right]) {
                sortedList[sortedIndex] = list1[left];
                left++;
            } else {
                sortedList[sortedIndex] = list2[right];
                right++;
            }
            sortedIndex++;
        }

        while (left < leftLen) {
            sortedList[sortedIndex] = list1[left];
            left++;
            sortedIndex++;
        }
        while (right < rightLen) {
            sortedList[sortedIndex] = list2[right];
            right++;
            sortedIndex++;
        }
        return sortedList;
    }
}