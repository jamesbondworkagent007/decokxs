package com.okinc.business.defi.wallet.transaction.ui.contract.approve;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC16639eni;
import o.AbstractC20202gcT;
import o.C20318ged;
import o.C56391yDq;
import o.C56442yFn;
import o.C8972bMm;

/* JADX INFO: loaded from: classes18.dex */
public final class OKWBaseSetApproveAmountFragment$initApproveAmountView$4$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: Incorrect field signature: TT; */
    final /* synthetic */ OKWBaseTransaction $transaction;
    int label;
    final /* synthetic */ AbstractC20202gcT<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lo/gcT<TT;>;TT;Lkotlin/coroutines/Continuation<-Lcom/okinc/business/defi/wallet/transaction/ui/contract/approve/OKWBaseSetApproveAmountFragment$initApproveAmountView$4$1$2;>;)V */
    public OKWBaseSetApproveAmountFragment$initApproveAmountView$4$1$2(AbstractC20202gcT abstractC20202gcT, OKWBaseTransaction oKWBaseTransaction, Continuation continuation) {
        super(2, continuation);
        this.this$0 = abstractC20202gcT;
        this.$transaction = oKWBaseTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKWBaseSetApproveAmountFragment$initApproveAmountView$4$1$2(this.this$0, this.$transaction, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKWBaseSetApproveAmountFragment$initApproveAmountView$4$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C20318ged c20318gedQUSxYX = this.this$0.QUSxYX();
            OKWBaseTransaction<?> oKWBaseTransaction = this.$transaction;
            this.label = 1;
            if (c20318gedQUSxYX.EZpvd(oKWBaseTransaction, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC16639eni abstractC16639eni = this.this$0.uzCIH;
        if (abstractC16639eni == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni = null;
        }
        abstractC16639eni.KWHzl.fIwbmz();
        ((C8972bMm) this.$transaction).OJuSTm().setNeedReleaseTransfer(true);
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        FragmentActivity activity2 = this.this$0.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        return Unit.INSTANCE;
    }
}
