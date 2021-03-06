package com.netty.http.xml.codec.response;

import io.netty.handler.codec.http.FullHttpResponse;

/**
 * @author wangchen
 * @date 2018/3/14 10:36
 */
public class HttpXmlResponse {
    private FullHttpResponse response;
    private Object result;

    public HttpXmlResponse(FullHttpResponse response, Object result) {
        this.response = response;
        this.result = result;
    }

    public FullHttpResponse getResponse() {
        return response;
    }

    public void setResponse(FullHttpResponse response) {
        this.response = response;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
