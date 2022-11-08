public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {


        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.pausetime = 2;
        plane.setColor(220, 100, 50);
        plane.startingAngle(0);
        plane.isTrail = true;
        plane.move(100);
        plane.setColor(150, 80, 170);
        plane.turn(135);
        plane.isTrail = true;
        plane.move(100);
        plane.setColor(50, 180, 20);
        plane.turn(115);
        plane.isTrail = true;
        plane.move(100);

    }

}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/