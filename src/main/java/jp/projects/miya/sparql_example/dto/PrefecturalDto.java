package jp.projects.miya.sparql_example.dto;

/**
 * Prefectual DTO Class
 *
 * @author masaya1507
 *
 */
public class PrefecturalDto {
	/** Prefectual Area Code */
	private String areaCode;

	/** Prefectual Area Name */
	private String name;

	/**
	 *
	 * @return
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 *
	 * @param areaCode
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	/**
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
