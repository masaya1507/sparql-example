package jp.projects.miya.sparql_example.service;

import java.util.List;

import jp.projects.miya.sparql_example.App;
import jp.projects.miya.sparql_example.dao.DBPediaJpnPrefetualDao;
import jp.projects.miya.sparql_example.dao.ISparqlExecutable;
import jp.projects.miya.sparql_example.dto.PrefecturalDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * DBPedia SPARQL Execute Service
 *
 * @author masaya1507
 *
 */
@Service
public class DBPediaJpnSparqlExecutorService extends AbstractService {
	/** slf4j Logger */
	private static final Logger LOG = LoggerFactory.getLogger(DBPediaJpnSparqlExecutorService.class);

	/**
	 * Constructor
	 */
	public DBPediaJpnSparqlExecutorService() {
	}

	/*
	 * (非 Javadoc)
	 * @see jp.projects.miya.sparql_example.service.AbstractService#execute()
	 */
	@Override
	public int execute() throws Exception {
		ISparqlExecutable<PrefecturalDto> executor =
				(ISparqlExecutable<PrefecturalDto>) App.CONTEXT.getBean(DBPediaJpnPrefetualDao.class);

		List<PrefecturalDto> result = executor.getResult();

		LOG.info("RESULT COUNT:" + result.size());

		return 0;
	}

}
