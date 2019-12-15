package com.cbat.xmlload.configration;

import com.cbat.xmlload.bean.User;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean {
	private String carInfo;
	@Override
	public Object getObject() throws Exception {
		User user = new User();
		String [] infos = carInfo.split(",");
		user.setId(infos[0]);
		user.setEmail(infos[1]);
		user.setUserName(infos[2]);
		return user;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
}
