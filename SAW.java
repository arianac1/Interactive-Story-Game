import java.util.Scanner;
public class SAW 
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name to begin:");
		String name = scan.next().toUpperCase();
		System.out.println("Hello, " + name + " You don't know me, but I know you." + 
				"\nI want to play a game. Here's what happens if you lose." + "\nThe device you are wearing is hooked into your upper and lower jaw." + "\nWhen the timer in the back goes off, your mouth will be permanently ripped open."
				+ "\nThink of it like a reverse bear trap. There is only one key to open the device." + "\nIt's in the stomach of your dead cellmate. Look around " + name + ". \nKnow that I'm not lying. Better hurry up."); 

		System.out.println("\nDo you walk towards the dead cellmate or sit where you are? (WALK or SIT)");				
		String choice1 = scan.next().toUpperCase();
		if(choice1.equals("WALK"))
		{System.out.println("As you start to walk the timer starts. Once you reach the dead guy you get the feeling of having to vomit.");	}
		else
		{System.out.println("You cry on the floor while time is wasting");}

		System.out.println("Now you have three choices to choose from, pick wisely. \nDo you want to get the key from inside the guy, find another way to escape, or do nothing. (KEY, ANOTHER, or NOTHING)");
		String game = scan.next().toUpperCase();
		switch(game)
		{
		case "KEY":
			System.out.println("Do you find something to cut the guy with? (YES or NO)");
			String weapon = scan.next().toUpperCase();
			System.out.println("Are you strong enough to cut him open? (YES or NO)");
			String strength = scan.next().toUpperCase();

			if(weapon.equals("YES") && strength.equals("YES"))
			{     System.out.println("What object did you find?");
			String object = scan.next();
			System.out.println("You stab the guy in the stomach with a " + object + ". As he starts bleeding everywhere you failed to notice the guy was still alive. \nToo late now. You rip open his stomach and find the key. You put the key in the lock and are able to disable the trap in time. \nCongratulations, you are stil alive.");    }
			else if(weapon.equals("YES") || strength.equals("YES"))
			{      System.out.println("You don't have enough of what it take to survive. \nThe timer runs out and your are trapped."); }
			else
			{ System.out.println("You gave up to quickly. Now you are forever trapped. HA HA HA HA");}
			break;
		case "ANOTHER":
			System.out.println("Are you able to think fast? (YES or NO)");
			String think = scan.next().toUpperCase();
			System.out.println("Are you good at solving puzzles? (YES or NO)");
			String puzzle = scan.next().toUpperCase();

			if(think.equals("YES") && puzzle.equals("YES"))
			{System.out.println("You quickly search the room for another way to escape. You come across a square box in the wall. \nYou begin examining it until you find a hole on the side. You find out how it works,but it will cost you. \nYou stick your hand in the box and little knives stab your hand for a while. \nYou pull your hand out(What's left of it) and the door opens. \nCongrats your smartness saved you this time and your cellmate. Yes he is still alive.");}
			else if (think.equals("YES") || puzzle.equals("YES"))
			{ System.out.println("Unable to find another way, you panic and start screaming. \nTime is close to countdown and you give up. The timer rings and the bear trap rips off your face.");}
			else
			{System.out.println("You destroy the room out of anger and cry out for help. \nYou should of payed attention in school now you have no idea what to do. \nUnable to do anything the timer runs out. The trap rips off your face and you are left laying there, faceless.");}
			break;

		case "NOTHING":
			System.out.println("Are you sure you want to giveup? (YES or NO)");
			String giveup = scan.next().toUpperCase();
			System.out.println("Are you absolutely sure you want to die? (YES or NO)");
			String sure = scan.next().toUpperCase();

			if(giveup.equals("YES") && sure.equals("YES"))
			{System.out.println("Congrats you are going to die any second.");}
			else if (giveup.equals("YES") || sure.equals("YES"))
			{ System.out.println("You still have some time to find a way to escape. You walk around but unable to find anything you giveup. \nThe trap snaps your face off. YOU DIE");}
			else
			{System.out.println("Why did you pick nothing if you want to live? \nNow you're stuck running around a room trying to find an escape that doesn't involve cutting open your cellmate. \nToo bad time runs out and you die. \nAt least you're cellemate wasn't really dead.");}
			break;
		default:
			System.out.println("I didn't understand your choice. Hit Run and try again, this time picking KEY, ANOTHER, or NOTHING");

		}
	}
}
