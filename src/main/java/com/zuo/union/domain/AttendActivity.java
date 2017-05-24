package com.zuo.union.domain;

import java.io.Serializable;

/**
 * 参与社区活动类
 * @author Yao
 *
 */
public class AttendActivity implements Serializable{

	private static final long serialVersionUID = 8942549387624389203L;
	
	/*参与社区活动记录id*/
	private Integer attendActId;
	
	/*参与的社区活动*/
	private Activity activity;
	
	/*参与者用户*/
	private User attendUser;

	public Integer getAttendActId() {
		return attendActId;
	}

	public void setAttendActId(Integer attendActId) {
		this.attendActId = attendActId;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public User getAttendUser() {
		return attendUser;
	}

	public void setAttendUser(User attendUser) {
		this.attendUser = attendUser;
	}

	
	
	
}
