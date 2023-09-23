public class Game {

    private final Box box = new Box();
    private final Input inputBox = new Input();
    private final Winner winner = new Winner();

    private byte randomStep() {
        while (true) {
            final byte random = (byte) (Math.random() * (9 - 1 + 1) + 1);
            if (box.isEmptyBox(((byte) (random - 1)))) {
                return random;
            }
        }
    }

    public boolean pcMove() {
        byte random = randomStep();
        box.fillBox((byte) (random - 1), 'O');

        return box.checkCombination('O');
    }

    public boolean checkDraw() {
        for (byte i = 0; i < 9; i++) {
            if (box.isEmptyBox(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean manMove() {
        byte input = inputBox.inputBox();
        box.fillBox((byte) (input - 1), 'X');

        return box.checkCombination('X');
    }

    public String getResult() {
        if (manMove()) {
            return "WON";
        }
        else if (checkDraw()) {
            return "DRAW";
        }
        else if (pcMove()) {
            return "LOST";
        } else return "GOING";
    }

    public void play() {
        while (true) {
            box.drawBox();
            String result = getResult();
            if (!result.equals("GOING")) {
                winner.printWinner(result);
                return;
            }
        }
    }
}
