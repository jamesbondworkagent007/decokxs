package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes2.dex */
public class ListMultipartUploadsRequest extends OSSRequest {
    private String bucketName;
    private String delimiter;
    private String encodingType;
    private String keyMarker;
    private Integer maxUploads;
    private String prefix;
    private String uploadIdMarker;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBucketName() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDelimiter() {
        return this.delimiter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getEncodingType() {
        return this.encodingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getKeyMarker() {
        return this.keyMarker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer getMaxUploads() {
        return this.maxUploads;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPrefix() {
        return this.prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUploadIdMarker() {
        return this.uploadIdMarker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDelimiter(String str) {
        this.delimiter = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setEncodingType(String str) {
        this.encodingType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setKeyMarker(String str) {
        this.keyMarker = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMaxUploads(Integer num) {
        this.maxUploads = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPrefix(String str) {
        this.prefix = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setUploadIdMarker(String str) {
        this.uploadIdMarker = str;
    }

    public ListMultipartUploadsRequest(String str) {
        this.bucketName = str;
    }
}
