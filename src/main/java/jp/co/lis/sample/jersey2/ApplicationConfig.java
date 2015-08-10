package jp.co.lis.sample.jersey2;

import javax.ws.rs.ApplicationPath;

import jp.co.lis.sample.jersey2.fillter.RequestFillter;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("jersey-eclipse")
public class ApplicationConfig extends ResourceConfig {

	public ApplicationConfig() {
		// パッケージ定義
		packages(this.getClass().getPackage().getName());
		// Requestフィルタの登録
		register(RequestFillter.class);

	}


}
