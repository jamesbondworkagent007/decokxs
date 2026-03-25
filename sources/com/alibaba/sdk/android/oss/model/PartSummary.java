package com.alibaba.sdk.android.oss.model;

import java.util.Date;

/* JADX INFO: loaded from: classes14.dex */
public class PartSummary {
    private String eTag;
    private Date lastModified;
    private int partNumber;
    private long size;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getETag() {
        return this.eTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Date getLastModified() {
        return this.lastModified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getPartNumber() {
        return this.partNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setETag(String str) {
        this.eTag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLastModified(Date date) {
        this.lastModified = date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPartNumber(int i) {
        this.partNumber = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSize(long j) {
        this.size = j;
    }
}
