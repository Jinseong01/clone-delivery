# clone-delivery

## 2024/09/07
- 공통
  1. 스프링 프로젝트를 자바 프로젝트로 생성하여 멀티 모듈 구성
  2. Build.gradle에 직접 설정 추가

- api 패키지
  1. 다른 모듈에서 사용하는 스프링빈을 위해 JpaConfig를 생성하여 스캔 지정
  2. Json 변환 시의 snakecase 설정 등을 위해 custom한 ObjectMapperConfig 생성
  3. API 문서화 등 유용한 Swagger Ui 설정
  4. Swagger Ui에도 custom한 ObejctMapper를 설정하기 위해 SwaggerConfig 생성
  5. filter를 통해 실제로 클라이언트에 응답하기 전, request와 response를 로그
  6. Api 공통 spec을 설정하여 response 형식을 통일
  7. Api 에러 코드 추가
  8. GlobalExceptionHandler와 ApiExceptionHandler를 통해 각각의 에러 관리
  9. Interceptor로 인증하기 위한 구조 생성 & 인증 제외 주소를 관리하는 WebConfig 생성

- db 패키지
  1. Entity의 공통되는 id부분을 별도의 BaseEntity로 생성

- MySQL
  1. delivery 스키마 생성
  2. account 테이블 생성하여 테스트

## 2024/09/08
- api
  1. 사용자 관련된 로직 구조(business, controller, converter, sevice) 세팅
  2. UserOpenApiController와 관련된 가입과 로그인(토큰X) 구현
  3. Token 구현하여 UserOpenApiController의 로그인과 연결

- db
  1. UserEntity, UserRepository 생성

- MySQL
  1. user 테이블 생성

## 2024/09/14
- api 패키지
  1. 사용자 인증 로직 적용
      AuthorizationInterceptor에서 유효한 토큰인 경우, 토큰에 저장되어 있던 userId를 requestContext에 저장
      UserSessionResolver에서 파라미터 형식과 어노테이션 체크 후, requestContext에서 userId를 꺼냄
      userId에 해당하는 UserEntity를 찾고, User객체로 생성한 후 Controller의 user파라미터로 사용
      

## 2024/09/15
- api 패키지
  1. Store와 관련된 Controller, Converter, Service 등의 서비스 로직 개발

- db 패키지
  1. StoreEntity, StoreRepository 생성

- MySQL
  1. store 테이블 생성