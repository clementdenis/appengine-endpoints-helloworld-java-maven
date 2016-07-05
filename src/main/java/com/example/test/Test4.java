package com.example.test;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiClass;
import com.google.api.server.spi.config.ApiMethod;

/**
 * This resource will not have generated methods
 */
@Api(name = "testApi", version = "v1")
@ApiClass(resource = "test4")
public class Test4 {
	
	public TestResource get() {
		return new TestResource("Hello world!");
	}
	
	@ApiMethod(httpMethod = ApiMethod.HttpMethod.PUT)
	public TestResource save(TestResource resource) {
		return resource;
	}
	
}
