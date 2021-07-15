- This is a API gateway application to take care of routing internal services
- This service has built on '2.3.4' sprint boot with cloud version as 'Hoxton.SR8'.
- Dependencies are :
	spring-boot-starter-actuator : To control endpoint access from API gateway.
	spring-cloud-starter-gateway : To provide gateway for user to submit request and route to individual service.
	spring-cloud-starter-netflix-eureka-client : register API gateway with Eureka server.
	spring-cloud-starter-config : To access common configuration from config server.
	spring-cloud-starter-netflix-hystrix : Hystrix Circuit Bracker to provide fallback API.
- This application defines fallback method for each service in case service is not responding for defined threshold.
- bootstrap.yml: Holds config server connection details to enable git access to fetch common configuration. 

EXECUTION FLOW:
- Start service registry application (service-registry)
- Start config server application (cloud-config-server) to fetch common configuration from git.
- Start API gateway application (cloud-gateway)	
	