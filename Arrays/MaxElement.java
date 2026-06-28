class MaxElement{
    public static void main(String args[]){
       int[] arr = {3, 7, 2, 9, 5};
       int maxElement = arr[0];
       for(int i = 0 ; i < arr.length ; i++){
          if(arr[i]>maxElement){
            maxElement = arr[i];
          }
       }
       System.out.print(maxElement);
    }
}