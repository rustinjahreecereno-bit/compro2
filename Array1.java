import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] numbers = {0,9,8,7,6,5,4,3,2,1};

        System.out.println("Array elements");
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Index " + i + ":" + numbers[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a integer: ");
        int search = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == search){
                System.out.println("First appearance in Index " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Number not found in array");
        }
    }
}
