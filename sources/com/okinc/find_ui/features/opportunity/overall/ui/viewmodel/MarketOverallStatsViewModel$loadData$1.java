package com.okinc.find_ui.features.opportunity.overall.ui.viewmodel;

import com.okinc.find_ui.features.opportunity.overall.data.datasource.IMarketOverallDataSource;
import com.okinc.find_ui.features.opportunity.overall.ui.viewmodel.MarketOverallStatsViewModel;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarType;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C34896nlB;
import o.C34946nlz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class MarketOverallStatsViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketOverallStatsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketOverallStatsViewModel$loadData$1(MarketOverallStatsViewModel marketOverallStatsViewModel, Continuation<? super MarketOverallStatsViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = marketOverallStatsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketOverallStatsViewModel$loadData$1 marketOverallStatsViewModel$loadData$1 = new MarketOverallStatsViewModel$loadData$1(this.this$0, continuation);
        marketOverallStatsViewModel$loadData$1.L$0 = obj;
        return marketOverallStatsViewModel$loadData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketOverallStatsViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            pUU.KWHzl("MarketOverallTrendViewModel", "loadData start");
            MarketOverallStatsViewModel marketOverallStatsViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.find_ui.features.opportunity.overall.ui.viewmodel.MarketOverallStatsViewModel$loadData$1.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj3) {
                    return ((MarketOverallStatsViewModel.StateListAnimator) obj3).KWHzl();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj3, Object obj4) {
                    ((MarketOverallStatsViewModel.StateListAnimator) obj3).OLrzqt((InterfaceC49371unL<C34896nlB>) obj4);
                }
            };
            InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (marketOverallStatsViewModel.KWHzl(anonymousClass1, actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl((C34896nlB) obj);
                    obj2 = objM7377constructorimpl;
                    MarketOverallStatsViewModel marketOverallStatsViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("MarketOverallTrendViewModel", "loadData failed", thM7380exceptionOrNullimpl);
                        MarketOverallStatsViewModel$loadData$1$3$1 marketOverallStatsViewModel$loadData$1$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.find_ui.features.opportunity.overall.ui.viewmodel.MarketOverallStatsViewModel$loadData$1$3$1
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj3) {
                                return ((MarketOverallStatsViewModel.StateListAnimator) obj3).KWHzl();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj3, Object obj4) {
                                ((MarketOverallStatsViewModel.StateListAnimator) obj3).OLrzqt((InterfaceC49371unL<C34896nlB>) obj4);
                            }
                        };
                        InterfaceC49371unL.Application application2 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                        this.L$0 = obj2;
                        this.label = 3;
                        if (marketOverallStatsViewModel2.KWHzl(marketOverallStatsViewModel$loadData$1$3$1, application2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    MarketOverallStatsViewModel marketOverallStatsViewModel3 = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                MarketOverallStatsViewModel marketOverallStatsViewModel32 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    C34896nlB c34896nlB = (C34896nlB) obj2;
                    pUU.KWHzl("MarketOverallTrendViewModel", "loadData success, data: " + c34896nlB);
                    MarketOverallStatsViewModel$loadData$1$4$1 marketOverallStatsViewModel$loadData$1$4$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.find_ui.features.opportunity.overall.ui.viewmodel.MarketOverallStatsViewModel$loadData$1$4$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj3) {
                            return ((MarketOverallStatsViewModel.StateListAnimator) obj3).KWHzl();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj3, Object obj4) {
                            ((MarketOverallStatsViewModel.StateListAnimator) obj3).OLrzqt((InterfaceC49371unL<C34896nlB>) obj4);
                        }
                    };
                    InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(c34896nlB);
                    this.L$0 = obj2;
                    this.label = 4;
                    if (marketOverallStatsViewModel32.KWHzl(marketOverallStatsViewModel$loadData$1$4$1, activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        MarketOverallStatsViewModel marketOverallStatsViewModel4 = this.this$0;
        Result.Application application3 = Result.Companion;
        C34946nlz c34946nlz = marketOverallStatsViewModel4.AEQbTJ;
        Triple triple = new Triple(TradingCalendarType.ECONOMIC.getRequestValue(), C56443yFo.AEQbTJ(1), IMarketOverallDataSource.PayloadPeriod.ONE_DAY);
        this.L$0 = null;
        this.label = 2;
        obj = c34946nlz.EZpvd(triple, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((C34896nlB) obj);
        obj2 = objM7377constructorimpl;
        MarketOverallStatsViewModel marketOverallStatsViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        MarketOverallStatsViewModel marketOverallStatsViewModel322 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        return Unit.INSTANCE;
    }
}
