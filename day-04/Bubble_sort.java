public class bubblesort {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 8, 2, 6, 9, 2};
        int n = numbers.length;

        System.out.println("🔹 Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("\n Sorted Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
