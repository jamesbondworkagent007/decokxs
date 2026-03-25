package com.alibaba.sdk.android.oss.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DeleteMultipleObjectRequest extends OSSRequest {
    private String bucketName;
    private boolean isQuiet;
    private List<String> objectKeys;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBucketName() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getObjectKeys() {
        return this.objectKeys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucketName(String str) {
        this.bucketName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setObjectKeys(List<String> list) {
        this.objectKeys = list;
    }

    public DeleteMultipleObjectRequest(String str, List<String> list, Boolean bool) {
        setBucketName(str);
        setObjectKeys(list);
        setQuiet(bool);
    }

    public Boolean getQuiet() {
        return Boolean.valueOf(this.isQuiet);
    }

    public void setQuiet(Boolean bool) {
        this.isQuiet = bool.booleanValue();
    }
}
