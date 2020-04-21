package com.example.demokaka.mapper;

import com.example.demokaka.model.Regulation;
import com.example.demokaka.model.RegulationExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface RegulationMapper {
    @SelectProvider(type=RegulationSqlProvider.class, method="countByExample")
    long countByExample(RegulationExample example);

    @DeleteProvider(type=RegulationSqlProvider.class, method="deleteByExample")
    int deleteByExample(RegulationExample example);

    @Delete({
        "delete from regulation",
        "where Regulation_id = #{regulationId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer regulationId);

    @Insert({
        "insert into regulation (Regulation_id, Regulation_title, ",
        "publish_time, publisher, ",
        "By_Meeting, main_body)",
        "values (#{regulationId,jdbcType=INTEGER}, #{regulationTitle,jdbcType=VARCHAR}, ",
        "#{publishTime,jdbcType=VARCHAR}, #{publisher,jdbcType=VARCHAR}, ",
        "#{byMeeting,jdbcType=VARCHAR}, #{mainBody,jdbcType=VARCHAR})"
    })
    int insert(Regulation record);

    @InsertProvider(type=RegulationSqlProvider.class, method="insertSelective")
    int insertSelective(Regulation record);

    @SelectProvider(type=RegulationSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="Regulation_id", property="regulationId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Regulation_title", property="regulationTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="publish_time", property="publishTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="publisher", property="publisher", jdbcType=JdbcType.VARCHAR),
        @Result(column="By_Meeting", property="byMeeting", jdbcType=JdbcType.VARCHAR),
        @Result(column="main_body", property="mainBody", jdbcType=JdbcType.VARCHAR)
    })
    List<Regulation> selectByExample(RegulationExample example);

    @Select({
        "select",
        "Regulation_id, Regulation_title, publish_time, publisher, By_Meeting, main_body",
        "from regulation",
        "where Regulation_id = #{regulationId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="Regulation_id", property="regulationId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Regulation_title", property="regulationTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="publish_time", property="publishTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="publisher", property="publisher", jdbcType=JdbcType.VARCHAR),
        @Result(column="By_Meeting", property="byMeeting", jdbcType=JdbcType.VARCHAR),
        @Result(column="main_body", property="mainBody", jdbcType=JdbcType.VARCHAR)
    })
    Regulation selectByPrimaryKey(Integer regulationId);

    @UpdateProvider(type=RegulationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Regulation record, @Param("example") RegulationExample example);

    @UpdateProvider(type=RegulationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Regulation record, @Param("example") RegulationExample example);

    @UpdateProvider(type=RegulationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Regulation record);

    @Update({
        "update regulation",
        "set Regulation_title = #{regulationTitle,jdbcType=VARCHAR},",
          "publish_time = #{publishTime,jdbcType=VARCHAR},",
          "publisher = #{publisher,jdbcType=VARCHAR},",
          "By_Meeting = #{byMeeting,jdbcType=VARCHAR},",
          "main_body = #{mainBody,jdbcType=VARCHAR}",
        "where Regulation_id = #{regulationId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Regulation record);
}