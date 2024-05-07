package com.ssafy.service.member;

import org.springframework.stereotype.Service;

import com.ssafy.mapper.member.MemberMapper;
import com.ssafy.model.member.Member;

@Service
public class MemberServiceImpl implements MemberService {
	private final MemberMapper memberMapper;

	public MemberServiceImpl(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}

	@Override
	public Member loginMember(Member member) {
		return memberMapper.loginMember(member);
	}

	@Override
	public void withdrawMember(Long id) {
		memberMapper.withdrawMember(id);;
	}

	@Override
	public void updateMember(Member member) {
		memberMapper.updateMember(member);
	}

	@Override
	public void joinMember(Member member) {
		memberMapper.joinMember(member);
	}

	@Override
	public Member getMember(Long id) {
		return memberMapper.getMember(id);
	}

}
