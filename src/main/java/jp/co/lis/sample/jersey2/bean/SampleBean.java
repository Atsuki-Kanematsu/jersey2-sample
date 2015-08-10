package jp.co.lis.sample.jersey2.bean;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SampleBean {

	private String value;

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
