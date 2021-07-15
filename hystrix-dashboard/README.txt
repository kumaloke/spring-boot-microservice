- This application will enable hystrix dashboard to monitor microservices
- This service has built on '2.3.4' sprint boot with cloud version as 'Hoxton.SR8'.
- Dependency is on spring-cloud-starter-netflix-hystrix-dashboard to enable dashboard.
- Use eureka client package to register this with Eureka server.
- spring-cloud-starter-config to enable config server git configuration.
- bootstrap.yml: Holds config server connection details to enable git access to fetch common configuration. 

EXECUTION FLOW:
- Start service registry application (service-registry)
- Start config server application (cloud-config-server) to fetch common configuration from git.
- Start API gateway application (cloud-gateway)
	