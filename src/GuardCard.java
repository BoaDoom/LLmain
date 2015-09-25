import java.util.*;
public class GuardCard extends Card{

public static final String GUARD_NAME = "Guard";
public static final int GUARD_VALUE = 1;
public static final String GUARD_DESC = "Guard lets you try and guess another players' card\nSelect another player to guess their card\nYou cannot select yourself, or guess the card as Guard";
public static final boolean GUARD_SELF_TARGET = false;
private int selectedCard;
private Player selectedPlayer;
private ArrayList<Integer> excluded; //list of player numbers inelligible to be target of the action

  public GuardCard(){
    super(GUARD_NAME, GUARD_VALUE, GUARD_DESC, GUARD_SELF_TARGET);
  }
  public void action(Player activePlayer,  PlayersList players, Deck deck){
    excluded = new ArrayList<Integer>();
    System.out.println(GUARD_DESC);
    selectedPlayer = selectPlayer(activePlayer, players, GUARD_SELF_TARGET); //allows for targeting of cards
    if (selectedPlayer.getPlayerNumber() == activePlayer.getPlayerNumber() && !GUARD_SELF_TARGET){    //if the only remaining target is self, and self isn't targetable
    }
    else{        //starts the unique action of the card
      System.out.println("Which card do you think they have?");
      System.out.println("2. Priest\n3. Baron\n4. Handmaid\n5. Prince\n6. King\n7. Countess\n8. Princess");
      selectedCard = InputCheck.check("choose only one", 2, 8, null);
      if (selectedCard == selectedPlayer.getCard(0).getValue()){ //compares selected card
        System.out.println("YOU GUESSED CORRECTLY!");
        System.out.println(selectedPlayer.getName() + " is eliminated from the round");
        selectedPlayer.eliminate();
      }
      else{
        System.out.println("You guessed incorrectly");
      }
    }

  }

  // public void action(){
  //
  // }
}
