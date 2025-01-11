<h1 style="text-align: center;">"Order your way to victory!"</h1>

## TEST Game Description
"Order & Score" is a strategic and competitive game where players arrange numbers in the optimal order to achieve the highest score. Players must carefully plan their sequence to maximize their score using multiplication and differences between consecutive numbers. The game challenges both strategic thinking and tactical decision-making, making it fun and engaging for all.

---

## Game Setup
1. **The Numbers**:
   - Players are given the numbers `1, 2, 3, 4, 5….N`.

2. **The Scene**:
   - Imagine these numbers are lined up as options for the players to arrange in any order they wish.
   - Each sequence of numbers is unique, and no repetition is allowed.

3. **Goal**:
   - Players must create a sequence of the numbers that will result in the highest total score based on the scoring formula.

---

## Rules
1. **Game Objective**:
   - Arrange the numbers in a sequence that produces the highest total score.

2. **Scoring Formula**:
   - For any sequence of numbers `a, b, c, d, e`: Total = (a x 2) + |a - b| + (b x 2) + |b - c| + (c x 2) + |c - d| + (d x 2) + |d - e| + (e x 2)


3. **Sequence Choice**:
   - Each player selects a unique sequence of the numbers.
   - No two players can choose the same sequence.

4. **Turn-Based Picking Rule**:
    - Players take turns picking numbers to form their sequence.
    - A player cannot pick a number that has already been selected for the same position in their opponent's sequence.
    - The player who picks a number for a specific position gains the right to choose the next number for the subsequent position.
    - This continues until both players have completed their sequences.

5. **Winning the Game**:
    - Once all players have chosen their sequences, the scores are calculated using the scoring formula.
    - The player with the highest total score wins the game.

---

## Example of Turn-Based Picking
Let’s say **Player A** and **Player B** are playing. The numbers available are `1, 2, 3, 4, 5`.

**Round 1**:
   - Player A picks **5** for the first position in their sequence.
   - Player B cannot pick **5** for the first position, so they choose **4**.
   - Since Player B picked second, Player B now gets the right to pick the number for the second position.

### Round 2:
- Player B picks **2** for the second position in their sequence.
- Player A cannot pick **2** for the second position, so they choose **1**.
- Since Player A picked second, Player A now gets the right to pick the number for the third position.

### Round 3:
- Player A picks **3** for the third position.
- Player B cannot pick **3** for the third position, so they choose **5**.
- Since Player B picked second, Player B now gets the right to pick the number for the fourth position.

### Round 4:
- Player B picks **1** for the fourth position.
- Player A cannot pick **1** for the fourth position, so they choose **4**.
- Since Player A picked second, Player A now gets the right to pick the number for the fifth position.

### Round 5:
- Player A picks **2** for the fifth position.
- Player B cannot pick **2** for the fifth position, so they choose **3**.

### Final Sequences:
- **Player A’s Sequence**: `5 → 1 → 3 → 4 → 2`
- **Player B’s Sequence**: `4 → 2 → 5 → 1 → 3`

Both players can now calculate their scores using the scoring formula.

---

## Example Scoring
1. **Player A chooses the sequence: `54123`**
- **Score Calculation**:
  ```
  (5 x 2) + |5 - 4| + (4 x 2) + |4 - 1| + (1 x 2) + |1 - 2| + (2 x 2) + |2 - 3| + (3 x 2)
  = 10 + 1 + 8 + 3 + 2 + 1 + 4 + 1 + 6 = 36
  ```

2. **Player B chooses the sequence: `12345`**
- **Score Calculation**:
  ```
  (1 x 2) + |1 - 2| + (2 x 2) + |2 - 3| + (3 x 2) + |3 - 4| + (4 x 2) + |4 - 5| + (5 x 2)
  = 2 + 1 + 4 + 1 + 6 + 1 + 8 + 1 + 10 = 34
  ```

3. **Result**:
- Player A’s total score is **36**.
- Player B’s total score is **34**.
- **Player A wins!**

---

## Strategies
1. **Plan the Sequence**:
- Try to position larger numbers where their values will be maximized by multiplication.
- Minimize the absolute differences between consecutive numbers when possible.

2. **Adapt to Opponent Choices**:
- If playing competitively, select sequences that you believe will outperform your opponents' choices.

---

## Winning the Game
- The player with the highest total score at the end is crowned the **Order and Score Champion**.

---

## Implementation Overview
"Order & Score" is developed as a Java desktop application using the Swing library for the graphical user interface (GUI). The application allows players to interactively select and arrange numbers, calculate their scores, and view the results in a user-friendly interface.

By adopting the **MVC design pattern**, the application achieves a clear separation of concerns, ensuring modularity and ease of maintenance:
- **Model**: Manages the game's data, including the sequence of numbers, score calculation logic, and enforcement of game rules.
- **View**: Defines the graphical interface with buttons, labels, and panels, enabling players to visually interact with the game.
- **Controller**: Processes player actions, such as button clicks, updates the Model with player input, and refreshes the View to reflect the current game state.

---

## Development Phases
1. **Phase 1**:
Develop the basic self-playing mode, including features such as displaying the available numbers, allowing users to select numbers in their desired order, and calculating and displaying the total score after each selection.

2. **Phase 2**:
Develop a standalone server to enable multiplayer functionality, allowing users to connect via sockets and compete against each other online. Include a chat feature to facilitate communication during gameplay.

3. **Phase 3**:
Introduce a computer opponent mode, enabling users to play against an AI when not connected to other players.

