package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes2.dex */
public class PutObjectResult extends OSSResult {
    private String eTag;
    private String serverCallbackReturnBody;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getETag() {
        return this.eTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getServerCallbackReturnBody() {
        return this.serverCallbackReturnBody;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setETag(String str) {
        this.eTag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setServerCallbackReturnBody(String str) {
        this.serverCallbackReturnBody = str;
    }
}
