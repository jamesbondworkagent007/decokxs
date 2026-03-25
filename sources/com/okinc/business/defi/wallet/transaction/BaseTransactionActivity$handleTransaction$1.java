package com.okinc.business.defi.wallet.transaction;

import android.view.View;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractActivityC17933fXr;
import o.AbstractC8601bFm;
import o.C10854bwM;
import o.C13754dXa;
import o.C20318ged;
import o.C56391yDq;
import o.C56442yFn;
import o.C9024bNl;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseTransactionActivity$handleTransaction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $flErrorContainer;
    final /* synthetic */ OKWBaseTransaction<?> $transaction;
    Object L$0;
    int label;
    final /* synthetic */ AbstractActivityC17933fXr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionActivity$handleTransaction$1(AbstractActivityC17933fXr abstractActivityC17933fXr, OKWBaseTransaction<?> oKWBaseTransaction, View view, Continuation<? super BaseTransactionActivity$handleTransaction$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractActivityC17933fXr;
        this.$transaction = oKWBaseTransaction;
        this.$flErrorContainer = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionActivity$handleTransaction$1(this.this$0, this.$transaction, this.$flErrorContainer, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionActivity$handleTransaction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C20318ged c20318gedFetchVPNInfo = this.this$0.fetchVPNInfo();
            OKWBaseTransaction<?> oKWBaseTransaction = this.$transaction;
            this.label = 1;
            if (c20318gedFetchVPNInfo.EZpvd(oKWBaseTransaction, this) == objCopydefault) {
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
        this.$flErrorContainer.setVisibility(8);
        View viewFindViewById = this.this$0.findViewById(C13754dXa.ActionBar.DfrfUJ);
        if (viewFindViewById == null) {
            this.this$0.finish();
            return Unit.INSTANCE;
        }
        viewFindViewById.setVisibility(0);
        this.this$0.AEQbTJ(this.$transaction);
        final AbstractActivityC17933fXr abstractActivityC17933fXr = this.this$0;
        abstractActivityC17933fXr.postDelay(new Runnable() { // from class: o.fXH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                abstractActivityC17933fXr.dismissLoadingWithLogo();
            }
        }, 0L);
        View decorView = this.this$0.getWindow().getDecorView();
        final AbstractActivityC17933fXr abstractActivityC17933fXr2 = this.this$0;
        decorView.post(new Runnable() { // from class: o.fXI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                rVN.reportFullyDrawn$default((android.app.Activity) abstractActivityC17933fXr2, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        });
        if (!this.this$0.AYXKKw()) {
            return Unit.INSTANCE;
        }
        C10854bwM c10854bwMDHguZz = this.$transaction.dHguZz();
        pUU.copydefault(this.this$0.getTAG(), "selectedRpcUrl = " + c10854bwMDHguZz.RJOkX() + " isCustom = " + c10854bwMDHguZz.DarRvM() + " chainId = " + c10854bwMDHguZz.AEQbTJ() + " ");
        OKWBaseTransaction<?> oKWBaseTransaction2 = this.$transaction;
        AbstractActivityC17933fXr abstractActivityC17933fXr3 = this.this$0;
        if ((oKWBaseTransaction2 instanceof AbstractC8601bFm) && !((AbstractC8601bFm) oKWBaseTransaction2).OJuSTm().isChangedCustomRpc() && !(oKWBaseTransaction2 instanceof C9024bNl) && c10854bwMDHguZz.QkdxfA()) {
            CoroutineDispatcher io2 = Dispatchers.getIO();
            BaseTransactionActivity$handleTransaction$1$3$1 baseTransactionActivity$handleTransaction$1$3$1 = new BaseTransactionActivity$handleTransaction$1$3$1(c10854bwMDHguZz, abstractActivityC17933fXr3, c10854bwMDHguZz, oKWBaseTransaction2, null);
            this.L$0 = c10854bwMDHguZz;
            this.label = 2;
            if (BuildersKt.withContext(io2, baseTransactionActivity$handleTransaction$1$3$1, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
