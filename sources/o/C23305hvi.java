package o;

import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTradeRealTimeBean;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory.FilterTimeDuration;
import com.okinc.business.market.features.overview.domain.TransactionInfo;
import com.okinc.business.market.features.overview.domain.TransactionStatistic;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23305hvi {

    /* JADX INFO: renamed from: o.hvi$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FilterTimeDuration.values().length];
            try {
                iArr[FilterTimeDuration.ONE_HOUR_SELECTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FilterTimeDuration.FOUR_HOUR_SELECTION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterTimeDuration.TWENTY_FOUR_HOURS_SELECTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[FilterTimeDuration.FIVE_MIN_CHANGE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    public static final TransactionInfo copydefault(@NotNull MarketTradeRealTimeBean marketTradeRealTimeBean, @NotNull FilterTimeDuration filterTimeDuration) {
        Intrinsics.checkNotNullParameter(marketTradeRealTimeBean, "");
        Intrinsics.checkNotNullParameter(filterTimeDuration, "");
        java.lang.String strOLrzqt = marketTradeRealTimeBean.OLrzqt();
        java.lang.String strKWHzl = marketTradeRealTimeBean.KWHzl();
        return new TransactionInfo(marketTradeRealTimeBean.AEQbTJ(), marketTradeRealTimeBean.EZpvd(), strKWHzl, strOLrzqt, KWHzl(marketTradeRealTimeBean, filterTimeDuration));
    }

    public static final TransactionStatistic KWHzl(@NotNull MarketTradeRealTimeBean marketTradeRealTimeBean, @NotNull FilterTimeDuration filterTimeDuration) {
        Intrinsics.checkNotNullParameter(marketTradeRealTimeBean, "");
        Intrinsics.checkNotNullParameter(filterTimeDuration, "");
        int i = Application.AEQbTJ[filterTimeDuration.ordinal()];
        if (i == 1) {
            return new TransactionStatistic(marketTradeRealTimeBean.fJNWhG(), marketTradeRealTimeBean.copydefault(), marketTradeRealTimeBean.djBIcL(), marketTradeRealTimeBean.iwGUEr(), marketTradeRealTimeBean.AkhnZx(), marketTradeRealTimeBean.getFieldNames());
        }
        if (i == 2) {
            return new TransactionStatistic(marketTradeRealTimeBean.fIwbmz(), marketTradeRealTimeBean.copydefault(), marketTradeRealTimeBean.gEmmrt(), marketTradeRealTimeBean.uzCIH(), marketTradeRealTimeBean.DbNXlk(), marketTradeRealTimeBean.wlaJM());
        }
        if (i == 3) {
            return new TransactionStatistic(marketTradeRealTimeBean.AuCTel(), marketTradeRealTimeBean.copydefault(), marketTradeRealTimeBean.AhwBna(), marketTradeRealTimeBean.ejfBZ(), marketTradeRealTimeBean.isConnected(), marketTradeRealTimeBean.getNewProxyInstance());
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new TransactionStatistic(marketTradeRealTimeBean.fARcdN(), marketTradeRealTimeBean.copydefault(), marketTradeRealTimeBean.values(), marketTradeRealTimeBean.hDKMBd(), marketTradeRealTimeBean.fetchVPNInfo(), marketTradeRealTimeBean.zLjUOn());
    }
}
