package com.okinc.tradingbot.impl.order.strategy.recurring.presenter;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C33129mqd;
import o.C55801xqm;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class RecurringPriceRangePresenter$bindTicker$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArrayList<C55801xqm> $modelList;
    final /* synthetic */ List<SharedFlow<TickersData>> $tickerFlows;
    final /* synthetic */ yHO<Integer, String, String, Unit> $tickerListener;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends kotlinx.coroutines.flow.SharedFlow<com.okinc.unify_trade.biz.subscribe.TickersData>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHO<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringPriceRangePresenter$bindTicker$2(List<? extends SharedFlow<TickersData>> list, ArrayList<C55801xqm> arrayList, yHO<? super Integer, ? super String, ? super String, Unit> yho, Continuation<? super RecurringPriceRangePresenter$bindTicker$2> continuation) {
        super(2, continuation);
        this.$tickerFlows = list;
        this.$modelList = arrayList;
        this.$tickerListener = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringPriceRangePresenter$bindTicker$2(this.$tickerFlows, this.$modelList, this.$tickerListener, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringPriceRangePresenter$bindTicker$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow[] sharedFlowArr = (SharedFlow[]) this.$tickerFlows.toArray(new SharedFlow[0]);
            Flow flowMerge = FlowKt.merge((Flow[]) Arrays.copyOf(sharedFlowArr, sharedFlowArr.length));
            final ArrayList<C55801xqm> arrayList = this.$modelList;
            final yHO<Integer, String, String, Unit> yho = this.$tickerListener;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringPriceRangePresenter$bindTicker$2.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(TickersData tickersData, Continuation<? super Unit> continuation) {
                    Iterator<C55801xqm> it = arrayList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (Intrinsics.EZpvd((Object) tickersData.getInstId(), (Object) it.next().KWHzl())) {
                            break;
                        }
                        i2++;
                    }
                    if (C33129mqd.copydefault(C56443yFo.AEQbTJ(i2), C56443yFo.AEQbTJ(0)) && C33129mqd.gEmmrt(C56443yFo.AEQbTJ(i2), C56443yFo.AEQbTJ(arrayList.size()))) {
                        C55801xqm c55801xqm = arrayList.get(i2);
                        Intrinsics.checkNotNullExpressionValue(c55801xqm, "");
                        C55801xqm c55801xqm2 = c55801xqm;
                        if (!Intrinsics.EZpvd((Object) c55801xqm2.copydefault(), (Object) tickersData.getLast())) {
                            c55801xqm2.KWHzl(tickersData.getLast());
                            yHO<Integer, String, String, Unit> yho2 = yho;
                            if (yho2 != null) {
                                yho2.invoke(C56443yFo.AEQbTJ(i2), arrayList.get(i2).KWHzl(), tickersData.getLast());
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowMerge.collect(flowCollector, this) == objCopydefault) {
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
