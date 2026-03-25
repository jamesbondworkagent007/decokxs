package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.SecurityType;

/* JADX INFO: renamed from: o.AeR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3038AeR {
    public static final int $stable = 8;
    public zCC AEQbTJ;
    public SecurityType EZpvd;
    public boolean KWHzl;
    public zCC OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3038AeR copy$default(C3038AeR c3038AeR, SecurityType securityType, zCC zcc, zCC zcc2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            securityType = c3038AeR.EZpvd;
        }
        if ((i & 2) != 0) {
            zcc = c3038AeR.AEQbTJ;
        }
        if ((i & 4) != 0) {
            zcc2 = c3038AeR.OLrzqt;
        }
        if ((i & 8) != 0) {
            z = c3038AeR.KWHzl;
        }
        return c3038AeR.OLrzqt(securityType, zcc, zcc2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zCC EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3038AeR OLrzqt(@NotNull SecurityType securityType, @NotNull zCC zcc, @NotNull zCC zcc2, boolean z) {
        Intrinsics.checkNotNullParameter(securityType, "");
        Intrinsics.checkNotNullParameter(zcc, "");
        Intrinsics.checkNotNullParameter(zcc2, "");
        return new C3038AeR(securityType, zcc, zcc2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SecurityType OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zCC copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3038AeR)) {
            return false;
        }
        C3038AeR c3038AeR = (C3038AeR) obj;
        return this.EZpvd == c3038AeR.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, c3038AeR.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c3038AeR.OLrzqt) && this.KWHzl == c3038AeR.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SecurityListItem(itemType=" + this.EZpvd + ", title=" + this.AEQbTJ + ", content=" + this.OLrzqt + ", isEntry=" + this.KWHzl + ")";
    }

    public C3038AeR(@NotNull SecurityType securityType, @NotNull zCC zcc, @NotNull zCC zcc2, boolean z) {
        Intrinsics.checkNotNullParameter(securityType, "");
        Intrinsics.checkNotNullParameter(zcc, "");
        Intrinsics.checkNotNullParameter(zcc2, "");
        this.EZpvd = securityType;
        this.AEQbTJ = zcc;
        this.OLrzqt = zcc2;
        this.KWHzl = z;
    }
}
