package com.alibaba.sdk.android.oss;

import com.alibaba.sdk.android.oss.common.OSSLog;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceException extends Exception {
    private static final long serialVersionUID = 430933593095358673L;
    private String errorCode;
    private String hostId;
    private String partEtag;
    private String partNumber;
    private String rawMessage;
    private String requestId;
    private int statusCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getHostId() {
        return this.hostId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPartEtag() {
        return this.partEtag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPartNumber() {
        return this.partNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getRawMessage() {
        return this.rawMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getStatusCode() {
        return this.statusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPartEtag(String str) {
        this.partEtag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPartNumber(String str) {
        this.partNumber = str;
    }

    public ServiceException(int i, String str, String str2, String str3, String str4, String str5) {
        super(str);
        this.statusCode = i;
        this.errorCode = str2;
        this.requestId = str3;
        this.hostId = str4;
        this.rawMessage = str5;
        OSSLog.logThrowable2Local(this);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "[StatusCode]: " + this.statusCode + ", [Code]: " + getErrorCode() + ", [Message]: " + getMessage() + ", [Requestid]: " + getRequestId() + ", [HostId]: " + getHostId() + ", [RawMessage]: " + getRawMessage();
    }
}
