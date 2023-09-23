public class Winner {
    private static final String WON = "You won the game!\nCreated by Shreyas Saha. Thanks for playing!";
    private static final String LOST = "You lost the game!\nCreated by Shreyas Saha. Thanks for playing!";
    private static final String DRAW = "It's a draw!\nCreated by Shreyas Saha. Thanks for playing!";

    public void printWinner(String variant) {
        if ("WON".equals(variant)) {
            System.out.println(WON);
        } else if ("LOST".equals(variant)) {
            System.out.println(LOST);
        } else if ("DRAW".equals(variant)) {
            System.out.println(DRAW);
        }
    }
}
