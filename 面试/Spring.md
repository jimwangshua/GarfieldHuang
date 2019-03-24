# Spring

1. BeanFactory 和 FactoryBean？

   > **BeanFactory：**是接口，提供了IOC容器最基本的形式，给具体的IOC容器的实现提供了规范
   >
   > **FactoryBean：**是接口，为IOC容器中Bean的实现提供了更加灵活的方式，FactoryBean在IOC容器的基础上给Bean的实现加上了一个简单工厂模式和装饰模式,我们可以在getObject()方法中灵活配置。其实在Spring源码中有很多FactoryBean的实现类.
   >
   > **区别：**BeanFactory是个Factory，也就是IOC容器或对象工厂，FactoryBean是个Bean。在Spring中，所有的Bean都是由BeanFactory(也就是IOC容器)来进行管理的。但对FactoryBean而言，这个Bean不是简单的Bean，而是一个能生产或者修饰对象生成的工厂Bean,它的实现与设计模式中的工厂模式和修饰器模式类似

2. Spring IOC 的理解，其初始化过程？

   > ioc 也就是控制反转，把某些业务对象的的控制权交给一个平台或者框架来同一管理，这个同一管理的平台可以称为ioc容器
   >
   > 

3. BeanFactory 和 ApplicationContext？

4. Spring Bean 的生命周期，如何被管理的？

5. Spring Bean 的加载过程是怎样的？

6. 如果要你实现Spring AOP，请问怎么实现？

7. 如果要你实现Spring IOC，你会注意哪些问题？

8. Spring 是如何管理事务的，事务管理机制？

9. Spring 的不同事务传播行为有哪些，干什么用的？

10. Spring 中用到了那些设计模式？

11. 说下你对 Spring 生态的了解？

12. 说下你对 Spring AOP 和 IOC 的理解？看过实现原理吗？

13. 说下 Bean 在 Spring 中的生命周期？

14. 讲下你知道的 Spring 注解有哪些？该什么场景使用？

15. Spring 事务知道吗？有了解过吗？

16. 说下你刚才说的 SpringBoot 吧，你觉得 SpringBoot 有什么优点？

17. SpringBoot 自动化配置是怎么做的？有看过实现源码吗？

18. Spring Boot 中最核心的注解 SpringBootApplication 有看过源码分析过吗？

19. 你的项目中 SpringBoot 用到了哪些和其他技术栈整合的？

20. 使用 Spring 或者 SpringBoot 有遇到过什么印象深刻的问题吗？当时是怎么解决的？