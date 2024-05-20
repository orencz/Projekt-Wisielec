import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    private String currentWord;
    private char[] guessedWord;
    private int attempts;
    private HashSet<Character> guessedLetters;
    private WordManager wordManager;

    public HangmanGame(WordManager wordManager) {
        this.wordManager = wordManager;
        this.guessedLetters = new HashSet<>();
    }

    public void startGame(String difficulty) {
        currentWord = wordManager.getRandomWord(difficulty);
        guessedWord = new char[currentWord.length()];
        attempts = 6;
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }
    }

    public boolean makeGuess(char guess) {
        guessedLetters.add(guess);
        boolean correct = false;
        for (int i = 0; i < currentWord.length(); i++) {
            if (currentWord.charAt(i) == guess) {
                guessedWord[i] = guess;
                correct = true;
            }
        }
        if (!correct) {
            attempts--;
        }
        return correct;
    }

    public boolean isGameOver() {
        return attempts <= 0 || new String(guessedWord).equals(currentWord);
    }

    public boolean isWin() {
        return new String(guessedWord).equals(currentWord);
    }

    public String getGuessedWord() {
        return new String(guessedWord);
    }

    public int getAttemptsLeft() {
        return attempts;
    }

    public HashSet<Character> getGuessedLetters() {
        return guessedLetters;
    }
}
