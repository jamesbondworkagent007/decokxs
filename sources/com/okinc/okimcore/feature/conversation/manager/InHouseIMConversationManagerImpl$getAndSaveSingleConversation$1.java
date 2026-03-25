package com.okinc.okimcore.feature.conversation.manager;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationListData;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.sGK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMConversationManagerImpl$getAndSaveSingleConversation$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ sGK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMConversationManagerImpl$getAndSaveSingleConversation$1(sGK sgk, Continuation<? super InHouseIMConversationManagerImpl$getAndSaveSingleConversation$1> continuation) {
        super(continuation);
        this.this$0 = sgk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((String) null, false, (Continuation<? super InHouseIMConversationListData>) this);
    }
}
