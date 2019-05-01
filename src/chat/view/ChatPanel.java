package chat.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import chat.controller.ChatController;
import chat.controller.IOController;

	public class ChatPanel extends JPanel
	{
		private JTextField chatField;
		private JTextArea chatArea;
		private JScrollPane chatPane;
		private JButton chatButton;
		private JButton checkerButton;
		private JButton loadButton;
		private JButton saveButton;
		private ChatController app;
		
	public ChatPanel(ChatController app)
	{
		super();
		this.app = app;
		SpringLayout appLayout = new SpringLayout();
		saveButton = new JButton("Save");
		loadButton = new JButton("Load");
		chatButton = new JButton("Chat");
		checkerButton = new JButton("Check Text");
		chatField = new JTextField("talk to the bot here", 50);
		chatArea = new JTextArea("Chat Area", 20, 50);
		chatPane = new JScrollPane();
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = chatField.getText();
				String response = "";
				response = appController.interactWithChatbot(userText);
				chatArea.append(response);
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
				chatField.setText("");
			}
		});
		
		saveButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click)
			{
				String chatText = chatArea.getText();
				String path = ".";
				IOController.saveText(appController, path, chatText);
				chatArea.setText("Chat saved!");
			}
		});
		
		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String path = getPath("load");
				String chatText = IOController.class.loadFile(appController, path);
				chatArea.setText(chatText);
			}
		});
		
		tweetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String textToTweet = chatField.getText().trim();
				appController.tweet(textToTweet);
			}
		});
		
		searchButton.addActionListener(new ActionListener()
				
			public void actionPerformed(ActionEvent searchClick)
			{
				String username = chatField.getText().trim();
				String display = appController.findWords(username);
				chatArea.append("\n\n" + display);
			}
		});
		
	}

	private void setupLayout()
	{
		// TODO Auto-generated method stub
	}

	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	}

	private void setupPanel()
	{
		Object appLayout;
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.MAGENTA);
		this.add(chatPane);
		this.add(chatButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(tweetButton);
		this.add(checkerButton);
		this.add(chatField);
	}
	
	private String getPath(String choice)
	{
		String path = ".";
		int result = -99;
		JFileChooser fileChooser = new JFileChooser();
		if (choice.equals("save"))
		{
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			result = fileChooser.showSaveDialog(this);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getCurrentDirectory().getAbsolutePath();
			}
		}
		else
		{
			result = fileChooser.showOpenDialog(this);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getSelectedFile().getAbsolutePath();
			}
		}
		
		return path;
	
	}

	private void setLayout(Object appLayout)
	{
		// TODO Auto-generated method stub
	}

	private void add(JTextField chatField2)
	{
		// TODO Auto-generated method stub
	}

	private void add(JButton chatButton2)
	{
		// TODO Auto-generated method stub
	}

	private void add(JScrollPane chatPane2)
	{
		// TODO Auto-generated method stub
	}

	private void setBackground(Color magenta)
	{
		// TODO Auto-generated method stub
	}

	private void setPreferredSize(Dimension dimension)
	{
		// TODO Auto-generated method stub
	}

}