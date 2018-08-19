package com.example.tanzilyayakshimbetova.javatest;

public class BinarySearch {

    public int searchForItem(int[] A, int element, int start, int end) {
        if (end >=start) {
            int middle = start + (end - start) / 2;
            if (A[middle] == element) {
                return middle;
            }
            if (A[middle] > element){
                return searchForItem(A, element, start, middle-1);
            } else {
                return searchForItem(A, element, middle+1, end);
            }
        }
        return -1;
    }

}
