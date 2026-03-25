package com.ibm.icu.util;

import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class DateInterval implements Serializable {
    private static final long serialVersionUID = 1;
    private final long fromDate;
    private final long toDate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getFromDate() {
        return this.fromDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getToDate() {
        return this.toDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (int) (this.fromDate + this.toDate);
    }

    public DateInterval(long j, long j2) {
        this.fromDate = j;
        this.toDate = j2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DateInterval) {
            DateInterval dateInterval = (DateInterval) obj;
            if (this.fromDate == dateInterval.fromDate && this.toDate == dateInterval.toDate) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return String.valueOf(this.fromDate) + " " + String.valueOf(this.toDate);
    }
}
