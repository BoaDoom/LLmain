import java.util.*;
public class GuardCard extends Card{

public static final String GUARD_NAME = "Guard";
public static final int GUARD_VALUE = 1;
public static final String GUARD_DESC = "Guard lets you try and guess another players' card";

  public GuardCard(){
    super(GUARD_NAME, GUARD_VALUE, GUARD_DESC);
  }
  public void action(Player activePlayer, List<Player> playersArray){
    @SuppressWarnings("resource")
	   Scanner keyboardIn = new Scanner(System.in);
    int selectedPlayer;
    System.out.println(GUARD_DESC + "\nSelect another player and guess their card" + "\nYou cannot select yourself");

    for (int i=0; i < playersArray.size(); i++){ //prints list of availible targets
      if (activePlayer.getPlayerNumber() != playersArray.get(i).getPlayerNumber()){
        System.out.println((i+1) +": " + playersArray.get(i).getName());
      }
      else{
        System.out.println((i+1) +": thats you");
      }
    }
    selectedPlayer = (keyboardIn.nextInt() - 1);
    System.out.println("other player has a " + playersArray.get(selectedPlayer).getCard(0).getName());


  }

  // public void action(){
  //
  // }
}
