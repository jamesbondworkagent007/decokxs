package com.alibaba.sdk.android.oss.model;

import android.support.v4.media.session.PlaybackStateCompat;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.MultipartUploadRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class MultipartUploadRequest<T extends MultipartUploadRequest> extends OSSRequest {
    protected String bucketName;
    protected Map<String, String> callbackParam;
    protected Map<String, String> callbackVars;
    protected ObjectMetadata metadata;
    protected String objectKey;
    protected long partSize;
    protected OSSProgressCallback<T> progressCallback;
    protected String uploadFilePath;
    protected String uploadId;

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
    public long getPartSize() {
        return this.partSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OSSProgressCallback<T> getProgressCallback() {
        return this.progressCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUploadFilePath() {
        return this.uploadFilePath;
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
    public void setPartSize(long j) {
        this.partSize = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setProgressCallback(OSSProgressCallback<T> oSSProgressCallback) {
        this.progressCallback = oSSProgressCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUploadFilePath(String str) {
        this.uploadFilePath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUploadId(String str) {
        this.uploadId = str;
    }

    public MultipartUploadRequest(String str, String str2, String str3) {
        this(str, str2, str3, null);
    }

    public MultipartUploadRequest(String str, String str2, String str3, ObjectMetadata objectMetadata) {
        this.partSize = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        setBucketName(str);
        setObjectKey(str2);
        setUploadFilePath(str3);
        setMetadata(objectMetadata);
    }
}
