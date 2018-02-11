package com.weibo.myweibo;

import com.weibo.weibo4j.Weibo;

public class UpdateStatus {
/*
	*//**
     * 发布一条微博信息
	 * @param args
	 *//*
	public static void main(String[] args) {
		System.setProperty("weibo4j.oauth.consumerKey", Weibo.CONSUMER_KEY);
    	System.setProperty("weibo4j.oauth.consumerSecret", Weibo.CONSUMER_SECRET);
       try {
       	Weibo weibo = getWeibo(true,args);
       	Status status = weibo.updateStatus("测试发表微博");
       	System.out.println(status.getId() + " : "+ status.getText()+"  "+status.getCreatedAt());
       	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Weibo getWeibo(boolean isOauth,String ... args) {
		Weibo weibo = new Weibo();
		if(isOauth) {//oauth验证方式 args[0]:访问的token；args[1]:访问的密匙
			weibo.setToken(args[0], args[1]);
		}else {//用户登录方式
    		weibo.setUserId(args[0]);//用户名/ID
   		weibo.setPassword(args[1]);//密码
		}
		return weibo;
	}*/
}