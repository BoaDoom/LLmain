import java.util.*;
public class PrinceCard extends Card{

public static final String PRINCE_NAME = "Prince";
public static final int PRINCE_VALUE = 5;
public static final String PRINCE_DESC = "Prince lets you try and guess another players' card";
public static final boolean PRINCE_TARGET = true;

  public PrinceCard(){
    super(PRINCE_NAME, PRINCE_VALUE, PRINCE_DESC, PRINCE_TARGET);
  }
  public void action(Player activePlayer, PlayerList playerList){

  }
  // public void action(){
  //
  // }
}
