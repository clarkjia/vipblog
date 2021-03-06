package com.weibo.place;

import java.util.List;

import com.weibo.weibo4j.Place;
import com.weibo.oauth2.Log;
import com.weibo.weibo4j.model.Places;
import com.weibo.weibo4j.model.WeiboException;

public class GetNearbyPois {
	public static void main(String[] args) {
		String access_token = args[0];
		String lat = args[1];
		String lon = args[2];
		Place p = new Place(access_token);
		try {
			List<Places> list = p.nearbyPois(lat, lon);
			for (Places pl : list) {
				Log.logInfo(pl.toString());
			}
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}
}
