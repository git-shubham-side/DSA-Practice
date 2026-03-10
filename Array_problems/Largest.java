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


// In this problem we have a problem which is find the largest and second largest element from
// the array, 
// now the approch is:
// first we'll find the element whcih is greater than all the element
// and how we'll find is 
//Taking the index 0 of the array and stroring into the 
//variable
// eg:  int [] arr={1,2,3,4,8,7,9,6,5,4,7};
//      largest = arr[0];

// and now w'll iterate over the array and find which element is greateer
//than the largest, like this :
//            if(arr[i]>largest)
/// if the element is greater than the largest we'll exchange the element to the largest element 
/// like this:
//               largest = arr[i];
// again this will find the elements greater than the previous elements
// and that's how we can solve the problem
