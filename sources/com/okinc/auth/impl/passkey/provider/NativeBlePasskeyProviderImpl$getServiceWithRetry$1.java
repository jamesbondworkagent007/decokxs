package com.okinc.auth.impl.passkey.provider;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C5947aGA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeBlePasskeyProviderImpl$getServiceWithRetry$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C5947aGA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeBlePasskeyProviderImpl$getServiceWithRetry$1(C5947aGA c5947aGA, Continuation<? super NativeBlePasskeyProviderImpl$getServiceWithRetry$1> continuation) {
        super(continuation);
        this.this$0 = c5947aGA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(null, null, 0, 0L, this);
    }
}
