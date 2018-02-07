package com.weibo.myweibo;

import com.weibo.weibo4j.Timeline;
import com.weibo.oauth2.Log;
import com.weibo.weibo4j.model.StatusWapper;
import com.weibo.weibo4j.model.WeiboException;

public class QueryWeiboList {

	public static void main(String[] args) {
		String access_token = "2.00r2LloBtmb_AD446c99111c0VHkbn";
		String statuses ="测试读取最新微博列表";
		Timeline tm = new Timeline(access_token);
		try {
			StatusWapper status = tm.getUserTimeline();
			Log.logInfo(status.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}	
	}

}
