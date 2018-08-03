import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.io.File;

/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton;

	private JPanel jp2;
	int prizeMoney2= 200;
	int prizeMoney4= 400;
	int prizeMoney6= 600;
	int prizeMoney8= 800;
	int score = 0;
	JLabel scoreBox = new JLabel(""+score);
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame jf = new JFrame();
		jp2 = new JPanel();
		jf.setLayout(new BorderLayout());

		// 1. Make the frame show up
		jf.setVisible(true);
		// 2. Give your frame a title
		jf.setTitle("JEOPARDY");
		// 3. Create a JPanel variable to hold the header using the createHeader method
		JPanel jp = createHeader("Questions");
		// 4. Add the header component to the quizPanel
		jp2.add(jp);
		// 5. Add the quizPanel to the frame
		jf.add(jp2);

		// 6. Use the createButton method to set the value of firstButton
		firstButton = createButton("$200");

		// 7. Add the firstButton to the quizPanel
		jp2.add(firstButton);
		// 8. Write the code inside the createButton() method below. Check that your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the createButton
		// method
		secondButton = createButton("$400");
		thirdButton = createButton("$600");
		fourthButton = createButton("$800");
		jp2.add(thirdButton);
		jp2.add(fourthButton);
		// 10. Add the secondButton to the quizPanel
		jp2.add(secondButton);
		// 11. Add action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		thirdButton.addActionListener(this);
		fourthButton.addActionListener(this);
		// 12. Fill in the actionPerformed() method below

		jf.pack();
		jp.setLayout(new GridLayout(buttonCount + 1, 3));
		jf.add(makeScorePanel(), BorderLayout.NORTH);
		jf.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 13. Use the method provided to play the Jeopardy theme music
		playJeopardyTheme();
		// 14. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
		jf.add(jb1000);
		jf.add(jb800);
		jf.add(jb600);
		jf.add(jb400);
		jf.add(jb200);
	}

	JButton jb200 = new JButton();
	JButton jb400 = new JButton();
	JButton jb600 = new JButton();
	JButton jb800 = new JButton();
	JButton jb1000 = new JButton();

	private JButton createButton(String dollarAmount) {

		// Create a new JButton
		JButton jb1 = new JButton();
		// Set the text of the button to the dollarAmount
		jb1.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
		buttonCount++;
		// Return your new button instead of the temporary button

		return jb1;
	}

	public void actionPerformed(ActionEvent arg0) {
		// Remove this temporary message:
		JOptionPane.showMessageDialog(null, "pressed " + ((JButton) arg0.getSource()).getText() + " button");

		// Use the method that plays the jeopardy theme music.

		JButton buttonPressed = (JButton) arg0.getSource();
		// If the buttonPressed was the firstButton
		if (buttonPressed == firstButton) {
			// Call the askQuestion() method
			askQuestion("a remake of this scary movie was released on 6/6/2006 30 years after the release of the original", "What is The Omen", buttonCount);
		
		}if (buttonPressed == secondButton) {
			// Call the askQuestion() method
			askQuestion("a remake of this scary movie was released on 6/6/2006 30 years after the release of the original", "What is The Omen", buttonCount);
		
		}if (buttonPressed == thirdButton) {
			// Call the askQuestion() method
			askQuestion("a remake of this scary movie was released on 6/6/2006 30 years after the release of the original", "What is The Omen", buttonCount);
		
		}if (buttonPressed == fourthButton) {
			// Call the askQuestion() method
			askQuestion("a remake of this scary movie was released on 6/6/2006 30 years after the release of the original", "What is The Omen", buttonCount);
		
		}
		// Fill in the askQuestion() method. When you play the game, the score should
		// change.

		// Or if the buttonPressed was the secondButton

		// Call the askQuestion() method with a harder question

		// Clear the button text (set the button text to nothing)

	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		// Remove this temporary message
		String q = JOptionPane.showInputDialog(
				"since 1986, Reaching the quarterFinals of this event has entitled you to free tickets and free tea for life");
		
		
		
		
		
		// Use a pop up to ask the user the question

		// If the answer is correct
		if (q.equals("What is Wimbledon")) {
			JOptionPane.showMessageDialog(null, "correct");
			score+=prizeMoney2;
			scoreBox.setText("score:"+score);
		}else {
			score-=prizeMoney2;
			scoreBox.setText("score:"+score);
			JOptionPane.showMessageDialog(null, "NOPE");
		}
		String r = JOptionPane.showInputDialog(
				"a remake of this scary movie was released on 6/6/2006 30 years after the release of the original");
		// Use a pop up to ask the user the question

		// If the answer is correct
		if (r.equals("What is The Omen")) {
			JOptionPane.showMessageDialog(null, "correct");
			score+=prizeMoney4;
			scoreBox.setText("score:"+score);
		}else {
			score-=prizeMoney4;
			scoreBox.setText("score:"+score);
			JOptionPane.showMessageDialog(null, "NOPE");
		}
		String s = JOptionPane.showInputDialog(
				"Mike Ditka & Tony Dorsett prowled the field as Panthers for this school");
		// Use a pop up to ask the user the question

		// If the answer is correct
		if (s.equals("What is University of Pittsburgh")) {
			JOptionPane.showMessageDialog(null, "correct");
			score+=prizeMoney6;
			scoreBox.setText("score:"+score);
			
		}else {
			score-=prizeMoney6;
			scoreBox.setText("score:"+score);
			JOptionPane.showMessageDialog(null, "NOPE");
		}
		String t = JOptionPane.showInputDialog(
				"a remake of this scary movie was released on 6/6/2006 30 years after the release of the original");
		// Use a pop up to ask the user the question

		// If the answer is correct
		if (t.equals("What is The Omen")) {
			JOptionPane.showMessageDialog(null, "correct");
			score+=prizeMoney8;
			scoreBox.setText("score:"+score);
		}else {
			score-=prizeMoney8;
			scoreBox.setText("score:"+score);
			JOptionPane.showMessageDialog(null, "NOPE");
		}
		// Increase the score by the prizeMoney

		// Call the updateScore() method

		// Pop up a message to tell the user they were correct

		// Otherwise

		// Decrement the score by the prizeMoney

		// Pop up a message to tell the user the correct answer

		// Call the updateScore() method
updateScore();
	}

	public void playJeopardyTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/jeopardy.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		scoreBox.setText("score:"+score);
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("score:" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
