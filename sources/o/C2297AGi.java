package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AGi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2297AGi {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.util.List<C2293AGe> EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.AGi */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2297AGi copy$default(C2297AGi c2297AGi, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2297AGi.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c2297AGi.copydefault;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            list = c2297AGi.EZpvd;
        }
        java.util.List list2 = list;
        if ((i & 8) != 0) {
            str3 = c2297AGi.KWHzl;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = c2297AGi.AEQbTJ;
        }
        return c2297AGi.copydefault(str, str5, list2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C2293AGe> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2297AGi copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C2293AGe> list, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C2297AGi(str, str2, list, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2297AGi)) {
            return false;
        }
        C2297AGi c2297AGi = (C2297AGi) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c2297AGi.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c2297AGi.copydefault) && Intrinsics.EZpvd(this.EZpvd, c2297AGi.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c2297AGi.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2297AGi.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PresetUserParams(accountId=" + this.OLrzqt + ", chainId=" + this.copydefault + ", presets=" + this.EZpvd + ", sceneType=" + this.KWHzl + ", userWalletAddress=" + this.AEQbTJ + ")";
    }

    public C2297AGi(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C2293AGe> list, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.OLrzqt = str;
        this.copydefault = str2;
        this.EZpvd = list;
        this.KWHzl = str3;
        this.AEQbTJ = str4;
    }
}
