package com.weibo.comment;

import com.weibo.weibo4j.Comments;
import com.weibo.oauth2.Log;
import com.weibo.weibo4j.model.CommentWapper;
import com.weibo.weibo4j.model.WeiboException;

public class GetCommentMentions {

	public static void main(String[] args) {
		String access_token = args[0];
		Comments cm = new Comments(access_token);
		try {
			CommentWapper comment = cm.getCommentMentions();
			Log.logInfo(comment.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
