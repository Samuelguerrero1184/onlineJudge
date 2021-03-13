package model;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String line;
		while((line = sc.nextLine()) != null) {
			if(line.equals("\n") || line.equals("") || line.equals(" ")) continue;
			
			int n = Integer.parseInt(line);
			
			int[] values = new int[n];
			String num = sc.nextLine();
			
			String[]nums = num.split(" ");
			for(int i = 0; i < values.length; i++) {
				values[i] = Integer.parseInt(nums[i]);
			}
			
			
			
			
		}
		sc.close();
	}
}