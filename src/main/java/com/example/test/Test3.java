package com.example.test;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiClass;
import com.google.api.server.spi.config.ApiMethod;

/**
 * This resource will not have generated methods
 */
@Api(name = "testApi", version = "v1")
@ApiClass(resource = "test3")
public class Test3 {
	
	@ApiMethod(httpMethod = ApiMethod.HttpMethod.GET)
	public TestResource fetch() {
		return new TestResource("Hello world!");
	}
	
	public TestResource update(TestResource resource) {
		return resource;
	}
	
}
