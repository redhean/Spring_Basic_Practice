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

# Spring DB 접근 기술

1. 개발이나 테스트 용도로 가벼운 H2 DB 사용
   - 다른 프로젝트 진행 시 변경 가능
2. SpringConfig.java파일에서 @Bean 설정 변경으로 쉽게 수정 가능(개방-폐쇄 원칙 / OCP, Open-Closed Principle)
3. 스프링 통합 테스트케이스 작성
   - @SpringBootTest, @Transactional 어노테이션 사용
4. 순수 JDBC로 접근
   - DB와 연결하고 SQL 쿼리를 직접 작성해야함
   - 중복되는 코드가 많음
5. JDBC Template를 사용하여 접근
   - 순수 JDBC에서 나온 반복 코드를 대부분 제거 가능
   - SQL 쿼리는 직접 작성해야함
6. JPA
   - 객체중심의 설계 가능
   - SQL도 JPA가 직접 만들어서 실행(JPQL을 사용하기는 함)
7. 스프링 데이터 JPA
   - 인터페이스를 통한 기본적인 CRUD 제공
   - 스프링 데이터 JPA는 JPA를 편리하게 사용하도록 도와주는 기술이기에 JPA를 먼저 제대로 습득하는 것이 중요.

# AOP

AOP: Aspect Oriented Programming<br/>
공통 관심 사항(cross-cutting concern)과 핵심 관심 사항(core concern)분리<br/>
프록시를 사용<br/>

# 강의

스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술 by 김영한
