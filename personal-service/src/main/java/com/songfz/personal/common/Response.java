package com.songfz.personal.common;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Author: fzsong3
 * @Date: 2020/6/28 17:13
 * @Description:
 */
public class Response<T> implements Serializable {

    protected String code = "200";
    protected String msg = "success";
    protected T data;

    public Response() {
    }

    public Response(T data) {
        this.data = data;
    }

    public Response(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getData() {
        return this.data;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public String toString() {
        return "Response(code=" + this.getCode() + ", msg=" + this.getMsg() + ", data=" + this.getData() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response)) return false;
        Response<?> response = (Response<?>) o;
        return Objects.equals(code, response.code) &&
                Objects.equals(msg, response.msg) &&
                Objects.equals(data, response.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg, data);
    }
}
