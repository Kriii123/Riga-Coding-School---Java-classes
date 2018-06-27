import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String q1 = "What color are apples?\n" + "(a)red/green\n(b)orange\n(c)magneta\n";
		String q2 = "What color are bananas?\n" + "(a)red/green\n(b)yellow\n(c)blue\n";
		
		Questions [] questions = {
				new Questions(q1, "a"),
				new Questions(q2, "b")
		};
		takeTest(questions);

	}
	
	public static void takeTest(Questions [] questions) {
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);
		
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			System.out.print("Your answer:");
			String answer = keyboardInput.nextLine();
			System.out.println();
			if(answer.equals(questions[i].answer)) {
				score++;
			}
		}
		System.out.println("You got " + score + "/" + questions.length);
	}

}
