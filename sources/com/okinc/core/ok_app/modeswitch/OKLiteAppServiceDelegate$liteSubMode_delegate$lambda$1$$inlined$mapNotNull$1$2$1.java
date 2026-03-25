package com.okinc.core.ok_app.modeswitch;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C33414mvx;

/* JADX INFO: loaded from: classes8.dex */
public final class OKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {
    Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C33414mvx.TaskDescription.AnonymousClass4 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1(C33414mvx.TaskDescription.AnonymousClass4 anonymousClass4, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
