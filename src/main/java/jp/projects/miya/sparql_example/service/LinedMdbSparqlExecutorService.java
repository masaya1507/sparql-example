package jp.projects.miya.sparql_example.service;

import java.util.List;

import jp.projects.miya.sparql_example.App;
import jp.projects.miya.sparql_example.dao.ISparqlExecutable;
import jp.projects.miya.sparql_example.dao.MovieInfoDao;
import jp.projects.miya.sparql_example.dto.MovieInfoDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * LinkedMDB SPARQL Execute Service
 *
 * @author masaya1507
 *
 */
@Service
public class LinedMdbSparqlExecutorService extends AbstractService {
	/** slf4j Logger */
	private static final Logger LOG = LoggerFactory.getLogger(LinedMdbSparqlExecutorService.class);

	/** SPARQL map.xml 'selectId' */
	private static final String SELECT_ID = "SelectMovieInfo";

	/**
	 * Constructor
	 */
	public LinedMdbSparqlExecutorService() {
	}

	/*
	 * (非 Javadoc)
	 * @see jp.projects.miya.sparql_example.service.AbstractService#execute()
	 */
	@Override
	public int execute() throws Exception {
		ISparqlExecutable<MovieInfoDto> executor =
				(ISparqlExecutable<MovieInfoDto>) App.CONTEXT.getBean(MovieInfoDao.class);

		executor.setSelectId(LinedMdbSparqlExecutorService.SELECT_ID);

		List<MovieInfoDto> result = executor.getResult();

		LOG.info("RESULT COUNT:" + result.size());

		return 0;
	}

}
