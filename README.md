<h1>토닥토닥</h1>
<img src="https://github.com/907hza/cyworld/assets/145747413/42d3a09b-48b2-4091-aef5-81a88291fbdf">
<br><br>
<ul>
<li><b>개발 인원</b> : 4명 </li></br>
<li><b>프로젝트 목적</b> : 의대 증원으로 인한 전공의 사직 문제로 생긴 의료 서비스 차질에 대응하기 위해서 프로젝트를 구현</li></br>
</ul>
<h3>(1) 개발 환경</h3>
<div>
<img alt="macOs" src="https://img.shields.io/badge/mac%20os-000000?style=for-the-badge&logo=apple&logoColor=white">
<img alt="HTML" src="https://img.shields.io/badge/HTML-239120?style=for-the-badge&logo=html5&logoColor=white">
<img alt="CSS" src="https://img.shields.io/badge/CSS-239120?&style=for-the-badge&logo=css3&logoColor=white">
<img alt="JavaScript" src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white">
<img alt="JAVA(JDK 1.8)" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">
<img alt="jQuery" src="https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white">
<img alt="Thymeleaf" src="https://img.shields.io/badge/Thymeleaf-black?style=for-the-badge&logo=Thymeleaf&logoColor=white">
<img alt="Spring Framework" src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
<img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white">
<img alt="Spring security" src="https://img.shields.io/badge/Spring security-6DB33F?style=for-the-badge&logo=Spring security&logoColor=white">
<img alt="MyBatis" src ="https://img.shields.io/badge/MyBatis-blue.svg?&style=for-the-badge&logo=MyBatis&logoColor=white"/>
<img alt="Apache Tomcat 9.0" src ="https://img.shields.io/badge/Apache Tomcat-yellow.svg?&style=for-the-badge&logo=Apache Tomcat&logoColor=black"/>
<img alt="Gradle" src ="https://img.shields.io/badge/Gradle-powderblue.svg?&style=for-the-badge&logo=Gradle&logoColor=white"/>
<img alt="Oracle" src ="https://img.shields.io/badge/Oracle-white.svg?&style=for-the-badge&logo=Oracle&logoColor=black"/>
<img alt="STS4" src ="https://img.shields.io/badge/STS4-green.svg?&style=for-the-badge&logo=STS4&logoColor=white"/>
<img alt="DBeaver" src ="https://img.shields.io/badge/DBeaver-red.svg?&style=for-the-badge&logo=DBeaver&logoColor=white"/>
<img alt="RESTful API" src ="https://img.shields.io/badge/RESTful API-powderblue.svg?&style=for-the-badge&logo=RESTful API&logoColor=white"/>
<img alt="AWS EC2" src ="https://img.shields.io/badge/AWS EC2-black.svg?&style=for-the-badge&logo=AWS EC2&logoColor=white"/>
<img alt="GitHub" src ="https://img.shields.io/badge/GitHub-purple.svg?&style=for-the-badge&logo=GitHub&logoColor=white"/>
<img alt="Sourcetree" src ="https://img.shields.io/badge/Sourcetree-navy.svg?&style=for-the-badge&logo=Sourcetree&logoColor=white"/>
</div>
<br><b>API</b> : KAKAO Maps API, KAKAOPAY, KAKAO/NAVER/GOOGLE Login API, coolSMS
<br><br>
<h3>(2) 기능 분담</h3>
<span>📻 상세히보기 : https://github.com/user-attachments/files/15883741/_.pdf</span>
<br>
<img src="https://github.com/907hza/todocTodoc/assets/145747413/e8ceff4e-d4a7-4dab-a055-7ca133cb41e5" >
<br><br>
<h3>(3) DB 설계</h3>
<img src="https://github.com/907hza/todocTodoc/assets/145747413/da9c3dee-a7cf-4bde-8850-bb70af409ce1" />
<br><br>
<h3>(4) 사이트 맵</h3>
<img src="https://github.com/907hza/cyworld/assets/145747413/2aaf0f4d-892e-4b0a-a7fe-63df8f00bf80" >
<br><br>
<h3>(5) 핵심 기술</h3>
<img src="https://github.com/907hza/todocTodoc/assets/145747413/472e8ad8-91a7-4f2c-a410-26746509b1d8" >
<br><br><br>
<h3>(6) 나의 기능 설명</h3>
<p>
  <b>1. 회원가입</b><br>
  &nbsp;&nbsp;&nbsp;&nbsp;- 이메일 중복검사 : 환자 회원테이블과 병원테이블, 약국 테이블에서 이메일을 가져와 비동기로 검사<br>
  &nbsp;&nbsp;&nbsp;&nbsp;- 핸드폰 문자인증 : 전달받은 번호에 랜덤 문자열을 보내고, 보낸 값을 받아 일치하는지 검사<br>
  &nbsp;&nbsp;&nbsp;&nbsp;- 약관동의 : 필수 약관을 선택하지 않으면 alert 작동<br>
  &nbsp;&nbsp;&nbsp;&nbsp;- 진료시간, 과목, 항목 값 가져오기<br>
  <br><b>2. 로그인</b><br>
  &nbsp;&nbsp;&nbsp;&nbsp;- JWT 토큰을 Http only 쿠키에 저장하는 방식<br>
  &nbsp;&nbsp;&nbsp;&nbsp;- 비밀번호는 시큐리티로 복호화하여 저장<br>
  &nbsp;&nbsp;&nbsp;&nbsp;- 카카오, 구글, 네이버 로그인 완료 후 토큰 발행<br>
  <br><b>3. 아이디/비밀번호 찾기</b><br>
  &nbsp;&nbsp;&nbsp;&nbsp;- 아이디 찾기 : 이름,생년월일(병원/약국은 사업자 등록번호)/이름,전화번호로 조회<br>
  &nbsp;&nbsp;&nbsp;&nbsp;- 비밀번호 찾기 : 이름,이메일 인증 / 이름,전화번호 인증을 통해 인증 후 새 비밀번호 재설정<br>
  <br><b>4. 맞춤 영양제</b><br>
  &nbsp;&nbsp;&nbsp;&nbsp;- CRUD, 페이징, 검색<br><br>
  <b>coolSms API : </b>https://blog.naver.com/907hz_/223488534078<br>
  <b>email : </b>https://blog.naver.com/907hz_/223488546152<br>
  <b>다중 첨부파일 :</b>https://blog.naver.com/907hz_/223488554035
</p>
<br><br>
<h3>(7) 회고록</h3>
<p>
  환자, 병원, 약국 회원의 받는 값이 달라서 테이블을 나눴었고, 환자, 병원, 약국 회원의 이메일이 중복되지 않도록 이메일 컬럼을 동일하게 했는데 이 때문에 환자, 병원/약국 쿼리를 짤 때 조인을 많이 해야해서 어려움을 많이 느꼈었습니다. 다음 번에는 flag 값으로 구분지어서 사용해도 될 것 같다는 생각도 들었습니다. 이를 통해 DB 설계의 중요성을 많이 알게되었습니다.<br>
또한, JWT 를 처음 적용해보면서 어느 곳에 저장하는 것이 가장 좋은 것인지 판단하는 것도 어려웠지만, XSS 공격, CSRF 공격을 방지하기 위해서는 HTTPS 에서 Secure Cookie 와 HTTP Only 쿠키를 사용해서 자바스크립트 기반의 공격을 방어하는 것이 가장 좋을 것이라고 판단이 되어서 accessToken 은 쿠키에, refreshToken 은 회원 DB 에 저장하게 되었습니다. accessToken 의 유효시간을 정해두고 해당 시간이 끝나면 refreshToken 을 통해 로그인 기간을 연장하는 js 를 만들었지만, 구현되지 않아 아쉬웠습니다. 동작 방식에 대해서 더 자세히 공부할 필요성을 느꼈습니다.<br>
제가 어려움을 가장 크게 느꼈던 부분은, 소셜로그인을 구현할 때입니다. 인터넷에 예로 JPA 밖에 나와있지 않아서 해당 JPA 부분을 공부하면서 해야했기에 좀 더 어려움을 느꼈었습니다.<br> 모든 부분에서 어려움이 있었고 아쉬움이 없다면 거짓말이겠지만, 처음 시도해본 타임리프와 spring boot 를 더 공부해볼 수 있어서 좋았고, 많이 얻어갔다고 생각이 들었습니다.
</p>

<br>
- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
<br>
<h3>(8) 참고했던 링크</h3>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1. jwt 구현<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;https://why-dev.tistory.com/365<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;https://m.blog.naver.com/qjawnswkd/222304836903<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;https://github1s.com/idsiemu/spring-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;boot/blob/master/src/main/java/com/hunter/city/security/JwtAuthorizationFilter.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;https://taesan94.tistory.com/290<br><br>

2. 소셜로그인 구현<br>
https://ksh-coding.tistory.com/66#1.%20DefalutOAuth2User%EB%A5%BC%20%EC%83%81%EC%86%8D%ED%95%9C%20User%20%ED%81%B4%EB%9E%98%EC%8A%A4%20-%20CustomOAuth2User-1<br>
https://github1s.com/sh111-coder/oauth2WithJwtLogin/blob/main/src/main/java/login/oauthtest4/global/oauth2/userinfo/NaverOAuth2UserInfo.java
<br><br>
3. 소셜로그인 api<br>
https://developers.naver.com/apps/#/myapps/NUo9moYA0WeT6_Hl1efX/config<br>
https://console.cloud.google.com/apis/credentials?project=concise-ivy-419914&pli=1<br>
https://developers.kakao.com/console/app/1061030/config/platform
