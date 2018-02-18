package WSB;

public class Punkt {

    private int x;
    private int y;

    public void setUstawWspoółrzędne(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getPobierzPunktX(){
        return x;

    }
    public int getPobierzPunktY(){
        return y;
    }
    public String getAll(){

        return x +", " + y;
    }

    public String toString(){
        return "Punkt [x:= "+ getPobierzPunktX() + ", y:= " + getPobierzPunktY()+
                "]";
    }
}
