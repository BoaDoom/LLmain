import java.util.*;
public class PriestCard extends Card{

public static final String PRIEST_NAME = "Priest";
public static final int PRIEST_VALUE = 2;
public static final String PRIEST_DESC = "Priest lets you try and guess another players' card\nSelect another player to guess their card\nYou cannot select yourself";

  public PriestCard(){
    super(PRIEST_NAME, PRIEST_VALUE, PRIEST_DESC);
  }
  public void action(Player activePlayer,  PlayersList players){
    @SuppressWarnings("resource")
	  Scanner keyboardIn = new Scanner(System.in);
    int selectedPlayer;
    System.out.println(PRIEST_DESC);
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
