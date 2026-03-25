package com.okinc.unify_trade.trade.position;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C54582xNs;
import o.C56391yDq;
import o.C56442yFn;
import o.xOE;

/* JADX INFO: loaded from: classes17.dex */
public final class TradePositionManagerV2$ensureInfoInstrumentSuspend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC54531xLw>, Object> {
    final /* synthetic */ String $needsBizType;
    int label;
    final /* synthetic */ xOE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradePositionManagerV2$ensureInfoInstrumentSuspend$2(xOE xoe, String str, Continuation<? super TradePositionManagerV2$ensureInfoInstrumentSuspend$2> continuation) {
        super(2, continuation);
        this.this$0 = xoe;
        this.$needsBizType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradePositionManagerV2$ensureInfoInstrumentSuspend$2(this.this$0, this.$needsBizType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC54531xLw> continuation) {
        return ((TradePositionManagerV2$ensureInfoInstrumentSuspend$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C54582xNs c54582xNsCopydefault = this.this$0.copydefault();
            String str = this.$needsBizType;
            this.label = 1;
            obj = c54582xNsCopydefault.EZpvd(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
