import java.util.Scanner;

public class remainder_theorem
{
    public static int findmin(int num[], int rem[], int K)
    {
        int x = 1;
        while(true)
        {
            int j;
            for(j=0; j <K; j++)
            {
                if(x%num[j] != rem[j])
                {
                    break;
                }
            }
            if(j==K)
            {
                return x;
            }
            x++;
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //congruence relations
        int size = sc.nextInt();
        int a[] = new int[size];
        int m[] = new int[size];
        
        //a
        for(int i=0; i <size; i++)
        {
            a[i] = sc.nextInt();
        }
        
        //m
        for(int i=0; i<size; i++)
        {
            m[i] = sc.nextInt();
        }
        
        System.out.println(findmin(m,a,size));
    }
}