package sandeep1;
import java.util.HashMap;
import java.util.Map;

public class sandy12 {

	    private Map<String, Integer> scores;
	    public sandy12() {
	        scores = new HashMap<>();
	    }

	    // Add a player and their score to the scoreboard
	    public void addScore(String player, int score) {
	        if (scores.containsKey(player)) {
	            int currentScore = scores.get(player);
	            scores.put(player, currentScore + score);
	        } else {
	            scores.put(player, score);
	        }
	    }

	    // Get the score of a specific player
	    public int getScore(String player) {
	        return scores.getOrDefault(player, 0);
	    }

	    // Display the scoreboard
	    public void displayScores() {
	        System.out.println("===== Scoreboard =====");
	        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        System.out.println("======================");
	    }

	    public static void main(String[] args) {
	    	sandy12 scoreboard = new sandy12();

	        // Add scores for players
	        scoreboard.addScore("Player1", 10);
	        scoreboard.addScore("Player2", 15);
	        scoreboard.addScore("Player1", 50); // Increase Player1's score

	        // Display the scores
	        scoreboard.displayScores();

	        // Get and display a specific player's score
	        String playerName = "Player2";
	        int playerScore = scoreboard.getScore(playerName);
	        System.out.println(playerName + "'s Score: " + playerScore);
	    }
	}


