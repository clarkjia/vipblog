package com.weibo.favorites;

import com.weibo.weibo4j.Favorite;
import com.weibo.oauth2.Log;
import com.weibo.weibo4j.model.Favorites;
import com.weibo.weibo4j.model.WeiboException;

public class UpdateFavoritesTags {

	public static void main(String[] args) {
		String access_token = args[0];
		Favorite fm = new Favorite(access_token);
		String id = args[1];
		String tags=args[2];
		try {
			Favorites favors = fm.updateFavoritesTags(id, tags);
			Log.logInfo(favors.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
