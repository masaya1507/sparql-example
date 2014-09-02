package jp.projects.miya.sparql_example.dao;

import java.util.List;

/**
 * SPARQL Execute Interface
 *
 * @author masaya1507
 *
 * @param <T> DTO Class
 */
public interface ISparqlExecutable<T> {
	public List<T> getResult();
}
