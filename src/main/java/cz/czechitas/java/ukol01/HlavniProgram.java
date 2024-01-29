package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //TODO implementace domácího úkolu


    nakresliPrasatko();

    nakresliNozicku();

    zofka.turnLeft(135);
    zofka.move(100);
    zofka.turnLeft(90);

    nakresliNozicku();

    zofka.turnRight(45);
    zofka.penUp();
    zofka.move(200);
    zofka.penDown();

    nakresliOsmiuhelnik();

    zofka.penUp();
    zofka.move(300);
    zofka.penDown();

    nakresliKolečko();

    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(200);
    zofka.penDown();

    nakresliSluníčko();


  }

  public void nakresliNozicku() {
    zofka.turnLeft(45);
    zofka.move(40);
    zofka.turnRight(180);
    zofka.move(40);
    zofka.turnLeft(90);
    zofka.move(40);
    zofka.turnRight(180);
    zofka.move(40);
  }

  public void nakresliPrasatko() {
    for (int i = 0; i < 4; i++) {
      zofka.move(100);
      zofka.turnRight(90);
    }

    zofka.turnLeft(60);
    zofka.move(100);
    zofka.turnRight(120);
    zofka.move(100);
    zofka.turnRight(30);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(100);
  }

  public void nakresliOsmiuhelnik() {
     for (int i = 0; i < 8; i++) {
     zofka.move(100);
     zofka.turnRight(45);
     }

    }

  public void nakresliKolečko() {
      for (int i = 0; i < 24; i++) {
        zofka.move(20);
        zofka.turnRight(15);
      }

    }

  public void nakresliSluníčko() {
     for (int i = 0; i < 24; i++) {
     zofka.move(20);
     zofka.turnRight(90);
     zofka.move(20);
     zofka.turnLeft(180);
     zofka.move(20);
     zofka.turnRight(75);
     }
  }

}
