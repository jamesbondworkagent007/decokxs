package o;

import com.okinc.unify_trade.biz.RecurringBuyDetails;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;

/* JADX INFO: renamed from: o.xrf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC55847xrf {
    java.lang.String getCompleteCycles();

    java.lang.String getDcdArbApy();

    java.lang.String getDcdCycle();

    java.lang.String getOrderArbitrageNum();

    java.lang.String getOrderInstId();

    java.util.ArrayList<java.lang.String> getOrderInstIds();

    java.lang.String getOrderInstType();

    java.lang.String getOrderMaxPx();

    java.lang.String getOrderMinPx();

    java.lang.String getOrderPnlRatio();

    java.lang.String getOrderTotalPnl();

    java.lang.String getOrderType();

    java.lang.String getPortfolioBalInterval();

    java.lang.String getPortfolioBalRatio();

    java.lang.String getPortfolioBalType();

    java.lang.String getRecDay();

    java.lang.String getRecHourly();

    java.util.ArrayList<RecurringListItem> getRecList();

    java.lang.String getRecPeriod();

    java.lang.String getRecTime();

    RecurringBuyDetails getRecurringBuyDetails();

    java.util.ArrayList<SmartPortfolioListItem> getSmartPortfolioList();

    java.lang.String getStgyInvestCcy();

    java.lang.String getSumApyAndStakingApy();

    java.lang.String getTradeQuoteCcyForSpot();

    boolean isHistoryOrder();

    java.lang.String pnlRatioInSourceCcy();

    java.lang.String sourceCcy();

    java.lang.String totalPnlInSourceCcy();
}
