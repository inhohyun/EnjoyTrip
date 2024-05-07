package com.ssafy.controller.member;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.model.member.Member;
import com.ssafy.service.member.MemberService;

import jakarta.servlet.http.HttpSession;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/users")
@RestController
public class MemberController {

	private final MemberService memberService;

	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Member member, HttpSession session) {

		try {
			Member loginMember = memberService.loginMember(member);
			if(loginMember!=null) {
			session.setAttribute("loginMember", loginMember);
			}else {
				throw new Exception();
			}
			return ResponseEntity.status(HttpStatus.CREATED).body("login successful");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("fail during login");
		}
	}

	@DeleteMapping("/withdraw/{id}")
	public ResponseEntity<String> withdraw(@PathVariable Long id) {
		try {
			memberService.withdrawMember(id);
			return ResponseEntity.status(HttpStatus.OK).body("withdraw successful");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("fail during withdraw");
		}
	}

	@PostMapping("/join")
	public ResponseEntity<String> join(@RequestBody Member member) {
		try {
			memberService.joinMember(member);
			return ResponseEntity.status(HttpStatus.OK).body("join successful");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("fail during join");
		}
	}

	@GetMapping("/logout")
	public ResponseEntity<String> logout(HttpSession session) {
		try {
			session.invalidate();
			return ResponseEntity.status(HttpStatus.OK).body("logout successful");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("fail during logout");
		}
	}

	@PostMapping("/update")
	ResponseEntity<String> update(@RequestBody Member member) {
		log.debug("member = {}", member);
		try {
			memberService.updateMember(member);
			return ResponseEntity.status(HttpStatus.OK).body("update successful");
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("fail during update");
		}
	}

	@GetMapping("/{id}")
	ResponseEntity<Member> showMember(@PathVariable Long id) {
		try {
			Member findMember = memberService.getMember(id);
			return ResponseEntity.status(HttpStatus.OK).body(findMember);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	/**
	 * Member loginMember(Member member); // 로그인 --------------ok
	 * 
	 * void withdrawMember(Member member); // 회원 탈퇴 --------------ok
	 * 
	 * void updateMember(Member member); // 회원 정보 수정 --------------ok
	 * 
	 * void joinMember(Member member); // 회원 가입 --------------ok
	 * 
	 * Member getMember(Long id); // 단일 회원 정보 조회 --------------ok
	 * 
	 * ++++++ 로그아웃도 ---------ok
	 */

	@Data
	@NoArgsConstructor
	static class Result1<T> {
		private T data;
	}

	@Data
	@NoArgsConstructor
	static class Result2<T> {
		private T data;
		private int count;
	}

}
