


public class LearnerLoveLetter{

  public static PlayersList players;
  public static Deck deck;
  public static int playerCount;


  public static void main(String args[]){

    deck = new Deck();
    playerCount = PlayersList.countingPlayers(); //asking for participating PlayersList and sending it to the players list object 'players'
    players = new PlayersList(playerCount);

    while(true){ //start of a round
      deck.shuffle();
      for(int i=0; i < playerCount; i++){ // deals out one card per person to start
        players.playersArray.get(i).takeCard(deck.deal());
        }
      for(int i=0; i < playerCount; i++){
        System.out.println(players.playersArray.get(i).getCurrentCard(0).getName());
        }
      while(true){ //starting of actual round rotation, check to make sure minimum players are active



        players.playersArray.get(i).takeCard(deck.deal());
      }


      break;

      }


  }



}
