package com.basicaop.BasicAop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.application.Bank;
import com.controller.Config;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);
    	
    	Bank bank = factory.getBean(Bank.class);
    	bank.name();
    }
}
