package chat.model;

public class CTECTwitter
{
	

}
	
	public String getMostCommonWord(String username)
	{
		String mostCommon = "";
		
		collectTweets(username);
		turnStatusesToWords();
		totalWordCount = tweetedWords.size();
		String [] boring = createIgnoredWordArray();
		removeBlanks();
		trimTheBoringWords(boring);
		generateWordCount();
		
		ArrayList<Map>
	}

	private void removeBlanks()
	{
		for (int index = tweetedWords.size())
	}
	
	private void collectTweets(String username)
	{
		Paging statusPage = new Paging(1,100);
		int page = 1;
		long lastID = Long.MAX_VALUE;
		
		while(page <= 10)
		{
			statusPage.setPage(page);
			try
			{
				ResponseList<Status> listedTweets = ChatTwitter.getUserTimeLine(username, statusPage);
				for(Status current : listedTweets)
				{
					if(current.getId() < lastID)
					{
						searchedTweets.add(current);
						lastID = current.getId();
					}
				}
			}
			catch(TwitterException searchTweetError)
			{
				
			}
		}
	}

