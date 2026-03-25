package com.okinc.business.defi.wallet.mine;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC18816fpZ;
import o.ActivityC18501fjb;
import o.C14780drs;
import o.C16234egA;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes5.dex */
public final class AddWalletActivity$initListeners$1 extends SuspendLambda implements Function2<List<? extends AbstractC18816fpZ>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC18501fjb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddWalletActivity$initListeners$1(ActivityC18501fjb activityC18501fjb, Continuation<? super AddWalletActivity$initListeners$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC18501fjb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AddWalletActivity$initListeners$1 addWalletActivity$initListeners$1 = new AddWalletActivity$initListeners$1(this.this$0, continuation);
        addWalletActivity$initListeners$1.L$0 = obj;
        return addWalletActivity$initListeners$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends AbstractC18816fpZ> list, Continuation<? super Unit> continuation) {
        return ((AddWalletActivity$initListeners$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        RecyclerView recyclerView;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            C16234egA c16234egA = this.this$0.KWHzl;
            RecyclerView.Adapter adapter = (c16234egA == null || (recyclerView = c16234egA.EZpvd) == null) ? null : recyclerView.getAdapter();
            C14780drs c14780drs = adapter instanceof C14780drs ? (C14780drs) adapter : null;
            if (c14780drs != null) {
                c14780drs.AEQbTJ(list);
            }
            rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
