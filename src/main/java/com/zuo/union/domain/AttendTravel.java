package com.zuo.union.domain;

import java.io.Serializable;

/**
 * 参与结伴出行类
 * @author Yao
 *
 */
public class AttendTravel implements Serializable {

	private static final long serialVersionUID = 1005868793925413649L;
	
	/*参与结伴出行的记录id*/
	private int attendTraId;
	
	/*参与的出行*/
	private Travel travel;
	
	/*参与者*/
	private User user;

	public int getAttendTraId() {
		return attendTraId;
	}

	public void setAttendTraId(int attendTraId) {
		this.attendTraId = attendTraId;
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
