package com.okinc.business.defi.wallet.imported;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC18418fhy;
import o.C16292ehF;
import o.C18375fhH;
import o.C18377fhJ;
import o.C52794wYp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C59534zip;
import o.rVN;

/* JADX INFO: loaded from: classes15.dex */
public final class DefiWalletSelectNetworkActivity$initObserver$3 extends SuspendLambda implements Function2<C18377fhJ, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC18418fhy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletSelectNetworkActivity$initObserver$3(ActivityC18418fhy activityC18418fhy, Continuation<? super DefiWalletSelectNetworkActivity$initObserver$3> continuation) {
        super(2, continuation);
        this.this$0 = activityC18418fhy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefiWalletSelectNetworkActivity$initObserver$3 defiWalletSelectNetworkActivity$initObserver$3 = new DefiWalletSelectNetworkActivity$initObserver$3(this.this$0, continuation);
        defiWalletSelectNetworkActivity$initObserver$3.L$0 = obj;
        return defiWalletSelectNetworkActivity$initObserver$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C18377fhJ c18377fhJ, Continuation<? super Unit> continuation) {
        return ((DefiWalletSelectNetworkActivity$initObserver$3) create(c18377fhJ, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C52794wYp c52794wYp;
        RecyclerView recyclerView;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C18377fhJ c18377fhJ = (C18377fhJ) this.L$0;
            C16292ehF c16292ehF = this.this$0.OLrzqt;
            RecyclerView.Adapter adapter = (c16292ehF == null || (recyclerView = c16292ehF.copydefault) == null) ? null : recyclerView.getAdapter();
            C59534zip c59534zip = adapter instanceof C59534zip ? (C59534zip) adapter : null;
            if (c59534zip != null) {
                List listOLrzqt = C56402yEa.OLrzqt();
                listOLrzqt.add(C18375fhH.OLrzqt);
                listOLrzqt.addAll(c18377fhJ.OLrzqt());
                c59534zip.setItems(C56402yEa.fARcdN(listOLrzqt));
                c59534zip.notifyDataSetChanged();
            }
            C16292ehF c16292ehF2 = this.this$0.OLrzqt;
            if (c16292ehF2 != null && (c52794wYp = c16292ehF2.EZpvd) != null) {
                c52794wYp.setEnabled(c18377fhJ.AEQbTJ());
            }
            if (!c18377fhJ.OLrzqt().isEmpty()) {
                this.this$0.dismissLoading();
                rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
