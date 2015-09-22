


public class LearnerLoveLetter{

  public static PlayersList players;
  public static Deck deck;
  public static GameTable gameTable;
  public static int playerCount;


  public static void main(String args[]){

    deck = new Deck();
    playerCount = PlayersList.countingPlayers(); //asking for participating PlayersList and sending it to the players list object 'players'
    gameTable = new GameTable(playerCount);
    players = new PlayersList(playerCount);

    while(true){ //start of a round
      deck.shuffle();
      for(int i=0; i < playerCount; i++){ // deals out one card per person to start
        players.playersArray.get(i).takeCard(deck.deal());
      }
      while(players.checkActive()){ //starting of player rotation
        Player currentPlayer = (players.playersArray.get(players.getTurn()));
        if (currentPlayer.getActive()){ //checks if player is still in the round then executes a card deal and play if true
          currentPlayer.takeCard(deck.deal()); //deals the player a second card
          currentPlayer.choosePlay().action(currentPlayer, players.playersArray); //makes player choose which card to keep and which to play and then executes power
          players.endOfTurn();
          System.out.println("end of turn turn label: " + players.getTurn());
        }
        else{
          players.endOfTurn();
        }

        if (deck.getDeckSize() == 0){
          System.out.println("You ran out of cards");
          break;
        }
      }
      //----insert a check for who is still active and award them a point if they are the only remaining
      //----insert a check for who is still active and if there is more than one, compare final card value, award point to highest
          //----aslo eventually add a check incase the final remaining players have identical final card values

        break;
      }


  }



}
