# Contributing to Logic Lab 🤝

First off, thank you for considering contributing! This project is a space for developers to practice algorithmic thinking through interactive terminal games.

---

## 🚀 How to Add a New Problem

To keep the repository organized and the user experience consistent, please follow our **Three-Class Architecture**:

1. **The Board (`XBoard.java`)** — Stores the state of the puzzle and handles the terminal rendering logic.
2. **The Validator (`XValidator.java`)** — Contains the logic to check if a user's move is legal according to the rules of the problem.
3. **The Engine (`XEngine.java`)** — The main game loop that handles user input, communicates with the validator, and updates the board.

### Folder Structure

Place your files in a new sub-directory under `src/`:

```text
src/
└── your-problem-name/
    ├── YourProblemBoard.java
    ├── YourProblemValidator.java
    └── YourProblemEngine.java
```

---

## 🛠️ Contribution Guidelines

- **Logic First** — Ensure the logic is sound. If the problem involves an "unbeatable" AI (like Tic-Tac-Toe), please implement the Minimax algorithm or similar adversarial search.
- **Code Style** — Use `PascalCase` for class names and `camelCase` for methods. Provide comments for complex algorithmic steps (especially in backtracking, recursion, or heuristic calculations).
- **Documentation** — If you add a problem, briefly update the `README.md` with a description of the puzzle and its mathematical background (e.g., Space Complexity $O(n)$).

---

## 📬 Submitting a Pull Request

1. Fork the repository.
2. Create your feature branch: `git checkout -b feature/new-puzzle`
3. Commit your changes: `git commit -m 'Add Sudoku Solver'`
4. Push to the branch: `git push origin feature/new-puzzle`
5. Open a Pull Request and describe how your implementation works.

---

## 📝 Complexity Standards

We love puzzles that challenge the brain! If your solution involves a specific search algorithm — BFS, DFS, A\*, or Alpha-Beta Pruning — please mention it in your PR.

---

*By contributing, you agree that your work will be licensed under the **MIT License**.*
