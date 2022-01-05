# Knight Of The Wind Demo
Working demo of Knight of the Wind: a (hardcore) text-based single player fantasy role-playing game written in Java. 

Exactly what it says on the tin. KotW is a game novel inspired by old CYOA books, DnD, other interactive novels like Magium, and a little bit of Pokémon fused with Dark Souls.

You play as a knight from the kingdom of Ventus. In this two-chapter demo, you are sent to a remote town to investigate the beginnings of a nefarious plot... well, you may have bitten off more than you can chew. Features working combat, dialogue, and narration systems. Battles are hard but never unfair or unbeatable. Slay your foes, consider your actions carefully, and try your best to advance the plot. Remember that if you die, you have to go back to the very beginning. No save scumming allowed. Peace.

Design patterns used:

1) Mediator (see #Combat)
2) Singleton (see #Player #ContinueGame)
3) Decorator (see #Weapon)
4) Factory (see #MonsterFactory)
5) Strategy (see #Combat #MoveStrategy #MoveSpecial)

Coding practices observed:

1) Proper spacing and indentations were applied.
2) Classes were designed to be as single-purpose as possible.
3) Java naming conventions were followed (classes, packages, etc.).
4) The use of design patterns were highlighted in the code.
5) Comments were placed in blocks of code to add space and clarity.
6) Javadoc entries were written briefly and concisely, detailing the purpose of a class or a method in the program as needed.
7) Memory was managed up to the extent that Java allows.
8) Classes were arranged into their own sub-packages for neat and proper organization.
9) Proper annotations were written in the code. Programmer’s TODO stubs were marked as DONE after completion of task.
10) Classes and methods were given obvious names.
11) Variables were used to store hardcoded numbers/values instead of using them directly.
12) Initializations that are unnecessary were minimized.
13) Code was tested by parts during development (development started on September 20, 2021, first demo finished on December 20, 2021).
