/*
*
*
*
*/

public class Treasure{
	private String Name;
	private String Description;
	private double Weight;
	private int Value;
	
	public Treasure(String _name, String _description, double _weight, int _value){
		this.Name = _name;
		this.Description = _description;
		this.Weight = _weight;
		this.Value = _value;
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
	
	public void setWeight(double weightPassed){
		this.Weight = weightPassed;
	}
	
	public double getWeight(){
		return this.Weight;
	}
	
	public void setValue(int valuePassed){
		this.Value = valuePassed;
	}
	
	public int getValue(){
		return this.Value;
	}
	
	public String toString(){
		String result = "\nTreasure Name: " + this.Name + "\nTreasure Description: " + this.Description 
						+ "\nTreasure Weight: " + this.Weight + "\nTreasure Value: " + this.Value;
		return result;
	}
}