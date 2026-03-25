package com.okinc.lifecycle.impl.deeplink.wrapper.core;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.pMZ;

/* JADX INFO: loaded from: classes23.dex */
public final class CoreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ pMZ.ActionBar this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1(pMZ.ActionBar actionBar, Continuation<? super CoreLinkDependencyHelperImpl$waitForConfigSync$1$execute$1> continuation) {
        super(continuation);
        this.this$0 = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(this);
    }
}
