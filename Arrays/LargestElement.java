class LargestElement{
    public static void main(String args[]){
       int[] arr = {3, 7, 2, 9, 5};
       int largestElement = Integer.MIN_VALUE;
       for(int i = 0 ; i < arr.length ; i++){
          if(arr[i]>largestElement){
            largestElement = arr[i];
          }
       }
       System.out.print(largestElement);
    }
}