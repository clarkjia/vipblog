package com.weibo.trends;

import java.util.List;

import com.weibo.weibo4j.Trend;
import com.weibo.oauth2.Log;
import com.weibo.weibo4j.model.Trends;
import com.weibo.weibo4j.model.WeiboException;

public class GetTrendsWeekly {

	public static void main(String[] args) {
		String access_token = args[0];
		Trend tm = new Trend(access_token);
		try {
			List<Trends> trends = tm.getTrendsWeekly();
			for(Trends ts : trends){
				Log.logInfo(ts.toString());
			}
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
