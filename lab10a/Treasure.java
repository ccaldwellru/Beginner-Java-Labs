/*
*
*
*
*/

public class Treasure{
	private String name;
	private String description;
	private double weight;
	private int value;
	
	public Treasure(String _name, String _description, double _weight, int _value){
		this.name = _name;
		this.description = _description;
		this.weight = _weight;
		this.value = _value;
	}
	
	public void setName(String namePassed){
		this.name = namePassed;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setDesc(String descPassed){
		this.description = descPassed;
	}
	
	public String getDesc(){
		return this.description;
	}
	
	public void setWeight(double weightPassed){
		this.weight = weightPassed;
	}
	
	public double getWeight(){
		return this.weight;
	}
	
	public void setValue(int valuePassed){
		this.value = valuePassed;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public boolean equals(Treasure objPassed){
		return (this.name.equals(objPassed.name) && this.description.equals(objPassed.description)
		&& this.value == objPassed.value && this.weight == objPassed.weight);
	}
	
	public int compareTo(Treasure objPassed){
		return (this.value - objPassed.value);
	}
	
	public String toString(){
		String result = "\nTreasure Name: " + this.name + "\nTreasure Description: " + this.description 
						+ "\nTreasure Weight: " + this.weight + "\nTreasure Value: " + this.value;
		return result;
	}
}