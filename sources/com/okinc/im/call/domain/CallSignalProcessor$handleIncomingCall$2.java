package com.okinc.im.call.domain;

import com.okinc.im.call.model.CallSessionV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35238nrZ;
import o.C35220nrH;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35234nrV;

/* JADX INFO: loaded from: classes8.dex */
public final class CallSignalProcessor$handleIncomingCall$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC35238nrZ.Fragment $signal;
    int label;
    final /* synthetic */ C35220nrH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallSignalProcessor$handleIncomingCall$2(AbstractC35238nrZ.Fragment fragment, C35220nrH c35220nrH, Continuation<? super CallSignalProcessor$handleIncomingCall$2> continuation) {
        super(2, continuation);
        this.$signal = fragment;
        this.this$0 = c35220nrH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallSignalProcessor$handleIncomingCall$2(this.$signal, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CallSignalProcessor$handleIncomingCall$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC35238nrZ.Fragment fragment = this.$signal;
            String strKWHzl = C44157sFk.KWHzl();
            if (strKWHzl == null) {
                return Unit.INSTANCE;
            }
            CallSessionV2 callSessionV2Copydefault = fragment.copydefault(strKWHzl);
            InterfaceC35234nrV interfaceC35234nrV = this.this$0.AhwBna;
            this.label = 1;
            if (interfaceC35234nrV.EZpvd(callSessionV2Copydefault, this) == objCopydefault) {
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
