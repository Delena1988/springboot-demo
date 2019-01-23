package cn.joinhealth.mapper;

import cn.joinhealth.model.RuleSpecialistFollowup;

public interface RuleSpecialistFollowupMapper {
    int deleteByPrimaryKey(String id);

    int insert(RuleSpecialistFollowup record);

    int insertSelective(RuleSpecialistFollowup record);

    RuleSpecialistFollowup selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RuleSpecialistFollowup record);

    int updateByPrimaryKeyWithBLOBs(RuleSpecialistFollowup record);

    int updateByPrimaryKey(RuleSpecialistFollowup record);
}