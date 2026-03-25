package com.okinc.business.defi.biz.core.transaction.sign.utxo.transaction;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC11993ceZ;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class OKWUTXOBaseTransaction$loadUTXOManagement$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractC11993ceZ<SignData> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKWUTXOBaseTransaction$loadUTXOManagement$1$1(AbstractC11993ceZ<SignData> abstractC11993ceZ, Continuation<? super OKWUTXOBaseTransaction$loadUTXOManagement$1$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC11993ceZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKWUTXOBaseTransaction$loadUTXOManagement$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKWUTXOBaseTransaction$loadUTXOManagement$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbuOFhtUX = this.this$0.OFhtUX();
            String strHtlTjW = this.this$0.htlTjW();
            long jFetchVPNInfo = this.this$0.dHguZz().fetchVPNInfo();
            this.label = 1;
            if (c13934dbuOFhtUX.OLrzqt(strHtlTjW, jFetchVPNInfo, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC11993ceZ<SignData> abstractC11993ceZ = this.this$0;
        abstractC11993ceZ.OLrzqt(abstractC11993ceZ.QbewEr, "loadUTXOManagement  end  " + this.this$0.RJOkX);
        return Unit.INSTANCE;
    }
}
