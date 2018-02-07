package com.weibo.location;

import com.weibo.weibo4j.Location;
import com.weibo.oauth2.Log;
import com.weibo.weibo4j.model.WeiboException;
import com.weibo.weibo4j.org.json.JSONObject;

public class SearchBusStation {

	public static void main(String[] args) {
		String access_token = args[0];
		String q = args[1];
		Location l = new Location(access_token);
		try {
			JSONObject json = l.searchBusStation(q);
			Log.logInfo(json.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}
}
