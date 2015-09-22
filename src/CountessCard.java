import java.util.*;
public class CountessCard extends Card{

public static final String COUNTESS_NAME = "Countess";
public static final int COUNTESS_VALUE = 7;
public static final String COUNTESS_DESC = "Countess lets you try and guess another players' card";
public static final boolean COUNTESS_TARGET = false;

  public CountessCard(){
    super(COUNTESS_NAME, COUNTESS_VALUE, COUNTESS_DESC, COUNTESS_TARGET);
  }
  public void action(Player activePlayer, PlayerList playerList){

  }
  // public void action(){
  //
  // }
}
