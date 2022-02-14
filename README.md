# Lost and Confused

## Install Instructions

### Windows:

1. Download the **ZIP-file**.
2. Extract the **ZIP-file** at your desired destination.
3. Enter the extracted folder and double click on **App.bat** to run the game.

### Linux:

1. Copy the HTTPS link from the GitHub-page.
2. In the terminal, write **"git clone '*the link*'"**. 
3. Enter the new folder with **"cd *directory name/*".**
4. Write **"chmod a+x App.sh"** in the terminal.
5. Write **"./App.sh"** in the terminal to run the game.

  
## Description
  
**Lost and Confused** is a text-based adventure game where you'll follow a branching path through a forest, trying to escape.
While trying to escape, the player will encounter random events which will affect the player in both positive and negative ways.

### Player.java - Gabbi

Keeps track of the players health and inventory, with methods to match. Gets called on by the other classes.

### Events.java - Andreas
Contains all the events that can occur during the game and modifies the inventory and health for the Player-class.

### GenerateEvent.java - Patrick

Generates the events from the Events-class with random chances and keeps track of distance traveled.

### Main.java

The main-method was mainly written by Patrick, but everyone has work on it in some way.
