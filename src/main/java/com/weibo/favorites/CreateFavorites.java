package com.weibo.favorites;

import com.weibo.weibo4j.Favorite;
import com.weibo.oauth2.Log;
import com.weibo.weibo4j.model.Favorites;
import com.weibo.weibo4j.model.WeiboException;

public class CreateFavorites {

	public static void main(String[] args) {
		String access_token = args[0];
		String id = args[1];
		Favorite fm = new Favorite(access_token);
		try {
			Favorites favors = fm.createFavorites(id);
			Log.logInfo(favors.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
