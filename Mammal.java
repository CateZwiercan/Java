/* Cate Zwiercan
 * May 23, 2016
 * Building a zoo
 */
public class Mammal extends Animal {
	
// properties 
	String type;

//constructors
	//default
	public Mammal(){
		type = "Elephant";
	}
	
	//specific
	public Mammal( String newType){
		type = newType;
	}
	
	// animal properties
	public Mammal (String newType, String newIDTag, String newColor, String newHabitat){
		type = newType;
		setIDTag(newIDTag);
		setColor(newColor);
		setHabitat(newHabitat);
	}
	
	//methods
	
	//type getter
	public String getType(){
		return type;
	}
	
	//type setter
	public void setType(String newType){
		type = newType;
	}
	
	//string print mammals
	public void printMammals(){
	System.out.println("Type: "+ type+ ", ");
	System.out.println(toString());
	System.out.println();
	}
}
