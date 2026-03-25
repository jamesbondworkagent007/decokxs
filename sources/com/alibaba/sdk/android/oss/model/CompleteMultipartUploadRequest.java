package com.alibaba.sdk.android.oss.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class CompleteMultipartUploadRequest extends OSSRequest {
    private String bucketName;
    private Map<String, String> callbackParam;
    private Map<String, String> callbackVars;
    private ObjectMetadata metadata;
    private String objectKey;
    private List<PartETag> partETags = new ArrayList();
    private String uploadId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBucketName() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> getCallbackParam() {
        return this.callbackParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> getCallbackVars() {
        return this.callbackVars;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObjectMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getObjectKey() {
        return this.objectKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<PartETag> getPartETags() {
        return this.partETags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUploadId() {
        return this.uploadId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucketName(String str) {
        this.bucketName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCallbackParam(Map<String, String> map) {
        this.callbackParam = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCallbackVars(Map<String, String> map) {
        this.callbackVars = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMetadata(ObjectMetadata objectMetadata) {
        this.metadata = objectMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setObjectKey(String str) {
        this.objectKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPartETags(List<PartETag> list) {
        this.partETags = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUploadId(String str) {
        this.uploadId = str;
    }

    public CompleteMultipartUploadRequest(String str, String str2, String str3, List<PartETag> list) {
        setBucketName(str);
        setObjectKey(str2);
        setUploadId(str3);
        setPartETags(list);
    }
}
