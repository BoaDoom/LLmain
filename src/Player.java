import java.util.*;

public class Player{
  private int playerNumber;
  private String playerName;
  private ArrayList<Card> currentHand;
  private ArrayList<Card> personalDiscard;
  private int score;
  public boolean active;

  public Player(int playerNumber){
    active = true;
    this.playerName = "Player Number " + (playerNumber + 1);
    this.playerNumber = playerNumber;
    currentHand = new ArrayList<Card>();
    personalDiscard = new ArrayList<Card>();
  }
  public void takeCard(Card card){
    currentHand.add(card);
  }

  public void discardCard(int cardChoice){
    personalDiscard.add(currentHand.remove(cardChoice));
  }

  public String getName(){
    return playerName;
  }
  public Card getCurrentCard(int num){
    return currentHand.get(num);
  }


}
