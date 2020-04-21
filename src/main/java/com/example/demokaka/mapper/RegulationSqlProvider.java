package com.example.demokaka.mapper;

import com.example.demokaka.model.Regulation;
import com.example.demokaka.model.RegulationExample.Criteria;
import com.example.demokaka.model.RegulationExample.Criterion;
import com.example.demokaka.model.RegulationExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class RegulationSqlProvider {

    public String countByExample(RegulationExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("regulation");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(RegulationExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("regulation");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Regulation record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("regulation");
        
        if (record.getRegulationId() != null) {
            sql.VALUES("Regulation_id", "#{regulationId,jdbcType=INTEGER}");
        }
        
        if (record.getRegulationTitle() != null) {
            sql.VALUES("Regulation_title", "#{regulationTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getPublishTime() != null) {
            sql.VALUES("publish_time", "#{publishTime,jdbcType=VARCHAR}");
        }
        
        if (record.getPublisher() != null) {
            sql.VALUES("publisher", "#{publisher,jdbcType=VARCHAR}");
        }
        
        if (record.getByMeeting() != null) {
            sql.VALUES("By_Meeting", "#{byMeeting,jdbcType=VARCHAR}");
        }
        
        if (record.getMainBody() != null) {
            sql.VALUES("main_body", "#{mainBody,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(RegulationExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("Regulation_id");
        } else {
            sql.SELECT("Regulation_id");
        }
        sql.SELECT("Regulation_title");
        sql.SELECT("publish_time");
        sql.SELECT("publisher");
        sql.SELECT("By_Meeting");
        sql.SELECT("main_body");
        sql.FROM("regulation");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Regulation record = (Regulation) parameter.get("record");
        RegulationExample example = (RegulationExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("regulation");
        
        if (record.getRegulationId() != null) {
            sql.SET("Regulation_id = #{record.regulationId,jdbcType=INTEGER}");
        }
        
        if (record.getRegulationTitle() != null) {
            sql.SET("Regulation_title = #{record.regulationTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getPublishTime() != null) {
            sql.SET("publish_time = #{record.publishTime,jdbcType=VARCHAR}");
        }
        
        if (record.getPublisher() != null) {
            sql.SET("publisher = #{record.publisher,jdbcType=VARCHAR}");
        }
        
        if (record.getByMeeting() != null) {
            sql.SET("By_Meeting = #{record.byMeeting,jdbcType=VARCHAR}");
        }
        
        if (record.getMainBody() != null) {
            sql.SET("main_body = #{record.mainBody,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("regulation");
        
        sql.SET("Regulation_id = #{record.regulationId,jdbcType=INTEGER}");
        sql.SET("Regulation_title = #{record.regulationTitle,jdbcType=VARCHAR}");
        sql.SET("publish_time = #{record.publishTime,jdbcType=VARCHAR}");
        sql.SET("publisher = #{record.publisher,jdbcType=VARCHAR}");
        sql.SET("By_Meeting = #{record.byMeeting,jdbcType=VARCHAR}");
        sql.SET("main_body = #{record.mainBody,jdbcType=VARCHAR}");
        
        RegulationExample example = (RegulationExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Regulation record) {
        SQL sql = new SQL();
        sql.UPDATE("regulation");
        
        if (record.getRegulationTitle() != null) {
            sql.SET("Regulation_title = #{regulationTitle,jdbcType=VARCHAR}");
        }
        
        if (record.getPublishTime() != null) {
            sql.SET("publish_time = #{publishTime,jdbcType=VARCHAR}");
        }
        
        if (record.getPublisher() != null) {
            sql.SET("publisher = #{publisher,jdbcType=VARCHAR}");
        }
        
        if (record.getByMeeting() != null) {
            sql.SET("By_Meeting = #{byMeeting,jdbcType=VARCHAR}");
        }
        
        if (record.getMainBody() != null) {
            sql.SET("main_body = #{mainBody,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("Regulation_id = #{regulationId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, RegulationExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}