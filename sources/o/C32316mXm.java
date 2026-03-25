package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mXm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32316mXm {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.util.List<mXB> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.mXm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C32316mXm copy$default(C32316mXm c32316mXm, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c32316mXm.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c32316mXm.OLrzqt;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c32316mXm.KWHzl;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = c32316mXm.AEQbTJ;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            list = c32316mXm.copydefault;
        }
        return c32316mXm.EZpvd(str, str5, str6, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32316mXm EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<mXB> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C32316mXm(str, str2, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<mXB> OLrzqt() {
        return this.copydefault;
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
        if (!(obj instanceof C32316mXm)) {
            return false;
        }
        C32316mXm c32316mXm = (C32316mXm) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c32316mXm.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c32316mXm.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c32316mXm.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c32316mXm.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c32316mXm.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FirstBuyerUiModel(totalBuyInRate=" + this.EZpvd + ", totalCurrentHoldingRate=" + this.OLrzqt + ", tokenContractAddress=" + this.KWHzl + ", chainId=" + this.AEQbTJ + ", buyers=" + this.copydefault + ")";
    }

    public C32316mXm(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<mXB> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.KWHzl = str3;
        this.AEQbTJ = str4;
        this.copydefault = list;
    }
}
