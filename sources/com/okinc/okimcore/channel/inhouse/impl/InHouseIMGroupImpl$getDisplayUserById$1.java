package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C44127sEh;
import o.C44461sQr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMGroupImpl$getDisplayUserById$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C44127sEh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMGroupImpl$getDisplayUserById$1(C44127sEh c44127sEh, Continuation<? super InHouseIMGroupImpl$getDisplayUserById$1> continuation) {
        super(continuation);
        this.this$0 = c44127sEh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((String) null, (String) null, (C44461sQr) null, (OKMessage) null, this);
    }
}
