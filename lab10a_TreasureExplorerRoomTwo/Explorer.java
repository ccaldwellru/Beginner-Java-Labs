/*
*
*
*
*/

public class Explorer{
	private String name;
	private String roomIn;
	private Treasure leftPocket;
	private Treasure rightPocket;
	
	public Explorer(String _name, String r1, Treasure t1, Treasure t2){
		this.name = _name;
		this.roomIn = r1;
		this.leftPocket = t1;
		this.rightPocket = t2;
	}
	
	public void setName(String namePassed){
		this.name = namePassed;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setRoom(String roomPassed){
		this.roomIn = roomPassed;
	}
	
	public String getRoom(){
		return this.roomIn;
	}
	
	public void setLeftPocket(Treasure treasurePassed){
		this.leftPocket = treasurePassed;
	}
	
	Treasure getLeftPocket(){
		return this.leftPocket;
	}
	
	public void setRightPocket(Treasure treasurePassed){
		this.rightPocket = treasurePassed;
	}
	
	Treasure getRightPocket(){
		return this.rightPocket;
	}
	
	public String toString(){
		String result = "\nExplorer Name: " + this.name + "\nRoom In: " 
						+ this.roomIn + "\nLeft Pocket Contains: " + this.leftPocket.getName()
						+ "\nRight Pocket Contains: " + this.rightPocket.getName()
						+ "\n" + this.roomIn;
		return result;
	}
}