package com.weibo.account;

import com.weibo.weibo4j.Account;
import com.weibo.oauth2.Log;
import com.weibo.weibo4j.model.RateLimitStatus;
import com.weibo.weibo4j.model.WeiboException;

public class GetAccountRateLimitStatus {

	public static void main(String[] args) {
		String access_token = args[0];
		Account am = new Account(access_token);
		try {
            RateLimitStatus json = am.getAccountRateLimitStatus();
			Log.logInfo(json.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
