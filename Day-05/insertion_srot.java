public class insertionsort {
    public static void main(String[] args) {
        int arr[] = {4,7,5,2,6,1,8,4,3};
        System.out.println("before sorting arr");
        for(int num : arr){
            System.out.print(num + " ");
        }
        int len = arr.length;
        for(int i=1;i<len;i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j -1;
                
            }
            arr[j+1] = key;
        }
        System.out.println("\n after sorting arr");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
