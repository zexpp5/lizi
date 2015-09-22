package com.youwinedu.lizi.controller.struct;


public class WebResponse {

    private WebResponseStatus status;
    private String error;

    public static WebResponse SUCCESS = new WebResponse(WebResponseStatus.SUCCESS);

    public WebResponse() {
    }

    public WebResponse(WebResponseStatus status) {
        this.status = status;
    }

    public WebResponseStatus getStatus() {
        return status;
    }

    public WebResponse setStatus(WebResponseStatus status) {
        this.status = status;
        return this;
    }

    public String getError() {
        return error;
    }

    public WebResponse setError(String error) {
        this.error = error;
        return this;
    }
}
