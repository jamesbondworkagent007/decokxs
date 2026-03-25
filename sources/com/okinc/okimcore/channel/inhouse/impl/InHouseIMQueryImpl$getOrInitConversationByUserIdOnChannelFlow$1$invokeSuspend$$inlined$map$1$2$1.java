package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.channel.inhouse.impl.InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1.StateListAnimator.AnonymousClass5 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1$invokeSuspend$$inlined$map$1$2$1(InHouseIMQueryImpl$getOrInitConversationByUserIdOnChannelFlow$1.StateListAnimator.AnonymousClass5 anonymousClass5, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
