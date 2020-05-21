# Tetris 2.0
[![Made with JAVA](https://img.shields.io/badge/Made_with-JAVA-1abc9c.svg)](https://en.wikipedia.org/wiki/Java_(programming_language))

Tetris 2.0 is a simple yet challenging console-based game written in pure java. 
It is designed with simplicity in mind. 

This is my solution for the final assignment question I have set for my first year students who are taking programming course (Fundamentals of Programming) at the [University of Malaya](https://www.um.edu.my/).
The complete question set can be found [here](https://github.com/kphilemon/tetris-2.0/blob/master/Tetris%202.0%20Question.pdf).

Disclaimer: this is not the one-and-only solution for the question.

## Getting Started
Clone, compile and run right away!

**1. Clone the repository**
```
git clone https://github.com/kphilemon/tetris-2.0.git
```
**2. Go to the src directory**
```
cd your_path_to_project\tetris-2.0\src
```
**3. Compile the source files**
```
javac *.java
```
**4. Run the program**
```
java Main
```

## Game Play
 ![gameplay.gif](https://github.com/kphilemon/tetris-2.0/blob/master/gameplay.gif)

## Game Description
Imagine, Tetris blocks are no longer falling from the top because it’s boring and annoying as hell.

In `Tetris 2.0`, Tetris blocks can be placed by yourself anywhere you want on the Tetris board (of course it must be able to fit in and not overlapped), without any time constraint and gravity. No more pressure of Tetris blocks falling!

The scoring rules are about the same but it’s more interesting this time - you get points for eliminating not only `fully-filled` horizontal rows but also vertical columns if and only if the numbers inside the squares of the row or column `sums up to even`!

### How to play?
1. Use the `arrow keys` (up, down, left, right) to move the Tetris block.

2. Press `w` to rotate the block.

3. Press `s` to put the block on hold.

4. Press `space` to insert at the previewed location (denoted by + sign).

5. Think twice before inserting because only fully-filled rows or columns with even sums can be eliminated.

6. Eliminate as many rows and columns as possible to beat the high score!

**Note:** If the arrow keys do not work, click on the small window at the top left corner and try again.

## Author
Connect with me on [LinkedIn](https://www.linkedin.com/in/philemon-khor/) or follow me on [Github](https://github.com/kphilemon).


## License
This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/kphilemon/tetris-2.0/blob/master/LICENSE.md) file for details
