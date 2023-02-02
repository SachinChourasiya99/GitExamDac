public class BubbleSort{
    public static void bubble(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int arr[] = {3,66,2,78,32,6,3};
        System.out.println("Before Bubble Sort : ");
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

        bubble(arr);

        System.out.println("After Bubble sort : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}