package cannibals;


public class CannibalsBoard {
    public void printBG(int mleft,int cleft,int mright,int cright, boolean onLeft) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        // Build the string representations for both shores
        for(int m=0; m<mleft; m++) sb1.append("M ");
        for(int c=0; c<cleft; c++) sb1.append("C ");

        for(int m=0; m<mright; m++) sb2.append("M ");
        for(int c=0; c<cright; c++) sb2.append("C ");

        // Padding to keep the shore strings aligned
        String leftShore = String.format("%-12s", sb1.toString());
        String rightShore = String.format("%12s", sb2.toString());

        System.out.println("+----------------------------------------------------------------------------------+");
        System.out.println("                                                                                    ");
        System.out.println("     " + mleft + "M" + cleft + "C" + "                                                                 " + mright + "M" + cright + "C" + "     |");
        System.out.println("                                                                                    ");

        if (onLeft) {
            System.out.println("  " + leftShore + "  \\________/                                            " + rightShore + "  ");
        } else {
            System.out.println("  " + leftShore + "                                            \\________/   " + rightShore + "  ");
        }

        System.out.println(" ████████████████==================================================████████████████");
        System.out.println(" ███████████████████============================================███████████████████");
        System.out.println("+----------------------------------------------------------------------------------+");
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
