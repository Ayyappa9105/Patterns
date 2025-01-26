import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("*"); // Print stars on the same line
            }
            System.out.println(); // Move to the next line after completing a row
        }
    }
}
/*OUTPUT:=
Enter number of rows:
4
Enter number of columns:
4
****
****
****
****
  */
