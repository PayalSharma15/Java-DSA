class MoveZeros{
    public static void main(String args[]){
        int[] arr = {0,1,0,3,12};
        int nonZeroindex = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]!=0){
                arr[nonZeroindex]=arr[i];
                nonZeroindex++;
            }
        }
        while(nonZeroindex < arr.length){
               arr[nonZeroindex] = 0;
               nonZeroindex++;
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}