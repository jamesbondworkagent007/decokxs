package com.okinc.lifecycle.impl.clipboard;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C38074pLg;

/* JADX INFO: loaded from: classes9.dex */
public final class ClipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C38074pLg.TaskDescription.AnonymousClass1 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipBoardContentManagerImpl$observeLockScreenState$$inlined$filter$1$2$1(C38074pLg.TaskDescription.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
