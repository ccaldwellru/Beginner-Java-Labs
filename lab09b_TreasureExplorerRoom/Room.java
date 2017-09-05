/*
*
*
*
*/

public class Room{
	private String Name;
	private String Description;
	private double Weight;
	private Treasure treasureObj;
	
	public Room(String _name, String _description, Treasure t1){
		this.Name = _name;
		this.Description = _description;
		this.treasureObj = t1;
	}
	
	public void setName(String namePassed){
		this.Name = namePassed;
	}
	
	public String getName(){
		return this.Name;
	}
	
	public void setDesc(String descPassed){
		this.Description = descPassed;
	}
	
	public String getDesc(){
		return this.Description;
	}
	
	public void setTreasure(Treasure treasurePassed){
		this.treasureObj = treasurePassed;
	}
	
	Treasure getTreasure(){
		return this.treasureObj;
	}
	
	public String toString(){
		String result = "\nRoom Name: " + this.Name + "\nRoom Description: " 
						+ this.Description + "\nTreasure Contained: " + this.treasureObj.getName()
						+ "\n" + this.treasureObj;
		return result;
	}
}