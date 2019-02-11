package com.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Account;
import com.serviceImpl.AccountServiceImpl;
import com.serviceImpl.AccountServiceImpl1;

public class Main 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		Account acct = new Account("43567","my black money");
		AccountServiceImpl aimpl = context.getBean
				("accountserviceaspectimpl",AccountServiceImpl.class);
	    aimpl.updateAccountBalance(acct, 50000);
     
	}
}


//AccountServiceImpl1 accountserviceimpl1 = context.getBean("accountserviceaspectimpl1",AccountServiceImpl1.class);
//   accountserviceimpl1.updateAccountBalance(acct, 50000);
   /*<bean id="accountserviceaspectimpl1" class="com.serviceImpl.AccountServiceImpl1"></bean>

    * 
    * 
<aop:pointcut expression="execution(* com.serviceImpl.AccountServiceImpl1.*(..))" id="ss"/>
<aop:aspect ref="accountserviceaspect" >
<aop:before method="validateCard1" pointcut-ref="ss"/>
</aop:aspect>
</aop:config>
    */