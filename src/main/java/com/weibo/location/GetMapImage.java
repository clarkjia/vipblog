package com.weibo.location;

import com.weibo.weibo4j.Location;
import com.weibo.oauth2.Log;
import com.weibo.weibo4j.model.WeiboException;
import com.weibo.weibo4j.org.json.JSONObject;

public class GetMapImage {

	public static void main(String[] args) {
		String access_token = args[0];
		String city = args[1];
		Location l = new Location(access_token);
		try {
			JSONObject json = l.getMapImageByCity(city);
			Log.logInfo(json.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
