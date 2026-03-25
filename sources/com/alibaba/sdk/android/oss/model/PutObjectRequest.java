package com.alibaba.sdk.android.oss.model;

import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.callback.OSSRetryCallback;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PutObjectRequest extends OSSRequest {
    private String bucketName;
    private Map<String, String> callbackParam;
    private Map<String, String> callbackVars;
    private ObjectMetadata metadata;
    private String objectKey;
    private OSSProgressCallback<PutObjectRequest> progressCallback;
    private OSSRetryCallback retryCallback;
    private byte[] uploadData;
    private String uploadFilePath;

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
    public OSSProgressCallback<PutObjectRequest> getProgressCallback() {
        return this.progressCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OSSRetryCallback getRetryCallback() {
        return this.retryCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getUploadData() {
        return this.uploadData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUploadFilePath() {
        return this.uploadFilePath;
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
    public void setProgressCallback(OSSProgressCallback<PutObjectRequest> oSSProgressCallback) {
        this.progressCallback = oSSProgressCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRetryCallback(OSSRetryCallback oSSRetryCallback) {
        this.retryCallback = oSSRetryCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUploadData(byte[] bArr) {
        this.uploadData = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUploadFilePath(String str) {
        this.uploadFilePath = str;
    }

    public PutObjectRequest(String str, String str2, String str3) {
        this(str, str2, str3, (ObjectMetadata) null);
    }

    public PutObjectRequest(String str, String str2, String str3, ObjectMetadata objectMetadata) {
        setBucketName(str);
        setObjectKey(str2);
        setUploadFilePath(str3);
        setMetadata(objectMetadata);
    }

    public PutObjectRequest(String str, String str2, byte[] bArr) {
        this(str, str2, bArr, (ObjectMetadata) null);
    }

    public PutObjectRequest(String str, String str2, byte[] bArr, ObjectMetadata objectMetadata) {
        setBucketName(str);
        setObjectKey(str2);
        setUploadData(bArr);
        setMetadata(objectMetadata);
    }
}
