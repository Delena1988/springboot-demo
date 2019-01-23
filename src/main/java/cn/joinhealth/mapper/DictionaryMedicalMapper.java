package cn.joinhealth.mapper;

import cn.joinhealth.model.DictionaryMedical;

public interface DictionaryMedicalMapper {
    int insert(DictionaryMedical record);

    int insertSelective(DictionaryMedical record);
}