package org.demo.example;

public class Quick {

    public void quickSort(int[] a, int start, int end){
        if (start < end)
        {
            int partitionIndex = partition(a, start, end);
            quickSort(a, start, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, end);
        }
    }

    private int partition (int[] a, int start, int end){
        int pivot = a[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++){
            if (a[j] < pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[end];
        a[end] = temp;

        return (i + 1);
    }

}
