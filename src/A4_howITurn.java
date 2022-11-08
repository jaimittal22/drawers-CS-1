

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(180, 0, 20);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 175, 40);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 100, 255);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 100, 255);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 100, 255);
        plane.move(100);
        plane.turn(90);
        plane.setColor(0, 100, 255);
        plane.move(100);
        plane.turn(30);
        plane.setColor(0, 100, 255);
        plane.move(100);
        plane.turn(120);
        plane.setColor(0, 100, 255);
        plane.move(100);

    }


}
