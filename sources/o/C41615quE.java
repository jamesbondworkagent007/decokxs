package o;

import com.okinc.market.ranking.core.model.po.RankingFuturesType;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41615quE {
    public final java.lang.String AEQbTJ;
    public final RankingFuturesType EZpvd;
    public final java.lang.Integer KWHzl;
    public final java.lang.Integer OLrzqt;
    public final PeriodEnum copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41615quE copy$default(C41615quE c41615quE, RankingFuturesType rankingFuturesType, PeriodEnum periodEnum, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            rankingFuturesType = c41615quE.EZpvd;
        }
        if ((i & 2) != 0) {
            periodEnum = c41615quE.copydefault;
        }
        PeriodEnum periodEnum2 = periodEnum;
        if ((i & 4) != 0) {
            num = c41615quE.OLrzqt;
        }
        java.lang.Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = c41615quE.KWHzl;
        }
        java.lang.Integer num4 = num2;
        if ((i & 16) != 0) {
            str = c41615quE.AEQbTJ;
        }
        return c41615quE.OLrzqt(rankingFuturesType, periodEnum2, num3, num4, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingFuturesType KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41615quE OLrzqt(@NotNull RankingFuturesType rankingFuturesType, @NotNull PeriodEnum periodEnum, java.lang.Integer num, java.lang.Integer num2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(rankingFuturesType, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41615quE(rankingFuturesType, periodEnum, num, num2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41615quE)) {
            return false;
        }
        C41615quE c41615quE = (C41615quE) obj;
        return this.EZpvd == c41615quE.EZpvd && this.copydefault == c41615quE.copydefault && Intrinsics.EZpvd(this.OLrzqt, c41615quE.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c41615quE.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c41615quE.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingFuturesType gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        java.lang.Integer num = this.OLrzqt;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.KWHzl;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        java.lang.String str = this.AEQbTJ;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverFuturesPayload(futuresType=" + this.EZpvd + ", period=" + this.copydefault + ", rankNum=" + this.OLrzqt + ", bizType=" + this.KWHzl + ", quoteType=" + this.AEQbTJ + ")";
    }

    public C41615quE(@NotNull RankingFuturesType rankingFuturesType, @NotNull PeriodEnum periodEnum, java.lang.Integer num, java.lang.Integer num2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(rankingFuturesType, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.EZpvd = rankingFuturesType;
        this.copydefault = periodEnum;
        this.OLrzqt = num;
        this.KWHzl = num2;
        this.AEQbTJ = str;
    }
}
