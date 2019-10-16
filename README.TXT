Overall, you have a good and useful structure.
The program works well (when edited - see below) and 
plays the game well.

A couple of ragged-around-the-edges issues:

I *did* say that you did not need Javadoc comments on every method,
but that you needed header comments with your names.  You ALWAYS need
header comments with your names!
(-1.0 in Javadoc)

You declare constants ROCK, PAPER, and SCISSORS up top in RPSMatch (lines 1-18) but you
don't make use of those constants in the RPSMatch.java code. 
In RPSMatch.java, in the setCompSign [lines 56-60], getCompText() [lines 74-79] and 
getResult() [line 105] methods, it becomes much clearer if you use ROCK instead of 0, 
for example.
(-0.5 in Style)

Big picture, this is good code, but needs a little polishing.