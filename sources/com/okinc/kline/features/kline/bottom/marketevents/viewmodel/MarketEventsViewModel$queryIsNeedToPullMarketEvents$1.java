package com.okinc.kline.features.kline.bottom.marketevents.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventPushPo;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import o.BhB;
import o.C37962pHd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC4535Bhr;
import o.pDX;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketEventsViewModel$queryIsNeedToPullMarketEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketEventsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketEventsViewModel$queryIsNeedToPullMarketEvents$1(MarketEventsViewModel marketEventsViewModel, Continuation<? super MarketEventsViewModel$queryIsNeedToPullMarketEvents$1> continuation) {
        super(2, continuation);
        this.this$0 = marketEventsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketEventsViewModel$queryIsNeedToPullMarketEvents$1 marketEventsViewModel$queryIsNeedToPullMarketEvents$1 = new MarketEventsViewModel$queryIsNeedToPullMarketEvents$1(this.this$0, continuation);
        marketEventsViewModel$queryIsNeedToPullMarketEvents$1.L$0 = obj;
        return marketEventsViewModel$queryIsNeedToPullMarketEvents$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketEventsViewModel$queryIsNeedToPullMarketEvents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String instrumentId;
        Object objM7377constructorimpl;
        String instrumentId2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = "";
            if (!pDX.AEQbTJ.AYXKKw()) {
                C37962pHd c37962pHd = this.this$0.valueOf;
                MarketCoinInfo marketCoinInfoOLrzqt = this.this$0.OLrzqt();
                if (marketCoinInfoOLrzqt != null && (instrumentId = marketCoinInfoOLrzqt.getInstrumentId()) != null) {
                    str = instrumentId;
                }
                SharedFlow<List<MarketEventPushPo.EventItem>> sharedFlowAhwBna = c37962pHd.AhwBna(str);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlowAhwBna, anonymousClass3, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                MarketEventsViewModel marketEventsViewModel = this.this$0;
                try {
                    Result.Application application = Result.Companion;
                    BhB bhBValueOf = marketEventsViewModel.valueOf();
                    MarketCoinInfo marketCoinInfoOLrzqt2 = marketEventsViewModel.OLrzqt();
                    if (marketCoinInfoOLrzqt2 != null && (instrumentId2 = marketCoinInfoOLrzqt2.getInstrumentId()) != null) {
                        str = instrumentId2;
                    }
                    if (!bhBValueOf.EZpvd(str, new Activity(marketEventsViewModel))) {
                        pUU.copydefault("MarketEventsViewModel", "Failed to subscribe WebSocket push from rust");
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("MarketEventsViewModel", "WebSocket subscription error from rust", thM7380exceptionOrNullimpl);
                }
                Result.m7376boximpl(objM7377constructorimpl);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    public static final class Activity implements InterfaceC4535Bhr {
        public final /* synthetic */ MarketEventsViewModel AEQbTJ;

        public Activity(MarketEventsViewModel marketEventsViewModel) {
            this.AEQbTJ = marketEventsViewModel;
        }

        @Override // o.InterfaceC4535Bhr
        public void onEventPush(boolean z) {
            if (z) {
                pUU.KWHzl("MarketEventsViewModel", "New market events available from rust");
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this.AEQbTJ), null, null, new MarketEventsViewModel$queryIsNeedToPullMarketEvents$1$1$success$1$onEventPush$1(this.AEQbTJ, z, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventsViewModel$queryIsNeedToPullMarketEvents$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<List<? extends MarketEventPushPo.EventItem>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MarketEventsViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MarketEventsViewModel marketEventsViewModel, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = marketEventsViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends MarketEventPushPo.EventItem> list, Continuation<? super Unit> continuation) {
            return invoke2((List<MarketEventPushPo.EventItem>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<MarketEventPushPo.EventItem> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                List list = (List) this.L$0;
                MutableSharedFlow mutableSharedFlow = this.this$0.KWHzl;
                Boolean boolKWHzl = C56443yFo.KWHzl(!list.isEmpty());
                this.label = 1;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
