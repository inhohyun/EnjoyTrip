package com.ssafy.model.member;

import lombok.Data;

@Data
public class Member {
	private Long id;
	private String loginId;
	private String loginPw;
	private String name;
	private String nickname;
	private String email;
	private String phoneNumber;

}
