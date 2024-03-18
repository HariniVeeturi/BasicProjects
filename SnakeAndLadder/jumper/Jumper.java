package jumper;
import coordinates.*;
public class Jumper {
   public  Coordinates start;
    public Coordinates end;
    String name;
    public Jumper(Coordinates start,Coordinates end)
    {
        this.start=start;
        this.end=end;

        if( start.row > end.row) this.name="Ladder";
        else
        this.name="Snake";
    }
    public String getJumperString()
    {
        return this.name;
    }
}
