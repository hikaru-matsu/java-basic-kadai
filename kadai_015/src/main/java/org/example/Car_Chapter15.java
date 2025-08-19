package org.example;


public class Car_Chapter15 {

  private int gear = 1;
  private int speed = 10;

  public void changeGear(int afterGear) {
    if(afterGear <= 5 && afterGear > 0) {
      speed = afterGear * speed;
    } else {
      afterGear = 1;
      speed = speed * afterGear;
    }
  }

  public void run() {
    System.out.println("時速" + speed + "km");
  }
}
