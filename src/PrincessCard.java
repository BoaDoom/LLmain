import java.util.*;
public class PrincessCard extends Card{

public static final String PRINCESS_NAME = "Princess";
public static final int PRINCESS_VALUE = 8;
public static final String PRINCESS_DESC = "Princess lets you try and guess another players' card";
public static final boolean PRINCESS_TARGET = false;

  public PrincessCard(){
    super(PRINCESS_NAME, PRINCESS_VALUE, PRINCESS_DESC, PRINCESS_TARGET);
  }
  public void action(Player activePlayer, PlayerList playerList){

  }
  // public void action(){
  //
  // }
}
