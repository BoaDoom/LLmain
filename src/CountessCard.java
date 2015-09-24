import java.util.*;
public class CountessCard extends Card{

public static final String COUNTESS_NAME = "Countess";
public static final int COUNTESS_VALUE = 7;
public static final String COUNTESS_DESC = "Countess lets you try and guess another players' card\nSelect another player to guess their card\nYou cannot select yourself";

  public CountessCard(){
    super(COUNTESS_NAME, COUNTESS_VALUE, COUNTESS_DESC);
  }
  public void action(Player activePlayer,  PlayersList players){
    @SuppressWarnings("resource")
	  Scanner keyboardIn = new Scanner(System.in);
    int selectedPlayer;
    System.out.println(COUNTESS_DESC);
    for (int i=0; i < players.playersArray.size(); i++){ //prints list of availible targets
      if (activePlayer.getPlayerNumber() != players.playersArray.get(i).getPlayerNumber()){
        System.out.println((i+1) +": " + players.playersArray.get(i).getName());
      }
      else{
        System.out.println((i+1) +": thats you");
      }
    }
    selectedPlayer = (keyboardIn.nextInt() - 1);
    System.out.println("Which card do you think they have?");


  }

  // public void action(){
  //
  // }
}
