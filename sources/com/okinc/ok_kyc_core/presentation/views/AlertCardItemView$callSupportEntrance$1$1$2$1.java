package com.okinc.ok_kyc_core.presentation.views;

import android.content.Context;
import com.okinc.biz.model.SupportService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C42224rKy;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC6817aWY;

/* JADX INFO: loaded from: classes23.dex */
public final class AlertCardItemView$callSupportEntrance$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SupportService $supportService;
    int label;
    final /* synthetic */ C42224rKy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertCardItemView$callSupportEntrance$1$1$2$1(SupportService supportService, C42224rKy c42224rKy, Continuation<? super AlertCardItemView$callSupportEntrance$1$1$2$1> continuation) {
        super(2, continuation);
        this.$supportService = supportService;
        this.this$0 = c42224rKy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AlertCardItemView$callSupportEntrance$1$1$2$1(this.$supportService, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AlertCardItemView$callSupportEntrance$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6817aWY serviceAction;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SupportService supportService = this.$supportService;
            if (supportService != null && (serviceAction = supportService.getServiceAction()) != null) {
                Context context = this.this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                this.label = 1;
                if (serviceAction.OLrzqt(context, this) == objCopydefault) {
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
}
