package o;

import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_find.viewmodel.PercentChangeRankingViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41086qkF {
    public java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C41086qkF() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41086qkF copy$default(C41086qkF c41086qkF, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c41086qkF.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c41086qkF.djBIcL;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = c41086qkF.copydefault;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = c41086qkF.OLrzqt;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            str5 = c41086qkF.KWHzl;
        }
        java.lang.String str10 = str5;
        if ((i & 32) != 0) {
            str6 = c41086qkF.AEQbTJ;
        }
        return c41086qkF.copydefault(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41086qkF copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new C41086qkF(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41086qkF)) {
            return false;
        }
        C41086qkF c41086qkF = (C41086qkF) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c41086qkF.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c41086qkF.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c41086qkF.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c41086qkF.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c41086qkF.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c41086qkF.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.EZpvd.hashCode() * 31) + this.djBIcL.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketDiscoverCategoryRankingHotInputVo(type=" + this.EZpvd + ", zone=" + this.djBIcL + ", period=" + this.copydefault + ", num=" + this.OLrzqt + ", rank=" + this.KWHzl + ", plateType=" + this.AEQbTJ + ")";
    }

    public C41086qkF(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.EZpvd = str;
        this.djBIcL = str2;
        this.copydefault = str3;
        this.OLrzqt = str4;
        this.KWHzl = str5;
        this.AEQbTJ = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C41086qkF(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? C55633xnd.getStableText$default(null, 1, null) : str;
        if ((i & 2) != 0) {
            PercentChangeRankingViewModel.ActionBar actionBar = PercentChangeRankingViewModel.Companion;
            str2 = C41786qxQ.AEQbTJ(actionBar.copydefault(), actionBar.KWHzl(), actionBar.AEQbTJ());
        }
        this(str, str2, (i & 4) != 0 ? "RANKING_PERIOD_1D" : str3, (i & 8) != 0 ? "350" : str4, (i & 16) != 0 ? "3" : str5, (i & 32) != 0 ? "" : str6);
    }

    public final PeriodEnum copydefault() {
        try {
            return PeriodEnum.valueOf(this.copydefault);
        } catch (java.lang.Exception unused) {
            return PeriodEnum.RANKING_PERIOD_1D;
        }
    }
}
