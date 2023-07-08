package org.demo.example;

public class Main {
    public static void main(String[] args) {
        int[] quickArray = {13, 18, 27, 2, 19, 25};

        Quick quick = new Quick();
        quick.quickSort(quickArray, 0,  quickArray.length - 1);

        System.out.println("Sorted quick array");
        printArray(quickArray, quickArray.length);

        int[] mergeArray = {11, 30, 24, 7, 31, 16, 39, 41};

        System.out.println();

        Merge merge = new Merge();
        merge.mergeSort(mergeArray, 0,  mergeArray.length - 1);
        System.out.println("Sorted merge array");
        printArray(mergeArray, mergeArray.length);

        System.out.println();

        int[] searchArray = {10,20,30,40,50,60,70};
        int key = 40;
        binarySearch(searchArray,0, searchArray.length - 1, key);

        Tree tree = new Tree();
        Node root = new Node(8);

        System.out.println("Building tree with root value " + root.value);
        tree.insertNode(root, 3);
        tree.insertNode(root, 1);
        tree.insertNode(root, 6);
        tree.insertNode(root, 4);
        tree.insertNode(root, 10);
        tree.insertNode(root, 7);
        tree.insertNode(root, 14);
        tree.insertNode(root, 13);

        System.out.println("Traversing tree in order");
        tree.traverseInOrder(root);
    }

    public static void binarySearch(int[] array, int first, int last, int key){
        int mid = (first + last)/2;

        while(first <= last){
            if (array[mid] < key ){
                first = mid + 1;
            }else if (array[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }

        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }

    private static void printArray(int[] array, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
    }

}