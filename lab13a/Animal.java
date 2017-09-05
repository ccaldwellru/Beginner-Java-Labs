abstract class Animal{
	protected String name;
	protected String food;
	protected String sound;
	
	public Animal(String _name, String _food, String _sound){
		this.name = _name;
		this.food = _food;
		this.sound = _sound;
	}
	public String speak(){
		return this.sound;
	}
	
	public void eat(String[] foods){
		
	}
	
	public String toString(){
		String result = this.name + " eats " + this.food + " says " + this.sound;
		return result;
	}
}