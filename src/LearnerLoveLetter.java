import java.util.*;


public class LearnerLoveLetter{

  public static PlayersList players;
  public static Deck deck;
  public static int playerCount;


  public static void main(String args[]){

    deck = new Deck();
    playerCount = InputCheck.check("How many players?", PlayersList.MINIMUM_PLAYER_COUNT, PlayersList.MAXIMUM_PLAYER_COUNT, null);     //asking for participating PlayersList and sending it to  'players'
    players = new PlayersList(playerCount);

    while(true){     //start of a round
      deck.shuffle();
      for(int i=0; i < playerCount; i++){    // deals out one card per person to start
        players.playersArray.get(i).takeCard(deck.deal());
      }
      while(players.checkActive()){     //starting of player rotation
        Player currentPlayer = players.playersArray.get(players.getTurn());
        currentPlayer.setShieldOff();   //turns off handmaid shield
        if (currentPlayer.getActive()){    //checks if player is still in the round then executes a card deal and play if true
          currentPlayer.takeCard(deck.deal());     //deals the player a second card
          currentPlayer.choosePlay().action(currentPlayer, players);    //forces player to choose which card to play, then executes that cards action
        }
        players.endOfTurn();    //turn order counter

        if (deck.getDeckSize() == 0){
          System.out.println("You ran out of cards");
          break;
        }
      }
      players.winnerCalc();
      }

      for(int i=0; i < playerCount; i++){
        System.out.println("player " + (1+i) + " score: " + players.playersArray.get(i).getScore());
        players.playersArray.get(i).setActive();    //turns players who were eliminated back on
        players.playersArray.get(i).discardCard(0);   //discards remaining card
        players.playersArray.get(i).clearDiscard();   //empties personal discard array
        players.playersArray.get(i).setShieldOff();   //turns off handmaid shield
        System.out.println("player " + (i+1) + "score: " + players.playersArray.get(i).getScore());
        System.out.println("win requirement" + players.getWinRequire());
        if (players.playersArray.get(i).getScore() == players.getWinRequire()){
          System.out.println(players.playersArray.get(i).getName() + " has won the game!");
          break;
        }
        //----add correct turn order reset, with winner being first to go
      }

    }


  }


}
