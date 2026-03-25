package com.reown.android.relay;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class NetworkClientTimeout {
    public static final Companion Companion = new Companion(null);
    public static final long MAX_TIMEOUT_LIMIT_AS_MILLIS = 60000;
    public static final long MIN_TIMEOUT_LIMIT_AS_MILLIS = 15000;
    public final TimeUnit timeUnit;
    public final long timeout;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NetworkClientTimeout copy$default(NetworkClientTimeout networkClientTimeout, long j, TimeUnit timeUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            j = networkClientTimeout.timeout;
        }
        if ((i & 2) != 0) {
            timeUnit = networkClientTimeout.timeUnit;
        }
        return networkClientTimeout.copy(j, timeUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.timeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeUnit component2() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkClientTimeout copy(long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "");
        return new NetworkClientTimeout(j, timeUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkClientTimeout)) {
            return false;
        }
        NetworkClientTimeout networkClientTimeout = (NetworkClientTimeout) obj;
        return this.timeout == networkClientTimeout.timeout && this.timeUnit == networkClientTimeout.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimeout() {
        return this.timeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.timeout) * 31) + this.timeUnit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NetworkClientTimeout(timeout=" + this.timeout + ", timeUnit=" + this.timeUnit + ")";
    }

    public NetworkClientTimeout(long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "");
        this.timeout = j;
        this.timeUnit = timeUnit;
        if (!isTimeoutInRequiredRange()) {
            throw new IllegalArgumentException("Timeout must be in range of 15000 .. 60000 milliseconds".toString());
        }
    }

    public final boolean isTimeoutInRequiredRange() {
        long jConvert = TimeUnit.MILLISECONDS.convert(this.timeout, this.timeUnit);
        return 15000 <= jConvert && jConvert < 60001;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.relay.NetworkClientTimeout.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final NetworkClientTimeout getDefaultTimeout() {
            return new NetworkClientTimeout(15000L, TimeUnit.MILLISECONDS);
        }
    }
}
