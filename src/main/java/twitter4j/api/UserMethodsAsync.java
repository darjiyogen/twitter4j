package twitter4j.api;

import twitter4j.TwitterListener;

public interface UserMethodsAsync
{
	/**
	 * Retrieves extended information of a given user, specified by screen name.  This information includes design settings, so third party developers can theme their widgets according to a given user's preferences.
	 * <br>This method calls http://api.twitter.com/1/users/show
	 * @param screenName the screen name of the user for whom to request the detail
	 * @param listener a listener object that receives the response
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-users%C2%A0show">Twitter API Wiki / Twitter REST API Method: users%C2%A0show</a>
	 */
	void showUserAsync(String screenName, TwitterListener listener);

	/**
	 * Retrieves extended information of a given user, specified by screen name.  This information includes design settings, so third party developers can theme their widgets according to a given user's preferences.
	 * <br>This method calls http://api.twitter.com/1/users/show
	 * @param userId the ID of the user for whom to request the detail
	 * @param listener a listener object that receives the response
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-users%C2%A0show">Twitter API Wiki / Twitter REST API Method: users%C2%A0show</a>
	 */
	void showUserAsync(int userId, TwitterListener listener);

	/**
	 * Returns the specified user's friends, each with current status inline.
	 * <br>This method calls http://api.twitter.com/1/statuses/friends
	 * @param listener a listener object that receives the response
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-statuses%C2%A0friends">Twitter API Wiki / Twitter REST API Method: statuses%C2%A0friends</a>
	 * @since Twitter4J 2.0.9
	 */
	void getFriendsStatusesAsync(TwitterListener listener);

	/**
	 * Returns the specified user's friends, each with current status inline.
	 * <br>This method calls http://api.twitter.com/1/statuses/friends
	 * @param cursor Breaks the results into pages. A single page contains 100 users. This is recommended for users who are followed by many other users. Provide a value of  -1 to begin paging. Provide values as returned to in the response body's next_cursor and previous_cursor attributes to page back and forth in the list.
	 * @param listener a listener object that receives the response
	 * @since Twitter4J 2.0.9
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-statuses%C2%A0friends">Twitter API Wiki / Twitter REST API Method: statuses%C2%A0friends</a>
	 */
	void getFriendsStatusesAsync(long cursor,TwitterListener listener);

	/**
	 * Returns the specified user's friends, each with current status inline.
	 * <br>This method calls http://api.twitter.com/1/statuses/friends
	 * @param screenName the screen name of the user for whom to request a list of friends
	 * @param listener a listener object that receives the response
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-statuses%C2%A0friends">Twitter API Wiki / Twitter REST API Method: statuses%C2%A0friends</a>
	 * @since Twitter4J 2.0.9
	 */
	void getFriendsStatusesAsync(String screenName, TwitterListener listener);

	/**
	 * Returns the specified user's friends, each with current status inline.
	 * <br>This method calls http://api.twitter.com/1/statuses/friends
	 * @param userId the ID of the user for whom to request a list of friends
	 * @param listener a listener object that receives the response
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-statuses%C2%A0friends">Twitter API Wiki / Twitter REST API Method: statuses%C2%A0friends</a>
	 * @since Twitter4J 2.1.0
	 */
	void getFriendsStatusesAsync(int userId, TwitterListener listener);

	/**
	 * Returns the specified user's friends, each with current status inline.
	 * <br>This method calls http://api.twitter.com/1/statuses/friends
	 * @param screenName the screen name of the user for whom to request a list of friends
	 * @param cursor Breaks the results into pages. A single page contains 100 users. This is recommended for users who are followed by many other users. Provide a value of  -1 to begin paging. Provide values as returned to in the response body's next_cursor and previous_cursor attributes to page back and forth in the list.
	 * @param listener a listener object that receives the response
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-statuses%C2%A0friends">Twitter API Wiki / Twitter REST API Method: statuses%C2%A0friends</a>
	 * @since Twitter4J 2.0.9
	 */
	void getFriendsStatusesAsync(String screenName, long cursor, TwitterListener listener);

	/**
	 * Returns the specified user's friends, each with current status inline.
	 * <br>This method calls http://api.twitter.com/1/statuses/friends
	 * @param userId the screen name of the user for whom to request a list of friends
	 * @param cursor Breaks the results into pages. A single page contains 100 users. This is recommended for users who are followed by many other users. Provide a value of  -1 to begin paging. Provide values as returned to in the response body's next_cursor and previous_cursor attributes to page back and forth in the list.
	 * @param listener a listener object that receives the response
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-statuses%C2%A0friends">Twitter API Wiki / Twitter REST API Method: statuses%C2%A0friends</a>
	 * @since Twitter4J 2.1.0
	 */
	void getFriendsStatusesAsync(int userId, long cursor, TwitterListener listener);

	/**
	 * Returns the authenticating user's followers, each with current status inline. They are ordered by the order in which they joined Twitter (this is going to be changed).
	 * <br>This method calls http://api.twitter.com/1/statuses/followers
	 * @param listener a listener object that receives the response
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-statuses%C2%A0followers">Twitter API Wiki / Twitter REST API Method: statuses%C2%A0followers</a>
	 * @since Twitter4J 2.0.9
	 */
	void getFollowersStatusesAsync(TwitterListener listener);

	/**
	 * Returns the authenticating user's followers, each with current status inline. They are ordered by the order in which they joined Twitter (this is going to be changed).
	 * <br>This method calls http://api.twitter.com/1/statuses/followers
	 * @param cursor Breaks the results into pages. A single page contains 100 users. This is recommended for users who are followed by many other users. Provide a value of  -1 to begin paging. Provide values as returned to in the response body's next_cursor and previous_cursor attributes to page back and forth in the list.
	 * @param listener a listener object that receives the response
	 * @since Twitter4J 2.0.9
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-statuses%C2%A0followers">Twitter API Wiki / Twitter REST API Method: statuses%C2%A0followers</a>
	 */
	void getFollowersStatusesAsync(long cursor, TwitterListener listener);

	/**
	 * Returns the specified user's followers, each with current status inline. They are ordered by the order in which they joined Twitter (this is going to be changed).
	 * <br>This method calls http://api.twitter.com/1/statuses/followers
	 *
	 * @param screenName The screen name of the user for whom to request a list of followers.
	 * @param listener a listener object that receives the response
	 * @since Twitter4J 2.0.9
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-statuses%C2%A0followers">Twitter API Wiki / Twitter REST API Method: statuses%C2%A0followers</a>
	 */
	void getFollowersStatusesAsync(String screenName, TwitterListener listener);

	/**
	 * Returns the specified user's followers, each with current status inline. They are ordered by the order in which they joined Twitter (this is going to be changed).
	 * <br>This method calls http://api.twitter.com/1/statuses/followers
	 *
	 * @param userId The ID of the user for whom to request a list of followers.
	 * @param listener a listener object that receives the response
	 * @since Twitter4J 2.1.0
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-statuses%C2%A0followers">Twitter API Wiki / Twitter REST API Method: statuses%C2%A0followers</a>
	 */
	void getFollowersStatusesAsync(int userId, TwitterListener listener);

	/**
	 * Returns the specified user's followers, each with current status inline. They are ordered by the order in which they joined Twitter (this is going to be changed).
	 * <br>This method calls http://api.twitter.com/1/statuses/followers
	 * @param screenName The screen name of the user for whom to request a list of followers.
	 * @param cursor Breaks the results into pages. A single page contains 100 users. This is recommended for users who are followed by many other users. Provide a value of  -1 to begin paging. Provide values as returned to in the response body's next_cursor and previous_cursor attributes to page back and forth in the list.
	 * @param listener a listener object that receives the response
	 * @since Twitter4J 2.0.9
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-statuses%C2%A0followers">Twitter API Wiki / Twitter REST API Method: statuses%C2%A0followers</a>
	 */
	void getFollowersStatusesAsync(String screenName, long cursor, TwitterListener listener);

	/**
	 * Returns the specified user's followers, each with current status inline. They are ordered by the order in which they joined Twitter (this is going to be changed).
	 * <br>This method calls http://api.twitter.com/1/statuses/followers
	 * @param userId The ID of the user for whom to request a list of followers.
	 * @param cursor Breaks the results into pages. A single page contains 100 users. This is recommended for users who are followed by many other users. Provide a value of  -1 to begin paging. Provide values as returned to in the response body's next_cursor and previous_cursor attributes to page back and forth in the list.
	 * @param listener a listener object that receives the response
	 * @since Twitter4J 2.1.0
	 * @see <a href="http://apiwiki.twitter.com/Twitter-REST-API-Method:-statuses%C2%A0followers">Twitter API Wiki / Twitter REST API Method: statuses%C2%A0followers</a>
	 */
	void getFollowersStatusesAsync(int userId, long cursor, TwitterListener listener);
}
