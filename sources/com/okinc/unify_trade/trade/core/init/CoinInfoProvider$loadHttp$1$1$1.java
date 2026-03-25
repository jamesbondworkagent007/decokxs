package com.okinc.unify_trade.trade.core.init;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.xNQ;
import o.xNW;

/* JADX INFO: loaded from: classes12.dex */
public final class CoinInfoProvider$loadHttp$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResponseData<ArrayList<TradeCoinInfo>> $resp;
    int label;
    final /* synthetic */ xNQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinInfoProvider$loadHttp$1$1$1(xNQ xnq, ResponseData<ArrayList<TradeCoinInfo>> responseData, Continuation<? super CoinInfoProvider$loadHttp$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = xnq;
        this.$resp = responseData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinInfoProvider$loadHttp$1$1$1(this.this$0, this.$resp, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinInfoProvider$loadHttp$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl(this.this$0.fJNWhG(), "task " + this.this$0.EZpvd() + " loadHttp start map data");
            xNQ.TaskDescription taskDescription = new xNQ.TaskDescription();
            ArrayList<TradeCoinInfo> data = this.$resp.getData();
            if (data == null) {
                data = new ArrayList<>();
            }
            xNQ.Activity activityOLrzqt = taskDescription.OLrzqt(data);
            pUU.KWHzl(this.this$0.fJNWhG(), "task " + this.this$0.EZpvd() + " loadHttp end map data");
            MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
            xNQ xnq = this.this$0;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ((xNQ.Application) value).AEQbTJ(xnq.KWHzl((List<TradeCoinInfo>) activityOLrzqt.AEQbTJ()), activityOLrzqt.OLrzqt(), activityOLrzqt.AEQbTJ())));
            xNW.notifyResult$default(this.this$0, true, null, 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
