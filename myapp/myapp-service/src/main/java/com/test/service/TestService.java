package com.test.service;

import com.test.integration.TestDAO;

public class TestService {
	public String getDetail() {
		return new TestDAO().getAppDetail();
	}
}
