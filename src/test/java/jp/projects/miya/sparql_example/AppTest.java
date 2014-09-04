package jp.projects.miya.sparql_example;

import static org.junit.Assert.*;
import jp.projects.miya.sparql_example.service.AbstractService;
import jp.projects.miya.sparql_example.service.DBPediaJpnSparqlExecutorService;
import jp.projects.miya.sparql_example.service.LinedMdbSparqlExecutorService;

import org.junit.Test;

/**
 * Unit test for App.
 */
public class AppTest {
	@Test
	public void testDBPediaJapanese() throws Exception {

		// サービスクラスの取得
		AbstractService service = (AbstractService) App.CONTEXT.getBean(DBPediaJpnSparqlExecutorService.class);

		// 実行処理
		assertEquals(service.execute(), 0);
	}

	@Test
	public void testLinkedMDB() throws Exception {

		// サービスクラスの取得
		AbstractService service = (AbstractService) App.CONTEXT.getBean(LinedMdbSparqlExecutorService.class);

		// 実行処理
		assertEquals(service.execute(), 0);
	}
}
