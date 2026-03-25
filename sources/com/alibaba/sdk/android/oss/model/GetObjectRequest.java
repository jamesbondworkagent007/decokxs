package com.alibaba.sdk.android.oss.model;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class GetObjectRequest extends OSSRequest {
    private String bucketName;
    private String objectKey;
    private OSSProgressCallback progressListener;
    private Range range;
    private Map<String, String> requestHeaders;
    private String xOssProcess;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBucketName() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getObjectKey() {
        return this.objectKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OSSProgressCallback getProgressListener() {
        return this.progressListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Range getRange() {
        return this.range;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> getRequestHeaders() {
        return this.requestHeaders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getxOssProcess() {
        return this.xOssProcess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucketName(String str) {
        this.bucketName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setObjectKey(String str) {
        this.objectKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setProgressListener(OSSProgressCallback<GetObjectRequest> oSSProgressCallback) {
        this.progressListener = oSSProgressCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRange(Range range) {
        this.range = range;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRequestHeaders(Map<String, String> map) {
        this.requestHeaders = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setxOssProcess(String str) {
        this.xOssProcess = str;
    }

    public GetObjectRequest(String str, String str2) {
        setBucketName(str);
        setObjectKey(str2);
    }
}
