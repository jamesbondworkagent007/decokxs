package com.okinc.unify_trade.trade.position;

import com.okinc.unify_trade.biz.subscribe.OpenInterestData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC58184ywW;
import o.xOE;

/* JADX INFO: loaded from: classes17.dex */
public final class TradePositionManagerV2$checkInfoInstrument$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC58184ywW<OpenInterestData> $emitter;
    final /* synthetic */ OpenInterestData $resp;
    int label;
    final /* synthetic */ xOE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradePositionManagerV2$checkInfoInstrument$1$job$1(xOE xoe, OpenInterestData openInterestData, InterfaceC58184ywW<OpenInterestData> interfaceC58184ywW, Continuation<? super TradePositionManagerV2$checkInfoInstrument$1$job$1> continuation) {
        super(2, continuation);
        this.this$0 = xoe;
        this.$resp = openInterestData;
        this.$emitter = interfaceC58184ywW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradePositionManagerV2$checkInfoInstrument$1$job$1(this.this$0, this.$resp, this.$emitter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradePositionManagerV2$checkInfoInstrument$1$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                xOE xoe = this.this$0;
                OpenInterestData openInterestData = this.$resp;
                this.label = 1;
                if (xoe.EZpvd(openInterestData, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.$emitter.onNext(this.$resp);
            throw th;
        }
        this.$emitter.onNext(this.$resp);
        return Unit.INSTANCE;
    }
}
