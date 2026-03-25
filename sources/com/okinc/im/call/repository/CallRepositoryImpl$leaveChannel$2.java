package com.okinc.im.call.repository;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35226nrN;
import o.C35235nrW;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class CallRepositoryImpl$leaveChannel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC35226nrN<? extends Unit>>, Object> {
    int label;
    final /* synthetic */ C35235nrW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRepositoryImpl$leaveChannel$2(C35235nrW c35235nrW, Continuation<? super CallRepositoryImpl$leaveChannel$2> continuation) {
        super(2, continuation);
        this.this$0 = c35235nrW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallRepositoryImpl$leaveChannel$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC35226nrN<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC35226nrN<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        return ((CallRepositoryImpl$leaveChannel$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl("leaveChannel: Destroying Agora channel");
            if (this.this$0.OLrzqt == null) {
                this.this$0.KWHzl("leaveChannel: Audio service unavailable, nothing to clean up");
                return AbstractC35226nrN.Companion.copydefault(Unit.INSTANCE);
            }
            try {
                this.this$0.OLrzqt.EZpvd();
                this.this$0.KWHzl("leaveChannel: Successfully left channel");
                return AbstractC35226nrN.Companion.copydefault(Unit.INSTANCE);
            } catch (Exception e) {
                this.this$0.KWHzl("leaveChannel: Exception during cleanup (ignored) - " + e.getMessage());
                return AbstractC35226nrN.Companion.copydefault(Unit.INSTANCE);
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
