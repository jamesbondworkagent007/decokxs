package com.okinc.im.imui.messageV2.manager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C36558odI;
import o.C36593odr;
import o.C44454sQk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListModelManager$applyDeleteMessageEventToMessageListModel$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C36593odr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListModelManager$applyDeleteMessageEventToMessageListModel$1(C36593odr c36593odr, Continuation<? super MessageListModelManager$applyDeleteMessageEventToMessageListModel$1> continuation) {
        super(continuation);
        this.this$0 = c36593odr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((C36558odI) null, (C44454sQk) null, this);
    }
}
