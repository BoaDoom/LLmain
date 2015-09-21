import java.util.*;

public class PlayersList
{
  public static final int MINIMUM_PLAYER_COUNT = 2;
  public static final int MAXIMUM_PLAYER_COUNT = 4;
  public static final int PLAYER_COUNT_EXTRA_RULE = 2; //the number of players where an extra set of rules is activated
  private static int totalPlayerNumber; //final player count
  public int lastWinner = 0; //playernumber of who won previous round, defaults to player 1 at posision 0
  public List<Player> playersArray;

  //constructor
  public PlayersList(int totalPlayerNumber){
    playersArray = new ArrayList<Player>();
    PlayersList.totalPlayerNumber = totalPlayerNumber;
    for (int i = 0; i < totalPlayerNumber ; i++){
      playersArray.add(new Player(i));
    }
  }





  //asks for a number of players and checks for integer, then min and max
  public static int countingPlayers(){
    int testingNumber;
    @SuppressWarnings("resource")
    Scanner keyboardIn = new Scanner(System.in);
    System.out.println("How many players? (between " + MINIMUM_PLAYER_COUNT + " and " + MAXIMUM_PLAYER_COUNT + ")");
    //checking for integer
    try{
      testingNumber = Integer.parseInt(keyboardIn.nextLine());
    }
    catch(Exception e){
      System.out.println("That was not even a whole number... try again");
      return countingPlayers();
    }
    //checking for correct number of players
    if (testingNumber < MINIMUM_PLAYER_COUNT || testingNumber > MAXIMUM_PLAYER_COUNT){
      System.out.println("That was not between " + MINIMUM_PLAYER_COUNT + " and " + MAXIMUM_PLAYER_COUNT + "... try again (between " + MINIMUM_PLAYER_COUNT + " and " + MAXIMUM_PLAYER_COUNT + ")");
      return countingPlayers();
      }
    else {
      return testingNumber;
      }
    }

  //asks for an inputed number and then checks to see if its an integer

  // public static void setTotalPlayers(int totalP){
  //       totalPlayerNumber = totalP;
  //   }
  public boolean activePlayers(){
    int activeNumber = 0;
    for(int i=0; i < totalPlayerNumber; i++){
      if (playersArray.get(i).active){ //counts active players
          activeNumber++;
          }
        else{
          }
        }
    if (activeNumber >= MINIMUM_PLAYER_COUNT){ //checks it against minium player count to keep round active
      return true;
        }
      else{
      return false;
      }
  }



  public static int getTotalPlayers()
  {
    return totalPlayerNumber;
  }

}
