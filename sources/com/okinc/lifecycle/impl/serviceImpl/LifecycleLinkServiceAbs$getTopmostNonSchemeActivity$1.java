package com.okinc.lifecycle.impl.serviceImpl;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC38168pOt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ AbstractC38168pOt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1(AbstractC38168pOt abstractC38168pOt, Continuation<? super LifecycleLinkServiceAbs$getTopmostNonSchemeActivity$1> continuation) {
        super(continuation);
        this.this$0 = abstractC38168pOt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(null, this);
    }
}
