import java.util.*;

public class Player{
  private int playerNumber;
  private String playerName;
  private ArrayList<Card> currentHand;
  private int score;
  private boolean active;

  public Player(int playerNumber){
    active = true;
    this.playerName = "Player Number " + (playerNumber + 1);
    this.playerNumber = playerNumber;
    currentHand = new ArrayList<Card>();
  }
  public void takeCard(Card card){
    currentHand.add(card);
  }

  public void discardCard(int cardChoice){
    currentHand.remove(cardChoice);
  }

  public String getName(){
    return playerName;
  }

  public Card getCard(int num){
    return currentHand.get(num);
  }

  public void playCard(int num){
    currentHand.remove(num);
  }

  public void setActive(boolean boo){
    if (boo){
      active = true;
    }
    else{
      active = false;
    }
  }

  public boolean getActive(){
    if (active){
      return true;
    }
    else{
      return false;
    }
  }


}
