public class Chatbot {
	
	public static String input = null;
	public static String response = null;
	public static boolean responded = false;
	

	
	public static void main(String[] args) {
		botFrame frame = new botFrame();
		Bot jerry = new Bot();

		
		while (true) {
			while (!responded) {
				//wait
			}
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
