package com.weibo.favorites;

import com.weibo.weibo4j.Favorite;
import com.weibo.oauth2.Log;
import com.weibo.weibo4j.model.WeiboException;

public class DestroyFavoritesBatch {

	public static void main(String[] args) {
		String access_token = args[0];
		boolean result = false;
		String ids = args[1];
		Favorite fm = new Favorite(access_token);
		try {
			result = fm.destroyFavoritesTagsBatch(ids);
			Log.logInfo(String.valueOf(result));
		} catch (WeiboException e) {

			e.printStackTrace();
		}
	}

}
