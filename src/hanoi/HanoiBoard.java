package hanoi;
import java.util.Stack;

public class HanoiBoard {
    private int numDisks;
    private Stack<Integer>[] pegs;

    // Extended ASCII / Unicode block characters
    private final String DISK_CHAR = "▓"; // Dark Shade block
    private final String ROD_CHAR  = "│"; // Box drawing vertical bar

    public void display() {
        System.out.println("\n      [ EXPERIMENT: TOWER OF HANOI ]");

        // Render from top level down
        for (int level = numDisks - 1; level >= 0; level--) {
            System.out.print("     ");
            for (int p = 0; p < 3; p++) {
                if (pegs[p].size() > level) {
                    int diskSize = pegs[p].get(level);
                    System.out.print(renderTexturedDisk(diskSize));
                } else {
                    // Empty rod centered in a 13-char space
                    System.out.print("      " + ROD_CHAR + "      ");
                }
            }
            System.out.println();
        }

        // Foundation
        System.out.println("    ──┴───────┴───────┴──");
        System.out.println("      PEG 1   PEG 2   PEG 3\n");
    }

    private String renderTexturedDisk(int size) {
        // Each 'size' unit adds one block to each side of the rod
        String side = DISK_CHAR.repeat(size);
        String diskStr = side + size + side; // e.g., "▓▓1▓▓"

        // Total width of a peg's space is 13 characters
        int totalWidth = 13;
        int padding = (totalWidth - diskStr.length()) / 2;

        StringBuilder sb = new StringBuilder();
        sb.append(" ".repeat(padding));
        sb.append(diskStr);
        sb.append(" ".repeat(totalWidth - diskStr.length() - padding));

        return sb.toString();
    }

    public void instructions() {
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                       TOWER OF HANOI: RECURSIVE LOGIC                        ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║                                                                              ║");
        System.out.println("║  Objective:                                                                  ║");
        System.out.println("║  Move the entire stack of disks from PEG 1 to PEG 3.                         ║");
        System.out.println("║                                                                              ║");
        System.out.println("║  The Three Golden Rules:                                                     ║");
        System.out.println("║  1. Only ONE disk can be moved at a time.                                    ║");
        System.out.println("║  2. Each move involves taking the top disk and placing it on another peg.    ║");
        System.out.println("║  3. No larger disk may be placed on top of a smaller disk.                   ║");
        System.out.println("║                                                                              ║");
        System.out.println("╠══════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║                               EXPECTED GOAL STATE                            ║");
        System.out.println("║                                                                              ║");
        System.out.println("║             │             │             │                                    ║");
        System.out.println("║             │             │           ▓▓1▓▓                                  ║");
        System.out.println("║             │             │          ▓▓▓2▓▓▓                                 ║");
        System.out.println("║             │             │         ▓▓▓▓3▓▓▓▓                                ║");
        System.out.println("║         ────┴─────────────┴─────────────┴────                                ║");
        System.out.println("║             PEG 1         PEG 2         PEG 3                                ║");
        System.out.println("║                                                                              ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝");

        int optimal = (int)(Math.pow(2, numDisks) - 1);
        System.out.println("\n[SYSTEM]: Minimum complexity for " + numDisks + " disks: " + optimal + " moves.");
        System.out.println("================================================================================\n");
    }
}
