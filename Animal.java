/* Cate Zwiercan
 * May 23, 2016
 * Building a zoo
 */
public class Animal {

// properties
	
	String idTag;
	String color; 
	String habitat;
	boolean respiration;
	
	
// constructors
	//default
	public Animal(){
		idTag= "123";
		color= "black";
		habitat = "land";
		respiration = true;
	}
	
	//specific attributes 
	public Animal(String newIDTag, String newColor, String newHabitat){
		idTag = newIDTag;
		color= newColor;
		habitat = newHabitat; 
		respiration = true;
	}
	
	
//methods
	//id tag getter
	public String getIDTag(){
		return idTag;
	}
	
	//id tag setter
	public void setIDTag(String newIDTag){
		idTag = newIDTag;
	}
	
	//color getter
	public String getColor(){
		return color;
	}
	
	//color setter
	public void setColor(String newColor){
		color = newColor;
	}
	
	//habitat getter
	public String getHabitat(){
		return habitat;
	}
	
	//habitat setter
	public void setHabitat(String newHabitat){
		habitat = newHabitat;
	}
	
	//respiration getter
	public boolean isAlive(){
		return respiration;
	}
	
	//respiration setter
	public void dies(){
		respiration = false;
		System.out.println("This animal has died.");
	}
	//String toString
	public String toString(){
		return  "ID Tag: "+ idTag + ", Color: "+ color + ", Habitat: "+ habitat + ", Respiration: " + respiration;
	}
}
