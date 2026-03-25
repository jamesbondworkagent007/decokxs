package o;

import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTradeRealTimeBean;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory.FilterTimeDuration;
import com.okinc.dexkline.market.features.overview.domain.TransactionInfo;
import com.okinc.dexkline.market.features.overview.domain.TransactionStatistic;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mRw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32164mRw {

    /* JADX INFO: renamed from: o.mRw$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
        }
    }

    public static final TransactionInfo OLrzqt(@NotNull MarketTradeRealTimeBean marketTradeRealTimeBean, @NotNull FilterTimeDuration filterTimeDuration) {
        Intrinsics.checkNotNullParameter(marketTradeRealTimeBean, "");
        Intrinsics.checkNotNullParameter(filterTimeDuration, "");
        java.lang.String strEZpvd = marketTradeRealTimeBean.EZpvd();
        java.lang.String strCopydefault = marketTradeRealTimeBean.copydefault();
        return new TransactionInfo(marketTradeRealTimeBean.AEQbTJ(), marketTradeRealTimeBean.KWHzl(), strCopydefault, strEZpvd, copydefault(marketTradeRealTimeBean, filterTimeDuration));
    }

    public static final TransactionStatistic copydefault(@NotNull MarketTradeRealTimeBean marketTradeRealTimeBean, @NotNull FilterTimeDuration filterTimeDuration) {
        Intrinsics.checkNotNullParameter(marketTradeRealTimeBean, "");
        Intrinsics.checkNotNullParameter(filterTimeDuration, "");
        int i = ActionBar.KWHzl[filterTimeDuration.ordinal()];
        if (i == 1) {
            return new TransactionStatistic(marketTradeRealTimeBean.AuCTel(), marketTradeRealTimeBean.OLrzqt(), marketTradeRealTimeBean.AYXKKw(), marketTradeRealTimeBean.uzCIH(), marketTradeRealTimeBean.AkhnZx(), marketTradeRealTimeBean.getFieldNames());
        }
        if (i == 2) {
            return new TransactionStatistic(marketTradeRealTimeBean.fJNWhG(), marketTradeRealTimeBean.OLrzqt(), marketTradeRealTimeBean.djBIcL(), marketTradeRealTimeBean.iwGUEr(), marketTradeRealTimeBean.DbNXlk(), marketTradeRealTimeBean.AuCTelauCTel());
        }
        if (i == 3) {
            return new TransactionStatistic(marketTradeRealTimeBean.ejfBZ(), marketTradeRealTimeBean.OLrzqt(), marketTradeRealTimeBean.gEmmrt(), marketTradeRealTimeBean.fIwbmz(), marketTradeRealTimeBean.fetchVPNInfo(), marketTradeRealTimeBean.getNewProxyInstance());
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new TransactionStatistic(marketTradeRealTimeBean.fARcdN(), marketTradeRealTimeBean.OLrzqt(), marketTradeRealTimeBean.isConnected(), marketTradeRealTimeBean.hDKMBd(), marketTradeRealTimeBean.values(), marketTradeRealTimeBean.wlaJM());
    }
}
