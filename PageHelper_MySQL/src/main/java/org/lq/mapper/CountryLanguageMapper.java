package org.lq.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lq.pojo.CountryLanguage;
import org.lq.pojo.CountryLanguageExample;
import org.lq.pojo.CountryLanguageKey;

public interface CountryLanguageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    long countByExample(CountryLanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    int deleteByExample(CountryLanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    int deleteByPrimaryKey(CountryLanguageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    int insert(CountryLanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    int insertSelective(CountryLanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    List<CountryLanguage> selectByExample(CountryLanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    CountryLanguage selectByPrimaryKey(CountryLanguageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") CountryLanguage record, @Param("example") CountryLanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    int updateByExample(@Param("record") CountryLanguage record, @Param("example") CountryLanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    int updateByPrimaryKeySelective(CountryLanguage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated Mon Aug 27 10:26:05 CST 2018
     */
    int updateByPrimaryKey(CountryLanguage record);
}