import java.util.*;
public class BaronCard extends Card{

public static final String BARON_NAME = "Baron";
public static final int BARON_VALUE = 3;
public static final String BARON_DESC = "Baron lets you try and guess another players' card";
public static final boolean BARON_TARGET = true;

  public BaronCard(){
    super(BARON_NAME, BARON_VALUE, BARON_DESC, BARON_TARGET);
  }
  public void action(Player activePlayer, PlayerList playerList){

  }
  // public void action(){
//
  //}
}
