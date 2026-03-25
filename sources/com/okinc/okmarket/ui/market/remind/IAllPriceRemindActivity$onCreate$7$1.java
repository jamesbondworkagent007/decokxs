package com.okinc.okmarket.ui.market.remind;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC46767tdQ;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;
import o.qZH;

/* JADX INFO: loaded from: classes19.dex */
public final class IAllPriceRemindActivity$onCreate$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractActivityC46767tdQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAllPriceRemindActivity$onCreate$7$1(AbstractActivityC46767tdQ abstractActivityC46767tdQ, Continuation<? super IAllPriceRemindActivity$onCreate$7$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractActivityC46767tdQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IAllPriceRemindActivity$onCreate$7$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IAllPriceRemindActivity$onCreate$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.fetchVPNInfo().copydefault(this.this$0.isConnected()) < 50) {
                AbstractActivityC46767tdQ abstractActivityC46767tdQ = this.this$0;
                this.label = 1;
                if (abstractActivityC46767tdQ.OLrzqt((Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.this$0);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.RZNAhV));
                String strAYXKKw = C33070mpX.AYXKKw(qZH.PendingIntent.uzCIH);
                final AbstractActivityC46767tdQ abstractActivityC46767tdQ2 = this.this$0;
                viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) strAYXKKw, new View.OnClickListener() { // from class: com.okinc.okmarket.ui.market.remind.IAllPriceRemindActivity$onCreate$7$1.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC46767tdQ2), null, null, new IAllPriceRemindActivity$onCreate$7$1$1$1(viewOnClickListenerC54939xaY, null), 3, null);
                    }
                });
                viewOnClickListenerC54939xaY.show();
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
