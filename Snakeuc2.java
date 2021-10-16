import java.util.*;
public class Snakeuc2
{
	  public static void main(String[] args)
        {
                int position=0;
                System.out.println("Snake ladder game played with single person");
                System.out.println("Singleplayer starting position  :" +position);
		Dice();
        }
	public static int Dice()
	{
		Random random=new Random();
		int dice=random.nextInt(6);
		dice=dice+1;
		System.out.println("The player rolls the die:" +dice);
		return dice;
	}
}
