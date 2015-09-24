import java.util.*;
public class BaronCard extends Card{

public static final String BARON_NAME = "Baron";
public static final int BARON_VALUE = 3;
public static final String BARON_DESC = "Baron lets you try and guess another players' card\nSelect another player to guess their card\nYou cannot select yourself";

  public BaronCard(){
    super(BARON_NAME, BARON_VALUE, BARON_DESC);
  }
  public void action(Player activePlayer,  PlayersList players){
    @SuppressWarnings("resource")
	  Scanner keyboardIn = new Scanner(System.in);
    int selectedPlayer;
    System.out.println(BARON_DESC);
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
