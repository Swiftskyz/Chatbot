package chat.controller;

import javax.swing.JOptionPane;

//import section
//import java.util.ArrayList;
//import javax.swing.JFrame;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
import chat.model.Chatbot;

public class ChatController
{
	private Chatbot simpleBot;
	private ChatFrame appFrame;
	
	public ChatController()
	{
		simpleBot = new Chatbot();
		appFrame = new ChatFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public String interactWithChatbot(String text)
	{
		String output = "";
		if(text == null)
		{
			output += "You really should not send null";
		}
		String userInput = JOptionPane.showInputDialog(null, "Hello, what would you like to talk about?");
		String chatbotSays = simpleBot.processText(userInput); 
		return chatbotSays;
	}

	public String useChatbotCheckers(String text)
	{
		return null;
	}

	
}

	//public class chatcontroller extends JFrame
//{

	
	//private JTextArea Chatarea = new JTextArea();
	//private JTextField chatbox = new JTextField();
	//public chatcontroller()
	//{
		//JFrame frame = new JFrame();
		//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//frame.setVisible(true);;
		//frame.setResizable(false);
		//frame.setLayout(null);
		//frame.setSize(600 , 600);
		//frame.setTitle("ChatBot");
		//frame.add(chatbox);
		///Chat Area, format picture.
		//Chatarea.setSize(500 , 400);
		//Chatarea.setLocation(2, 2);
		//TextField
		//chatbox.setSize(540, 30);
		//chatbox.setLocation(2, 550);
	//}
//}