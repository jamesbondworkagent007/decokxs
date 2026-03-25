package com.okinc.common.okcore.localization;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC32525mfI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class BaseLanguageListTaskImpl$execute$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ AbstractC32525mfI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLanguageListTaskImpl$execute$1(AbstractC32525mfI abstractC32525mfI, Continuation<? super BaseLanguageListTaskImpl$execute$1> continuation) {
        super(continuation);
        this.this$0 = abstractC32525mfI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC32525mfI.AEQbTJ(this.this$0, this);
    }
}
