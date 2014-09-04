package jp.projects.miya.sparql_example;

import jp.projects.miya.sparql_example.service.AbstractService;
import jp.projects.miya.sparql_example.service.DBPediaJpnSparqlExecutorService;

/**
 * Application EntryPoint
 *
 * Note: Proxy Settings Example(specify JVM Option)
 *  -Dhttp.proxyHost=xxx.xxx.xxx.xxx -Dhttp.proxyPort=xxxx
 * @author masaya1507
 *
 */
public class EntryPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		// サービスクラスの取得
		AbstractService service = (AbstractService) App.CONTEXT.getBean(DBPediaJpnSparqlExecutorService.class);

		// 実行処理
		int result = service.execute();

		if (result != 0) {
			throw new IllegalStateException("ExecuteStatus :" + result);
		}
	}

}
