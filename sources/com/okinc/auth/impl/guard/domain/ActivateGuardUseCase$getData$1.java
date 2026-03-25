package com.okinc.auth.impl.guard.domain;

import com.okinc.auth.impl.guard.domain.ActivateGuardUseCase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivateGuardUseCase$getData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ActivateGuardUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateGuardUseCase$getData$1(ActivateGuardUseCase activateGuardUseCase, Continuation<? super ActivateGuardUseCase$getData$1> continuation) {
        super(continuation);
        this.this$0 = activateGuardUseCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((ActivateGuardUseCase.StateListAnimator) null, (Continuation<? super ActivateGuardUseCase.TaskDescription>) this);
    }
}
