package hanoi;

public class HanoiBoard {
    private int numDisks;

    public int getNumDisks() {
        return numDisks;
    }
    public void setNumDisks(int numDisks) {
        this.numDisks = numDisks;
    }
    public HanoiBoard(int numDisks) {
        this.numDisks = numDisks;
    }
    public void displayBoard() {

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
