package arrays;
class Largest{
    public static void main(String[] args) {
        int [] arr={1,2,3,4,8,7,9,6,5,4,7};
        int largest = arr[0];
        int secondLargest=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest = arr[i];
            }
        }
        System.out.println("Largest is:"+largest);
        System.out.println("Second Largest:"+secondLargest);

    }
}
