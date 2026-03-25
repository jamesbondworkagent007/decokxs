package com.okinc.okimcore.repository;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C44489sRs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class WebSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C44489sRs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1(C44489sRs c44489sRs, Continuation<? super WebSocketMessageRepository$buildSendWebSocketNormalMessageRequestStageTwo$1> continuation) {
        super(continuation);
        this.this$0 = c44489sRs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((OKMessage) null, this);
    }
}
