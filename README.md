# Spring_Basic_Practice

1. 정적 컨텐츠
2. MVC와 템플릿 엔진 
3. API

# 회원 관리 예제

1. 회원 도메인과 리포지토리 만들기
2. 회원 서비스 개발
3. Junit5를 사용하여 회원 리포지토리 테스트와 회원 서비스 테스트 해보기

4. 컴포넌트 스캔과 자동 의존관계 설정 해보기
    - @Component(@Controller, @Service, @Repository)
5. 자바 코드로 직접 스프링 빈 등록하기 (SpringConfig.java)
6. 웹 MVC 개발
    - HomeController 추가 : 컨트롤러가 정적 파일보다 순위가 높기 때문에 기본 화면으로 나옴
    - 회원등록 폼 구현 : createMemberForm.html에서 form을 사용해 post기능 수행, 이는 Controller에서 @PostMapping을 통해 접근 가능
    - 회원조회 폼 구현 : memberList.html에서 thymeleaf 문법 th:each를 사용하여 List 요소들을 table로 표현 가능 

# 강의

스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술 by 김영한
