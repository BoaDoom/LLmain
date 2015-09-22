import java.util.*;

public class GameTable{
  private static int seatPositions;

  public GameTable(int playerCount){
    seatPositions = playerCount;


  }
  public void playCard(Player player, Card card){


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
