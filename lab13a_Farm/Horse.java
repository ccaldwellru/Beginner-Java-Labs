public class Horse extends Animal{
	protected String type;
	
	public Horse(String _name, String _type){
		super(_name, "hay", "nay");
		this.type = _type;
	}
}