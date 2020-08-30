# Commit contains

## FreeMarker  

Freemarker template extension is `.ftl`

To ENABLE FreeMarker add this in `application.properties` 

```properties
spring.freemarker.template-loader-path= classpath:/templates
spring.freemarker.suffix= .ftl
```

> NOTE: All those coming from `spring-boot-starter-freemarker` dependence.