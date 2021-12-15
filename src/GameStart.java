
public class GameStart {
	public static void main(String[] args) {
		int gamesTurns[] = new int[1000];
		boolean gamesStatus[] = new boolean[1000];
		
		for (int i = 0; i < 1000; i++) {
			Result result = Game.run();
			gamesTurns[i] = result.turns;
			gamesStatus[i] = result.status;
			if ((i+1)%10 == 0) {
				System.out.println((1+i)/10 + "%");
			}
		}
		
		System.out.println("Player1 win rate is: " + ((float)ArrayCalculation.countBoolean(gamesStatus))/1000);
		System.out.println("Max turns is: " + ArrayCalculation.max(gamesTurns));
		System.out.println("Min turns is: " + ArrayCalculation.min(gamesTurns));
		System.out.println("Average turns is: " + ArrayCalculation.average(gamesTurns));
	}
}