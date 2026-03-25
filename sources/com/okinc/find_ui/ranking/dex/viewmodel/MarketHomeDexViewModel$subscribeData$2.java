package com.okinc.find_ui.ranking.dex.viewmodel;

import com.okinc.find_ui.ranking.dex.viewmodel.MarketHomeDexViewModel;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C27563jxZ;
import o.C34964nmQ;
import o.C41460qrI;
import o.C41482qre;
import o.C41495qrr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeDexViewModel$subscribeData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexChainGroupVo $dexChainGroupVo;
    final /* synthetic */ int $pageSize;
    final /* synthetic */ DexPeriodEnum $period;
    final /* synthetic */ Pair<DexSortByEnum, SortOrder> $sorter;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHomeDexViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.Pair<? extends com.okinc.market.quotation.ui.model.dex.DexSortByEnum, ? extends com.okinc.market.quotation.ui.model.SortOrder> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketHomeDexViewModel$subscribeData$2(DexChainGroupVo dexChainGroupVo, DexPeriodEnum dexPeriodEnum, Pair<? extends DexSortByEnum, ? extends SortOrder> pair, int i, MarketHomeDexViewModel marketHomeDexViewModel, Continuation<? super MarketHomeDexViewModel$subscribeData$2> continuation) {
        super(2, continuation);
        this.$dexChainGroupVo = dexChainGroupVo;
        this.$period = dexPeriodEnum;
        this.$sorter = pair;
        this.$pageSize = i;
        this.this$0 = marketHomeDexViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeDexViewModel$subscribeData$2 marketHomeDexViewModel$subscribeData$2 = new MarketHomeDexViewModel$subscribeData$2(this.$dexChainGroupVo, this.$period, this.$sorter, this.$pageSize, this.this$0, continuation);
        marketHomeDexViewModel$subscribeData$2.L$0 = obj;
        return marketHomeDexViewModel$subscribeData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeDexViewModel$subscribeData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Flow flow;
        Object objEZpvd;
        Object objOLrzqt;
        Flow flow2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("MarketHomeDexViewModel", "subscribeData start");
            DexChainGroupVo dexChainGroupVo = this.$dexChainGroupVo;
            DexPeriodEnum dexPeriodEnum = this.$period;
            Pair<DexSortByEnum, SortOrder> pair = this.$sorter;
            int i2 = this.$pageSize;
            MarketHomeDexViewModel marketHomeDexViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            C41495qrr c41495qrr = new C41495qrr(dexChainGroupVo, dexPeriodEnum, pair, C34964nmQ.Companion.copydefault(), C56443yFo.AEQbTJ(i2), false, 32, null);
            if (C27563jxZ.OLrzqt.valueOf()) {
                C41460qrI c41460qrI = marketHomeDexViewModel.OLrzqt;
                this.label = 1;
                objOLrzqt = c41460qrI.OLrzqt(c41495qrr, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                flow2 = (Flow) objOLrzqt;
            } else {
                C41482qre c41482qre = marketHomeDexViewModel.copydefault;
                this.label = 2;
                objEZpvd = c41482qre.EZpvd(c41495qrr, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                flow2 = (Flow) objEZpvd;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
            flow2 = (Flow) objOLrzqt;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                objM7377constructorimpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                flow = (Flow) objM7377constructorimpl;
                if (flow != null) {
                    return null;
                }
                MarketHomeDexViewModel marketHomeDexViewModel2 = this.this$0;
                int i3 = this.$pageSize;
                Flow flowM7441catch = FlowKt.m7441catch(FlowKt.onCompletion(FlowKt.onStart(flow, new MarketHomeDexViewModel$subscribeData$2$3$1(null)), new MarketHomeDexViewModel$subscribeData$2$3$2(marketHomeDexViewModel2, null)), new MarketHomeDexViewModel$subscribeData$2$3$3(null));
                MarketHomeDexViewModel$subscribeData$2$3$4 marketHomeDexViewModel$subscribeData$2$3$4 = new MarketHomeDexViewModel$subscribeData$2$3$4(marketHomeDexViewModel2, i3, null);
                this.L$0 = null;
                this.label = 4;
                if (FlowKt.collectLatest(flowM7441catch, marketHomeDexViewModel$subscribeData$2$3$4, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
            flow2 = (Flow) objEZpvd;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(flow2);
        MarketHomeDexViewModel marketHomeDexViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("MarketHomeDexViewModel", "subscribeData: onFailure", thM7380exceptionOrNullimpl);
            if (thM7380exceptionOrNullimpl instanceof CancellationException) {
                pUU.AEQbTJ("MarketHomeDexViewModel", "subscribeData: onFailure CancellationException", thM7380exceptionOrNullimpl);
            } else {
                MarketHomeDexViewModel$subscribeData$2$2$1 marketHomeDexViewModel$subscribeData$2$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.find_ui.ranking.dex.viewmodel.MarketHomeDexViewModel$subscribeData$2$2$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((MarketHomeDexViewModel.StateListAnimator) obj2).OLrzqt();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((MarketHomeDexViewModel.StateListAnimator) obj2).AEQbTJ((InterfaceC49371unL<? extends List<C34964nmQ>>) obj3);
                    }
                };
                InterfaceC49371unL.Application application3 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                this.L$0 = objM7377constructorimpl;
                this.label = 3;
                if (marketHomeDexViewModel3.KWHzl(marketHomeDexViewModel$subscribeData$2$2$1, application3, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        flow = (Flow) objM7377constructorimpl;
        if (flow != null) {
        }
    }
}
