package chat.model;

import java.util.ArrayList;

public class Chatbot

{

	private String currentUser;

	private String joke;

	private String content;

	public ArrayList<String> ResponseList;

	public ArrayList<String> SpookyList;

	public Object getResponseList;

	public ArrayList<String> getSpookyList;

	public Chatbot()

	{

		this.joke = "Why did the chicken cross the road? To get to the other side!";

		this.currentUser = new String("default user - boring!!!");

		this.content = new String("empty of all content but not null");

		this.ResponseList = new ArrayList<String>();

		this.SpookyList = new ArrayList<String>();

		buildTheList();

	}

	private void buildTheList()
	{
		ResponseList.add("Hello! How are you today?");
		ResponseList.add("Well I got to go - it's been a pleasure");
		SpookyList.add("It's spooky season...");
		SpookyList.add("LAMP!!!");
	}

	public String processText(String userText)
	{
		String output = "";
		output = "You said: " + userText;
		return output;
	}

	public Object getContent()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Object SpookyList()
	{
		// TODO Auto-generated method stub
		return SpookyList;
	}

	public Object ResponseList()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Object CurrentUser()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public boolean spookyChecker(String string)
	{
		// TODO Auto-generated method stub
		return false;
	}

	public boolean legitimacyChecker(Object object)
	{
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contentChecker(String string)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
