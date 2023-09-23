

public class Box {
    private final char [] box = new char[9];

    public Box(){
        init();
    }


    public void drawBox(){
        System.out.println("\n\n " + box[0] + " | " + box[1] + " | " + box[2] + " ");
        System.out.println("-----------");
        System.out.println(" " + box[3] + " | " + box[4] + " | " + box[5] + " ");
        System.out.println("-----------");
        System.out.println(" " + box[6] + " | " + box[7] + " | " + box[8] + " \n");
    }

    public void init(){
        for (int i = 0; i < 9; i++)
            box[i] = ' ';
    }

    public boolean isEmptyBox(byte i) {
        return box[i] != 'X' && box[i] != 'O';
    }

    public void fillBox(byte i, char symbol) {
        box[i] = symbol;
    }

    public boolean checkCombination(char symbol) {
        if ((box[0] == symbol && box[1] == symbol && box[2] == symbol) ||
                (box[3] == symbol && box[4] == symbol && box[5] == symbol) ||
                (box[6] == symbol && box[7] == symbol && box[8] == symbol) ||
                (box[0] == symbol && box[3] == symbol && box[6] == symbol) ||
                (box[1] == symbol && box[4] == symbol && box[7] == symbol) ||
                (box[2] == symbol && box[5] == symbol && box[8] == symbol) ||
                (box[0] == symbol && box[4] == symbol && box[8] == symbol) ||
                (box[2] == symbol && box[4] == symbol && box[6] == symbol)) {
            return true;
        }
        return false;
    }

    public void printStartBox(){
        System.out.println("Enter box number to select. Enjoy!");

        System.out.println("\n\n 1" + " | 2" +   " | 3" +   " ");
        System.out.println("-----------");
        System.out.println(" 4" +  " | 5"  + " | 6"  + " ");
        System.out.println("-----------");
        System.out.println(" 7"  + " | 8"  + " | 9" + " \n");
    }
}
