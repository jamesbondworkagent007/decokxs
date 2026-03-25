package com.alibaba.sdk.android.oss.model;

/* JADX INFO: loaded from: classes14.dex */
public class Range {
    public static final long INFINITE = -1;
    private long begin;
    private long end;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean checkIsValid() {
        long j = this.begin;
        if (j >= -1) {
            long j2 = this.end;
            if (j2 >= -1) {
                return j < 0 || j2 < 0 || j <= j2;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getBegin() {
        return this.begin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getEnd() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBegin(long j) {
        this.begin = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setEnd(long j) {
        this.end = j;
    }

    public Range(long j, long j2) {
        setBegin(j);
        setEnd(j2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        long j = this.begin;
        sb.append(j == -1 ? "" : String.valueOf(j));
        sb.append("-");
        long j2 = this.end;
        sb.append(j2 != -1 ? String.valueOf(j2) : "");
        return sb.toString();
    }
}
