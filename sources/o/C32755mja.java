package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32755mja {
    public final int AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C32755mja copy$default(C32755mja c32755mja, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c32755mja.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            str = c32755mja.copydefault;
        }
        java.lang.String str7 = str;
        if ((i2 & 4) != 0) {
            str2 = c32755mja.gEmmrt;
        }
        java.lang.String str8 = str2;
        if ((i2 & 8) != 0) {
            str3 = c32755mja.EZpvd;
        }
        java.lang.String str9 = str3;
        if ((i2 & 16) != 0) {
            str4 = c32755mja.AhwBna;
        }
        java.lang.String str10 = str4;
        if ((i2 & 32) != 0) {
            str5 = c32755mja.OLrzqt;
        }
        java.lang.String str11 = str5;
        if ((i2 & 64) != 0) {
            str6 = c32755mja.KWHzl;
        }
        return c32755mja.KWHzl(i, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32755mja KWHzl(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new C32755mja(i, str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32755mja)) {
            return false;
        }
        C32755mja c32755mja = (C32755mja) obj;
        return this.AEQbTJ == c32755mja.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c32755mja.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c32755mja.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c32755mja.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c32755mja.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c32755mja.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c32755mja.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.AEQbTJ);
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.gEmmrt.hashCode();
        java.lang.String str = this.EZpvd;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AhwBna;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ViewIdentifier(id=" + this.AEQbTJ + ", idName=" + this.copydefault + ", textContent=" + this.gEmmrt + ", contentDescription=" + this.EZpvd + ", tag=" + this.AhwBna + ", className=" + this.OLrzqt + ", bounds=" + this.KWHzl + ")";
    }

    public C32755mja(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.AEQbTJ = i;
        this.copydefault = str;
        this.gEmmrt = str2;
        this.EZpvd = str3;
        this.AhwBna = str4;
        this.OLrzqt = str5;
        this.KWHzl = str6;
    }
}
