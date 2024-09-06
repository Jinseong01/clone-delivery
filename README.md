"# clone-delivery" 

09/07
- 공통
1) 스프링 프로젝트를 자바 프로젝트로 생성하여 멀티 모듈 구성
2) Build.gradle에 직접 설정 추가

- api 패키지
1) 다른 모듈에서 사용하는 스프링빈을 위해 JpaConfig 생성
2) Json 변환 시의 snakecase 설정 등을 위해 custom한 ObjectMapperConfig 생성
3) API 문서화 등 유용한 swagger ui 설정
4) Swagger Ui에도 custom한 ObejctMapper를 사용하기 위해 SwaggerConfig 생성
5) filter를 통해 클라이언트에 응답하기 전, request와 response에 대한 로그

- db 패키지
1) Entity의 공통되는 id부분을 BaseEntity로 따로 구성

- MySQL
1) delivery 스키마 생성
2) account 테이블 생성하여 테스트