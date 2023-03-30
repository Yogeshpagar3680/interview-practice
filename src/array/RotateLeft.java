package array;

public class RotateLeft {
    public static void main(String[] args) {

        //initialize array
        int arr[] = new int[]{1,2,3,4,5};

        int n = 1; //no of times the array should be rotated

        //Displays original array
        System.out.println("original array: ");
        for (int i=0; i< arr.length; i++){

            System.out.print(arr[i] + " ");
        }

        //Rotate the given array by n times towards left
        for (int i=0; i<n; i++){

            int first = arr[0];
            int j;
            for(j=0; j< arr.length-1; j++){

                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        System.out.println();

        //Displays resulting array after rotation
        System.out.println("____________________________________");
        System.out.println("Array after left rotation: ");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
