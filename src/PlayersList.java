import java.util.*;

public class PlayersList
{
  public static final int MINIMUM_PLAYER_COUNT = 2;
  public static final int MAXIMUM_PLAYER_COUNT = 4;
  public static final int PLAYER_COUNT_EXTRA_RULE = 2; //the number of players where an extra set of rules is activated
  private static int totalPlayerNumber; //final player count
  private static int winRequire; //number of round wins to win the game
  private int lastWinner; //playernumber of who won previous round, defaults to player 1 at posision 0
  private int turnOrder;
  public List<Player> playersArray;

  //constructor
  public PlayersList(int totalPlayerNumber){
    playersArray = new ArrayList<Player>();
    turnOrder = 0;
    lastWinner = 0; //default starting position for player rotation. aka, player one.
    PlayersList.totalPlayerNumber = totalPlayerNumber;
    switch (totalPlayerNumber){ //assigns the number of rounds to win the game
      case 2: setWinLimit(6);
      break;
      case 3: setWinLimit(5);
      break;
      case 4: setWinLimit(4);
      break;
    }
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

  //returns true if active players is above miniumum count to continue round
  public boolean checkActive(){
    int activeNumber = 0;
    for(int i=0; i < totalPlayerNumber; i++){ //counts active players
      if (playersArray.get(i).getActive()){
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

  public void endOfTurn(){ //resets the turn counter to continue the round
    if (turnOrder >= (totalPlayerNumber - 1)){
      this.turnOrder = 0;
    }
    else{
      turnOrder++;

    }
    System.out.println("turn order num: " + turnOrder);
  }

  public int getTurn(){
    return turnOrder;
  }

  public void setWinner(int winningPlayer){ //sets who last won a round
    lastWinner = winningPlayer;
  }
  public int getWinner(){ //gets the winner of the previous round
    return lastWinner;
  }
  public static int getTotalPlayers(){
    return totalPlayerNumber;
  }
  public void setWinLimit(int number){
    winRequire = number;
  }
}
