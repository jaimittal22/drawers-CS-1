public class GradedPicture extends World {
    public void go() {
        plane.showBackGround();
        for (int row = 67; row < 250; row++)    //*** this is using new getBackground
        {
            for (int col = 118; col < 462; col++)    //*** this is using new get Background
            {
                plane.teleport(col, row);

                int red = plane.howMuchRed();
                int green = plane.howMuchGreen();
                int blue = plane.howMuchBlue();

                if (red > 0 && green > 0 && blue > 0) //&&green<240 && blue< 100)
                {
                    plane.setPixelColor(0, 100, 200);
                }
            }
        }
        public void drawer; ();
        plane.isTrail = true;
        plane.pausetime = 1 / 2;
        plane.trailWidth = 4;
        plane.teleport(166, 140);
        plane.move(100);
        plane.turn(90);
        plane.move(220);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(220);
        plane.turn(90);
        plane.move(130);
        plane.turn(90);
        plane.move(220);
        plane.turn(90);
        plane.move(60);
        plane.turn(90);
        plane.move(220);
        plane.turn(270);
        plane.move(30);
        plane.turn(270);
        plane.move(220);
        for (int h = 0; h < 5; h++) {
            int Q = (int) (Math.random() * 3) + 1;
            if (Q == 1) drawer 20);


        }
    }
}