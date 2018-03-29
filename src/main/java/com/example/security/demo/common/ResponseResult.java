package com.example.security.demo.common;

import java.io.Serializable;

/**
 *
 * @author Mao.Zeng@MG
 * @date 2018/3/22 16:39
 */
public class ResponseResult<T> implements Serializable {
    private String status;
    private String msg;
    private T data;

    public ResponseResult(){
        this.status = "success";
        this.msg = "request success";
    }
    public ResponseResult(String status,String msg){
        this.status = status;
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
