/*
*
*
*/
public class TreasureTest{
	
	public static void main(String[] args){
		Treasure t1  = new Treasure("ruby", "gemstone", 25.0, 50);
		Treasure t11 = new Treasure("diamond", "giant gem", 250.0, 15000);
		Treasure t12 = new Treasure("fool's gold", "gold that is just a rock", 5.0, 0);
		Treasure t13 = new Treasure("vase", "ancient pottery", 10.0, 150);
		Treasure t14 = new Treasure("pickles", "food of the gods", 4.0, 15);
		Treasure t10 = new Treasure("ruby", "gemstone", 25.0, 50);
		System.out.print("t1==t1: ");
		System.out.println((t1==t1) == true?"Pass":"Fail");
		System.out.print("t1==t10: ");
		System.out.println((t1==t10) == false?"Pass":"Fail");
		System.out.print("t1==t11: ");
		System.out.println((t1==t11) == false?"Pass":"Fail");
		System.out.print("t1.equals(t1): ");
		System.out.println((t1.equals(t1)) == true?"Pass":"Fail");
		System.out.print("t1.equals(t11): ");
		System.out.println((t1.equals(t11) == false)?"Pass":"Fail");
		System.out.print("t1.equals(t12): ");
		System.out.println((t1.equals(t12) == false)?"Pass":"Fail");
		System.out.print("t1.equals(t13): ");
		System.out.println((t1.equals(t13) == false)?"Pass":"Fail");
		System.out.print("t1.equals(t14): ");
		System.out.println((t1.equals(t14) == false)?"Pass":"Fail");
		System.out.print("t1.equals(t10): ");
		System.out.println((t1.equals(t10)) == true?"Pass":"Fail");
		System.out.print("t1.compareTo(t1): ");
		System.out.println((t1.compareTo(t1) == 0)?"Pass":"Fail");
		System.out.print("t1.compareTo(t10): ");
		System.out.println((t1.compareTo(t10) == 0)?"Pass":"Fail");
		System.out.print("t1.compareTo(t11): ");
		System.out.println((t1.compareTo(t11) == -14950)?"Pass":"Fail");
		System.out.print("t1.compareTo(t14): ");
		System.out.println((t1.compareTo(t14) == 35)?"Pass":"Fail");
		System.out.println("\n");
		
		Explorer expOne = new Explorer("Jeff", "Starting room", t1, t1);
		Explorer expTwo = new Explorer("John", "Not Starting Room", t11, t13);
		Explorer expThree = new Explorer("Jacob", "Over there", t14, t13);
		
		System.out.print("Left pocket == right pocket: ");
		System.out.println((expOne.getLeftPocket() == expOne.getRightPocket()) == true?"Pass":"Fail");
		System.out.print("Left pocket != right pocket: ");
		System.out.println((expTwo.getLeftPocket() == expTwo.getRightPocket()) == false?"Pass":"Fail");
		System.out.print("Left pocket .equals right pocket: ");
		System.out.println((expOne.getLeftPocket().equals(expOne.getRightPocket())) == true?"Pass":"Fail");
		System.out.print("Left pocket !equals right pocket: ");
		System.out.println((expTwo.getLeftPocket().equals(expTwo.getRightPocket())) == false?"Pass":"Fail");
		System.out.print("Left pocket compareTo right pocket returns 0: ");
		System.out.println((expOne.getLeftPocket().compareTo(expOne.getRightPocket())) == 0?"Pass":"Fail");
		System.out.print("Left pocket compareTo right pocket returns positive number: ");
		System.out.println((expTwo.getLeftPocket().compareTo(expTwo.getRightPocket())) == 14850?"Pass":"Fail");
		System.out.print("Left pocket compareTo right pocket returns negative number: ");
		System.out.println((expThree.getLeftPocket().compareTo(expThree.getRightPocket())) == -135?"Pass":"Fail");
		
	}
}