package model;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String line;
		try {	
		while((line = sc.nextLine()) != "") {
			//if(line == "") {
			if(line.equals("\n") || line.equals("") || line.equals(" ")|| line.equals(null)) {
			continue;
			}
			int n = Integer.parseInt(line);
			
			int[] numBooks = new int[n];
			String num = sc.nextLine();
			
			String[]nums = num.split(" ");
			
			//After splitting the string, we insert value per value to a new integer array to evaluate them
			for(int i = 0; i < numBooks.length; i++) {
				numBooks[i] = Integer.parseInt(nums[i]);
			}
			
			int m = sc.nextInt();
			
			Arrays.sort(numBooks);
			
			int ri = 0, rj = 0;
			for(int i = 0; i < numBooks.length; i++) {
				int i1 = numBooks[i];
				
				if(i1 > m) break;
				
				for(int j = i+1; j < numBooks.length; j++) {
					int i2 = numBooks[j];
					if(i2 > m) break;
					
					if(i1 + i2 == m) {
						if(ri + rj == i1 + i2) {
							if(rj - ri > i2 - i1) {
								ri = i1;
								rj = i2;
							}
						} else {
							ri = i1;
							rj = i2;
						}
					}
				}
			}	
			System.out.printf("Peter should buy books whose prices are %d and %d.\n", ri, rj);
			System.out.println();
		}
		//}
		}catch (Exception e){
			
		}	
		sc.close();		
	}
}
