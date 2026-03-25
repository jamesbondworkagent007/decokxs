package com.immomo.mls.utils;

import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43044rhp;
import o.C43047rhs;
import o.C56391yDq;
import o.C56442yFn;
import o.C7788aqT;
import o.C7791aqW;
import o.InterfaceC43015rhM;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorMonitor$clearLocalBundles$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ErrorMonitor$clearLocalBundles$1(Continuation<? super ErrorMonitor$clearLocalBundles$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ErrorMonitor$clearLocalBundles$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ErrorMonitor$clearLocalBundles$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC43015rhM interfaceC43015rhMGEmmrt;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.valueOf("ErrorMonitor", "clearLocalBundles");
            C7791aqW c7791aqWAEQbTJ = C7788aqT.AEQbTJ();
            if (c7791aqWAEQbTJ != null && (interfaceC43015rhMGEmmrt = c7791aqWAEQbTJ.gEmmrt()) != null) {
                interfaceC43015rhMGEmmrt.KWHzl();
            }
            C43047rhs.AEQbTJ.KWHzl();
            RxBus.AEQbTJ(new C43044rhp());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
