package com.weibo.trends;

import java.util.List;

import com.weibo.weibo4j.Trend;
import com.weibo.oauth2.Log;
import com.weibo.weibo4j.model.UserTrend;
import com.weibo.weibo4j.model.WeiboException;

public class GetTrends {

	public static void main(String[] args) {
		String access_token = args[0];
		String uid = args[1];
		Trend tm = new Trend(access_token);
		try {
			List<UserTrend> trends = tm.getTrends(uid);
			for(UserTrend t : trends){
				Log.logInfo(t.toString());
			}
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
