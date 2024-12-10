public class SieveMain{

    public static void simpleSieve(int limit)
    {
        boolean prime[] = new boolean[limit + 1];
        for (int i = 2; i < limit; i++)
        {
            prime[i] = true;
        }   

        //marking all multiples of prime numbers as false

        for(int p = 2; p*p < limit; p++)
        {
            //if prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                for(int i = p*p; i < limit; i += p)
                {
                    prime[i] = false;
                }
            }
        }

        //printing all prime numbers
        for(int i = 2; i < limit; i++)
        {
            if(prime[i] == true)
            {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        simpleSieve(30);
    }
}