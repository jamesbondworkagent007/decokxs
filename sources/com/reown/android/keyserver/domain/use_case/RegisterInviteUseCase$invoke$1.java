package com.reown.android.keyserver.domain.use_case;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class RegisterInviteUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RegisterInviteUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterInviteUseCase$invoke$1(RegisterInviteUseCase registerInviteUseCase, Continuation<? super RegisterInviteUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = registerInviteUseCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7299invokegIAlus = this.this$0.m7299invokegIAlus(null, this);
        return objM7299invokegIAlus == C56442yFn.copydefault() ? objM7299invokegIAlus : Result.m7376boximpl(objM7299invokegIAlus);
    }
}
