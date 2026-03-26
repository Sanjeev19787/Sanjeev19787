public class arrayQuestion2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,-3,4};
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }
        for(int i=0; i<n; i++) {
            System.err.print(arr[i]+" ");
        }
    }
}
