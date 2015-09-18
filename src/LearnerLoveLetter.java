


public class LearnerLoveLetter{

  public static PlayersList players;
  public static Deck deck;

  public static void main(String args[]){

    deck = new Deck();
    players.countingPlayers(); //asking for participating PlayersList and sending it to the players list object 'players'
    System.out.println(players.getTotalPlayers());
    players = new PlayersList();

  }



}
