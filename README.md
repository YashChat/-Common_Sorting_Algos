# -Common_Sorting_Algos
This file has all the the common sorting algorithms.

The following methods must be completed:
  ● bubbleSort(int[] a): sort a using the Bubblesort method 
  ● selectionSort(int[] a): sort a using the Selection Sort method
  ● insertionSort(int[] a): sort a using the Insertion Sort method -- to “insert” an item into the sorted part 
    of the array, use the swap function until it is in the appropriate place
  ● foo1(int k, int m): This method is meant to ensure that array[k] >= array[2k+1] and array[2k+2], as long as those indices are less
    than equal to m. You should return the final index of the element originally at k. It should do the following:
    ○ if(2k+1 > m): don’t swap; return k
    ○ else if(2k+2 > m): compare array[k] to array[2k+1] and if
      array[k] is smaller, swap the two and return 2k+1
