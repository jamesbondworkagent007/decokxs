package o;

import com.okinc.business.market.features.analysis.futures.sub.ranking.data.model.RankingItemPo;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType;
import com.okinc.market.ext.UpDownColor;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jLx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25937jLx {
    public final java.lang.String AEQbTJ;
    public final int AYXKKw;
    public final RankingItemPo AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final UpDownColor OLrzqt;
    public final FuturesAnalysisRankingPeriod copydefault;
    public final BigDecimal gEmmrt;
    public final FuturesAnalysisRankingPnlType valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpDownColor OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25937jLx OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull BigDecimal bigDecimal, @NotNull UpDownColor upDownColor, int i, @NotNull FuturesAnalysisRankingPnlType futuresAnalysisRankingPnlType, @NotNull FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod, @NotNull RankingItemPo rankingItemPo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(futuresAnalysisRankingPnlType, "");
        Intrinsics.checkNotNullParameter(futuresAnalysisRankingPeriod, "");
        Intrinsics.checkNotNullParameter(rankingItemPo, "");
        return new C25937jLx(str, str2, str3, bigDecimal, upDownColor, i, futuresAnalysisRankingPnlType, futuresAnalysisRankingPeriod, rankingItemPo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25937jLx)) {
            return false;
        }
        C25937jLx c25937jLx = (C25937jLx) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c25937jLx.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c25937jLx.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c25937jLx.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, c25937jLx.gEmmrt) && this.OLrzqt == c25937jLx.OLrzqt && this.AYXKKw == c25937jLx.AYXKKw && this.valueOf == c25937jLx.valueOf && this.copydefault == c25937jLx.copydefault && Intrinsics.EZpvd(this.AhwBna, c25937jLx.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Integer.hashCode(this.AYXKKw)) * 31) + this.valueOf.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AhwBna.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RankingListItemVo(iconUrl=" + this.EZpvd + ", name=" + this.KWHzl + ", formattedPnlValue=" + this.AEQbTJ + ", rawPnlValue=" + this.gEmmrt + ", color=" + this.OLrzqt + ", progress=" + this.AYXKKw + ", pnlType=" + this.valueOf + ", period=" + this.copydefault + ", po=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal valueOf() {
        return this.gEmmrt;
    }

    public C25937jLx(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull BigDecimal bigDecimal, @NotNull UpDownColor upDownColor, int i, @NotNull FuturesAnalysisRankingPnlType futuresAnalysisRankingPnlType, @NotNull FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod, @NotNull RankingItemPo rankingItemPo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(futuresAnalysisRankingPnlType, "");
        Intrinsics.checkNotNullParameter(futuresAnalysisRankingPeriod, "");
        Intrinsics.checkNotNullParameter(rankingItemPo, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.AEQbTJ = str3;
        this.gEmmrt = bigDecimal;
        this.OLrzqt = upDownColor;
        this.AYXKKw = i;
        this.valueOf = futuresAnalysisRankingPnlType;
        this.copydefault = futuresAnalysisRankingPeriod;
        this.AhwBna = rankingItemPo;
    }
}
