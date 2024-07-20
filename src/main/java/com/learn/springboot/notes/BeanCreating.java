package com.learn.springboot.notes;

public class BeanCreating {


}

/*


        ------------- XML base
            Ways of creating beans
                - xml base, resources/static/config.xml
                - @Configuration class base, AppConfig


        ------------- Bean Scope

            - boundary for a bean can access.
                1. Singleton: [ default behaviour ]
                        will get same object each time
                2. Prototype:
                        will get new object each time

                3. @Request:
                        Scope a single bean definition to the lifecycle of a single HTTP request. That is, each
                        HTTP request has its own instance of a bean created off the back of a single bean definition.
                        Only valid in the context of a web-aware spring application context.


                 4. @Session: scope a single bean definition to the lifeCycle of an HTTP Session. Only valid in the
                              context of a web-aware spring application context.

                 5. @Application: scopes a single bean definition to the lifecycle of a ServletContext. Only valid in the
                                  context of a web-aware spring application context.

                 6. @WebSocket: scopes a single bean definition to the lifecycle of a web socket. only valid in the
                                context of a web-aware spring application context.


















 */