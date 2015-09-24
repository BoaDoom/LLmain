import java.util.*;
public class GuardCard extends Card{

public static final String GUARD_NAME = "Guard";
public static final int GUARD_VALUE = 1;
public static final String GUARD_DESC = "Guard lets you try and guess another players' card\nSelect another player to guess their card\nYou cannot select yourself, or guess the card as Guard";
private int selectedCard;
private Player selectedPlayer;

  public GuardCard(){
    super(GUARD_NAME, GUARD_VALUE, GUARD_DESC);
  }
  public void action(Player activePlayer,  PlayersList players){
    @SuppressWarnings("resource")
	  Scanner keyboardIn = new Scanner(System.in);
    System.out.println(GUARD_DESC);
    for (int i=0; i < players.playersArray.size(); i++){ //prints list of availible targets from array
      if (activePlayer.getPlayerNumber() != players.playersArray.get(i).getPlayerNumber()){   // checks to see if you are the listed player
        if (players.playersArray.get(i).getActive()){ //checks too see if listed player is active
          System.out.println((i+1) +": " + players.playersArray.get(i).getName()); //prints player on list's name
        }
        else{
          System.out.println((i+1) +": player is eliminated");
        }
      }
      else{
        System.out.println((i+1) +": Yourself");
      }
    }
    selectedPlayer = players.playersArray.get(keyboardIn.nextInt() - 1);
    System.out.println("Which card do you think they have?");
    System.out.println("2. Priest\n3. Baron\n4. Handmaid\n5. Prince\n6. King\n7. Countess\n8. Princess");
    selectedCard = LearnerLoveLetter.selectionChecker("choose only one", 2, 8, null);
    if (selectedCard == selectedPlayer.getCard(0).getValue()){ //compares selected card
      System.out.println("YOU GUESSED CORRECTLY!");
      System.out.println(selectedPlayer.getName() + " is eliminated from the round");
      selectedPlayer.eliminate();
    }
    else{
      System.out.println("You guessed incorrectly");
    }

  }

  // public void action(){
  //
  // }
}
