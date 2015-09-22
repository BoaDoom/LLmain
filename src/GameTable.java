import java.util.*;

public class GameTable{
  private static int seatPositions;
  private Card[][] tableTop;

  public GameTable(int playerCount){
    seatPositions = playerCount;
    tableTop = new Card[PlayersList.MAXIMUM_PLAYER_COUNT][];


  }
  public void discardCard(int playerPostion, Card card){

  }

  public int choosePlay(Player player){
    Scanner keyboardIn = new Scanner(System.in);
    System.out.println("Choose which card to play, the remainder will be kept");
    System.out.println("Card 1: " + player.getCard(0).getName());
    System.out.println("Card 2: " + player.getCard(1).getName());
    int cardChoice = keyboardIn.nextInt();
    return cardChoice;
  }

}
