package Array.two_pointer;
import java.util.*;
public class twosum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int si=s.nextInt();
        int arr[]=new int[si];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        int t=s.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==t)
                {
                    System.out.print(i+"and"+j);
                    return;
                }
            }
        }
        System.out.print("no");

    }
}
