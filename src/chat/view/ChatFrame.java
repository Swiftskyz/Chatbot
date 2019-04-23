package chat.view;

import javax.swing.JFrame;

import chat.controller.ChatController;

public class ChatFrame
{
	private ChatController app;
	private ChatPanel appPanel;
	
	public ChatFrame(ChatController app)
	{
		super();
		this.app = app;
		this.appPanel = new ChatPanel(app);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 600);
		this.setTitle("Chatbot 2.0");
		this.setResizable(false);
		this.setVisible(true);
	}

	private void setContentPane(ChatPanel appPanel2)
	{
		// TODO Auto-generated method stub
		
	}

	private void setSize(int i, int j)
	{
		// TODO Auto-generated method stub
		
	}

	private void setTitle(String string)
	{
		// TODO Auto-generated method stub
		
	}

	private void setResizable(boolean b)
	{
		// TODO Auto-generated method stub
		
	}

	private void setVisible(boolean b)
	{
		// TODO Auto-generated method stub
		
	}

	public ChatPanel getContentPane()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Object getTitle()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
