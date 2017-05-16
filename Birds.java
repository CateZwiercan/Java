/* Cate Zwiercan
 * May 23, 2016
 * Building a zoo
 */
public class Birds extends Animal {

//properties
	String type;
	boolean flys;
	boolean swims;
	
//constructors
	//default
	public Birds(){
		type = "Pigeon";
		flys = true;
		swims = false;
	}
	
	//specific
	public Birds(String newType, boolean ifFlys, boolean ifSwims){
		type = newType;
		flys = ifFlys;
		swims = ifSwims;
	}
	
	//constructor with animal props
	public Birds(String newIDTag, String newColor, String newHabitat, String newType, boolean ifFlys, boolean ifSwims){
		type = newType;
		flys = ifFlys;
		swims = ifSwims;
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
	
	//flys getter
	public boolean ifFlys(){
		return flys;
	}
	
	//flys setter
	public void doesFly(boolean newFlys){
		flys = newFlys;
	}
	
	//swims getter
	public boolean ifSwims(){
		return swims;
	}
	
	//swims setter
	public void doesSwim (boolean newSwims){
		swims = newSwims;
	}
	
	//print birds
	public void printBirds(){
		
	System.out.println("Type: "+ type+ ", Does it fly: "+ flys + ", Does it swim: "+ swims+ ", ");
	System.out.println(toString());
	System.out.println();
	}
}
