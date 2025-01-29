import java.util.*;
class Pattern3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n=sc.nextInt();
        System.out.println("Pattern-4 Is:");
        for(int i=0;i<=n;i++)
        {
            int r=1;
            for(int j=0;j<i;j++)
            {
                System.out.print(r+"\t");
                r++;
            }
            System.out.println();
        }
    }
}
/* OUTPUT:-
Enter the n value:
5
Pattern-4 Is:

1	
1	2	
1	2	3	
1	2	3	4	
1	2	3	4	5
  */
