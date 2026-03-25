package com.alibaba.sdk.android.oss.model;

import java.util.Date;

/* JADX INFO: loaded from: classes14.dex */
public class CopyObjectResult extends OSSResult {
    private String etag;
    private Date lastModified;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getETag() {
        return this.etag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Date getLastModified() {
        return this.lastModified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setEtag(String str) {
        this.etag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLastModified(Date date) {
        this.lastModified = date;
    }
}
