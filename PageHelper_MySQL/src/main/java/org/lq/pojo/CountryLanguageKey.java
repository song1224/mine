package org.lq.pojo;

public class CountryLanguageKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.CountryCode
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    private String countrycode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.Language
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    private String language;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.CountryCode
     *
     * @return the value of countrylanguage.CountryCode
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.CountryCode
     *
     * @param countrycode the value for countrylanguage.CountryCode
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.Language
     *
     * @return the value of countrylanguage.Language
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.Language
     *
     * @param language the value for countrylanguage.Language
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }
}