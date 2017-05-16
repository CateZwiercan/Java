/* Cate Zwiercan 
 * 3/7/16
 * this will stimulate a rock paper scissors game
 */
import java.util.Random; 
import java.util.Scanner;
public class rockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String compItem="";
		String playerItem="";
		String answer ="";
		int compWins=0;
		int playerWins=0;
	Random randitem= new Random();
	//welcome the user
		Scanner input= new Scanner(System.in);
		System.out.println("Welcome to Rock, Paper Scissors! Play a quick game and see if you beat the computer.\n The choices are Rock(1), Paper(2), or Scissors (3). ");
		
	// ask for which item they want
	while ( compWins <2 && playerWins < 2){
		
		System.out.print("Enter the number of your item of choice: ");
		int item= input.nextInt();
		
	// switch for item	
		switch (item) {
		case 1: playerItem= "Rock";
				break;
		case 2: playerItem = "Paper";
				break;
		case 3: playerItem = "Scissors";
				break;
		}
	// get random number for another item
		int compChoice= randitem.nextInt(3)+1;
		
	// switch for item
		switch (compChoice) {
		case 1: compItem= "Rock";
				break;
		case 2: compItem = "Paper";
				break;
		case 3: compItem = "Scissors";
				break;
		}
	// if statement checking who one
	//print what was chosen and who one
		if (item == compChoice){
			System.out.println("You chose "+ playerItem+ " and your opponent chose "+ compItem+". It looks like it's a tie!");
		}
		else if (item == 1 && compChoice== 2 || item == 2 && compChoice== 3 || item == 3 && compChoice==1) {
			System.out.println("You chose "+ playerItem+ " and computer chose "+ compItem+". Computer won!");
			compWins++;
		}
		else if (item == 1  && compChoice==3  || item == 3  && compChoice==2 || item == 2  && compChoice==1) {
			System.out.println("You chose "+ playerItem+ " and computer chose "+ compItem+". You won!");
			 playerWins++;
		}
		// see if they want to play again
		
		
		System.out.println("Let's go to the next round!");
		
	if (compWins >=2){
		System.out.println("Sorry the Computer won twice... GAME OVER! ");
			}
	else if (playerWins >= 2){
		System.out.println("You won twice... GAME OVER! Congrats!");
			}
	}  
	System.out.println("Thanks for playing!");
	input.close(); 

}
	
}
