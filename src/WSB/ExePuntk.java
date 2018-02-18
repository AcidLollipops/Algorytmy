package WSB;

public class ExePuntk {

    public static void main(String[] args) {
        /*Utwórz klasę Punkt. Charakteryzuje się dwiema współrzędnymi: x i y (int)
        . Dodaj do niej metodę ustawWspółrzędne oraz metodę pobierzPunkt,
        która zwraca odniesienie do obiektu typu Punkt. Napisz program
        wykorzystujący klasę Punkt.
        */

        Punkt pkt=new Punkt();
        pkt.setUstawWspoółrzędne(4, 5);
        System.out.print(pkt.getAll()+ "\n");
        System.out.println(pkt);

    }
}
