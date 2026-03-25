package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AzQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C4148AzQ {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public long AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public long KWHzl;
    public java.lang.Long OLrzqt;
    public long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4148AzQ copydefault(long j, @NotNull java.lang.String str, long j2, java.lang.Long l, @NotNull java.lang.String str2, long j3, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C4148AzQ(j, str, j2, l, str2, j3, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4148AzQ)) {
            return false;
        }
        C4148AzQ c4148AzQ = (C4148AzQ) obj;
        return this.copydefault == c4148AzQ.copydefault && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c4148AzQ.EZpvd) && this.KWHzl == c4148AzQ.KWHzl && Intrinsics.EZpvd(this.OLrzqt, c4148AzQ.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c4148AzQ.AhwBna) && this.AYXKKw == c4148AzQ.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c4148AzQ.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Long.hashCode(this.copydefault);
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = java.lang.Long.hashCode(this.KWHzl);
        java.lang.Long l = this.OLrzqt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l == null ? 0 : l.hashCode())) * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Long.hashCode(this.AYXKKw)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BuySellPresetParam(feeLevel=" + this.copydefault + ", feeValue=" + this.EZpvd + ", routerModeType=" + this.KWHzl + ", slippageLevel=" + this.OLrzqt + ", slippageValue=" + this.AhwBna + ", slippageType=" + this.AYXKKw + ", dynamicMaxSlippageValue=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long valueOf() {
        return this.AYXKKw;
    }

    public C4148AzQ(long j, @NotNull java.lang.String str, long j2, java.lang.Long l, @NotNull java.lang.String str2, long j3, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = j;
        this.EZpvd = str;
        this.KWHzl = j2;
        this.OLrzqt = l;
        this.AhwBna = str2;
        this.AYXKKw = j3;
        this.AEQbTJ = str3;
    }
}
