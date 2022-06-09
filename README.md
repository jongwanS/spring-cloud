# spring-cloud 공부

1. 유레카서버 접속    
 > http://localhost:8761/

2. 유레카 클라이언트   
 > 1번 클라이언트 : http://localhost:8081 (동일 컨테이너 포트변경해서 띄우면, 로드밸런싱)    
 > 2번 클라이언트 : http://localhost:8082

3. api 게이트웨이를통해 타겟url 분기처리 1,2번 클라이언트 접근   
 > 1번 클라이언트 접속 http://localhost:5555/eureka_client1    
 > 2번 클라이언트 접속 http://localhost:5555/eureka_client2
