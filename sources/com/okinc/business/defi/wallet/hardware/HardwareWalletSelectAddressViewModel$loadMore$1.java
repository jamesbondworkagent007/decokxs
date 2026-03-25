package com.okinc.business.defi.wallet.hardware;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C10854bwM;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC15373eFy;
import o.eEX;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class HardwareWalletSelectAddressViewModel$loadMore$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eEX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareWalletSelectAddressViewModel$loadMore$1(eEX eex, Continuation<? super HardwareWalletSelectAddressViewModel$loadMore$1> continuation) {
        super(2, continuation);
        this.this$0 = eex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HardwareWalletSelectAddressViewModel$loadMore$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HardwareWalletSelectAddressViewModel$loadMore$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC15373eFy interfaceC15373eFy = this.this$0.OLrzqt;
            long jAEQbTJ = this.this$0.AEQbTJ();
            this.label = 1;
            obj = interfaceC15373eFy.KWHzl(jAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C10854bwM c10854bwM = (C10854bwM) obj;
        if (c10854bwM == null) {
            return Unit.INSTANCE;
        }
        if (c10854bwM.call()) {
            eEX eex = this.this$0;
            eex.AEQbTJ(eex.EZpvd() + 1);
        } else {
            eEX eex2 = this.this$0;
            eex2.AEQbTJ(eex2.EZpvd() + 4);
        }
        pUU.OLrzqt(">>>ledger loadMore 2 currentOffset:" + this.this$0.EZpvd() + " - offetFlow:" + this.this$0.KWHzl.getValue());
        MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
        Integer numAEQbTJ = C56443yFo.AEQbTJ(this.this$0.EZpvd());
        this.label = 2;
        if (mutableStateFlow.emit(numAEQbTJ, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
