package com.okinc.auth.impl.passkey.service;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C5958aGL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C5958aGL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1(C5958aGL c5958aGL, Continuation<? super AuthPasskeyServiceImpl$checkPasskeyForOkxPayAuthenticate$1> continuation) {
        super(continuation);
        this.this$0 = c5958aGL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault(this);
    }
}
