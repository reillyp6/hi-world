import javax.swing.JOptionPane;

public class AnimalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int answer = JOptionPane.showConfirmDialog(null, "Does the animal have moist skin?");
		boolean amphibian = (answer == JOptionPane.YES_OPTION);
		if (amphibian)
			JOptionPane.showMessageDialog(null, "The animal is an amphibian");
		else {
			answer = JOptionPane.showConfirmDialog(null, "Does the animal have fins?");
			boolean fish = (answer == JOptionPane.YES_OPTION);
			if (fish)
				JOptionPane.showMessageDialog(null, "The animal is a fish.");
			else {
				answer = JOptionPane.showConfirmDialog(null, "Does the animal have feathers?");
				boolean bird = (answer == JOptionPane.YES_OPTION);
				if (bird)
					JOptionPane.showMessageDialog(null, "The animal is a bird.");
				else {
					answer = JOptionPane.showConfirmDialog(null, "Does the animal have hair or fur?");
					boolean mammal = (answer == JOptionPane.YES_OPTION);
					if (mammal)
						JOptionPane.showMessageDialog(null, "The Animal is a mammal");
					else {
						answer = JOptionPane.showConfirmDialog(null, "Does the animal have scales?");
						boolean reptile = (answer == JOptionPane.YES_OPTION);
						if (reptile)
							JOptionPane.showMessageDialog(null, "The animal is a reptile.");
						if (!reptile)
							;
						JOptionPane.showMessageDialog(null, "I don't know what the fuck that is.");

					}

				}
			}
		}

	}
}
