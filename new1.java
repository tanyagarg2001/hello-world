package Project1;

import java.util.Scanner;

public class new1{
	
	public static long start;
	public static long end;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		String n;
		linkedlistedited cookies = new linkedlistedited();
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
				System.out.println("Enter value ");
				String checkstr=s.nextLine();
				long rettime=cookies.search(checkstr);
				
				if(rettime==0)
				{
					System.out.println("Entry not found");
					break;
				}
				
				long time=retTime(rettime, endTime());
				if(time>30000)
				{
					System.out.println("Entry expired");
					cookies.removethis(checkstr);
					n=randomAlphaNumeric(20);
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
				n=randomAlphaNumeric(20);;
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
	
	private static final String STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	public static String randomAlphaNumeric(int count) 
	{
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) 
		{
			int character = (int)(Math.random()*STRING.length());
			builder.append(STRING.charAt(character));
		}
		
		return builder.toString();
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
