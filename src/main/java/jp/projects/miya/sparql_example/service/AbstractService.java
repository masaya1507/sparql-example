package jp.projects.miya.sparql_example.service;

/**
 * SpringFramework Service Class Base
 *
 * @author masaya1507
 *
 */
public abstract class AbstractService {

	/**
	 * Service Execute Method
	 *
	 * @return Executed Status
	 * @throws Exception
	 */
	public abstract int execute() throws Exception;
}
