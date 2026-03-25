package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AeW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3043AeW {
    public static final int $stable = 8;
    public C3068Aev AEQbTJ;
    public java.util.List<C3038AeR> KWHzl;
    public java.util.List<C3038AeR> OLrzqt;
    public java.util.List<C3038AeR> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AeW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3043AeW copy$default(C3043AeW c3043AeW, C3068Aev c3068Aev, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3068Aev = c3043AeW.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = c3043AeW.copydefault;
        }
        if ((i & 4) != 0) {
            list2 = c3043AeW.KWHzl;
        }
        if ((i & 8) != 0) {
            list3 = c3043AeW.OLrzqt;
        }
        return c3043AeW.AEQbTJ(c3068Aev, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3043AeW AEQbTJ(C3068Aev c3068Aev, @NotNull java.util.List<C3038AeR> list, @NotNull java.util.List<C3038AeR> list2, @NotNull java.util.List<C3038AeR> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new C3043AeW(c3068Aev, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C3038AeR> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C3038AeR> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C3038AeR> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3068Aev copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3043AeW)) {
            return false;
        }
        C3043AeW c3043AeW = (C3043AeW) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c3043AeW.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c3043AeW.copydefault) && Intrinsics.EZpvd(this.KWHzl, c3043AeW.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c3043AeW.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        C3068Aev c3068Aev = this.AEQbTJ;
        return ((((((c3068Aev == null ? 0 : c3068Aev.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SecurityListState(securityLevel=" + this.AEQbTJ + ", verificationMethod=" + this.copydefault + ", advancedSecurity=" + this.KWHzl + ", accountManagement=" + this.OLrzqt + ")";
    }

    public C3043AeW(C3068Aev c3068Aev, @NotNull java.util.List<C3038AeR> list, @NotNull java.util.List<C3038AeR> list2, @NotNull java.util.List<C3038AeR> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.AEQbTJ = c3068Aev;
        this.copydefault = list;
        this.KWHzl = list2;
        this.OLrzqt = list3;
    }
}
