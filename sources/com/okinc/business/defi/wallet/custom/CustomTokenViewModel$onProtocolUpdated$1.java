package com.okinc.business.defi.wallet.custom;

import com.okinc.business.defi.biz.net.bean.CoinProtocol;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C16204efX;
import o.C16263egd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class CustomTokenViewModel$onProtocolUpdated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $protocolId;
    int label;
    final /* synthetic */ C16204efX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTokenViewModel$onProtocolUpdated$1(C16204efX c16204efX, int i, Continuation<? super CustomTokenViewModel$onProtocolUpdated$1> continuation) {
        super(2, continuation);
        this.this$0 = c16204efX;
        this.$protocolId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomTokenViewModel$onProtocolUpdated$1(this.this$0, this.$protocolId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CustomTokenViewModel$onProtocolUpdated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        C16263egd value;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<CoinProtocol> listKWHzl = this.this$0.EZpvd().getValue().KWHzl();
            int i = this.$protocolId;
            Iterator<T> it = listKWHzl.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((CoinProtocol) next).getProtocolId() == i) {
                    break;
                }
            }
            CoinProtocol coinProtocol = (CoinProtocol) next;
            if (coinProtocol != null) {
                MutableStateFlow<C16263egd> mutableStateFlowEZpvd = this.this$0.EZpvd();
                do {
                    value = mutableStateFlowEZpvd.getValue();
                } while (!mutableStateFlowEZpvd.compareAndSet(value, C16263egd.copy$default(value, null, false, false, null, coinProtocol, false, 47, null)));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
