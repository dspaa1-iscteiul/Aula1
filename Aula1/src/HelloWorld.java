import javax.swing.JFrame;
import javax.swing.JTextField;

public class HelloWorld {

	public static void main(String[] args) {
		JFrame text = new JFrame();
		text.add(new JTextField("Hello World"));
		System.out.println("Hello World");
		text.pack();
		text.setLocationRelativeTo(null);
		text.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		text.setVisible(true);
	}

}
