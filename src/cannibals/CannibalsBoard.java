package cannibals;


public class CannibalsBoard {
    public void printBG(char[] initShore,char[] finalShore,char[] boat) {
        System.out.println("+----------------------------------------------------------------------------------+\n"+
                           "|                                                                                  |\n"+
        "|    "+initShore+"                                                                 "+finalShore+"     |\n"+
        "|                                                                                  |\n"+
        "| M M M C C C    \\__"+boat[0]+"__"+boat[1]+"__/                                                        |\n"+
        "|████████████████==================================================████████████████|\n"+
        "|███████████████████============================================███████████████████|\n"+
        "+----------------------------------------------------------------------------------+");
    }
    public void instructions() {

        System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                     MISSIONARIES AND CANNIBALS – GAME RULES                          ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║                                                                                      ║");
        System.out.println("║  Welcome to the River Crossing Challenge!                                            ║");
        System.out.println("║                                                                                      ║");
        System.out.println("║  Objective:                                                                          ║");
        System.out.println("║  Move all 3 Missionaries (M) and 3 Cannibals (C) from the LEFT bank to the RIGHT.    ║");
        System.out.println("║                                                                                      ║");
        System.out.println("║  Rules:                                                                              ║");
        System.out.println("║  1. The boat can carry a maximum of 2 people.                                        ║");
        System.out.println("║  2. The boat must have at least 1 person to move.                                    ║");
        System.out.println("║  3. Cannibals must never outnumber Missionaries on either bank.                      ║");
        System.out.println("║                                                                                      ║");
        System.out.println("║  ⚠ Golden Rule:                                                                      ║");
        System.out.println("║  If Cannibals outnumber Missionaries on a bank, the Missionaries will be eaten!      ║");
        System.out.println("║                                                                                      ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║                                   GOAL STATE                                         ║");
        System.out.println("║                                                                                      ║");
        System.out.println("║   +------------------------------------------------------------------------------+   ║");
        System.out.println("║   |                                                                              |   ║");
        System.out.println("║   |    0M0C                                                         3M3C         |   ║");
        System.out.println("║   |                                                                              |   ║");
        System.out.println("║   |                        \\______ /                      M M M C C C            |    ║");
        System.out.println("║   |███████████████████======================================█████████████████████|   ║");
        System.out.println("║   |██████████████████████===============================█████████████████████████|   ║");
        System.out.println("║   +------------------------------------------------------------------------------+   ║");
        System.out.println("║                                                                                      ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════╝");

        System.out.println();
        System.out.println("Symbols: M = Missionary   C = Cannibal");
        System.out.println("=========================================================================================");
        System.out.println();
    }
}
