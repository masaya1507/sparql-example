package jp.projects.miya.sparql_example.dto;

/**
 * MovieInfoDto DTO Class
 *
 * @author masaya1507
 *
 */
public class MovieInfoDto {
	/**  */
	private String firm;
	/**  */
	private String label;
	/**  */
	private String subject;

	/**
	 *
	 * @return
	 */
	public String getFirm() {
		return firm;
	}

	/**
	 *
	 * @param firm
	 */
	public void setFirm(String firm) {
		this.firm = firm;
	}

	/**
	 *
	 * @return
	 */
	public String getLabel() {
		return label;
	}

	/**
	 *
	 * @param label
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 *
	 * @return
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 *
	 * @param subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
