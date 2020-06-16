package com.example.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @className:Result
 * @description:
 * @author:Peter
 * @date:2020/6/16 16:01
 **/
@Data
public class Result implements Serializable {

    /**
     * 200是正常的， 非200是异常
     */
    public int code;
    private String msg;
    private Object data;

    public static Result succ(Object data){
        return succ(200, "操作成功", data);
    }

    public static Result succ(int code, String msg, Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result fail(String msg){
        return fail(400, msg, null);
    }

    public static Result fail(String msg, Object data){
        return fail(400, msg, data);
    }

    public static Result fail(int code, String msg, Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
