package com.okinc.tradingbot.impl.botList.ui.backtest;

import com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListViewModel;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C48234uJy;
import o.C48235uJz;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.uLU;

/* JADX INFO: loaded from: classes11.dex */
public final class BacktestListViewModel$loadMoreBacktests$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BacktestListViewModel.Activity $currentData;
    int label;
    final /* synthetic */ BacktestListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BacktestListViewModel$loadMoreBacktests$3(BacktestListViewModel backtestListViewModel, BacktestListViewModel.Activity activity, Continuation<? super BacktestListViewModel$loadMoreBacktests$3> continuation) {
        super(2, continuation);
        this.this$0 = backtestListViewModel;
        this.$currentData = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BacktestListViewModel$loadMoreBacktests$3(this.this$0, this.$currentData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BacktestListViewModel$loadMoreBacktests$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C48234uJy c48234uJy = this.this$0.EZpvd;
            C48234uJy.TaskDescription taskDescription = new C48234uJy.TaskDescription(this.this$0.KWHzl, this.$currentData.AEQbTJ());
            this.label = 1;
            obj = c48234uJy.KWHzl(taskDescription, this);
            if (obj == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C48234uJy.ActionBar actionBar = (C48234uJy.ActionBar) obj;
        List<BizTradeStrategyInfo> listEZpvd = actionBar.EZpvd();
        BacktestListViewModel backtestListViewModel = this.this$0;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (BizTradeStrategyInfo bizTradeStrategyInfo : listEZpvd) {
            backtestListViewModel.AhwBna.put(bizTradeStrategyInfo.getOrderAlgoId(), bizTradeStrategyInfo);
            arrayList.add(C48235uJz.EZpvd.copydefault(bizTradeStrategyInfo, false));
        }
        MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
        do {
            value = mutableStateFlow.getValue();
            objCopydefault = (uLU) value;
            if (objCopydefault instanceof uLU.ActionBar) {
                uLU.ActionBar actionBar2 = (uLU.ActionBar) objCopydefault;
                objCopydefault = actionBar2.copydefault(((BacktestListViewModel.Activity) actionBar2.KWHzl()).OLrzqt(CollectionsKt___CollectionsKt.djBIcL((Collection) ((BacktestListViewModel.Activity) actionBar2.KWHzl()).OLrzqt(), (Iterable) arrayList), actionBar.AEQbTJ(), actionBar.KWHzl(), false));
            }
        } while (!mutableStateFlow.compareAndSet(value, objCopydefault));
        return Unit.INSTANCE;
    }
}
