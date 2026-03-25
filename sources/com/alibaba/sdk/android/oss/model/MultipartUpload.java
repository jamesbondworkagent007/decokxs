package com.alibaba.sdk.android.oss.model;

import java.util.Date;

/* JADX INFO: loaded from: classes21.dex */
public class MultipartUpload {
    private Date initiated;
    private String key;
    private String storageClass;
    private String uploadId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Date getInitiated() {
        return this.initiated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getStorageClass() {
        return this.storageClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUploadId() {
        return this.uploadId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setInitiated(Date date) {
        this.initiated = date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setKey(String str) {
        this.key = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setStorageClass(String str) {
        this.storageClass = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUploadId(String str) {
        this.uploadId = str;
    }
}
