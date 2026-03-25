package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.im.CacheStrategy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C44136sEq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMQueryImpl$getConversation$4 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C44136sEq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMQueryImpl$getConversation$4(C44136sEq c44136sEq, Continuation<? super InHouseIMQueryImpl$getConversation$4> continuation) {
        super(continuation);
        this.this$0 = c44136sEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((String) null, (CacheStrategy) null, this);
    }
}
