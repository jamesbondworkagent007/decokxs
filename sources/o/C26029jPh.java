package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jPh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26029jPh {
    public final java.util.List<C26041jPt> AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.jPh */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C26029jPh copy$default(C26029jPh c26029jPh, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c26029jPh.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c26029jPh.OLrzqt;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c26029jPh.copydefault;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = c26029jPh.EZpvd;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            list = c26029jPh.AEQbTJ;
        }
        return c26029jPh.OLrzqt(str, str5, str6, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C26041jPt> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26029jPh OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<C26041jPt> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C26029jPh(str, str2, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26029jPh)) {
            return false;
        }
        C26029jPh c26029jPh = (C26029jPh) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c26029jPh.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c26029jPh.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c26029jPh.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c26029jPh.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c26029jPh.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FirstBuyerUiModel(totalBuyInRate=" + this.KWHzl + ", totalCurrentHoldingRate=" + this.OLrzqt + ", tokenContractAddress=" + this.copydefault + ", chainId=" + this.EZpvd + ", buyers=" + this.AEQbTJ + ")";
    }

    public C26029jPh(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<C26041jPt> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.copydefault = str3;
        this.EZpvd = str4;
        this.AEQbTJ = list;
    }
}
