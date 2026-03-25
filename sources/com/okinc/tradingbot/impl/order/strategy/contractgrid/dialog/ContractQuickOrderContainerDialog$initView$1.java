package com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C50297vJe;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54577xNn;
import o.vIF;

/* JADX INFO: loaded from: classes11.dex */
public final class ContractQuickOrderContainerDialog$initView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C50297vJe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractQuickOrderContainerDialog$initView$1(C50297vJe c50297vJe, Continuation<? super ContractQuickOrderContainerDialog$initView$1> continuation) {
        super(2, continuation);
        this.this$0 = c50297vJe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContractQuickOrderContainerDialog$initView$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContractQuickOrderContainerDialog$initView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            this.label = 1;
            if (InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, this, 3, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        C50297vJe c50297vJe = this.this$0;
        vIF vifOLrzqt = vIF.Companion.OLrzqt(c50297vJe.OLrzqt(), c50297vJe.djBIcL());
        C50297vJe.TaskDescription taskDescription = C50297vJe.Companion;
        c50297vJe.OLrzqt(taskDescription.OLrzqt());
        c50297vJe.AEQbTJ(vifOLrzqt, c50297vJe.copydefault());
        Function1<Boolean, Unit> function1EZpvd = taskDescription.EZpvd();
        if (function1EZpvd != null) {
            function1EZpvd.invoke(C56443yFo.KWHzl(true));
        }
        if (c50297vJe.isAdded() && !c50297vJe.isDetached()) {
            c50297vJe.AYXKKw();
            c50297vJe.valueOf();
        }
        return Unit.INSTANCE;
    }
}
