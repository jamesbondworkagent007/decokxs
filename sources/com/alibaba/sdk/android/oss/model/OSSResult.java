package com.alibaba.sdk.android.oss.model;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class OSSResult {
    private Long clientCRC;
    private String requestId;
    private Map<String, String> responseHeader;
    private Long serverCRC;
    private int statusCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Long getClientCRC() {
        return this.clientCRC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> getResponseHeader() {
        return this.responseHeader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Long getServerCRC() {
        return this.serverCRC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getStatusCode() {
        return this.statusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRequestId(String str) {
        this.requestId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setResponseHeader(Map<String, String> map) {
        this.responseHeader = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setClientCRC(Long l) {
        if (l == null || l.longValue() == 0) {
            return;
        }
        this.clientCRC = l;
    }

    public void setServerCRC(Long l) {
        if (l == null || l.longValue() == 0) {
            return;
        }
        this.serverCRC = l;
    }

    public String toString() {
        String string = super.toString();
        int i = this.statusCode;
        return String.format("OSSResult<%s>: \nstatusCode:%d,\nresponseHeader:%s,\nrequestId:%s", string, Integer.valueOf(i), this.responseHeader.toString(), this.requestId);
    }
}
