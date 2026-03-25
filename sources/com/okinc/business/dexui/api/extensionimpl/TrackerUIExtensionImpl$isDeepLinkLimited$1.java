package com.okinc.business.dexui.api.extensionimpl;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C23283hvM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerUIExtensionImpl$isDeepLinkLimited$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C23283hvM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerUIExtensionImpl$isDeepLinkLimited$1(C23283hvM c23283hvM, Continuation<? super TrackerUIExtensionImpl$isDeepLinkLimited$1> continuation) {
        super(continuation);
        this.this$0 = c23283hvM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(null, null, this);
    }
}
