package switch_case_with_java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// data
		String day;
		
		// comparation
		System.out.printf("What day of the week is today?\nR: ");
		int x = sc.nextInt();
		
		switch (x) {
		case 1:
			day = "Today is Sunday.";
			break;
		case 2:
			day = "Today is Monday.";
			break;
		case 3:
			day = "Today is Tuesday.";
			break;
		case 4:
			day = "Today is Wednesday.";
			break;
		case 5:
			day = "Today is Thursday.";
			break;
		case 6:
			day = "Today is Friday.";
			break;
		case 7:
			day = "Today is Saturday.";
			break;
		default:
			day = "Invalid Value.";
			break;
		}

	System.out.println(day);
	sc.close();
	
	}

}
