package Recursions;

import java.util.ArrayList;

public class boardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getBoardPath(3, 0));
		System.out.println(count(3,0,"",3));
  
	}
	
	public static int count(int end, int curr, String ans, int counter) {
		if (curr == end) {
		    counter++;;
			return counter;
		}
		if (curr > end) {
			return counter;
		}

		
		for (int dice = 1; dice <= 6; dice++) {
			count(end, curr + dice,ans+dice,counter+1);
			
		}

		return counter;
	}
	
	
	public static ArrayList<String> getBoardPath(int end, int curr) {
		if (curr == end) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		if (curr > end) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}

		ArrayList<String> recResult = null;
		ArrayList<String> myResult = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			recResult = getBoardPath(end, curr + dice);
			for (int i = 0; i < recResult.size(); i++) {
				myResult.add(dice + recResult.get(i));
			}
		}

		return myResult;
	}


}
