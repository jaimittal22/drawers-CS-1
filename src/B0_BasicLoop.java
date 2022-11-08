public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.pausetime = 0;
        plane.isTrail=true;
        for(int x=0;x<20;x=x+1) {
            for(int y=0;y<20;y=y+1) {
                int a = (int) (Math.random() * 10) + 1;
                System.out.println(a);
                plane.teleport(y*50, x*30);
                plane.setColor(10*x, 15, y * 10);
                house(10);
            }
        }
    }

    private void house(int d) {
        plane.isTrail = true;
        plane.trailWidth = 2;
        plane.pausetime = 0;
     //   plane.setColor((int)(Math.random()*256), (int)(Math.random()*256),(int)(Math.random()*256));

        plane.startingAngle(90);
        mysquare(d);
        mytriangle(d);
    }


    private void mytriangle(int d) {
        plane.turn(0);
        plane.move(d);
        plane.turn(220);
        plane.move(d);
        plane.turn(280);
        plane.move(d);
    }

    private void mysquare(int d) {
        plane.pausetime = 0;
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 5;
       // plane.setColor((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255));
        plane.move(d);
        plane.turn(90);
        plane.move(d);
        plane.turn(90);
        plane.move(d);
        plane.turn(90);
        plane.move(d);
    }
}
