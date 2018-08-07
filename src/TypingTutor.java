import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor {
	JFrame jf= new JFrame();
	JLabel jl = new JLabel();
	
	char currentLetter;
	
public static void main(String[] args) {
	TypingTutor tt = new TypingTutor();
tt.drawFrame();
}
void drawFrame() {
	jf.setVisible(true);
	jf.setTitle("Type or Die");
	jf.add(jl);
	currentLetter = generateRandomLetter();
	String cl = String.valueOf(currentLetter);
jl.setText(cl);
jl.setFont(jl.getFont().deriveFont(28.0f));
jl.setHorizontalAlignment(JLabel.CENTER);


	
jf.pack();
}

char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}

}
