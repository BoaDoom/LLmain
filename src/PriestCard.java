import java.util.*;
public class PriestCard extends Card{

public static final String PRIEST_NAME = "Priest";
public static final int PRIEST_VALUE = 2;
public static final String PRIEST_DESC = "Shows you another players' card";

  public PriestCard(){
    super(PRIEST_NAME, PRIEST_VALUE, PRIEST_DESC);
  }
  public void action(Player activePlayer, List<Player> playerArray){
    System.out.println(PRIEST_DESC);
  }
  // public void action(){
  //
  // }
}
