import java.awt.*;

public class Cupcake {

        public String name;                //holds the name of the hero
        public int xpos;                //the x position
        public int ypos;                //the y position
        public int dx;                    //the speed of the hero in the x direction
        public int dy;                    //the speed of the hero in the y direction
        public int width;
        public int height;
        public boolean isAlive;            //a boolean to denote if the hero is alive or dead.

        public Rectangle rec;


        // METHOD DEFINITION SECTION

        // Constructor Definition
        // A constructor builds the object when called and sets variable values.


        //This is a SECOND constructor that takes 3 parameters.  This allows us to specify the hero's name and position when we build it.
        // if you put in a String, an int and an int the program will use this constructor instead of the one above.
        public Cupcake(int pXpos, int pYpos) {
            xpos = pXpos;
            ypos = pYpos;
            dx =0;
            dy =0;
            width = 60;
            height = 60;
            isAlive = true;
            rec= new Rectangle(xpos,ypos,width,height);

        } // constructor

        //The move method.  Everytime this is run (or "called") the hero's x position and y position change by dx and dy
        public void move() {
            xpos = xpos + dx;
            ypos = ypos + dy;
            rec= new Rectangle(xpos,ypos,width,height);


        }
    }

