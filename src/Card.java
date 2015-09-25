import java.util.*;
public class Card{
  private boolean selfTarget;
  private int value;
  private int selectedCard;
  private String name;
  private String desc;
  private Player selectedPlayer;
  private ArrayList<Integer> excluded; //list of player numbers inelligible to be target of the action

  public Card(String name, int value, String desc, boolean selfTarget){
    this.name = name;
    this.value = value;
    this.desc = desc;
    this.selfTarget = selfTarget;
  }

  public void action(Player activePlayer, PlayersList players, Deck deck){
  }

  public Player selectPlayer(Player activePlayer,  PlayersList players, boolean self){
    excluded = new ArrayList<Integer>();
    for (int i=0; i < players.playersArray.size(); i++){ //prints list of availible targets from array
      if (players.playersArray.get(i).getActive()){ //checks too see if listed player is active
        if (activePlayer.getPlayerNumber() != players.playersArray.get(i).getPlayerNumber()){   // checks to see if you are the listed player
          if (!players.playersArray.get(i).getShielded()){ //checks too see if listed player is active
            System.out.println((i+1) +": " + players.playersArray.get(i).getName()); //prints player on list's name
          }
          else{
            System.out.println((i+1) +": player is protected by a Handmaid");
            excluded.add(i);
          }
        }
        else{
          System.out.println((i+1) +": Yourself");
          if (!self){
            excluded.add(i);
          }
        }
      }
      else{
        System.out.println((i+1) +": player is eliminated");
        excluded.add(i);
      }
    }
    if (excluded.size() == players.playersArray.size()){
      System.out.println("There is no one to use this card on! and you cannot use it on yourself\n the card is discarded without any effect");
      return activePlayer;
    }
    else{
      return players.playersArray.get(InputCheck.check("choose a target", 1, players.playersArray.size(), excluded)-1);

    }
  }


  public String getName(){
    return name;
  }
  public int getValue(){
    return value;
  }
}
