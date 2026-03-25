package com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel;

import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56391yDq;
import o.C56442yFn;
import o.uLP;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotDcaAddOrderPresenter$uiModelFlow$1 extends SuspendLambda implements yHO<SpotDcaAddOrderPresenter.Fragment, TickersData, Continuation<? super SpotDcaAddOrderPresenter.Fragment>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ SpotDcaAddOrderPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDcaAddOrderPresenter$uiModelFlow$1(SpotDcaAddOrderPresenter spotDcaAddOrderPresenter, Continuation<? super SpotDcaAddOrderPresenter$uiModelFlow$1> continuation) {
        super(3, continuation);
        this.this$0 = spotDcaAddOrderPresenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(SpotDcaAddOrderPresenter.Fragment fragment, TickersData tickersData, Continuation<? super SpotDcaAddOrderPresenter.Fragment> continuation) {
        SpotDcaAddOrderPresenter$uiModelFlow$1 spotDcaAddOrderPresenter$uiModelFlow$1 = new SpotDcaAddOrderPresenter$uiModelFlow$1(this.this$0, continuation);
        spotDcaAddOrderPresenter$uiModelFlow$1.L$0 = fragment;
        spotDcaAddOrderPresenter$uiModelFlow$1.L$1 = tickersData;
        return spotDcaAddOrderPresenter$uiModelFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            SpotDcaAddOrderPresenter.Fragment fragment = (SpotDcaAddOrderPresenter.Fragment) this.L$0;
            TickersData tickersData = (TickersData) this.L$1;
            SpotDcaAddOrderPresenter spotDcaAddOrderPresenter = this.this$0;
            boolean zIsConnected = fragment.isConnected();
            String strAhwBna = fragment.AhwBna();
            if (strAhwBna == null) {
                strAhwBna = "";
            }
            TickersData tickersData2 = tickersData == null ? new TickersData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null) : tickersData;
            StrategyConfigInfo strategyConfigInfo = (StrategyConfigInfo) this.this$0.copydefault.getValue();
            if (strategyConfigInfo == null) {
                strategyConfigInfo = new StrategyConfigInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (String) null, (String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (String) null, (String) null, (String) null, (BotRangeConfig) null, (String) null, (String) null, (LmtOrderNumber) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (SmartEarnConfig) null, (String) null, (List) null, (List) null, (String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
            }
            String strOLrzqt = spotDcaAddOrderPresenter.OLrzqt(zIsConnected, strAhwBna, tickersData2, strategyConfigInfo);
            SpotDcaAddOrderPresenter spotDcaAddOrderPresenter2 = this.this$0;
            String last = tickersData != null ? tickersData.getLast() : null;
            String strAEQbTJ = spotDcaAddOrderPresenter2.AEQbTJ(last != null ? last : "");
            SpotDcaAddOrderPresenter.ActionBar.InterfaceC0653ActionBar interfaceC0653ActionBarOLrzqt = this.this$0.OLrzqt(fragment.AhwBna());
            if (interfaceC0653ActionBarOLrzqt == null) {
                interfaceC0653ActionBarOLrzqt = fragment.gEmmrt();
            }
            SpotDcaAddOrderPresenter.ActionBar.InterfaceC0653ActionBar interfaceC0653ActionBar = interfaceC0653ActionBarOLrzqt;
            SpotDcaAddOrderPresenter.ActionBar.Activity activityOLrzqt = this.this$0.OLrzqt(fragment.AYXKKw(), strOLrzqt, uLP.KWHzl(fragment.values()));
            if (activityOLrzqt == null) {
                activityOLrzqt = fragment.valueOf();
            }
            return SpotDcaAddOrderPresenter.Fragment.m7101copypoI0buE$default(fragment, null, null, 0, strAEQbTJ, false, null, null, null, strOLrzqt, null, null, interfaceC0653ActionBar, activityOLrzqt, null, null, 26359, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
