public class Chatbot {
	
	public static String input = "";
	public static String response = null;
	public static boolean uResponded;
	static Bot jerry;
	static botFrame frame;

	public void userResponded(String s) {
		uResponded = true;
		if (s.equals("bye")) {
			frame.answer("It's very nice to chat with you. Looking forward to talking with you next time!");
		} else {
			response = jerry.generateResponse(s);
			frame.answer(response);
		}
		
	}
	//public void botResponded() {
	//	uResponded = false;
	//	
	//}
	
	public static void main(String[] args) {
		frame = new botFrame();
		jerry = new Bot();

		
		//while (true) {
		//	if (uResponded) {
		//		if (!input.equals("bye")) {
//
//					response = jerry.generateResponse(input); 
//					frame.answer(response);
//
//				}
//				else {
//					System.out.println("Bot: \t" + "It's very nice to chat with you. Looking forward to talking with you next time!"); 
//					break; 
//				}
//			} 
//	  
  //		}
	}
}
