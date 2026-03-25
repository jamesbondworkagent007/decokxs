package com.okinc.okex.debug.fragments;

import com.okinc.okex.debug.adapter.EntrypointListAdapter;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C45450spy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ChatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C45450spy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1(C45450spy c45450spy, Continuation<? super ChatbotDBoxFragment$buildUnifiedEntranceEntryPoints$1> continuation) {
        super(continuation);
        this.this$0 = c45450spy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((Continuation<? super List<? extends EntrypointListAdapter.StateListAnimator>>) this);
    }
}
