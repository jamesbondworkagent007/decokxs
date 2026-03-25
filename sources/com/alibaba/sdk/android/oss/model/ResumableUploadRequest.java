package com.alibaba.sdk.android.oss.model;

import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import java.io.File;

/* JADX INFO: loaded from: classes14.dex */
public class ResumableUploadRequest extends MultipartUploadRequest {
    private Boolean deleteUploadOnCancelling;
    private String recordDirectory;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Boolean deleteUploadOnCancelling() {
        return this.deleteUploadOnCancelling;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getRecordDirectory() {
        return this.recordDirectory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDeleteUploadOnCancelling(Boolean bool) {
        this.deleteUploadOnCancelling = bool;
    }

    public ResumableUploadRequest(String str, String str2, String str3) {
        this(str, str2, str3, null, null);
    }

    public ResumableUploadRequest(String str, String str2, String str3, ObjectMetadata objectMetadata) {
        this(str, str2, str3, objectMetadata, null);
    }

    public ResumableUploadRequest(String str, String str2, String str3, String str4) {
        this(str, str2, str3, null, str4);
    }

    public ResumableUploadRequest(String str, String str2, String str3, ObjectMetadata objectMetadata, String str4) {
        super(str, str2, str3, objectMetadata);
        this.deleteUploadOnCancelling = Boolean.TRUE;
        setRecordDirectory(str4);
    }

    public void setRecordDirectory(String str) {
        if (!OSSUtils.isEmptyString(str)) {
            File file = new File(str);
            if (!file.exists() || !file.isDirectory()) {
                throw new IllegalArgumentException("Record directory must exist, and it should be a directory!");
            }
        }
        this.recordDirectory = str;
    }
}
