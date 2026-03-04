# Logic Lab: The Interactive Solver 🧩

Welcome to the **Logic Lab**, a Java-based suite of classic algorithmic puzzles. Instead of just reading code,you can **play** and solve these challenges yourself directly from your terminal!



## 🎮 How to Play
1. **Clone & Compile**: 
   ```bash
   javac Main.java
   java Main
Select a Challenge: Choose from the menu to start a session.Solve: Input your moves (e.g., move 3 to 1 for Tower of Hanoi) and the system will validate your logic in real-time.📂 Interactive Challenges🧩 The ClassicsN-Queens Solver: Try to place $N$ queens on the board without any of them attacking each other. The system will highlight illegal placements.Tower of Hanoi: Can you move the stack in the minimum number of moves? ($2^n - 1$)8-Puzzle Tile: Use your arrow keys or coordinates to slide tiles into the correct order.🛶 Logic & StrategyMissionaries & Cannibals: A text-based survival game. Choose who gets on the boat, but don't let the missionaries be outnumbered!Tic-Tac-Toe: Play against a friend or test your luck against our Minimax AI.Map-Coloring: Assign colors to different "provinces" and see if you can complete the map without touching identical colors.
---

## 🛠️ Implementation Strategy

To make this user-friendly, focus on these three Java classes for each problem:

1.  **`Board.java`**: Handles the visual representation (printing the grid/state to the console).
2.  **`Validator.java`**: Contains the `isValidMove()` logic. This is the "brain" of your toy problem.
3.  **`GameEngine.java`**: The `while` loop that takes `Scanner` input and updates the state.

---

## 💡 Next Step
Would you like me to generate the **Java code for the `Main` menu** and the **`Tower of Hanoi` interactive logic** to get your interactive suite started?
