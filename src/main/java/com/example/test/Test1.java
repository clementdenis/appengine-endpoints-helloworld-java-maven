package com.example.test;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiClass;

/**
 * This resource will have generated "patch" method
 */
@Api(name = "testApi", version = "v1")
@ApiClass(resource = "test1")
public class Test1 {
	
	public TestResource get() {
		return new TestResource("Hello world!");
	}
	
	public TestResource update(TestResource resource) {
		return resource;
	}
	
}
