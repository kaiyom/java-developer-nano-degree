# Commit contains

## HttpServlet 

It gets called when we hit the url.
`@WebServlet` is responsible for making HttpServlet as a component. 

## Filter 

It gets called before [HttpServlet](#HttpServlet) when we hit the url.
`@WebFilter` will make it a component. 

```
    we can use filter to clean the request i.e. we can check whether 
    the request has those value what needed or not.
    
    Also, we can check response state as well. 
```

## ServletContextListener

It gets called when Servlet was initialized.

`@WebListener` is what will make `ServletContextListener` available as a component.


> NOTE: All those class, interface and annotation is at `javax.servlet.*`
>> which comes with Spring-boot-starter-web dependence.