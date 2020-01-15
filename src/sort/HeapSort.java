package sort;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HeapSort {

    public static void main(String[] args) {
        final Heap<Integer> heapSort = new Heap<>();
        final Integer[] unsortedValues = { 15, 8, 7, 23, 1, 9, 10, 2, 4, 0 };
        heapSort.sort(unsortedValues);
        System.out.println(Stream.of(unsortedValues).map(String::valueOf).collect(Collectors.joining(",")));
    }



    private static class Heap<V extends Comparable<V>> {

        public void sort(V[] unsortedArray)
        {
            int n = unsortedArray.length;

            // Build heap (rearrange array)
            for (int i = n / 2 - 1; i >= 0; i--)
                heapify(unsortedArray, i, n);

            // One by one extract an element from heap
            for (int i=n-1; i>=0; i--)
            {
                // Move current root to end
                V temp = unsortedArray[0];
                unsortedArray[0] = unsortedArray[i];
                unsortedArray[i] = temp;

                // call max heapify on the reduced heap
                heapify(unsortedArray, 0, i);
            }
        }

        /**
         *
         * @param unsortedArray
         * @param node current node
         * @param n size of the heap
         */
        void heapify(V[] unsortedArray, int node, int n) {
            if (n == 1 || node >= unsortedArray.length) {
                return;
            }
            int largest = node;
            final int indexChildLeft = indexChildLeft(node);
            if (indexChildLeft < unsortedArray.length && unsortedArray[largest].compareTo(unsortedArray[indexChildLeft]) > 0) {
                largest = indexChildLeft;
            }

            final int indexChildRight = indexChildRight(node);
            if (indexChildRight < unsortedArray.length && unsortedArray[largest].compareTo(unsortedArray[indexChildRight]) > 0) {
                largest = indexChildRight;
            }

            if (largest != node) {
                swap(unsortedArray, node, largest);
                heapify(unsortedArray, largest, n - 1);
            }
        }

        private void swap(V[] unsortedArray, int node1, int node2) {
            final V value1 = unsortedArray[node1];
            unsortedArray[node1] = unsortedArray[node2];
            unsortedArray[node2] = value1;
        }

        private int indexChildRight(int indexParent) {
            return 2 * (indexParent + 1);
        }

        private int indexChildLeft(int indexParent) {
            return 2 * (indexParent + 2);
        }

    }


}
