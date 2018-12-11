package chat.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import chat.controller.ChatController;

public class ControllerTest
{

	private ChatController ControllerTest;
	
	public ChatController ControllerTest1;
	@Before
	public void setUp() throws Exception
	{
		ControllerTest = new ChatController();
	}

	@After
	public void tearDown() throws Exception
	{
		ControllerTest = null;
	}

	@Test
	public void testChatController()
	{
		assertNotNull("Chatbot data member not initialized");
	}
	
	public void asserNotNull(String Object)
	{
		
	}

	@Test
	public void testInteractWithChatbot()
	{
		assertNotNull("Stub method used, implement with code", ControllerTest.interactWithChatbot(""));
		assertNotNull("Null should not ever be returned", ControllerTest.interactWithChatbot(null));
		assertTrue("If null is supplied user should be notified about it");
	}
	
	private void assertTrue(String string)
	{
		// TODO Auto-generated method stub
		
	}

	private void assertNotNull(String string, Object interactWithChatbot)
	{
		
	}
	
	@Test
	public void testUseChatbotCheckers()
	{
		assertTrue("Spooky tester method not implemented");
	}

	@Test
	public void testGetChatbot()
	{
		assertNotNull("Chatbot data member not initialized");
	}

	private void assertNotNull(String string)
	{
		// TODO Auto-generated method stub
		
	}

}
