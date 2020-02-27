
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card queenHearts10 = new Card("Queen", "Heart", 10);
		Card jackSpade10 = new Card("Jack", "Spade", 10);
		Card exactCopy = new Card("Queen", "Heart", 10);
		System.out.println(queenHearts10.suit());
		System.out.println(queenHearts10.rank());
		System.out.println(queenHearts10.pointValue());
		System.out.println(jackSpade10.suit());
		System.out.println(jackSpade10.rank());
		System.out.println(jackSpade10.pointValue());
		System.out.println(exactCopy.suit());
		System.out.println(exactCopy.rank());
		System.out.println(exactCopy.pointValue());
		System.out.println(queenHearts10.matches(jackSpade10));
		System.out.println(queenHearts10.matches(exactCopy));
		System.out.println(queenHearts10);
		System.out.println(jackSpade10);
		System.out.println(exactCopy);
	}
}
