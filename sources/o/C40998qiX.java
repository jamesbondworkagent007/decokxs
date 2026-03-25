package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qiX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40998qiX {
    public TradingCalendarType KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40998qiX copy$default(C40998qiX c40998qiX, TradingCalendarType tradingCalendarType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tradingCalendarType = c40998qiX.KWHzl;
        }
        return c40998qiX.AEQbTJ(tradingCalendarType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingCalendarType AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40998qiX AEQbTJ(@NotNull TradingCalendarType tradingCalendarType) {
        Intrinsics.checkNotNullParameter(tradingCalendarType, "");
        return new C40998qiX(tradingCalendarType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40998qiX) && this.KWHzl == ((C40998qiX) obj).KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradingCalendarTypeListVo(tradingCalendarType=" + this.KWHzl + ")";
    }

    public C40998qiX(@NotNull TradingCalendarType tradingCalendarType) {
        Intrinsics.checkNotNullParameter(tradingCalendarType, "");
        this.KWHzl = tradingCalendarType;
    }
}
