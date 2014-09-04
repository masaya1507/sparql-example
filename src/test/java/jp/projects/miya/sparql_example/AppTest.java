package jp.projects.miya.sparql_example;

import static org.junit.Assert.*;
import jp.projects.miya.sparql_example.service.AbstractService;
import jp.projects.miya.sparql_example.service.DBPediaJpnSparqlExecutorService;

import org.junit.Test;

/**
 * Unit test for App.
 */
public class AppTest {
	@Test
	public void test() throws Exception {

		// サービスクラスの取得
		AbstractService service = (AbstractService) App.CONTEXT.getBean(DBPediaJpnSparqlExecutorService.class);

		// 実行処理
		assertEquals(service.execute(), 0);
	}
}
