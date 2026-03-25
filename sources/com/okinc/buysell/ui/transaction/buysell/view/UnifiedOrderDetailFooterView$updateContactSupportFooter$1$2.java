package com.okinc.buysell.ui.transaction.buysell.view;

import android.app.Activity;
import android.content.Context;
import com.okinc.biz.model.SupportService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35334ntP;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC6817aWY;

/* JADX INFO: loaded from: classes7.dex */
public final class UnifiedOrderDetailFooterView$updateContactSupportFooter$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SupportService $supportService;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedOrderDetailFooterView$updateContactSupportFooter$1$2(SupportService supportService, Context context, Continuation<? super UnifiedOrderDetailFooterView$updateContactSupportFooter$1$2> continuation) {
        super(2, continuation);
        this.$supportService = supportService;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifiedOrderDetailFooterView$updateContactSupportFooter$1$2(this.$supportService, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnifiedOrderDetailFooterView$updateContactSupportFooter$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC6817aWY serviceAction = this.$supportService.getServiceAction();
            Activity activityKWHzl = C35334ntP.KWHzl(this.$context);
            this.label = 1;
            if (serviceAction.OLrzqt(activityKWHzl, this) == objCopydefault) {
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
