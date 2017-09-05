/*
*
*
*/
public class TreasureTest{
	public static void main(String[] args){
	
	Treasure treasureObj = new Treasure("Key", "Golden Key", 1.5, 25);
	System.out.println(treasureObj.toString());
	
	treasureObj.setName("Ring");
	treasureObj.setDesc("Platinum ring");
	treasureObj.setWeight(2.5);
	treasureObj.setValue(25);
	
	/*
	System.out.println("name: " + treasureObj.getName());
	System.out.println("Description: " + treasureObj.getDesc());
	System.out.println("Weight: " + treasureObj.getWeight());
	System.out.println("Value: " + treasureObj.getValue());
	*/
	
	System.out.println(treasureObj.toString());
	}
}