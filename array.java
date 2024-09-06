public class array {
    public static void main(String[] args) {

        int arr [] = new int[] {23,33,44,55,66,77};

        int min  = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i]<min) min = arr[i];

        }
        System.out.println("Smallest number in giveen array " + min);
    }
}