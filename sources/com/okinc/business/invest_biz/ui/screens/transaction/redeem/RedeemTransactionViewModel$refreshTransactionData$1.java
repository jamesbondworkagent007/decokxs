package com.okinc.business.invest_biz.ui.screens.transaction.redeem;

import android.graphics.drawable.Drawable;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.screens.transaction.redeem.RedeemTransactionViewModel$refreshTransactionData$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC24170iXm;
import o.C25493ixk;
import o.C26714jhY;
import o.C33070mpX;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.iXB;

/* JADX INFO: loaded from: classes6.dex */
public final class RedeemTransactionViewModel$refreshTransactionData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C26714jhY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedeemTransactionViewModel$refreshTransactionData$1(C26714jhY c26714jhY, Continuation<? super RedeemTransactionViewModel$refreshTransactionData$1> continuation) {
        super(2, continuation);
        this.this$0 = c26714jhY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RedeemTransactionViewModel$refreshTransactionData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RedeemTransactionViewModel$refreshTransactionData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InitialInfoModel value = this.this$0.gEmmrt().getValue();
            if (value != null) {
                final C26714jhY c26714jhY = this.this$0;
                iXB value2 = c26714jhY.fetchVPNInfo().getValue();
                Function2 function2 = new Function2() { // from class: o.jih
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return RedeemTransactionViewModel$refreshTransactionData$1.invokeSuspend$lambda$1$lambda$0(c26714jhY, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3);
                    }
                };
                this.label = 1;
                if (AbstractC24170iXm.reloadContent$default(c26714jhY, value, value2, null, function2, this, 4, null) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(C26714jhY c26714jhY, boolean z, String str) {
        if (z) {
            iXB value = c26714jhY.fetchVPNInfo().getValue();
            if (value == null) {
                value = new iXB("", null, null, null, null, null, 0L, null, 0, false, false, false, 4092, null);
            }
            iXB ixb = value;
            c26714jhY.copydefault(ixb.KWHzl((4091 & 1) != 0 ? ixb.copydefault : null, (4091 & 2) != 0 ? ixb.valueOf : null, (4091 & 4) != 0 ? ixb.AkhnZx : TransactionStage.CONFIRMATION, (4091 & 8) != 0 ? ixb.OLrzqt : null, (4091 & 16) != 0 ? ixb.AYXKKw : null, (4091 & 32) != 0 ? ixb.gEmmrt : null, (4091 & 64) != 0 ? ixb.fetchVPNInfo : System.currentTimeMillis(), (4091 & 128) != 0 ? ixb.djBIcL : null, (4091 & 256) != 0 ? ixb.AEQbTJ : 0, (4091 & 512) != 0 ? ixb.AhwBna : false, (4091 & 1024) != 0 ? ixb.KWHzl : false, (4091 & 2048) != 0 ? ixb.EZpvd : false));
        } else {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C25493ixk.FragmentManager.AxsJAYsNCnLh), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
