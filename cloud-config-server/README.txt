- This application will work as confir server to access git for common configuration.
- This service has built on '2.3.4' sprint boot with cloud version as 'Hoxton.SR8'.
- Dependency is on spring-cloud-config-server to access git.
- Use eureka client package to register this with Eureka server.

EXECUTION FLOW:
- Start service registry application (service-registry)
- Has to be started before any application which is access git.	
	