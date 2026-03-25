package com.okinc.business.invest_biz.ui.screens.transaction.redeem;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC24170iXm;
import o.C26707jhR;
import o.C26714jhY;
import o.C56391yDq;
import o.C56442yFn;
import o.iXB;

/* JADX INFO: loaded from: classes15.dex */
public final class RedeemTransactionFragment$onInputChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isMax;
    final /* synthetic */ String $newInput;
    int label;
    final /* synthetic */ C26707jhR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedeemTransactionFragment$onInputChange$1(C26707jhR c26707jhR, boolean z, String str, Continuation<? super RedeemTransactionFragment$onInputChange$1> continuation) {
        super(2, continuation);
        this.this$0 = c26707jhR;
        this.$isMax = z;
        this.$newInput = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RedeemTransactionFragment$onInputChange$1(this.this$0, this.$isMax, this.$newInput, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RedeemTransactionFragment$onInputChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC24170iXm abstractC24170iXmFetchVPNInfo = this.this$0.fetchVPNInfo();
            Intrinsics.copydefault(abstractC24170iXmFetchVPNInfo, "");
            ((C26714jhY) abstractC24170iXmFetchVPNInfo).copydefault(this.$isMax);
            String str = this.$newInput;
            iXB value = this.this$0.fetchVPNInfo().fetchVPNInfo().getValue();
            iXB ixb = new iXB(str, value != null ? value.djBIcL() : null, null, null, null, null, 0L, null, 0, false, false, false, 4092, null);
            MutableSharedFlow mutableSharedFlow = this.this$0.AkhnZx;
            this.label = 1;
            if (mutableSharedFlow.emit(ixb, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
