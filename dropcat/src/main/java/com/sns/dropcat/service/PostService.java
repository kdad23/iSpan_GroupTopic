package com.sns.dropcat.service;

import com.sns.dropcat.model.FollowingList;
import com.sns.dropcat.replyfomat.Result;

public interface PostService {
	Result getAllMainPagePost(Integer userId);
	Result getMainPagePost(Integer userId, Integer postPage,Integer setLimit);
	Result getLikeUsers(Integer postContextId);
	Result getfollowingListandFanList(Integer userID);
	Result insertFollowingList(FollowingList followingList);
	Result deleteFollowingList(FollowingList followingList);
	
}
