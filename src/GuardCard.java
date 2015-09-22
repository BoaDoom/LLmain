import java.util.*;
public class GuardCard extends Card{

public static final String GUARD_NAME = "Guard";
public static final int GUARD_VALUE = 1;
public static final String GUARD_DESC = "Guard lets you try and guess another players' card";
public static final boolean GUARD_TARGET = true;

  public GuardCard(){
    super(GUARD_NAME, GUARD_VALUE, GUARD_DESC, GUARD_TARGET);
  }

  public void action(Player activePlayer, PlayerList playerList){

  }

  // public void action(){
  //
  // }
}
