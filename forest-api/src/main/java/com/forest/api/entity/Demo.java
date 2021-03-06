package com.forest.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.forest.api.common.persistence.DataEntity;

/**
 * 
 * @author forest
 *
 */
@JsonIgnoreProperties({"delFlag", "createDate", "updateBy", "createBy", "updateDate"})
public class Demo extends DataEntity<Demo>{

	private static final long serialVersionUID = 1L;
	
	private String testName;

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	

}
