import java.util.*;


public class LearnerLoveLetter{

  public static PlayersList players;
  public static Deck deck;
  public static int playerCount;


  public static void main(String args[]){

    deck = new Deck();
    playerCount = selectionChecker("How many players?", PlayersList.MINIMUM_PLAYER_COUNT, PlayersList.MAXIMUM_PLAYER_COUNT, null);     //asking for participating PlayersList and sending it to  'players'
    players = new PlayersList(playerCount);

    while(true){     //start of a round
      deck.shuffle();
      for(int i=0; i < playerCount; i++){    // deals out one card per person to start
        players.playersArray.get(i).takeCard(deck.deal());
      }
      while(players.checkActive()){     //starting of player rotation
        Player currentPlayer = (players.playersArray.get(players.getTurn()));
        currentPlayer.setShieldOff();   //turns off handmaid shield
        if (currentPlayer.getActive()){    //checks if player is still in the round then executes a card deal and play if true
          currentPlayer.takeCard(deck.deal());     //deals the player a second card
          Card chosenCard = currentPlayer.choosePlay();    //makes player choose which card to keep and which to play
          chosenCard.action(currentPlayer, players);
        }
        players.endOfTurn();


        if (deck.getDeckSize() == 0){
          System.out.println("You ran out of cards");
          break;
        }
      }
      for(int i=0; i < playerCount; i++){

      }


      }
      //----insert a check for who is still active and award them a point if they are the only remaining
      //----insert a check for who is still active and if there is more than one, compare final card value, award point to highest
          //----aslo eventually add a check incase the final remaining players have identical final card values
        for(int i=0; i < playerCount; i++){    // deals out one card per person to start
          players.playersArray.get(i).setActive();    //turns players who were eliminated back on
          players.playersArray.get(i).discardCard(0);   //discards remaining card
          players.playersArray.get(i).clearDiscard();   //empties personal discard array
          players.playersArray.get(i).setShieldOff();   //turns off handmaid shield
        }

      }


  }

  public static int selectionChecker(String prompt, int min, int max, Integer excluded){ //promt should be worded as "Select a number between"
    int testingNumber;
    Scanner keyboardIn = new Scanner(System.in);
    System.out.print(prompt + " (between " + min + " and " + max + ")");
    if (excluded == null){
      System.out.println();
    }
    else{
      System.out.println(" and excluding " + excluded);
    }
    //checking for integer
    try{
      testingNumber = Integer.parseInt(keyboardIn.nextLine());
    }
    catch(Exception e){
      System.out.println("That was not even a whole number... try again");
      return selectionChecker(prompt, min, max, excluded);
    }
    //checking for correct number of players
    if (testingNumber < min || testingNumber > max){
      System.out.println("That was not between " + min + " and " + max + "... try again");
      return selectionChecker(prompt, min, max, excluded);
    }
      //keyboardIn.close(); //resolve 'memory leak' issue
    else{
      try{
        if (excluded == testingNumber){
          System.out.println(testingNumber + " is specifically excluded from your selection");
          return selectionChecker(prompt, min, max, excluded);
        }
      }
      catch(Exception e){
      }
      return testingNumber;
    }

  }
}
