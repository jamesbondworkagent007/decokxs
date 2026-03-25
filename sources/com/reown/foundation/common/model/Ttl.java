package com.reown.foundation.common.model;

import com.squareup.moshi.JsonClass;

/* JADX INFO: loaded from: classes12.dex */
@JsonClass(generateAdapter = false)
public final class Ttl {
    private final long seconds;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Ttl copy$default(Ttl ttl, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ttl.seconds;
        }
        return ttl.copy(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.seconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Ttl copy(long j) {
        return new Ttl(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ttl) && this.seconds == ((Ttl) obj).seconds;
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
        return "Ttl(seconds=" + this.seconds + ")";
    }

    public Ttl(long j) {
        this.seconds = j;
    }
}
