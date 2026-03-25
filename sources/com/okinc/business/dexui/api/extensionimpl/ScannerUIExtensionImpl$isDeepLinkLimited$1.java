package com.okinc.business.dexui.api.extensionimpl;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C23281hvK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ScannerUIExtensionImpl$isDeepLinkLimited$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C23281hvK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerUIExtensionImpl$isDeepLinkLimited$1(C23281hvK c23281hvK, Continuation<? super ScannerUIExtensionImpl$isDeepLinkLimited$1> continuation) {
        super(continuation);
        this.this$0 = c23281hvK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault(null, null, this);
    }
}
