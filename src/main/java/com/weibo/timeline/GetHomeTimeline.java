package com.weibo.timeline;

import com.weibo.weibo4j.Timeline;
import com.weibo.oauth2.Log;
import com.weibo.weibo4j.model.StatusWapper;
import com.weibo.weibo4j.model.WeiboException;

public class GetHomeTimeline {

	public static void main(String[] args) {
		String access_token = args[0];
		Timeline tm = new Timeline(access_token);
		try {
			StatusWapper status = tm.getHomeTimeline();
			Log.logInfo(status.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
