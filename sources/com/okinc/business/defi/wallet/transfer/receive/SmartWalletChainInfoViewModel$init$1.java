package com.okinc.business.defi.wallet.transfer.receive;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C21050gsT;
import o.C21052gsV;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class SmartWalletChainInfoViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $walletId;
    int label;
    final /* synthetic */ C21052gsV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartWalletChainInfoViewModel$init$1(C21052gsV c21052gsV, String str, Continuation<? super SmartWalletChainInfoViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = c21052gsV;
        this.$walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartWalletChainInfoViewModel$init$1(this.this$0, this.$walletId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmartWalletChainInfoViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.this$0.EZpvd.OLrzqt(this.$walletId, false);
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            C21052gsV c21052gsV = this.this$0;
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
            MutableStateFlow mutableStateFlow = c21052gsV.OLrzqt;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, new C21050gsT(abstractC12782ctV.fdOvFl(), c21052gsV.copydefault.valueOf().OLrzqt())));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pUU.copydefault("SmartWalletChainInfoViewModel", message);
        }
        return Unit.INSTANCE;
    }
}
