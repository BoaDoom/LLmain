import java.util.*;
public class KingCard extends Card{

public static final String KING_NAME = "King";
public static final int KING_VALUE = 6;
public static final String KING_DESC = "King forces you and another player into a faceoff, showing eachother your cards\nwhichever card is the lowest is out of the round";
public static final boolean KING_SELF_TARGET = false;
private int selectedCard;
private Player selectedPlayer;
private ArrayList<Integer> excluded; //list of player numbers inelligible to be target of the action

  public KingCard(){
    super(KING_NAME, KING_VALUE, KING_DESC, KING_SELF_TARGET);
  }
  public void action(Player activePlayer,  PlayersList players, Deck deck){
    excluded = new ArrayList<Integer>();
    System.out.println(KING_DESC);
    selectedPlayer = selectPlayer(activePlayer, players, KING_SELF_TARGET); //allows for targeting of cards
    if (selectedPlayer.getPlayerNumber() == activePlayer.getPlayerNumber() && !KING_SELF_TARGET){    //if the only remaining target is self, and self isn't targetable
    }
    else{
      System.out.println("You have a " + activePlayer.getCard());
      System.out.println("and the selected player has a " + selectedPlayer.getCard());
      if (activePlayer.getCard(0).getValue() > selectedPlayer.getCard(0).getValue()){
        System.out.println("Your card is larger. you win and your opponent is knocked out");
        selectedPlayer.eliminate();
      }
      else if (activePlayer.getCard(0).getValue() < selectedPlayer.getCard(0).getValue()){
        System.out.println("Their card is larger. Your opponent wins and you are knocked out");
        activePlayer.eliminate();
      }
      else if (activePlayer.getCard(0).getValue() == selectedPlayer.getCard(0).getValue()){
        System.out.println("You both have the same card, no one is knocked out");
      }
    }
  }

  // public void action(){
  //
  // }
}
