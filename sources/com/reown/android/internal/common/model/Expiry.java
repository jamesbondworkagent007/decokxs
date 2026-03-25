package com.reown.android.internal.common.model;

/* JADX INFO: loaded from: classes12.dex */
public final class Expiry {
    public final long seconds;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Expiry copy$default(Expiry expiry, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = expiry.seconds;
        }
        return expiry.copy(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.seconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Expiry copy(long j) {
        return new Expiry(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Expiry) && this.seconds == ((Expiry) obj).seconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSeconds() {
        return this.seconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.seconds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Expiry(seconds=" + this.seconds + ")";
    }

    public Expiry(long j) {
        this.seconds = j;
    }
}
