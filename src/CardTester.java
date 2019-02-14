/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {

    public static void main(String args[])
    {
        Card card1 = new Card("A", "spade", 1);
        Card card2 = new Card("A", "spade", 1);
        Card card3 = new Card("J", "spade", 10);

        System.out.println(card1.matches(card2));
        System.out.println(card2.matches(card3));
        System.out.println(card3.matches(card1));
    }


}
