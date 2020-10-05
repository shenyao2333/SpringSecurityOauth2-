package com.example.oauth2.web;

/**
 * @author ：sy
 * @date ：Created in 2020.3.26 21:53
 * @description: 通用的异常枚举
 */
public enum ErrorEnum {


    /**
     * 成功
     */
    SUCCEED(R.CodeStatus.OK,"处理成功"),

    /**
     * 自定义错误处理
     */
    SYS(R.CodeStatus.SYS,"系统错误"),

    REQUEST(R.CodeStatus.REQUEST,"请求错误"),


    POWER (R.CodeStatus.POWER,"无权访问"),


    DATA (R.CodeStatus.DATA,"数据异常"),

    ANOMALY(R.CodeStatus.ANOMALY,"未知异常"),

    NET (R.CodeStatus.NET,"网络异常"),


    EXPIRED(R.CodeStatus.EXPIRED,"令牌错误"),


    EXTERN(R.CodeStatus.EXTERN,"第三方错误"),




    ;


    private Integer code;

    private String msg;

    ErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
