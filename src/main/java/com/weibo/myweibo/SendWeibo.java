package com.weibo.myweibo;

import com.weibo.oauth2.Log;
import com.weibo.weibo4j.Timeline;
import com.weibo.weibo4j.model.Status;
import com.weibo.weibo4j.model.StatusWapper;
import com.weibo.weibo4j.model.WeiboException;

public class SendWeibo {

	public static void main(String[] args) {
		String access_token = "2.00r2LloBtmb_AD446c99111c0VHkbn";
		String statuses ="该条微博由程序发送,https://baike.baidu.com/";
		//String access_token = "2.00**********";
		//String statuses = "该条微博由JAVA程序发送，目的测试其微博相关api，并无实际用途。https://baike.baidu.com/item/Java/85979?fr=aladdin";
		Timeline tm = new Timeline(access_token);
		try {
			Status share = tm.share(statuses);
			System.out.println(share);
		} catch (WeiboException e) {
			e.printStackTrace();
		}}
		/*Timeline tm = new Timeline(access_token);
		try {
			Status status = tm.updateStatus(statuses);
			Log.logInfo(status.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}	*/
	//}

}
