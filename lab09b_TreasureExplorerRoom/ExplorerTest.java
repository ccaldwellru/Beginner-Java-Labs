/*
*
*
*/
public class ExplorerTest{
	public static void main(String[] args){
	
	Treasure treasureObj1 = new Treasure("Key", "Golden Key", 5.0, 25);
	Treasure treasureObj2 = new Treasure("Lint", "A piece of dust", 0.0, 0);
	Room roomObj1 = new Room("Start Room", "A cold, dark, damp place", treasureObj1);
	Explorer explorerObj = new Explorer("Dora", roomObj1, treasureObj1, treasureObj2);
	System.out.println(explorerObj.toString());

	}
}