/*
 * 
 * 
 */
import java.util.Scanner;

public class Merch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		String output = "\nHere's your order:\n";
		String purchaseItem;
		String shirtSize;
		String shirtStyle;
		String shirtColor;
		String sockStyle;

		System.out.print("Would you like a Sockrockers T-shirt today? (Y or N): ");
		purchaseItem = scan.next();
		if (purchaseItem.equalsIgnoreCase("Y")) {
			System.out.print("Small, medium, or large? (S, M, or L): ");
			shirtSize = new String(scan.next());
			shirtSize = shirtSize.toLowerCase();
			switch (shirtSize) {
			case "s":
				output += "Small ";
				break;
			case "m":
				output += "Medium ";
				break;
			case "l":
				output += "Large ";
				break;
			}
			System.out.print("There are 3 colors:\nW : white\nB: black\nO : orange\nWhich color would you like?: ");
			shirtColor = scan.next();
			shirtColor = shirtColor.toLowerCase();
			switch (shirtColor) {
			case "w":
				output += "white ";
				break;
			case "b":
				output += "black ";
				break;
			case "o":
				output += "orange ";
				break;
			}
			System.out.print(
					"There are 4 styles:\nT : tank top\nS : short sleeve\nL : long sleeve\nH : hoodie\nWhich style would you like?: ");
			shirtStyle = scan.next();
			shirtStyle = shirtStyle.toLowerCase();
			switch (shirtStyle) {
			case "t":
				output += "tank-top for $12";
				total += 12;
				break;
			case "s":
				output += "short sleeve T-shirt for $15";
				total += 15;
				break;
			case "l":
				output += "long sleeve for $20";
				total += 20;
				break;
			case "h":
				output += "hoodie for $22";
				total += 22;
				break;
			}
			System.out.print("Would you like Sockrockers socks today? (Y or N): ");
			purchaseItem = scan.next();
			if (purchaseItem.equalsIgnoreCase("Y")) {
				System.out.print("There are 3 types of socks:\nC : Children's socks\nW : Adult's white gym socks"
						+ "\nO : Adult's 10th anniversary orange socks\nWhich kind would you like?: ");
				sockStyle = scan.next();
				sockStyle = sockStyle.toLowerCase();
				switch (sockStyle) {
				case "c":
					output += "\nChildren's socks for $6";
					total += 6;
					System.out.println(output + "\nYour total is $" + total);
					break;
				case "w":
					output += "\nAdult's white gym socks socks for $8";
					total += 8;
					System.out.println(output + "\nYour total is $" + total);
					break;
				case "o":
					output += "\n10th Anniversary socks for $10";
					total += 10;
					System.out.println(output + "\nYour total is $" + total);
					break;
				}
			} 
			else {
				System.out.println(output + "\nYour total is $" + total);
			}
		} 
		else {
			System.out.print("Would you like Sockrockers socks today? (Y or N): ");
			purchaseItem = scan.next();
			if (purchaseItem.equalsIgnoreCase("Y")) {
				System.out.print("There are 3 types of socks:\nC : Children's socks\nW : Adult's white gym socks"
						+ "\nO : Adult's 10th anniversary orange socks\nWhich kind would you like?: ");
				sockStyle = scan.next();
				sockStyle = sockStyle.toLowerCase();
				switch (sockStyle) {
				case "c":
					output += "\nChildren's socks for $6";
					total += 6;
					System.out.println(output + "\nYour total is $" + total);
					break;
				case "w":
					output += "\nAdult's white gym socks socks for $8";
					total += 8;
					System.out.println(output + "\nYour total is $" + total);
					break;
				case "o":
					output += "\n10th Anniversary socks for $10";
					total += 10;
					System.out.println(output + "\nYour total is $" + total);
					break;

				}

			} 
			else {
				System.out.println(output + "\nYour total is $" + total);
			}

		}
	}
}
