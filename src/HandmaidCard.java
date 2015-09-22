import java.util.*;
public class HandmaidCard extends Card{

public static final String HANDMAID_NAME = "Handmaid";
public static final int HANDMAID_VALUE = 4;
public static final String HANDMAID_DESC = "Handmaid lets you try and guess another players' card";
public static final boolean HANDMAID_TARGET = false;

  public HandmaidCard(){
    super(HANDMAID_NAME, HANDMAID_VALUE, HANDMAID_DESC, HANDMAID_TARGET);
  }
  public void action(Player activePlayer, PlayerList playerList){

  }
  // public void action(){
  //
  // }
}
