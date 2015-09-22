import java.util.*;
public class Card{
  private String name;
  private int value;
  private String desc;

  public Card(String name, int value, String desc){
    this.name = name;
    this.value = value;
    this.desc = desc;
  }

  public void action(Player activePlayer, List<Player> playerArray){

  }

  public String getName(){
    return name;
  }
}
