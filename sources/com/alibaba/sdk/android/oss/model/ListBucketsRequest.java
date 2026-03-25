package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes2.dex */
public class ListBucketsRequest extends OSSRequest {
    private static final int MAX_RETURNED_KEYS_LIMIT = 1000;
    private String marker;
    private Integer maxKeys;
    private String prefix;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMarker() {
        return this.marker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer getMaxKeys() {
        return this.maxKeys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPrefix() {
        return this.prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMarker(String str) {
        this.marker = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMaxKeys(Integer num) {
        this.maxKeys = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPrefix(String str) {
        this.prefix = str;
    }

    public ListBucketsRequest() {
    }

    public ListBucketsRequest(String str) {
        this(str, null);
    }

    public ListBucketsRequest(String str, String str2) {
        this(str, str2, 100);
    }

    public ListBucketsRequest(String str, String str2, Integer num) {
        this.prefix = str;
        this.marker = str2;
        this.maxKeys = num;
    }
}
