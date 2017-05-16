/* Cate Zwiercan
 * May 23, 2016
 * Building a zoo
 */
public class BuildAZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnimalStore PhillyZoo = new AnimalStore();
	

		// add 4 birds
		Birds penguin = new Birds("234","Black", "Antartica", "Penguin", false, true);
		Birds flamingo = new Birds("567","Pink", "Lake", "Flamingo", true, false);
		Birds peacock = new Birds("890","Blue", "Jungle", "Peacock", false, false);
		Birds tucan = new Birds("257","Multicolor", "Wild", "Tucan", true, false);
		
		//add 6 mammals
		Mammal dolphin = new Mammal("Dolphin", "176", "Gray", "ocean" );
		Mammal Lion = new Mammal("Lion", "473", "Golden", "jungle" );
		Mammal Monkey = new Mammal("Monkey", "834", "Brown", "jungle" );
		Mammal Tiger = new Mammal("Tiger", "094", "Black and Orange", "jungle" );
		Mammal Giraffe = new Mammal("Giraffe", "295", "Yellow", "safari" );
		Mammal Cheetah = new Mammal("Cheetah", "563", "Black and Yellow", "Savannah" );
		
		//print all the animals added
		penguin.printBirds();
		flamingo.printBirds();
		peacock.printBirds();
		tucan.printBirds(); 
		dolphin.printMammals();
		Lion.printMammals();
		Monkey.printMammals();
		Tiger.printMammals();
		Giraffe.printMammals();
		Cheetah.printMammals();
		
		
		// dead animal
		Giraffe.dies();
				
		//put all animals in zoo
		PhillyZoo.addAnimaltoZoo(penguin);
		PhillyZoo.addAnimaltoZoo(flamingo);
		PhillyZoo.addAnimaltoZoo(peacock);
		PhillyZoo.addAnimaltoZoo(tucan);
		PhillyZoo.addAnimaltoZoo(dolphin);
		PhillyZoo.addAnimaltoZoo(Lion);
		PhillyZoo.addAnimaltoZoo(Monkey);
		PhillyZoo.addAnimaltoZoo(Tiger);
		PhillyZoo.addAnimaltoZoo(Cheetah);
		PhillyZoo.addAnimaltoZoo(Giraffe);
		
		//dead animal 
		Cheetah.dies();
		
		//print animals
		System.out.println(penguin.toString());
		System.out.println(flamingo.toString());
		System.out.println(peacock.toString());
		System.out.println(tucan.toString());
		System.out.println(dolphin.toString());
		System.out.println(Lion.toString());
		System.out.println(Monkey.toString());
		System.out.println(Tiger.toString());
		System.out.println(Cheetah.toString());
	
		
		//remove the one that died
		PhillyZoo.removeAnimalFromZoo("563");
		
		//remove the one that leaves
		PhillyZoo.removeAnimalFromZoo("834");
		
		//print animals
		System.out.println(penguin.toString());
		System.out.println(flamingo.toString());
		System.out.println(peacock.toString());
		System.out.println(tucan.toString());
		System.out.println(dolphin.toString());
		System.out.println(Lion.toString());
		System.out.println(Tiger.toString());
		
}
}