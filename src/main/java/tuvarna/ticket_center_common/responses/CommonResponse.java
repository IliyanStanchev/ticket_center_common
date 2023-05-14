package tuvarna.ticket_center_common.responses;

import tuvarna.ticket_center_common.requests.RequestCodes;
import tuvarna.ticket_center_common.requests.RequestStatuses;

import java.io.Serializable;

public class CommonResponse implements Serializable {

    private RequestCodes requestCode;

    private RequestStatuses requestStatus;

    private Object response;

    public CommonResponse() {
    }

    public CommonResponse(RequestCodes requestCode, RequestStatuses requestStatus, Object response) {
        this.requestCode = requestCode;
        this.requestStatus = requestStatus;
        this.response = response;
    }

    public RequestCodes getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(RequestCodes requestCode) {
        this.requestCode = requestCode;
    }

    public RequestStatuses getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatuses requestStatus) {
        this.requestStatus = requestStatus;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }
}
