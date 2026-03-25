package com.okinc.business.invest_biz.ui.screens.transaction.redeem;

import android.os.Bundle;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C26714jhY;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26680jgr;

/* JADX INFO: loaded from: classes6.dex */
public final class RedeemTransactionViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C26714jhY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedeemTransactionViewModel$1(C26714jhY c26714jhY, Continuation<? super RedeemTransactionViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c26714jhY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RedeemTransactionViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RedeemTransactionViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<InvestTransactionModel> sharedFlowAEQbTJ = this.this$0.QOLQEE.AEQbTJ();
            final C26714jhY c26714jhY = this.this$0;
            FlowCollector<? super InvestTransactionModel> flowCollector = new FlowCollector() { // from class: com.okinc.business.invest_biz.ui.screens.transaction.redeem.RedeemTransactionViewModel$1.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(InvestTransactionModel investTransactionModel, Continuation<? super Unit> continuation) {
                    String txId = investTransactionModel.getTxId();
                    Bundle bundleAEQbTJ = c26714jhY.DTwDnp.AEQbTJ();
                    if (Intrinsics.EZpvd((Object) txId, (Object) (bundleAEQbTJ != null ? bundleAEQbTJ.getString("tx_id") : null)) && C26714jhY.Companion.OLrzqt(investTransactionModel.getPushToastCode())) {
                        c26714jhY.KWHzl(InterfaceC26680jgr.Application.copydefault);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
