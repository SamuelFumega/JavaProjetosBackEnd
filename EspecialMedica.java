public class EspecialMedica {
    private int code;
    private String desc;
    private String localEspec;
    private String dataEspec;
    public EspecialMedica(){
    }
    public EspecialMedica(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getLocalEspec() {
        return localEspec;
    }
    public void setLocalEspec(String localEspec) {
        this.localEspec = localEspec;
    }
    public String getDataEspec() {
        return dataEspec;
    }
    public void setDataEspec(String dataEspec) {
        this.dataEspec = dataEspec;
    }
}
