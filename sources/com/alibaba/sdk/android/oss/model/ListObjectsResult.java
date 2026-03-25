package com.alibaba.sdk.android.oss.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class ListObjectsResult extends OSSResult {
    private String bucketName;
    private String delimiter;
    private String encodingType;
    private boolean isTruncated;
    private String marker;
    private int maxKeys;
    private String nextMarker;
    private String prefix;
    private List<OSSObjectSummary> objectSummaries = new ArrayList();
    private List<String> commonPrefixes = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBucketName() {
        return this.bucketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getCommonPrefixes() {
        return this.commonPrefixes;
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
    public String getMarker() {
        return this.marker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMaxKeys() {
        return this.maxKeys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<OSSObjectSummary> getObjectSummaries() {
        return this.objectSummaries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPrefix() {
        return this.prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isTruncated() {
        return this.isTruncated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBucketName(String str) {
        this.bucketName = str;
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
    public void setMarker(String str) {
        this.marker = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMaxKeys(int i) {
        this.maxKeys = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setNextMarker(String str) {
        this.nextMarker = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPrefix(String str) {
        this.prefix = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTruncated(boolean z) {
        this.isTruncated = z;
    }

    public void addObjectSummary(OSSObjectSummary oSSObjectSummary) {
        this.objectSummaries.add(oSSObjectSummary);
    }

    public void clearObjectSummaries() {
        this.objectSummaries.clear();
    }

    public void addCommonPrefix(String str) {
        this.commonPrefixes.add(str);
    }

    public void clearCommonPrefixes() {
        this.commonPrefixes.clear();
    }
}
