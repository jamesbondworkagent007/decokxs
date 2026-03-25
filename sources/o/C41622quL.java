package o;

import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_find.viewmodel.PercentChangeRankingViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41622quL {
    public java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C41622quL() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41622quL copy$default(C41622quL c41622quL, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c41622quL.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c41622quL.OLrzqt;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = c41622quL.AYXKKw;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = c41622quL.EZpvd;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            str5 = c41622quL.KWHzl;
        }
        java.lang.String str10 = str5;
        if ((i & 32) != 0) {
            str6 = c41622quL.AEQbTJ;
        }
        return c41622quL.KWHzl(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41622quL KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new C41622quL(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41622quL)) {
            return false;
        }
        C41622quL c41622quL = (C41622quL) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c41622quL.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c41622quL.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c41622quL.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c41622quL.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c41622quL.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c41622quL.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RankingHotInputVo(dataType=" + this.copydefault + ", type=" + this.OLrzqt + ", zone=" + this.AYXKKw + ", period=" + this.EZpvd + ", num=" + this.KWHzl + ", rank=" + this.AEQbTJ + ")";
    }

    public C41622quL(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.copydefault = str;
        this.OLrzqt = str2;
        this.AYXKKw = str3;
        this.EZpvd = str4;
        this.KWHzl = str5;
        this.AEQbTJ = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C41622quL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "hot" : str;
        java.lang.String stableText$default = (i & 2) != 0 ? C55633xnd.getStableText$default(null, 1, null) : str2;
        if ((i & 4) != 0) {
            PercentChangeRankingViewModel.ActionBar actionBar = PercentChangeRankingViewModel.Companion;
            str3 = C41786qxQ.AEQbTJ(actionBar.copydefault(), actionBar.KWHzl(), actionBar.AEQbTJ());
        }
        this(str, stableText$default, str3, (i & 8) != 0 ? "RANKING_PERIOD_1D" : str4, (i & 16) != 0 ? "350" : str5, (i & 32) != 0 ? "1" : str6);
    }

    public final PeriodEnum KWHzl() {
        try {
            return PeriodEnum.valueOf(this.EZpvd);
        } catch (java.lang.Exception unused) {
            return PeriodEnum.RANKING_PERIOD_1D;
        }
    }
}
