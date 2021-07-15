- This application will work as server for service registry.
- Has to be start before any application starts so that application will be registered with this server.
- User can monitor all applications which are registered through this using localhost:<port-8761>
- This service has built on '2.5.2' sprint boot with cloud version as '2020.0.3'.
- Dependency is on spring-cloud-starter-netflix-eureka-server for establishing eureka server.

EXECUTION FLOW:
- Has to be started first before any other application which is registered with this server.