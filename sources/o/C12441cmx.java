package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cmx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12441cmx {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final C10854bwM KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C12441cmx copy$default(C12441cmx c12441cmx, C10854bwM c10854bwM, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c10854bwM = c12441cmx.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c12441cmx.EZpvd;
        }
        java.lang.String str5 = str;
        if ((i & 4) != 0) {
            str2 = c12441cmx.OLrzqt;
        }
        java.lang.String str6 = str2;
        if ((i & 8) != 0) {
            str3 = c12441cmx.copydefault;
        }
        java.lang.String str7 = str3;
        if ((i & 16) != 0) {
            str4 = c12441cmx.AEQbTJ;
        }
        return c12441cmx.KWHzl(c10854bwM, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12441cmx KWHzl(@NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C12441cmx(c10854bwM, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12441cmx)) {
            return false;
        }
        C12441cmx c12441cmx = (C12441cmx) obj;
        return Intrinsics.EZpvd(this.KWHzl, c12441cmx.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c12441cmx.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c12441cmx.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c12441cmx.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c12441cmx.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Fee(coinMeta=" + this.KWHzl + ", tokenId=" + this.EZpvd + ", tokenSymbol=" + this.OLrzqt + ", amount=" + this.copydefault + ", feeValue=" + this.AEQbTJ + ")";
    }

    public C12441cmx(@NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.KWHzl = c10854bwM;
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.copydefault = str3;
        this.AEQbTJ = str4;
    }
}
