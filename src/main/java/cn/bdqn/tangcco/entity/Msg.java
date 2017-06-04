package cn.bdqn.tangcco.entity;

import java.util.Map;

/**
 * Created by Administrator on 2017/6/3.
 */
public class Msg {
    private String code;
    private String msg;
    private Map<String,Object> map;

    public Msg() {
    }

    public Msg(String code, String msg, Map<String, Object> map) {
        this.code = code;
        this.msg = msg;
        this.map = map;
    }

    public static Msg success(Map<String,Object> map){
        return new Msg("100","处理成功",map);
    }
    public static Msg error(Map<String,Object> map){
        return new Msg("200","处理失败",map);
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
