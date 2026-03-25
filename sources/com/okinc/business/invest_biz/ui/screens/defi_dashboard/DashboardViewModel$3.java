package com.okinc.business.invest_biz.ui.screens.defi_dashboard;

import com.okinc.business.invest_biz.ui.screens.defi_dashboard.model.DashboardListMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C24204iYt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26359jao;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardViewModel$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C24204iYt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardViewModel$3(C24204iYt c24204iYt, Continuation<? super DashboardViewModel$3> continuation) {
        super(2, continuation);
        this.this$0 = c24204iYt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardViewModel$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DashboardViewModel$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC26359jao interfaceC26359jao = this.this$0.isConnected;
            this.label = 1;
            objCopydefault = interfaceC26359jao.copydefault(this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        C24204iYt c24204iYt = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            c24204iYt.KWHzl.setValue((DashboardListMode) objCopydefault);
        }
        return Unit.INSTANCE;
    }
}
