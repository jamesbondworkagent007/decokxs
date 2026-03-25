package com.okinc.tradingbot.impl.botList.ui.backtest;

import com.okinc.tradingbot.impl.botList.ui.backtest.BacktestListViewModel;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C48234uJy;
import o.C48235uJz;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.uLU;

/* JADX INFO: loaded from: classes11.dex */
public final class BacktestListViewModel$loadBacktests$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BacktestListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BacktestListViewModel$loadBacktests$2(BacktestListViewModel backtestListViewModel, Continuation<? super BacktestListViewModel$loadBacktests$2> continuation) {
        super(2, continuation);
        this.this$0 = backtestListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BacktestListViewModel$loadBacktests$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BacktestListViewModel$loadBacktests$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C48234uJy c48234uJy = this.this$0.EZpvd;
            C48234uJy.TaskDescription taskDescription = new C48234uJy.TaskDescription(this.this$0.KWHzl, null);
            this.label = 1;
            obj = c48234uJy.KWHzl(taskDescription, this);
            if (obj == objCopydefault) {
                return objCopydefault;
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
        this.this$0.OLrzqt.setValue(uLU.Companion.AEQbTJ(new BacktestListViewModel.Activity(arrayList, actionBar.AEQbTJ(), actionBar.KWHzl(), false)));
        return Unit.INSTANCE;
    }
}
