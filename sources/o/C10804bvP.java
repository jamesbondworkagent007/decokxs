package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bvP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10804bvP {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.Long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C10804bvP copy$default(C10804bvP c10804bvP, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c10804bvP.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c10804bvP.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str3 = c10804bvP.EZpvd;
        }
        if ((i & 8) != 0) {
            l = c10804bvP.copydefault;
        }
        return c10804bvP.AEQbTJ(str, str2, str3, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10804bvP AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C10804bvP(str, str2, str3, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10804bvP)) {
            return false;
        }
        C10804bvP c10804bvP = (C10804bvP) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c10804bvP.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c10804bvP.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c10804bvP.EZpvd) && Intrinsics.EZpvd(this.copydefault, c10804bvP.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.AEQbTJ;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.Long l = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CheckBtcAssetsForDappParams(payload=" + this.OLrzqt + ", action=" + this.AEQbTJ + ", address=" + this.EZpvd + ", coinId=" + this.copydefault + ")";
    }

    public C10804bvP(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.copydefault = l;
    }
}
