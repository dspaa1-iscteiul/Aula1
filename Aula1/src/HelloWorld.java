import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * 
 * @author dariop
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		JFrame text = new JFrame();
		text.add(new JTextField("Hello World"));
		text.pack();
		text.setLocationRelativeTo(null);
		text.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		text.setVisible(true);
	}
	
	public void nada() {
		
	}

}
