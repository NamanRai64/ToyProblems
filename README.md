# Logic Lab: The Interactive Solver 🧩

Welcome to the **Logic Lab**, a Java-based suite of classic algorithmic puzzles. Instead of just reading code, you can **play** and solve these challenges yourself directly from your terminal!



## 🎮 How to Play

1.  **Clone & Compile**:
    ```bash
    javac Main.java
    java Main
    ```
2.  **Select a Challenge**: Choose from the menu to start a session.
3.  **Solve**: Input your moves (e.g., `1 3` to move a disk from Peg 1 to Peg 3 in Tower of Hanoi) and the system will validate your logic in real-time.

---

## 📂 Interactive Challenges

### 🧩 The Classics
* **N-Queens Solver**: Try to place $N$ queens on the board without any of them attacking each other. The system will highlight illegal placements.

* **Tower of Hanoi**: Can you move the stack in the minimum number of moves? ($2^n - 1$)

* **8-Puzzle Tile**: Use your arrow keys or coordinates to slide tiles into the correct order.


### 🛶 Logic & Strategy
* **Missionaries & Cannibals**: A text-based survival game. Choose who gets on the boat, but don't let the missionaries be outnumbered!

* **Tic-Tac-Toe**: Play against a friend or test your luck against our **Minimax AI**.
  
* **Map-Coloring**: Assign colors to different "provinces" and see if you can complete the map without touching identical colors.

---

## 🛠️ Implementation Strategy

To make this user-friendly and maintainable, each problem is structured around three core Java classes:

1.  **`Board.java`**: Handles the visual representation, rendering the grid or game state to the console.
2.  **`Validator.java`**: Contains the `isValidMove()` logic—the "brain" that enforces the rules of the toy problem.
3.  **`GameEngine.java`**: Manages the game loop, processes `Scanner` input, and updates the state.

---

## 📝 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
