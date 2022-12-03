import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String name;
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> gifters = new ArrayList<String>();
		ArrayList<String> giftees = new ArrayList<String>();
		Random rand = new Random();

		System.out.println("Please input the participant's name: ");
		name = scanner.nextLine();

		while(!name.isBlank()){
			gifters.add(name);
			giftees.add(name);
			System.out.println("Please input the participant's name: ");
			name = scanner.nextLine();
		}

		while(!(gifters.isEmpty() && giftees.isEmpty())) {
			String gifter = gifters.get(rand.nextInt(0,gifters.size()));
			String giftee = giftees.get(rand.nextInt(0,giftees.size()));
			while(giftee.equals(gifter)){
				giftee = giftees.get(rand.nextInt(0,giftees.size()));
			}
			System.out.println(String.format("%s is going to gift %s",gifter,giftee));
			gifters.remove(gifter);
			giftees.remove(giftee);
		}
		System.out.println("\nMerry Christmas!!!");
	}
}