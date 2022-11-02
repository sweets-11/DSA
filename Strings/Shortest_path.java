import java.util.*;

import javax.swing.plaf.synth.SynthStyle;

public class Shortest_path {

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'N') { // assume compus which has 4 sides NORTH ,SOUTH,EAST,WEST  and now remember ogive question where origin is(x_0,y_0); 
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int X2 = x * x;// yaha x square 
        int Y2 = y * y;// y square
        
        return (float)Math.sqrt(X2 + Y2);// sqart function float val. return krta h , sqrt use iss lie kia h because ye shortest val or path batata h.
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
