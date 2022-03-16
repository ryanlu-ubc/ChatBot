public class Chatbot {
	
	public static String input = "";
	public static String response = null;
	public static boolean uResponded;
	
	public void userResponded() {
		uResponded = true;
	}
	public void botResponded() {
		uResponded = false;
	}
	
	public static void main(String[] args) {
		botFrame frame = new botFrame();
		Bot jerry = new Bot();

		
		while (true) {
			if (uResponded) {
				if (!input.equals("bye")) {

					response = jerry.generateResponse(input); 
					frame.answer(response);

				}
				else {
					System.out.println("Bot: \t" + "It's very nice to chat with you. Looking forward to talking with you next time!"); 
					break; 
				}
			} 
	  
  		}
	}
}
