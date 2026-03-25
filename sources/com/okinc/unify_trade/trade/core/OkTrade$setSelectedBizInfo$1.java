package com.okinc.unify_trade.trade.core;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C54582xNs;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes12.dex */
public final class OkTrade$setSelectedBizInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $instId;
    final /* synthetic */ String $instType;
    int label;
    final /* synthetic */ C54582xNs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkTrade$setSelectedBizInfo$1(C54582xNs c54582xNs, String str, String str2, Continuation<? super OkTrade$setSelectedBizInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = c54582xNs;
        this.$instType = str;
        this.$instId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OkTrade$setSelectedBizInfo$1(this.this$0, this.$instType, this.$instId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OkTrade$setSelectedBizInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        BizInstrument bizInstrumentValueOf;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C54582xNs c54582xNs = this.this$0;
            String str = this.$instType;
            this.label = 1;
            obj = c54582xNs.EZpvd(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC54531xLw abstractC54531xLw = (AbstractC54531xLw) obj;
        if (abstractC54531xLw == null || (bizInstrumentValueOf = abstractC54531xLw.valueOf(this.$instId)) == null) {
            return Unit.INSTANCE;
        }
        this.this$0.KWHzl(bizInstrumentValueOf);
        return Unit.INSTANCE;
    }
}
