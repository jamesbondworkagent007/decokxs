package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.network.CacheStrategy;

/* JADX INFO: renamed from: o.Bbp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4345Bbp {
    public static final int $stable = 8;
    public long EZpvd;
    public CacheStrategy OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4345Bbp copy$default(C4345Bbp c4345Bbp, CacheStrategy cacheStrategy, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cacheStrategy = c4345Bbp.OLrzqt;
        }
        if ((i & 2) != 0) {
            j = c4345Bbp.EZpvd;
        }
        if ((i & 4) != 0) {
            z = c4345Bbp.copydefault;
        }
        return c4345Bbp.copydefault(cacheStrategy, j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CacheStrategy OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4345Bbp copydefault(@NotNull CacheStrategy cacheStrategy, long j, boolean z) {
        Intrinsics.checkNotNullParameter(cacheStrategy, "");
        return new C4345Bbp(cacheStrategy, j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4345Bbp)) {
            return false;
        }
        C4345Bbp c4345Bbp = (C4345Bbp) obj;
        return this.OLrzqt == c4345Bbp.OLrzqt && this.EZpvd == c4345Bbp.EZpvd && this.copydefault == c4345Bbp.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + java.lang.Long.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OkxCacheConfig(strategy=" + this.OLrzqt + ", expireSecs=" + this.EZpvd + ", bindIgnoreAuthorization=" + this.copydefault + ")";
    }

    public C4345Bbp(@NotNull CacheStrategy cacheStrategy, long j, boolean z) {
        Intrinsics.checkNotNullParameter(cacheStrategy, "");
        this.OLrzqt = cacheStrategy;
        this.EZpvd = j;
        this.copydefault = z;
    }
}
