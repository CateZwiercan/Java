/* Cate Zwiercan
 * May 23, 2016
 * Building a zoo
 */
import java.util.HashMap;
public class AnimalStore {

	//properties
	HashMap AnimalStore = new HashMap();
	
	//methods
	
	//add animal
	public boolean addAnimaltoZoo(Animal newAnimal){
		if (newAnimal.isAlive() == true){
			AnimalStore.put(newAnimal.idTag, newAnimal);
			System.out.println("Animal "+ newAnimal.idTag + " has been added");
			newAnimal.habitat = "zoo";
			return true;
		}
		else {
			System.out.println("Sorry Animal "+ newAnimal.idTag+ " is dead and you cannot add a dead animal to our beautiful zoo.");
			return false;
	
		}
		}
	
	// remove animal
	public boolean removeAnimalFromZoo(String idTag){
		
			if (AnimalStore.containsKey(idTag)){
				AnimalStore.remove(idTag);
				System.out.println("Animal "+ idTag+ " has been removed");
				return true;
				}
		else {
			System.out.println("Sorry you can't remove Animal "+ idTag);
			return false;
			}
	
	}
	//print 
	public void printAllAnimals(){
		Animal temp;
		for(Object key: AnimalStore.keySet()){
			temp = (Animal)AnimalStore.get(key);
			temp.toString();
		}
	}
	
	}
	

