/*
*
*
*/
public class RoomTest{
	public static void main(String[] args){
	
	Treasure treasureObj = new Treasure("Key", "Golden Key", 5.0, 25);
	Room roomObj = new Room("Start Room", "A cold, dark, damp place", treasureObj);
	System.out.println(roomObj.toString());
	
	treasureObj.setName("Lint");
	treasureObj.setDesc("A Piece of dust");
	treasureObj.setWeight(0.0);
	treasureObj.setValue(0);
	roomObj.setName("Davis 225");
	roomObj.setDesc("Computer Lab");
	roomObj.setTreasure(treasureObj);
	System.out.println(roomObj.toString());
	/*
	System.out.println("name: " + treasureObj.getName());
	System.out.println("Description: " + treasureObj.getDesc());
	System.out.println("Weight: " + treasureObj.getWeight());
	System.out.println("Value: " + treasureObj.getValue());
	*/
	
	
	}
}