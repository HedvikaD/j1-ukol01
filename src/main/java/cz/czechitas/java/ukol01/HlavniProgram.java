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
    zofka.move(300);
    zofka.turnLeft(90);
    zofka.move(100);
    zofka.penDown();

    /**
     nakresliOsmiuhelnik();

     zofka.penUp();
     zofka.move(300);
     zofka.penDown();

     nakresliKolečko();

     zofka.penUp();
     zofka.turnLeft(90);
     zofka.move(200);
     zofka.penDown();
     */

    nakresliDomecek();

    zofka.penUp();
    zofka.turnLeft(270);
    zofka.move(700);
    zofka.penDown();
    zofka.turnRight(90);

    nakresliDomecek();

    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(220);
    zofka.penDown();

    nakresliDomecek();

    for (int i = 0; i < 4; i++) {
      zofka.penUp();
      zofka.turnLeft(90);
      zofka.move(50);
      zofka.turnLeft(90);
      zofka.penDown();
      nakresliDomecek();
    }
    {

    }

    zofka.turnLeft(90);
    zofka.penUp();
    zofka.move(100);
    zofka.penDown();

    nakresliSluníčko();
    zofka.turnRight(90);
    zofka.penUp();
    zofka.move(500);
    zofka.turnRight(90);
    zofka.move(600);
    zofka.turnRight(90);
    zofka.penDown();

    nakresliH();

    zofka.penUp();
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();

    nakresliE();

    zofka.penUp();
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();

    nakresliD();

    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();

    nakresliA();

    zofka.turnLeft(180);
    zofka.penUp();
    zofka.move(200);
    zofka.turnRight(90);
    zofka.move(70);
    zofka.penDown();

    nakresliOcasek();

    zofka.penUp();
    zofka.move(200);
    zofka.penDown();
    zofka.turnRight(900);


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

  public void nakresliDomecek() {
    zofka.turnRight(30);
    zofka.move(100);
    zofka.turnRight(120);
    zofka.move(100);
    zofka.turnRight(30);
    for (int i = 0; i < 4; i++) {
      zofka.move(100);
      zofka.turnRight(90);
    }
  }

  public void nakresliH() {
    zofka.move(40);
    zofka.turnRight(180);
    zofka.move(20);
    zofka.turnLeft(90);
    zofka.move(20);
    zofka.turnLeft(90);
    zofka.move(20);
    zofka.turnRight(180);
    zofka.move(40);
    zofka.turnLeft(90);
  }

  public void nakresliE() {
    zofka.move(40);
    zofka.turnRight(90);
    zofka.move(20);
    zofka.turnRight(180);
    zofka.move(20);
    zofka.turnLeft(90);
    zofka.move(20);
    zofka.turnLeft(90);
    zofka.move(20);
    zofka.turnRight(180);
    zofka.move(20);
    zofka.turnLeft(90);
    zofka.move(20);
    zofka.turnLeft(90);
    zofka.move(20);
  }

  public void nakresliD() {
    zofka.move(40);
    zofka.turnRight(90);
    for (int i = 0; i < 12; i++) {
      zofka.move(5);
      zofka.turnRight(15);
    }

  }

  public void nakresliA() {
    zofka.turnRight(30);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.move(25);
    zofka.turnLeft(120);
    zofka.move(25);
    zofka.turnLeft(120);
    zofka.move(25);
    zofka.turnLeft(180);
    zofka.move(50);
  }


  public void nakresliOcasek() {

    zofka.turnRight(30);
    for (int i = 0; i < 5; i++) {
      zofka.move(20);
      zofka.turnRight(30);
    }
    for (int i = 0; i < 8; i++) {
      zofka.move(10);
      zofka.turnRight(30);
    }
    zofka.move(50);
  }


  }










