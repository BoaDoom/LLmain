import java.util.*;
public class KingCard extends Card{

public static final String KING_NAME = "King";
public static final int KING_VALUE = 6;
public static final String KING_DESC = "King lets you try and guess another players' card";
public static final boolean KING_TARGET = true;

  public KingCard(){
    super(KING_NAME, KING_VALUE, KING_DESC, KING_TARGET);
  }
  public void action(Player activePlayer, PlayerList playerList){

  }
  // public void action(){
  //
  // }
}
