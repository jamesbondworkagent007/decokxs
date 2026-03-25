package com.okinc.okimcore.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C44486sRp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageRepository$getMaxSeqInBoundMsgIsReceiveReadReceiptHandled$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C44486sRp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageRepository$getMaxSeqInBoundMsgIsReceiveReadReceiptHandled$1(C44486sRp c44486sRp, Continuation<? super MessageRepository$getMaxSeqInBoundMsgIsReceiveReadReceiptHandled$1> continuation) {
        super(continuation);
        this.this$0 = c44486sRp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((String) null, (String) null, this);
    }
}
