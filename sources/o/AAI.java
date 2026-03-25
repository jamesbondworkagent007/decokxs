package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class AAI {
    public static final int $stable = 8;
    public java.util.List<AAJ> AEQbTJ;
    public java.util.List<AAJ> AYXKKw;
    public java.util.List<AAK> AhwBna;
    public java.util.List<AAM> EZpvd;
    public java.util.List<AAJ> KWHzl;
    public java.util.List<AAJ> OLrzqt;
    public java.util.List<AAM> copydefault;
    public java.util.List<AAJ> djBIcL;
    public java.util.List<AAK> gEmmrt;
    public java.util.List<AAK> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AAM> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AAK> AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AAJ> AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AAJ> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AAJ> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AAM> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AAJ> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAI copydefault(@NotNull java.util.List<AAM> list, @NotNull java.util.List<AAM> list2, @NotNull java.util.List<AAK> list3, @NotNull java.util.List<AAK> list4, @NotNull java.util.List<AAK> list5, @NotNull java.util.List<AAJ> list6, @NotNull java.util.List<AAJ> list7, @NotNull java.util.List<AAJ> list8, @NotNull java.util.List<AAJ> list9, @NotNull java.util.List<AAJ> list10) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(list10, "");
        return new AAI(list, list2, list3, list4, list5, list6, list7, list8, list9, list10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AAJ> djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AAI)) {
            return false;
        }
        AAI aai = (AAI) obj;
        return Intrinsics.EZpvd(this.copydefault, aai.copydefault) && Intrinsics.EZpvd(this.EZpvd, aai.EZpvd) && Intrinsics.EZpvd(this.gEmmrt, aai.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, aai.AhwBna) && Intrinsics.EZpvd(this.valueOf, aai.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, aai.AEQbTJ) && Intrinsics.EZpvd(this.AYXKKw, aai.AYXKKw) && Intrinsics.EZpvd(this.OLrzqt, aai.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, aai.djBIcL) && Intrinsics.EZpvd(this.KWHzl, aai.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AAK> gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DexHolderAnalysisData(holderChangeList1day=" + this.copydefault + ", holderChangeList7day=" + this.EZpvd + ", top10HolderList=" + this.gEmmrt + ", top50HolderList=" + this.AhwBna + ", top100HolderList=" + this.valueOf + ", devHolderList=" + this.AEQbTJ + ", suspiciousHolderList=" + this.AYXKKw + ", suspectedRatTradingHolderList=" + this.OLrzqt + ", top100AvgHoldingList=" + this.djBIcL + ", greaterThan10uHoldingList=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AAK> valueOf() {
        return this.gEmmrt;
    }

    public AAI(@NotNull java.util.List<AAM> list, @NotNull java.util.List<AAM> list2, @NotNull java.util.List<AAK> list3, @NotNull java.util.List<AAK> list4, @NotNull java.util.List<AAK> list5, @NotNull java.util.List<AAJ> list6, @NotNull java.util.List<AAJ> list7, @NotNull java.util.List<AAJ> list8, @NotNull java.util.List<AAJ> list9, @NotNull java.util.List<AAJ> list10) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(list7, "");
        Intrinsics.checkNotNullParameter(list8, "");
        Intrinsics.checkNotNullParameter(list9, "");
        Intrinsics.checkNotNullParameter(list10, "");
        this.copydefault = list;
        this.EZpvd = list2;
        this.gEmmrt = list3;
        this.AhwBna = list4;
        this.valueOf = list5;
        this.AEQbTJ = list6;
        this.AYXKKw = list7;
        this.OLrzqt = list8;
        this.djBIcL = list9;
        this.KWHzl = list10;
    }
}
