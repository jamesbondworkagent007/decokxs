package o;

import com.okinc.market.ext.UpDownColor;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qxR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41787qxR {
    public static final int copydefault = TickersData.$stable;
    public final java.lang.String AEQbTJ;
    public final TickersData AYXKKw;
    public final double AhwBna;
    public final UpDownColor EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41787qxR copy$default(C41787qxR c41787qxR, TickersData tickersData, UpDownColor upDownColor, java.lang.String str, java.lang.String str2, double d, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tickersData = c41787qxR.AYXKKw;
        }
        if ((i & 2) != 0) {
            upDownColor = c41787qxR.EZpvd;
        }
        UpDownColor upDownColor2 = upDownColor;
        if ((i & 4) != 0) {
            str = c41787qxR.OLrzqt;
        }
        java.lang.String str4 = str;
        if ((i & 8) != 0) {
            str2 = c41787qxR.KWHzl;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            d = c41787qxR.AhwBna;
        }
        double d2 = d;
        if ((i & 32) != 0) {
            str3 = c41787qxR.AEQbTJ;
        }
        return c41787qxR.KWHzl(tickersData, upDownColor2, str4, str5, d2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpDownColor AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TickersData AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41787qxR KWHzl(@NotNull TickersData tickersData, @NotNull UpDownColor upDownColor, @NotNull java.lang.String str, @NotNull java.lang.String str2, double d, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C41787qxR(tickersData, upDownColor, str, str2, d, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return this.AhwBna;
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
        if (!(obj instanceof C41787qxR)) {
            return false;
        }
        C41787qxR c41787qxR = (C41787qxR) obj;
        return Intrinsics.EZpvd(this.AYXKKw, c41787qxR.AYXKKw) && this.EZpvd == c41787qxR.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c41787qxR.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c41787qxR.KWHzl) && java.lang.Double.compare(this.AhwBna, c41787qxR.AhwBna) == 0 && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c41787qxR.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.AYXKKw.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Double.hashCode(this.AhwBna)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InstrumentTickerVo(rawTickerPo=" + this.AYXKKw + ", ratioColor=" + this.EZpvd + ", ratioDisplay=" + this.OLrzqt + ", priceDisplay=" + this.KWHzl + ", ratioValue=" + this.AhwBna + ", priceValue=" + this.AEQbTJ + ")";
    }

    public C41787qxR(@NotNull TickersData tickersData, @NotNull UpDownColor upDownColor, @NotNull java.lang.String str, @NotNull java.lang.String str2, double d, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AYXKKw = tickersData;
        this.EZpvd = upDownColor;
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.AhwBna = d;
        this.AEQbTJ = str3;
    }
}
