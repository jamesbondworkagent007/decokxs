package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ABG {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.util.List<ABL> KWHzl;
    public java.lang.String OLrzqt;
    public java.util.List<ABL> copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.ABG */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ABG copy$default(ABG abg, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = abg.gEmmrt;
        }
        if ((i & 2) != 0) {
            str2 = abg.AEQbTJ;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = abg.EZpvd;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = abg.OLrzqt;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            list = abg.copydefault;
        }
        java.util.List list3 = list;
        if ((i & 32) != 0) {
            list2 = abg.KWHzl;
        }
        return abg.EZpvd(str, str5, str6, str7, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ABL> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ABG EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<ABL> list, @NotNull java.util.List<ABL> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new ABG(str, str2, str3, str4, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ABL> KWHzl() {
        return this.KWHzl;
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
        if (!(obj instanceof ABG)) {
            return false;
        }
        ABG abg = (ABG) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) abg.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) abg.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) abg.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) abg.OLrzqt) && Intrinsics.EZpvd(this.copydefault, abg.copydefault) && Intrinsics.EZpvd(this.KWHzl, abg.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.gEmmrt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FeeConfig(min=" + this.gEmmrt + ", max=" + this.AEQbTJ + ", limitOrderMin=" + this.EZpvd + ", limitOrderMax=" + this.OLrzqt + ", feeOptions=" + this.copydefault + ", limitOrderFeeOptions=" + this.KWHzl + ")";
    }

    public ABG(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<ABL> list, @NotNull java.util.List<ABL> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.gEmmrt = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.OLrzqt = str4;
        this.copydefault = list;
        this.KWHzl = list2;
    }
}
