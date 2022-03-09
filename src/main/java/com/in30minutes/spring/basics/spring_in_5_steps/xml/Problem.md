
#Problem: ApplicationContext closes too fast

#Description: 

###Loads config properly:
org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loaded 2 bean definitions from class path resource [applicationContext.xml]

###ApplicationContext closes before I'm able to use beans

org.springframework.context.support.ClassPathXmlApplicationContext - Closing org.springframework.context.support.ClassPathXmlApplicationContext@612fc6eb, started on Thu Mar 10 00:29:57 CET 2022


###Throws exception:
Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.in30minutes.spring.basics.spring_in_5_steps.basic.XmlPersonDAO' available
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:351)


# console FULL
00:29:57.436 [main] DEBUG org.springframework.context.support.ClassPathXmlApplicationContext - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@612fc6eb
00:29:57.542 [main] DEBUG org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loaded 2 bean definitions from class path resource [applicationContext.xml]
00:29:57.560 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'xmlJdbcConnection'
XMLJDBC Connection
00:29:57.567 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'xmlPersonDAO'
00:29:57.606 [main] DEBUG org.springframework.context.support.ClassPathXmlApplicationContext - Closing org.springframework.context.support.ClassPathXmlApplicationContext@612fc6eb, started on Thu Mar 10 00:29:57 CET 2022
Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.in30minutes.spring.basics.spring_in_5_steps.basic.XmlPersonDAO' available
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:351)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:342)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1172)
	at com.in30minutes.spring.basics.spring_in_5_steps.SpringIn5StepsXMLContextApplication.main(SpringIn5StepsXMLContextApplication.java:24)
