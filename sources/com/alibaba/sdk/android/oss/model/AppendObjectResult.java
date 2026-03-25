package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes14.dex */
public class AppendObjectResult extends OSSResult {
    private long nextPosition;
    private String objectCRC64;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getNextPosition() {
        return this.nextPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getObjectCRC64() {
        return this.objectCRC64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setObjectCRC64(String str) {
        this.objectCRC64 = str;
    }

    public void setNextPosition(Long l) {
        this.nextPosition = l.longValue();
    }
}
