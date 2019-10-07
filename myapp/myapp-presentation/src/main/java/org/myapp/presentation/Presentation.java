package org.myapp.presentation;

import java.util.ArrayList;

import org.apache.commons.collections4.CollectionUtils;

import com.test.service.TestService;

public class Presentation {
	public static void main(String[] args) {
		if (CollectionUtils.isNotEmpty(new ArrayList<Object>())) {
			return;
		}

		System.out.println(new TestService().getDetail());
	}
}
