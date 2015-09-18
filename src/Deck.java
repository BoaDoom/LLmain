import java.util.*;

public class Deck{

  public static final int GUARD_NUMBER = 5;
  public static final int PRIEST_NUMBER = 2;
  public static final int BARON_NUMBER = 2;
  public static final int HANDMAID_NUMBER = 2;
  public static final int PRINCE_NUMBER = 2;
  public static final int KING_NUMBER = 1;
  public static final int COUNTESS_NUMBER = 1;
  public static final int PRINCESS_NUMBER = 1;

  private ArrayList<Card> cards;
  private ArrayList<Card> discards;

  public Deck(){
    for (int i=0; i < GUARD_NUMBER; i++){
      cards.add(new GuardCard());
    }
    for (int i=0; i < PRIEST_NUMBER; i++){
      cards.add(new PriestCard());
    }
    for (int i=0; i < BARON_NUMBER; i++){
      cards.add(new BaronCard());
    }
    for (int i=0; i < HANDMAID_NUMBER; i++){
      cards.add(new HandmaidCard());
    }
    for (int i=0; i < PRINCE_NUMBER; i++){
      cards.add(new PrinceCard());
    }
    for (int i=0; i < KING_NUMBER; i++){
      cards.add(new KingCard());
    }
    for (int i=0; i < COUNTESS_NUMBER; i++){
      cards.add(new CountessCard());
    }
    for (int i=0; i < PRINCESS_NUMBER; i++){
      cards.add(new PrincessCard());
    }
  }
  //returns the top card of the deck, removing it from the deck and placing it in discards
  public Card deal(){
    Card card = cards.remove(0);
    discards.add(card);
    return card;
  }
  // public Card deal(){
  //   return discards.add(cards.remove(0));
  // }

  public void shuffle(){

    Random ran = new Random();
    for (int i=0; i < discards.size(); i++){
      cards.add(discards.remove(ran.nextInt(discards.size())));
    }
    ArrayList<Card> tempDeck = new ArrayList<Card>();
    for (int i=0; i < cards.size(); i++){
      tempDeck.add(cards.remove(ran.nextInt(cards.size())));
    }
    cards = tempDeck;
  }

}
