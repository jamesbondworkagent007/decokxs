package com.alibaba.sdk.android.oss.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class ListBucketsResult extends OSSResult {
    private List<OSSBucketSummary> buckets = new ArrayList();
    private boolean isTruncated;
    private String marker;
    private int maxKeys;
    private String nextMarker;
    private String ownerDisplayName;
    private String ownerId;
    private String prefix;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<OSSBucketSummary> getBuckets() {
        return this.buckets;
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
    public String getOwnerDisplayName() {
        return this.ownerDisplayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOwnerId() {
        return this.ownerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPrefix() {
        return this.prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getTruncated() {
        return this.isTruncated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBuckets(List<OSSBucketSummary> list) {
        this.buckets = list;
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
    public void setOwnerDisplayName(String str) {
        this.ownerDisplayName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPrefix(String str) {
        this.prefix = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTruncated(boolean z) {
        this.isTruncated = z;
    }

    public void addBucket(OSSBucketSummary oSSBucketSummary) {
        this.buckets.add(oSSBucketSummary);
    }

    public void clearBucketList() {
        this.buckets.clear();
    }
}
