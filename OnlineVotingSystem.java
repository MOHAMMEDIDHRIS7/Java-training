public class OnlineVotingSystem {
    public static void main(String[] args) {
        String[] candidates = {"krishna", "santhosh", "idris"};
        int[] votes = {3, 5, 2};   // sample votes

        System.out.println("=== Online Voting System ===");
        System.out.println("Candidates List:");

        for (int i = 0; i < candidates.length; i++) {
            System.out.println((i + 1) + ". " + candidates[i]);
        }

        // Display votes
        System.out.println("\nVotes Received:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i] + " : " + votes[i] + " votes");
        }

        // Find winner
        int maxVotes = votes[0];
        String winner = candidates[0];

        for (int i = 1; i < votes.length; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winner = candidates[i];
            }
        }

        System.out.println("\nWinner is: " + winner + " with " + maxVotes + " votes");
    }
}