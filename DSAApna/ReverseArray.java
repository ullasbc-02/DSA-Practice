package DSAApna;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {4,-4,9,-100,3,90};
        int start = 0, end=arr.length-1;
        while(start<=end){
        int temp = arr[start];
        arr[start++] = arr[end];
        arr[end--] = temp;
        }
        for (int i:arr ) System.out.print(" "+i);
    }
    

}
