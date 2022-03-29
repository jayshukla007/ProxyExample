# ProxyExample

Problem statement : How Spring proxy works, implement proxy like Spring framwork.

There are two ways Spring can make proxies:

1) Using JDK dynamic proxy libraries to create a new instance of the injected bean’s interface which will act as a delegate to that bean.

2) Using CGLIB, CGLIB will be used to make a new object that extends the target bean’s class and acts as a delegate to that original bean. 

CGLIB dynamically subclass the original bean and add interception logic directly by overriding every possible method. Think of it as subclassing the original class and calling super version amongst other things.

I have implemented proxy using subclass, please refer code for for more details.
