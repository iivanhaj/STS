// 1
// 1

import java.util.*;

public class swap_nibbles
{
    public static byte swapNibble(byte b)
    {
        byte upper = (byte) ((b & 0xF0) >>> 4);
        byte lower = (byte) ((b & 0x0F));

        byte swapped = (byte) ((lower << 4) | upper);

        return swapped;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();
        byte s = swapNibble(b);
        System.out.println(s & 0xFF);
    }
}