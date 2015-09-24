import java.util.*;

public class Player{
  private boolean active;
  private boolean shielded;
  private int score;
  private int playerNumber;
  private String playerName;
  private ArrayList<Card> currentHand;
  private ArrayList<Card> discardPile;

  public Player(int playerNumber){
    active = true;
    this.playerName = "Player Number " + (playerNumber + 1);
    this.playerNumber = playerNumber;
    currentHand = new ArrayList<Card>();
    discardPile = new ArrayList<Card>();
  }


  public Card choosePlay(){
    Scanner keyboardIn = new Scanner(System.in);
    System.out.println("===============================");
    System.out.println(playerName + " it is your turn");
    System.out.println("Choose which card to play, the remainder will be kept");
    System.out.println("Card 1: " + getCard(0).getName());
    System.out.println("Card 2: " + getCard(1).getName());
    return discardCard(keyboardIn.nextInt()-1);
  }

  public Card discardCard(int cardChoice){
    Card card = currentHand.remove(cardChoice);
    System.out.println("Discarded: " + card.getName());
    discardPile.add(card);
    return card;
  }

  public void takeCard(Card card){
    currentHand.add(card);
  }


  public boolean getActive(){
    if (active){
      return true;
    }
    else{
      return false;
    }
  }

  public void setActive(){
    active = true;
  }

  public void eliminate(){
    active = false;
  }

  public String getName(){
    return playerName;
  }

  public int getPlayerNumber(){
    return playerNumber;
  }

  public Card getCard(int num){
    return currentHand.get(num);
  }

  public void setShieldOn(){
    shielded = true;
  }
  public void setShieldOff(){
    shielded = false;
  }

  public void clearDiscard(){
    discardPile.clear();
  }



}
