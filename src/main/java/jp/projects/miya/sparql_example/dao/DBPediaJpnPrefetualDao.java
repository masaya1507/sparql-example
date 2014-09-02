package jp.projects.miya.sparql_example.dao;

import java.util.List;

import jp.projects.miya.sparql_example.App;
import jp.projects.miya.sparql_example.dto.PrefecturalDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.twinkql.template.TwinkqlTemplate;

/**
 * DBPedia Prefetual Data Access Object
 *
 * @author masaya1507
 *
 */
@Component
public class DBPediaJpnPrefetualDao implements ISparqlExecutable<PrefecturalDto>{
	/** twinkql template at applicationContext.xml */
	private static final String TEMPLATE_NAME = "DBPediaJpnTemplate";
	/** namespace at map.xml */
	private static final String SPARQL_NAMESPACE = "dbpedia_japanese";
	/** SPARQL Query at map.xml */
	private static final String SPARQL_NAME = "SelectJapanesePrefecturals";

	/** slf4j Logger */
	private static final Logger LOG = LoggerFactory.getLogger(DBPediaJpnPrefetualDao.class);

	/*
	 * (非 Javadoc)
	 * @see jp.projects.miya.sparql_example.dao.ISparqlExecutable#getResult()
	 */
	@Override
	public List<PrefecturalDto> getResult() {
		TwinkqlTemplate template =
				(TwinkqlTemplate) App.CONTEXT.getBean(DBPediaJpnPrefetualDao.TEMPLATE_NAME);

		List<PrefecturalDto> prefecturals = template.selectForList(
				DBPediaJpnPrefetualDao.SPARQL_NAMESPACE,
				DBPediaJpnPrefetualDao.SPARQL_NAME,
				null,
				PrefecturalDto.class);

		for (PrefecturalDto p : prefecturals) {
			LOG.info(p.getAreaCode() + " - " + p.getName());
		}

		return prefecturals;
	}

}
