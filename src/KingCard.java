import java.util.*;
public class KingCard extends Card{

public static final String KING_NAME = "King";
public static final int KING_VALUE = 6;
public static final String KING_DESC = "King lets you try and guess another players' card\nSelect another player to guess their card\nYou cannot select yourself";

  public KingCard(){
    super(KING_NAME, KING_VALUE, KING_DESC);
  }
  public void action(Player activePlayer,  PlayersList players){
    @SuppressWarnings("resource")
	  Scanner keyboardIn = new Scanner(System.in);
    int selectedPlayer;
    System.out.println(KING_DESC);
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
