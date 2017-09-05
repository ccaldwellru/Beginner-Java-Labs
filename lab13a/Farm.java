public class Farm{
	
	public static void main(String[] args){
		Animal[] pen = new Animal[3];
		Animal pig = new Pig("Wilbur");
		pen[0] = pig;
		Animal mrEd = new Horse("Mr. Ed", "Show Horse");
		pen[1] = mrEd;
		Animal secretariat = new Horse("Secretariat", "Race Horse");
		pen[2] = secretariat;
		for(Animal a : pen){
			System.out.println(a);
		}
		for(Animal a : pen){
			System.out.println(a.speak());
		}
		
	}
}