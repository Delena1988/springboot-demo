package cn.joinhealth.model;

public class DictionaryMedical {
    private Byte dictionaryType;  //字典类型（1疾病 2手术 3药品）

    private String dictionaryCode;  //代码

    private String dictionaryName;  //名称

    private String pinyinCode;  //拼音码

    public Byte getDictionaryType() {
        return dictionaryType;
    }

    public void setDictionaryType(Byte dictionaryType) {
        this.dictionaryType = dictionaryType;
    }

    public String getDictionaryCode() {
        return dictionaryCode;
    }

    public void setDictionaryCode(String dictionaryCode) {
        this.dictionaryCode = dictionaryCode == null ? null : dictionaryCode.trim();
    }

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName == null ? null : dictionaryName.trim();
    }

    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode == null ? null : pinyinCode.trim();
    }
}