package com.example.helloworld;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * Created by Clement on 05/07/2016.
 */
@Api(name = "testApi",
		version = "v1",
		resource = "testResource")
public class TestAPI {
	
	public static class TestResource {
		private String testData;
		
		public TestResource() {
		}
		
		public TestResource(String testData) {
			this.testData = testData;
		}
		
		public String getTestData() {
			return testData;
		}
		
		public void setTestData(String testData) {
			this.testData = testData;
		}
	}
	
	public TestResource get() {
		return new TestResource("Hello world!");
	}
	
	public TestResource update(TestResource resource) {
		return resource;
	}
	
}
