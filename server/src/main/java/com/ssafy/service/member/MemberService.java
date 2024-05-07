package com.ssafy.service.member;

import com.ssafy.model.member.Member;

public interface MemberService {

	Member loginMember(Member member); // 로그인

	void withdrawMember(Long id); // 회원 탈퇴

	void updateMember(Member member); // 회원 정보 수정

	void joinMember(Member member); // 회원 가입

	Member getMember(Long id); // 단일 회원 정보 조회
}
