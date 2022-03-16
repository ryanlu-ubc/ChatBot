import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class botFrame extends Chatbot implements ActionListener{
	
	JFrame frame = new JFrame();
	JLabel picture = new JLabel();
	JButton startButton = new JButton();
	JButton chatButton = new JButton();
	JTextField chatBox = new JTextField();
	JTextField outputBox = new JTextField();
	JTextArea test = new JTextArea();

	static String message = null;
	static String output = "";
	
	static String[][] inputText = {
			//standard greetings
			{"Hi", "Hello", "Hey", "Hola", "Ola"},
			//question greetings
			{"How are you", "What's up", "Sup", "How r you", "How r u", "How are u"},
			//age questions
			{"How old are you", "How old are u", "How old r you", "How old r u"},
			//name questions
			{"What is your name", "What's your name", "Do you have a name"},
			//location questions 
			{"Where do you live", "Where are you located", "Where do u live", "Where are u located", "Where r you located", "Where r u located"},
			//date questions
			{"What's the date today", "What is the date today"},
			//day questions
			{"What day is it today", "What is the day today", "What's the day today"},
			//weather questions
			{"What's the weather like", "How is the weather like", "What is the weather like", "How's the weather like"}
	};
			
			
	
	botFrame(){
		createFrame();
		createStartButton();
	}
	
	public void createFrame() {
		frame.setTitle("Friend Chatbot");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0xA9A9A9));
		frame.setLayout(null);
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	public void createStartButton() {
		frame.add(startButton);
		startButton.setBounds(250,400,100,50);
		startButton.setText("Chat With Me!");
		startButton.addActionListener(this);
	}
	
	public void createChatButton() {
		frame.add(chatButton);
		chatButton.setBounds(250,330,100,50);
		chatButton.setText("Enter");
		chatButton.addActionListener(this);
	}
	
	public void addChatBox() {
		frame.add(chatBox);
		chatBox.setBounds(60, 400, 500, 150);
		
//		outputBox.setEditable(false);
//		frame.add(outputBox);
//		
		test.setEditable(false);
		frame.add(test);
		
//		JScrollPane scrollOutputBox = new JScrollPane(outputBox,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//		frame.add(scrollOutputBox);
//		scrollOutputBox.setBounds(60, 50, 500, 150);
		
		
		JScrollPane scrollOutputBox = new JScrollPane(test,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		frame.add(scrollOutputBox);
		scrollOutputBox.setBounds(60, 50, 500, 150);


	}

	public static String getInput() {
		return message;
	}
	public void setOutput(String s) {
		output = s;
	}

	public void answer(String s) {
		test.append("test: " + s + "\n");
		chatBox.setText("");
		botResponded();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==startButton) {
			addChatBox();
			createChatButton();
			startButton.setVisible(false);
			chatButton.setVisible(true);
		}
		else if(e.getSource()==chatButton) {
			message = chatBox.getText();
			super.input = message;
			userResponded();
			test.append("ME:" + message + "\n");
			chatBox.setText("");
//			outputBox.setText(message);

//			if(message.contains(inputText)) {
//				test.append("TEST \n");  
//			}
			
			if(message.contains("Hello")) {
				test.append("TEST: Hi \n");  
			}
			
			
		}
		
	}

}
	