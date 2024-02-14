package com.chojaehyeok.realEstate;

import java.util.Scanner;

import com.chojaehyeok.realEstate.controller.AuthController;
import com.chojaehyeok.realEstate.controller.implement.AuthControllerImplement;
import com.chojaehyeok.realEstate.dto.request.CheckIdRequestDto;
import com.chojaehyeok.realEstate.dto.request.SendCodeRequestDto;
import com.chojaehyeok.realEstate.dto.response.CheckIdResponseDto;
import com.chojaehyeok.realEstate.dto.response.SendCodeResponseDto;
import com.chojaehyeok.realEstate.interfaces.Code;
import com.chojaehyeok.realEstate.repository.EmailAuthenticationRepository;
import com.chojaehyeok.realEstate.repository.UserRepository;
import com.chojaehyeok.realEstate.repository.implement.EmailAuthenticationRepositoryImplement;
import com.chojaehyeok.realEstate.repository.implement.UserRepositoryImplement;
import com.chojaehyeok.realEstate.service.AuthService;
import com.chojaehyeok.realEstate.service.implement.AuthServiceImplement;

// Controller (package / interface) : 입력과 출력을 담당하는 요쇼
// Service (package / interface) : 실제 비즈니스 로직 (연산)
// Repository (package / interface) : 데이터베이스 연결과 관련된 작업

// DTO (Data Transfer Object) : 데이터 전송을 위한 객체
// Entity : 데이터베이스의 테이블을 자바 클래스로 표현한 객체

public class App {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 // 의존성 원칙을 지킬려면 아래 코드처럼 작성하기
		 UserRepository userRepository = new UserRepositoryImplement();
		 EmailAuthenticationRepository emailAuthenticationRepository = new EmailAuthenticationRepositoryImplement();
		 AuthService authService = new AuthServiceImplement(userRepository, emailAuthenticationRepository);
		 AuthController authController = new AuthControllerImplement(authService); 
		 
		 while (true) {
			 System.out.print("1. 회원가입 / 2. 로그인 / 3. 게시물 작성 / 4. 게시물 보기 / 5. 종료 : ");
			 String input = scanner.nextLine();
			 
			 if (input.equals("1")) {
				 // 1. 아이디 중복확인
				 CheckIdRequestDto checkIdRequest = new CheckIdRequestDto(); //ID 객체 받아오기
				 System.out.print("아이디 : ");
				 String id = scanner.nextLine();
				 checkIdRequest.setId(id); // id 입력
				 
				 CheckIdResponseDto checkIdResponse = authController.checkId(checkIdRequest); // checkID 메서드에 전달
				 Code code = checkIdResponse.getCode();
				 
				 if(code == Code.DI) {
					 System.out.println("중복된 아이디 입니다.");
					 continue;
				 }
				 
				 if (code == Code.DBE) {
					 System.out.println("데이터베이스 에러입니다.");
					 continue;
				 }
				 
				 if (code == Code.VF) {
					 System.out.println("잘못된 입력입니다.");
					 continue;
				 }
				 
				 System.out.println("사용 가능한 아이디입니다.");
				 
				 System.out.print("비밀번호 : ");
				 String password = scanner.nextLine();
				 System.out.print("비밀번호 확인 : ");
				 String passwordCheck = scanner.nextLine();
				 
				 // 2. 이메일 인증 코드 전송
				 System.out.print("이메일 : ");
				 String email = scanner.nextLine();
				 
				 SendCodeRequestDto sendCodeRequest = new SendCodeRequestDto();
				 sendCodeRequest.setEmail(email);
				 
				 SendCodeResponseDto sendCodeResponse = authController.sendCode(sendCodeRequest);
				 code = sendCodeResponse.getCode();
				 
				 if (code == Code.VF) {
					 System.out.println("잘못된 입력입니다.");
					 continue;
				 }
				 
				 if (code == Code.DE) {
					 System.out.println("중복된 이메일입니다.");
					 continue;
				 }
				 
				 if (code == Code.DBE) {
					 System.out.println("데이터베이스 에러입니다.");
					 continue;
				 }
				 
				 System.out.println(sendCodeResponse.getData());
				 // 3. 이메일 인증 처리
				 // 4. 회원가입 처리
				
			 }
			 if (input.equals("2")) System.out.println("로그인");
			 if (input.equals("3")) System.out.println("게시물 작성");
			 if (input.equals("4")) System.out.println("게시물 보기");
			 if (input.equals("5")) break;
		 }
		 
		 System.out.println("프로그램 종료");
		
	}

}
