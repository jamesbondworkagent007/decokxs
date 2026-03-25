package com.okinc.cache;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class CacheConfig {
    public static final int $stable = 8;
    private long clearInterval;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CacheConfig() {
        this(0L, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CacheConfig copy$default(CacheConfig cacheConfig, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cacheConfig.clearInterval;
        }
        return cacheConfig.copy(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.clearInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CacheConfig copy(long j) {
        return new CacheConfig(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CacheConfig) && this.clearInterval == ((CacheConfig) obj).clearInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getClearInterval() {
        return this.clearInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.clearInterval);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClearInterval(long j) {
        this.clearInterval = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CacheConfig(clearInterval=" + this.clearInterval + ")";
    }

    public CacheConfig(long j) {
        this.clearInterval = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
 A[MD:(long):void (m)] (LINE:6) call: com.okinc.cache.CacheConfig.<init>(long):void type: THIS */
    public /* synthetic */ CacheConfig(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
