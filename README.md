# POKER - Poker hand calculation tool

POKER includes

- A poker hand calculator 

- A hand evaluation tool 

## The Game of Poker
Poker is a gambling card game dating back to the early 19th century. There are a great 
many variations of the game, but for this project we will just consider the simple 
5-card game, leaving out much of the subtlety of the game involving betting and bluffing.

Poker is written in Java 1.7 using Swing, and will run on any major OS 
with Java installed.

## Examples
For example, this input:
java Poker 2H TH AS AD TC
should produce this output:
Player 1: Aces over 10s
This input:
java Poker 2H TH 1S 1D TC
Should produce this output:
Error: invalid card name ’1S’
This input:
java Poker KS 9S QS AS JS 3D 7C 3S 3H 7S
Should produce this output:
Player 1: Ace-high flush
Player 2: 3s full of 7s
Player 2 wins.
This input:
java Poker qc jc 2h 7s 9h qd jd 2s 7c 9s 9c 7d 2c jh qh 9d 7h 2d js qs
Should produce this output:
Player 1: Queen-high
Player 2: Queen-high
Player 3: Queen-high
Player 4: Queen-high
Players 1, 2, 3 and 4 draw.