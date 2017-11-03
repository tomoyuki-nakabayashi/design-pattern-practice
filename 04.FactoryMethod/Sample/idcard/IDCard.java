package idcard;
import framework.*;

public class IDCard extends Product {
  private String owner;
  private int serial;

  IDCard (String owner, int serial) {
    System.out.println("create a card of " + owner);
    this.owner = owner;
    this.serial = serial;
  }

  public void use() {
    System.out.println("use a card of " + owner);
  }

  public String getOwner() {
    return owner;
  }

  public int getSerial() {
    return serial;
  }
}