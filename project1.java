package Project1;

import java.util.Scanner;
import java.util.Random;

public class project1 {
	
	public static long start;
	public static long end;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Random rand=new Random();
		int n;
		linkedlist cookies = new linkedlist();
		Character ans;
		System.out.println("Enter function to be performed ");
		ans=s.next().charAt(0);
		
		while(ans=='e' || ans=='r' || ans=='g' || ans=='E' || ans=='R' || ans=='G' )
		{
			
			if(ans=='e' || ans=='E')
			{
				System.out.println("Ending");
				break;
			}
			
			else if(ans=='r' || ans=='R')
			{
				int check=s.nextInt();
				long rettime=cookies.search(check);
				
				if(rettime==0)
				{
					System.out.println("Entry not found");
					break;
				}
				
				long time=retTime(rettime, endTime());
				if(time>30000)
				{
					System.out.println("Entry expired");
					cookies.removethis(check);
					n=rand.nextInt(99999) +1;
					cookies.addLast(n,startTime());
					cookies.display();				
				}
				else
				{
					System.out.println("Entry exists");
				}
			}
			
			else if(ans=='g' || ans=='G')
			{
				n=rand.nextInt(99999) +1;
				cookies.addLast(n,startTime());
				cookies.display();
			}
			
			else
			{
				System.out.println("Invalid choice");
				break;
			}
			
			System.out.println("Enter function to be performed ");
			ans=s.next().charAt(0);
		}
		
		
		
	}
	
	public static long startTime() {
		start = System.currentTimeMillis();
		return start;
		}
	public static long endTime() {
		end = System.currentTimeMillis();
			return end;
		}
	public static long retTime(long s, long e) {
		return e-s;
	}

}
