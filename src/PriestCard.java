import java.util.*;
public class PriestCard extends Card{

public static final String PRIEST_NAME = "Priest";
public static final int PRIEST_VALUE = 2;
public static final String PRIEST_DESC = "Priest lets you try and guess another players' card";
public static final boolean PRIEST_TARGET = true;

  public PriestCard(){
    super(PRIEST_NAME, PRIEST_VALUE, PRIEST_DESC, PRIEST_TARGET);
  }
  public void action(Player activePlayer, PlayerList playerList){

  }
  // public void action(){
  //
  // }
}
