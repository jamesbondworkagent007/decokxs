package com.okinc.auth.impl.mfa.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C5706aBY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KickOutInitialDeviceUseCase$getData$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C5706aBY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KickOutInitialDeviceUseCase$getData$1(C5706aBY c5706aBY, Continuation<? super KickOutInitialDeviceUseCase$getData$1> continuation) {
        super(continuation);
        this.this$0 = c5706aBY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((C5706aBY.Activity) null, (Continuation<? super C5706aBY.TaskDescription>) this);
    }
}
