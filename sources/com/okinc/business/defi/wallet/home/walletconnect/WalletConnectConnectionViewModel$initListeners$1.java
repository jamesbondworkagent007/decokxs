package com.okinc.business.defi.wallet.home.walletconnect;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC12782ctV;
import o.C18346fgf;
import o.C18347fgg;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletConnectConnectionViewModel$initListeners$1 extends SuspendLambda implements yHO<Integer, AbstractC12782ctV, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $initState;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ C18347fgg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletConnectConnectionViewModel$initListeners$1(C18347fgg c18347fgg, int i, Continuation<? super WalletConnectConnectionViewModel$initListeners$1> continuation) {
        super(3, continuation);
        this.this$0 = c18347fgg;
        this.$initState = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(Integer num, AbstractC12782ctV abstractC12782ctV, Continuation<? super Unit> continuation) {
        WalletConnectConnectionViewModel$initListeners$1 walletConnectConnectionViewModel$initListeners$1 = new WalletConnectConnectionViewModel$initListeners$1(this.this$0, this.$initState, continuation);
        walletConnectConnectionViewModel$initListeners$1.L$0 = num;
        walletConnectConnectionViewModel$initListeners$1.L$1 = abstractC12782ctV;
        return walletConnectConnectionViewModel$initListeners$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C18346fgf c18346fgf;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Integer num = (Integer) this.L$0;
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) this.L$1;
            MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
            int i = this.$initState;
            C18347fgg c18347fgg = this.this$0;
            do {
                value = mutableStateFlow.getValue();
                c18346fgf = (C18346fgf) value;
            } while (!mutableStateFlow.compareAndSet(value, C18346fgf.copy$default(c18346fgf, c18346fgf.KWHzl() == null ? C56443yFo.AEQbTJ(i) : num, null, abstractC12782ctV, null, abstractC12782ctV != null ? true ^ c18347fgg.OLrzqt(abstractC12782ctV) : true, 10, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
