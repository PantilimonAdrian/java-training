package code._4_student_effort;

public class RockPaperScissorsChallenge {
    public static void main(String[] args) throws InterruptedException {
        Player player1 = new Player("Andrei");
        Player player2 = new Player("Luca");

        player1.start();
        player2.start();

        player1.join();
        player2.join();

        generateWinner(player1, player2);
    }

    private static void generateWinner(Player player1, Player player2) {
        if (player1.getOption().equals(player2.getOption())) {
            System.out.println(player1.getPlayerName() + " vs " + player2.getPlayerName());
            System.out.println("Option: " + player1.getOption() + " vs " + player2.getOption());
            System.out.println("Result: Tie!");
        } else if (("rock".equals(player1.getOption()) && "scissors".equals(player2.getOption()))
                || ("paper".equals(player1.getOption()) && "rock".equals(player2.getOption()))
                || ("scissors".equals(player1.getOption()) && "paper".equals(player2.getOption()))) {
            System.out.println(player1.getPlayerName() + " vs " + player2.getPlayerName());
            System.out.println("Option: " + player1.getOption() + " vs " + player2.getOption());
            System.out.println("Result: " + player1.getPlayerName() + " wins.");
        } else {
            System.out.println(player1.getPlayerName() + " vs " + player2.getPlayerName());
            System.out.println("Option: " + player1.getOption() + " vs " + player2.getOption());
            System.out.println("Result: " + player2.getPlayerName() + " wins.");
        }
    }
}
