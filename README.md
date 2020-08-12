# Common-Sorting-Algos

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
    ○ else if array[k] is smaller than array[2k+1] or array[2k+2], swap it with the larger of the two and return that index (if
      array[2k+1] == array[2k+2], swap with array[2k+1])
      
  ● foo2(int k, int m): In this method, you should make sure that array[k] >= array[2k+1] and array[2k+2]. If not, use foo1 to
    adjust. Then call foo1 again on the new index of array[k]. Do this until array[k] >= array[2k+1] and array[2k+2] OR there’s no
    more array elements to swap with that are before index m.
    
  ● foo3(): call foo2 repeatedly on all the indices in the array from floor(N/2) down to 0 (NOTE: You have to go backwards through the
    array, but you only have to start at the halfway point.) N is the size of the array.
    
  ● mysterySort: This method sorts the array using foo1, foo2, and foo3 as follows:
          ○ m = the length of the array
          ○ foo3()
          ○ while m > 0
          ○ swap(0, m-1)
          ○ m--
          ○ foo2(0, m)
          ○ end while
