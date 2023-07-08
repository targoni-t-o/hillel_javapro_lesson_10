package org.demo.example;

public class Merge {

    void mergeSort(int[] array, int start, int end)
    {
        if (start < end){
            int middle = (start + end) / 2;

            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    private void merge(int[] array, int start, int middle, int end){
        int i, j, k;
        int n1 = middle - start + 1;
        int n2 = end - middle;

        int[] LeftArray = new int[n1];
        int[] RightArray = new int[n2];

        for (i = 0; i < n1; i++) LeftArray[i] = array[start + i];
        for (j = 0; j < n2; j++) RightArray[j] = array[middle + 1 + j];

        i = 0;
        j = 0;
        k = start;

        while (i < n1 && j < n2){
            if(LeftArray[i] <= RightArray[j]){
                array[k] = LeftArray[i];
                i++;
            }
            else{
                array[k] = RightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            array[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < n2){
            array[k] = RightArray[j];
            j++;
            k++;
        }
    }
}