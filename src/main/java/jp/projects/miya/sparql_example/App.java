package jp.projects.miya.sparql_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application Constant Class
 *
 * @author masaya1507
 *
 */
public class App {
	/** Spring ApplicationContextオブジェクト */
	public static final ApplicationContext CONTEXT =
			new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

	/**
	 * ディレクトリ・ファイル名のパス区切り
	 */
	public static final String FS = System.getProperty("file.separator");

	/**
	 * ディレクトリ・ファイル名のパス区切り
	 */
	public static final String LS = System.getProperty("line.separator");

}
