package com.okinc.okimcore.usecase;

import com.okinc.okimcore.model.im.inhouseim.ws.WSSendAck;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C44502sSe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$onSendMessageSuccess$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$onSendMessageSuccess$1(C44502sSe c44502sSe, Continuation<? super MessagesUseCase$onSendMessageSuccess$1> continuation) {
        super(continuation);
        this.this$0 = c44502sSe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((C44502sSe.StateListAnimator.C0942StateListAnimator) null, (WSSendAck) null, false, (Continuation<? super C44502sSe.StateListAnimator.Application>) this);
    }
}
