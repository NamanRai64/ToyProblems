package cannibals;

import java.sql.SQLOutput;

public class CannibalsBoard {
    private static void printBG() {
        String initShore="2C2M",finalShore="2C2M";
        char[] boat ={'M','C'};
        System.out.println("+----------------------------------------------------------------------------------+\n"+
        "|                                                                                  |\n"+
        "|    "+initShore+"                                                                 "+finalShore+"     |\n"+
        "|                                                                                  |\n"+
        "| M M M C C C    \\__"+boat[0]+"__"+boat[1]+"__/                                                       |\n"+
        "|████████████████==================================================████████████████|\n"+
        "|███████████████████============================================███████████████████|\n"+
        "+----------------------------------------------------------------------------------+");
    }
    private static void instructions() {
        System.out.println("Instructions for Missionaries and Cannibals: ");
        System.out.println("+----------------------------------------------------------------------------------------+");
        System.out.println("|                                                                                        |");
        System.out.println("|   Welcome to the River Crossing Challenge!                                             |");
        System.out.println("|   ========================================                (M M M)  |~~~~|  (     )     |");
        System.out.println("|   How to Play:                                            (C C C)  |~~~~|              |");
        System.out.println("|   1. Move 3 Missionaries and 3 Cannibals across.          (     )  |Boat|  (     )     |");
        System.out.println("|   2. The boat can carry a maximum of 2 people.            -------  |____|  -------     |");
        System.out.println("|   3. The boat must have at least 1 person to move.          Left    River   Right      |");
        System.out.println("|                                                                                        |");
        System.out.println("|   The Golden Rule:                                                                     |");
        System.out.println("|   If Cannibals outnumber Missionaries on either bank, the Missionaries are eaten!      |");
        System.out.println("|                                                                                        |");
        System.out.println("|   Goal:                                                                                |");
        System.out.println("|   Get everyone safely to the Right Bank without any casualties.                        |");
        System.out.println("|                                                                                        |");
        System.out.println("+----------------------------------------------------------------------------------------+");
        System.out.println();
        System.out.println("Let's get Started, M-Missionaries and C- Cannibal:");
        System.out.println("==================================================================================================");
        System.out.println();
    }
    public static void main(String[] args) {

        instructions();
        printBG();
    }
}
