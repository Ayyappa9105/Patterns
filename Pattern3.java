import java.util.*;
class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows:");
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/* OUTPUT:-
  enter number of rows:
  5
  *****
  ****
  ***
  **
  *
*/
