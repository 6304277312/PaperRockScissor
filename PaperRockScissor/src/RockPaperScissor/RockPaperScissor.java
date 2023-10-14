package RockPaperScissor;
import java.util.Random;
	import java.util.Scanner;

	public class RockPaperScissor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        while (true) {
	            System.out.print("Enter your choice (rock, paper, or scissors): ");
	            String playerChoice = scanner.nextLine().toLowerCase();

	            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
	                System.out.println("Invalid choice. Please enter 'rock', 'paper', or 'scissors'.");
	                continue;
	            }

	            int computerInt = random.nextInt(3); // 0 for Rock, 1 for Paper, 2 for Scissors
	            String computerChoice = "";
	            switch (computerInt) {
	                case 0:
	                    computerChoice = "rock";
	                    break;
	                case 1:
	                    computerChoice = "paper";
	                    break;
	                case 2:
	                    computerChoice = "scissors";
	                    break;
	            }

	            System.out.println("Computer chose: " + computerChoice);

	            if (playerChoice.equals(computerChoice)) {
	                System.out.println("It's a tie!");
	            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
	                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
	                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
	                System.out.println("You win!");
	            } else {
	                System.out.println("Computer wins!");
	            }

	            System.out.print("Play again? (yes/no): ");
	            String playAgain = scanner.nextLine().toLowerCase();
	            if (!playAgain.equals("yes")) {
	                break;
	            }
	        }

	        System.out.println("Thanks for playing!");
	    }
	}


