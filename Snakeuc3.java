public class Snakeuc3 {
	public static void main(String[] args){
	System.out.println("let's play snake and ladder");
	int startPosition = 0;

	System.out.println("Start Position :" +startPosition);

	int diceValue = (int) Math.floor((Math.random()*6) + 1);

	System.out.println("Number on dice : " +diceValue);

	int cond = (int) Math.floor(Math.random() * 10) % 3 + 1;

	switch(cond) {

		case 1:
		startPosition = startPosition + diceValue;
		break;
		case 2:
		startPosition = startPosition - diceValue;
		break;

		default:
		System.out.println("No player at start postion" +startPosition);
		}
		System.out.println("Position of player after choosing a  option : " +startPosition);
	 }
}


