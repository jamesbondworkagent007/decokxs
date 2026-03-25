package com.okinc.business.dex.trade.common;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C22416heu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC19753gOa;
import o.InterfaceC28239kUa;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes5.dex */
public final class SwapBottomViewModel$checkEoaAutoConfirmStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SwapBottomViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwapBottomViewModel$checkEoaAutoConfirmStatus$1(SwapBottomViewModel swapBottomViewModel, Continuation<? super SwapBottomViewModel$checkEoaAutoConfirmStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = swapBottomViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwapBottomViewModel$checkEoaAutoConfirmStatus$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwapBottomViewModel$checkEoaAutoConfirmStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        InterfaceC19753gOa interfaceC19753gOa;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.this$0.OLrzqt.KWHzl();
            MutableStateFlow mutableStateFlow = this.this$0.copydefault;
            SwapBottomViewModel swapBottomViewModel = this.this$0;
            do {
                value = mutableStateFlow.getValue();
                if (interfaceC9738bbJKWHzl == null) {
                    interfaceC19753gOa = InterfaceC19753gOa.ActionBar.copydefault;
                } else if (interfaceC9738bbJKWHzl.gHZMYf()) {
                    interfaceC19753gOa = InterfaceC19753gOa.StateListAnimator.KWHzl;
                } else if (swapBottomViewModel.OLrzqt.djBIcL()) {
                    if (C22416heu.AubY()) {
                        interfaceC19753gOa = InterfaceC19753gOa.Activity.EZpvd;
                    } else {
                        interfaceC19753gOa = InterfaceC19753gOa.ActionBar.copydefault;
                    }
                } else if (C22416heu.fIwbmz()) {
                    interfaceC19753gOa = Intrinsics.EZpvd(swapBottomViewModel.KWHzl.OLrzqt(), InterfaceC28239kUa.TaskDescription.AEQbTJ) ? InterfaceC19753gOa.Activity.EZpvd : InterfaceC19753gOa.StateListAnimator.KWHzl;
                } else {
                    interfaceC19753gOa = InterfaceC19753gOa.ActionBar.copydefault;
                }
            } while (!mutableStateFlow.compareAndSet(value, interfaceC19753gOa));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
