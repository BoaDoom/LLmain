import java.util.*;
public class PrincessCard extends Card{

public static final String PRINCESS_NAME = "Princess";
public static final int PRINCESS_VALUE = 8;
public static final String PRINCESS_DESC = "Princess lets you try and guess another players' card\nSelect another player to guess their card\nYou cannot select yourself";

  public PrincessCard(){
    super(PRINCESS_NAME, PRINCESS_VALUE, PRINCESS_DESC);
  }
  public void action(Player activePlayer,  PlayersList players){
    @SuppressWarnings("resource")
	  Scanner keyboardIn = new Scanner(System.in);
    int selectedPlayer;
    System.out.println(PRINCESS_DESC);
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
