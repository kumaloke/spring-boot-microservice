- This service will allow to create/retrieve department information like:
		departmentId, departmentName, departmentAddress, departmentCode
- This service has built on '2.3.4' sprint boot with cloud version as 'Hoxton.SR8'.
- Dependencies are :
	spring-boot-starter-data-jpa : Java persistent APIs to perform operation on DB
	spring-boot-starter-web : To implement web application (Rest)
	h2 : H2 (in memory) database to store department information.
	lombok : To enable annotation for POJO (plain old Java object).
	spring-cloud-starter-netflix-eureka-client : Eureka client to register service with Eureka service registry.
	spring-cloud-starter-config : Config server to pull configuration from git.
	spring-cloud-starter-sleuth/spring-cloud-starter-zipkin: For distributed log analysis.
- Classes:
	Entity: To hold DB structure.
	Repository: To perform DB operations
	Service: To serve layer between DB and Controller
	Controller: To accept user request and perform operation accordingly.
- bootstrap.yml: Holds config server connection details to enable git access to fetch common configuration. 
- application.yml: Holds application configuration like:
	port, application name, eureka client (serive registry) & zipkin (log distribution server) configuration.

EXECUTION FLOW:
- Start service registry application (service-registry)
- Start config server application (cloud-config-server) to fetch common configuration from git.
- Start API gateway application (cloud-gateway)
- Start hystrix dashboard application (hystrix-dashboard) to monitor application. 
- Start application.
- Start zipkin server 'java -jar zipkin-server-2.23.2-exec.jar', make sure it connects to 'http://127.0.0.1:9411/' else correct uri in application.yml 
	  
		
	
