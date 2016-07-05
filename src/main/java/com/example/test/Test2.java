package com.example.test;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiClass;
import com.google.api.server.spi.config.ApiMethod;

/**
 * Created by Clement on 05/07/2016.
 */
@Api(name = "testApi", version = "v1")
@ApiClass(resource = "test2")
public class Test2 {
	
	public TestResource get() {
		return new TestResource("Hello world!");
	}
	
	@ApiMethod(httpMethod = "PATCH")
	public TestResource update(TestResource resource) {
		return resource;
	}
	
}
