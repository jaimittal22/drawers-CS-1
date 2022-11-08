public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(200, 0, 0);

        plane.startingAngle(90);
        mysquare();
        triangle();

    }


    public void triangle() {
        plane.pausetime = 2;
        plane.setColor(220, 100, 50);
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.move(100);
        plane.setColor(150, 80, 170);
        plane.turn(-220);
        plane.isTrail = true;
        plane.move(70);
        plane.setColor(50, 180, 20);
        plane.turn(-280);
        plane.isTrail = true;
        plane.move(60);
    }
    public void mysquare() {
        plane.startingAngle(90);
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
    }

}


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/