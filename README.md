# 🎯 Hangman

A classic letter-guessing **Hangman** game built in Java. Try to guess the hidden word, one letter at a time, before you run out of lives, and the hangman is complete!

![Java](https://img.shields.io/badge/Language-Java-blue.svg)
![Beginner Project](https://img.shields.io/badge/Level-Beginner-brightgreen)
![Console Game](https://img.shields.io/badge/Type-Console--App-lightgrey)

---

## ✨ Features

### 🧠 Random Word Generator
- Pick a random word from a list of 30 predefined words.
- Varies in length and difficulty to keep the game unpredictable.

### ❗ Limited Lives System
- You get **7 incorrect attempts** to guess the word.
- Each wrong guess draws a new part of the hangman.

### 📉 Real-time Hangman Drawing
- Dynamically updates the ASCII art after every wrong guess.
- Clearly shows your remaining lives visually and numerically.

### 🔠 Letter-by-Letter Guessing
- Guess a single letter per round.
- If the letter exists, all matching positions are revealed.
- If not, you lose a life and the drawing progresses.

### 🛡️ Validated Input
- Accepts only **one alphabet character** per guess.
- Prevents input of numbers, symbols, or empty values.
- Graceful handling of invalid input with user-friendly messages.

### 🧼 Clean Game Loop
- Shows the word's progress after every guess.
- Ends with a **win message** or a **game over screen** revealing the word.

---

## 🚀 Getting Started

### 📦 Requirements

- Java 8 or above
- Any terminal or command line interface

### 🛠️ How to Run
Download the jar file from the releases section
```bash
java -jar hangman.jar
```
Try it on [Replit](https://replit.com/@yago-xd/tictactoe)

---

## 🎮 How to Play

1. The game will pick a random word.
2. You'll see it hidden using underscores (`_`) to represent each unknown letter.
3. You have **7 lives** — every incorrect guess removes one.
4. On your turn:
    - Enter a **single alphabet character** (e.g., `a`, `m`, `z`).
    - If correct, the letter will appear in its position(s).
    - If wrong, a new part of the hangman is drawn.
5. Your progress is shown after every guess.
6. The game ends when:
    - ✅ You guess all letters correctly (You win!)
    - ❌ You use all seven wrong attempts (Game Over)

---

## 🧠 Future Improvements

- ♻️ Replay support after a game ends
- 🪨 Word list from a file
- 📚 Word categories (e.g., fruits, places, animals)
- 🎯 Difficulty levels (short, medium, long words)
- 🎨 GUI version using Java Swing
- 🤝 Multiplayer mode (Player 1 sets word, Player 2 guesses)

---

## 🔧 Tools Used

- Java 17 (or Java 8+)
- IntelliJ IDEA or any Java IDE
- Terminal or command line interface
- Git + GitHub

---

## 🙌 Author Notes

This Hangman game was built to help practice:

- `char[]` arrays for tracking word progress
- Loops and conditions for real-time game flow
- User input validation
- ASCII art rendering
- Game loop design with a clear end condition

If you're new to Java and want to get hands-on with real logic building, this is a great beginner project. You’ll reinforce how to combine arrays, loops, methods, and interactivity all in one place.

---

## 🖥️ Sample Output

```console
Welcome to Hangman!
You will need to guess a random word based on its length
You have 7 wrong attempts before the game ends
Guess only 1 letter of the word at a time
The word is displayed after every guess
Good luck!
-------------------------

❤️ Lives: 7

   ____________
   |          |
   |
   |
   |
   |
   |
   |
   |
___|___

Word: _____

Guess a letter in the word: e
Correct guess!
❤️ Lives: 7

   ____________
   |          |
   |
   |
   |
   |
   |
   |
   |
___|___

Word: ____e

Guess a letter in the word: a
Wrong guess!
❤️ Lives: 6

   ____________
   |         _|_
   |        /   \
   |       |     |
   |        \_ _/
   |
   |
   |
   |
___|___

Word: ____e

Guess a letter in the word: i
Correct guess!
❤️ Lives: 6

   ____________
   |         _|_
   |        /   \
   |       |     |
   |        \_ _/
   |
   |
   |
   |
___|___

Word: __i_e

Guess a letter in the word: s
Correct guess!
❤️ Lives: 6

   ____________
   |         _|_
   |        /   \
   |       |     |
   |        \_ _/
   |
   |
   |
   |
___|___

Word: s_i_e

Guess a letter in the word: m
Correct guess!
❤️ Lives: 6

   ____________
   |         _|_
   |        /   \
   |       |     |
   |        \_ _/
   |
   |
   |
   |
___|___

Word: smi_e

Guess a letter in the word: l
Correct guess!
❤️ Lives: 6

   ____________
   |         _|_
   |        /   \
   |       |     |
   |        \_ _/
   |
   |
   |
   |
___|___

Word: smile
You have won the game!
You have guessed the word smile correctly
```