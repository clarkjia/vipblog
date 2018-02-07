package com.weibo.location;

import com.weibo.weibo4j.Location;
import com.weibo.oauth2.Log;
import com.weibo.weibo4j.model.Poisition;
import com.weibo.weibo4j.model.WeiboException;

public class AddPois {

	public static void main(String[] args) {
		String access_token = args[0];
		String srcid = args[1];
		String name = args[2];
		String address = args[3];
		String cityName = args[4];
		String category = args[5];
		String longitude = args[6];
		String latitude = args[7];
		Location l = new Location(access_token);
		try {
			Poisition pois = l.addPois(srcid, name, address, cityName,
					category, longitude, latitude);
			Log.logInfo(pois.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
