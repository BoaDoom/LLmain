import java.util.*;
public class BaronCard extends Card{

public static final String BARON_NAME = "Baron";
public static final int BARON_VALUE = 3;
public static final String BARON_DESC = "Baron lets you see switch with another player\nSelect another player to switch cards\nYou cannot select yourself";
public static final boolean BARON_SELF_TARGET = false;
private int selectedCard;
private Player selectedPlayer;
private ArrayList<Integer> excluded; //list of player numbers inelligible to be target of the action

  public BaronCard(){
    super(BARON_NAME, BARON_VALUE, BARON_DESC, BARON_SELF_TARGET);
  }
  public void action(Player activePlayer,  PlayersList players){
    excluded = new ArrayList<Integer>();
    System.out.println(BARON_DESC);
    selectedPlayer = selectPlayer(activePlayer, players, BARON_SELF_TARGET); //allows for targeting of cards
    if (selectedPlayer.getPlayerNumber() == activePlayer.getPlayerNumber() && !BARON_SELF_TARGET){    //if the only remaining target is self, and self isn't targetable
    }
    else{
      System.out.println("The selected player has a " + selectedPlayer.getCard(0).getName());
    }
  }

  // public void action(){
  //
  // }
}
