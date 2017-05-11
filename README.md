# Spring Boot Async Processing

A Simple Spring Boot Async Processing


__Callable vs DeferredResult__

A Callable returned from a handler method, is processed asynchronously by the Spring container. Whereas, a DeferredResult<?> (which should also be returned from a handler method as well) produces the return value from a thread of its own choice i.e. the developer is responsible for creating a new thread and doing all thread management.

