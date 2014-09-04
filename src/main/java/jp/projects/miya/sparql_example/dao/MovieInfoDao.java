package jp.projects.miya.sparql_example.dao;

import java.util.List;

import jp.projects.miya.sparql_example.dto.MovieInfoDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.twinkql.template.TwinkqlTemplate;

/**
 * DBPedia Prefetual Data Access Object
 *
 * @author masaya1507
 *
 */
public class MovieInfoDao implements ISparqlExecutable<MovieInfoDto>{

	/** slf4j Logger */
	private static final Logger LOG = LoggerFactory.getLogger(MovieInfoDao.class);

	/** Namespace at map.xml */
	private String namespace;

	/** selectId at map.xml */
	private String selectId;

	/** SPARQL template */
	private TwinkqlTemplate template;

	/**
	 *
	 * @return
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 *
	 * @param namespace
	 */
	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	/**
	 *
	 * @return
	 */
	public TwinkqlTemplate getTemplate() {
		return template;
	}

	/**
	 *
	 * @param template
	 */
	public void setTemplate(TwinkqlTemplate template) {
		this.template = template;
	}

	/*
	 * (非 Javadoc)
	 * @see jp.projects.miya.sparql_example.dao.ISparqlExecutable#getSelectId()
	 */
	public String getSelectId() {
		return selectId;
	}

	/*
	 * (非 Javadoc)
	 * @see jp.projects.miya.sparql_example.dao.ISparqlExecutable#setSelectId(java.lang.String)
	 */
	public void setSelectId(String selectId) {
		this.selectId = selectId;
	}

	/*
	 * (非 Javadoc)
	 * @see jp.projects.miya.sparql_example.dao.ISparqlExecutable#getResult()
	 */
	@Override
	public List<MovieInfoDto> getResult() {
		List<MovieInfoDto> listInfo = this.template.selectForList(
				this.getNamespace(),
				this.getSelectId(),
				null,
				MovieInfoDto.class);

		for (MovieInfoDto data : listInfo) {
			LOG.info(data.getFirm() + " - " + data.getLabel() + " - " + data.getSubject());
		}

		return listInfo;
	}

}
