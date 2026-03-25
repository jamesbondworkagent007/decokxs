package com.alibaba.sdk.android.oss.model;

import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class TriggerCallbackRequest extends OSSRequest {
    private String mBucketName;
    private Map<String, String> mCallbackParam;
    private Map<String, String> mCallbackVars;
    private String mObjectKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBucketName() {
        return this.mBucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> getCallbackParam() {
        return this.mCallbackParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> getCallbackVars() {
        return this.mCallbackVars;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getObjectKey() {
        return this.mObjectKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucketName(String str) {
        this.mBucketName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCallbackParam(Map<String, String> map) {
        this.mCallbackParam = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCallbackVars(Map<String, String> map) {
        this.mCallbackVars = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setObjectKey(String str) {
        this.mObjectKey = str;
    }

    public TriggerCallbackRequest(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        setBucketName(str);
        setObjectKey(str2);
        setCallbackParam(map);
        setCallbackVars(map2);
    }
}
