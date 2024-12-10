// n
// 1

import java.util.*;
import java.io.*;

public class lexicographic
{
    static char MAX_CHAR = 26;

    public static void count_freq(String str, int freq[]. int len)
    {
        for(int i = 0; i < len; i++)
        {
            freq[str.charAt(i) - 'a']++;
        }
    }

    public static boolean can_Palindrome(int freq[], int len)
    {
        int count_odd = 0;
        for(int i = 0; i < MAX_CHAR; i++)
        {
            if(freq[i] % 2 != 0)
            {
                count_odd++;
            }
        }

        if(len % 2 == 0)
        {
            if(count_odd > 0)
            {
                return false;
            }
        }
        else
        {
            if(count_odd != 1)
            {
                return false;
            }
        }
        return true;
    }

    public static String find_odd_remove(int freq)
    {
        String odd = "";
        for(int i = 0; i < MAX_CHAR; i++)
        {
            if(freq[i] % 2 != 0)
            {
                odd = odd + (char)(i + 'a');
                freq[i]--;
                break;
            }
        }
        return odd;
    }

    static String findPalindrome(String str)
    {
        int len = str.length();
        int freq[] = new int[MAX_CHAR];
        count_freq(str, freq, len);

        if(!can_Palindrome(freq, len))
        {
            return "No Palindrome";
        }

        String odd = find_odd_remove(freq);
        String front = "", rear = "";
        for(int i = 0; i < MAX_CHAR; i++)
        {
            String temp = "";
            if(freq[i] != 0)
            {
                char ch = (char)(i + 'a');
                for(int j = 1; j <= freq[i]/2; j++)
                {
                    temp = temp + ch;
                }
                front = front + temp;
                rear = temp + rear;
            }
        }
        return front + odd + rear;
    }
}