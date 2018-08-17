package Recursions;
import java.util.*;
import java.lang.Math;
public class tower_of_hanoi {
    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    towerOfHanoi(n,"T1", "T2", "T3");
    int sum=(int)(Math.pow(2,n))-1;
    System.out.println(sum);
    }
    
    public static void towerOfHanoi(int n, String from_rod, String to_rod, String aux_rod)
    {
        if (n == 1)
        {
            System.out.println("Move 1th disc from " +  from_rod + " to " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move " + n + "th disc from " +  from_rod + " to " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }
}

