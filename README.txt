This project contains application related to microservice and it's deployment.
Here are the application:
  service-registry : To enable Eureka server to register applications.
  cloud-config-server : Application to access git to pull common configuration stored in application.yml
  cloud-gateway : API Gateway to route requests to appropriate service. 
                  Provide fallback mechanism (Circuit Breaker) in case of individual service is not available/not responding.
  department-service : Department microservice to store department information.
  user-service : User microservice to store user information.
  hystrix-dashboard : Hystrix dashboad application to show trand on microservice access and availability.
  
Deployment Flow:
  1. Service registry : http://localhost:8761/
  2. config-server
  3. API gateway : http://localhost:9191/. Streaming @ http://localhost:9191/actuator/hystrix.stream
  4. Hystrix Dashboard : http://localhost:9295/hystrix. Place http://localhost:9191/actuator/hystrix.stream and visualize streaming.
  5. Microservices : http://localhost:9191/departments, http://localhost:9191/users
  6. zipkin/sleuth :  http://127.0.0.1:9411/ (install using java -jar zipkin-server-2.23.2-exec.jar).
  
  
