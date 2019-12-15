package com.cbat.xmlload.configration;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class MyMethodReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("替换后的新方法");
		return null;
	}
}
