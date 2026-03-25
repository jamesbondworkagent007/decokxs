package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AzS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4150AzS {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;
    public java.util.List<AGP> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.AzS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4150AzS copy$default(C4150AzS c4150AzS, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.util.List list, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c4150AzS.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c4150AzS.AEQbTJ;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            z = c4150AzS.copydefault;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = c4150AzS.OLrzqt;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            list = c4150AzS.valueOf;
        }
        java.util.List list2 = list;
        if ((i & 32) != 0) {
            str4 = c4150AzS.KWHzl;
        }
        return c4150AzS.OLrzqt(str, str5, z2, str6, list2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AGP> AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4150AzS OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, @NotNull java.util.List<AGP> list, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C4150AzS(str, str2, z, str3, list, str4);
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
        if (!(obj instanceof C4150AzS)) {
            return false;
        }
        C4150AzS c4150AzS = (C4150AzS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c4150AzS.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c4150AzS.AEQbTJ) && this.copydefault == c4150AzS.copydefault && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c4150AzS.OLrzqt) && Intrinsics.EZpvd(this.valueOf, c4150AzS.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c4150AzS.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode4 = this.OLrzqt.hashCode();
        int iHashCode5 = this.valueOf.hashCode();
        java.lang.String str = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChainTokensData(text=" + this.EZpvd + ", sectionType=" + this.AEQbTJ + ", clickable=" + this.copydefault + ", clickableMsg=" + this.OLrzqt + ", tokenList=" + this.valueOf + ", rawJson=" + this.KWHzl + ")";
    }

    public C4150AzS(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, @NotNull java.util.List<AGP> list, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.copydefault = z;
        this.OLrzqt = str3;
        this.valueOf = list;
        this.KWHzl = str4;
    }
}
