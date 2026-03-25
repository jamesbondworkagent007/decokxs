package com.okinc.tradingbot.impl.order.strategy.domain.usecase;

import com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitResponse;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C56391yDq;
import o.C56442yFn;
import o.vNI;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbGetProfitInfoUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super vNI.ActionBar>, Object> {
    final /* synthetic */ vNI.TaskDescription $input;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ vNI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbGetProfitInfoUseCase$execute$2(vNI vni, vNI.TaskDescription taskDescription, Continuation<? super SmartArbGetProfitInfoUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = vni;
        this.$input = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SmartArbGetProfitInfoUseCase$execute$2 smartArbGetProfitInfoUseCase$execute$2 = new SmartArbGetProfitInfoUseCase$execute$2(this.this$0, this.$input, continuation);
        smartArbGetProfitInfoUseCase$execute$2.L$0 = obj;
        return smartArbGetProfitInfoUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super vNI.ActionBar> continuation) {
        return ((SmartArbGetProfitInfoUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferred;
        SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponse;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, this.this$0.KWHzl, null, new SmartArbGetProfitInfoUseCase$execute$2$arbitrageProfitsDeferred$1(this.this$0, this.$input, null), 2, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, this.this$0.KWHzl, null, new SmartArbGetProfitInfoUseCase$execute$2$tickerDeferred$1(this.this$0, this.$input, null), 2, null);
            this.L$0 = deferredAsync$default2;
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            obj = objAwait;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                smartArbWithdrawProfitResponse = (SmartArbWithdrawProfitResponse) this.L$0;
                C56391yDq.AEQbTJ(obj);
                return new vNI.ActionBar(smartArbWithdrawProfitResponse, (TickersData) obj);
            }
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponse2 = (SmartArbWithdrawProfitResponse) obj;
        this.L$0 = smartArbWithdrawProfitResponse2;
        this.label = 2;
        Object objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        smartArbWithdrawProfitResponse = smartArbWithdrawProfitResponse2;
        obj = objAwait2;
        return new vNI.ActionBar(smartArbWithdrawProfitResponse, (TickersData) obj);
    }
}
