package Recursions;
import java.util.*;
public class mazepath_d {
	    public static void main(String args[]) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int m=s.nextInt();
	    System.out.println();
	    printMazePath(n-1, m-1, 0, 0, "");
	    }
	    
	    public static void printMazePath(int er, int ec, int cr, int cc, String path) {
			if (cr == er && cc == ec) {
				System.out.print(path + " " );
				return;
			}
			if (cr > er || cc > ec) {
				return;
			}
			
			printMazePath(er, ec, cr + 1, cc, path + "V");
			printMazePath(er, ec, cr, cc + 1, path + "H");
			printMazePath(er, ec, cr+ 1, cc+ 1, path + "D");	
		}

	}
