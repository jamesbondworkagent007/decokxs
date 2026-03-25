package com.okinc.web3.security.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class RetryConfig {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final RetryConfig retryConfig = new RetryConfig(5, 50, 1000, 1.5d);
    private final double backoffMultiplier;
    private final long baseDelay;
    private final int maxAttempts;
    private final long maxDelay;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RetryConfig copy$default(RetryConfig retryConfig2, int i, long j, long j2, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = retryConfig2.maxAttempts;
        }
        if ((i2 & 2) != 0) {
            j = retryConfig2.baseDelay;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = retryConfig2.maxDelay;
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            d = retryConfig2.backoffMultiplier;
        }
        return retryConfig2.copy(i, j3, j4, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.maxAttempts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.baseDelay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.maxDelay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component4() {
        return this.backoffMultiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RetryConfig copy(int i, long j, long j2, double d) {
        return new RetryConfig(i, j, j2, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetryConfig)) {
            return false;
        }
        RetryConfig retryConfig2 = (RetryConfig) obj;
        return this.maxAttempts == retryConfig2.maxAttempts && this.baseDelay == retryConfig2.baseDelay && this.maxDelay == retryConfig2.maxDelay && Double.compare(this.backoffMultiplier, retryConfig2.backoffMultiplier) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getBackoffMultiplier() {
        return this.backoffMultiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBaseDelay() {
        return this.baseDelay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxAttempts() {
        return this.maxAttempts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMaxDelay() {
        return this.maxDelay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.maxAttempts) * 31) + Long.hashCode(this.baseDelay)) * 31) + Long.hashCode(this.maxDelay)) * 31) + Double.hashCode(this.backoffMultiplier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RetryConfig(maxAttempts=" + this.maxAttempts + ", baseDelay=" + this.baseDelay + ", maxDelay=" + this.maxDelay + ", backoffMultiplier=" + this.backoffMultiplier + ")";
    }

    public RetryConfig(int i, long j, long j2, double d) {
        this.maxAttempts = i;
        this.baseDelay = j;
        this.maxDelay = j2;
        this.backoffMultiplier = d;
        if (1 > i || i >= 11) {
            throw new IllegalArgumentException("maxAttempts must be between 1 and 10".toString());
        }
        if (10 > j || j >= 10001) {
            throw new IllegalArgumentException("baseDelay must be between 10ms and 10s".toString());
        }
        if (j2 < j || j2 > 60000) {
            throw new IllegalArgumentException("maxDelay must be between baseDelay and 60s".toString());
        }
        if (1.0d > d || d > 5.0d) {
            throw new IllegalArgumentException("backoffMultiplier must be between 1.0 and 5.0".toString());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.utils.RetryConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RetryConfig getRetryConfig() {
            return RetryConfig.retryConfig;
        }
    }
}
