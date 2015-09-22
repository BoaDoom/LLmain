import java.util.*;
public class Card{
  private String name;
  private int value;
  private String desc;
  private boolean target;

  public Card(String name, int value, String desc, boolean target){
    this.name = name;
    this.value = value;
    this.desc = desc;
    this.target = target;
  }

  public void action(Player activePlayer, Player selectedPlayer){

  }

  public String getName(){
    return name;
  }
}
