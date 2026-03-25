package com.okinc.okimcore.facade;

import com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C44484sRn;
import o.sFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class TransactionFacade$getOrPrepopulateMissingConversations$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ sFA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionFacade$getOrPrepopulateMissingConversations$1(sFA sfa, Continuation<? super TransactionFacade$getOrPrepopulateMissingConversations$1> continuation) {
        super(continuation);
        this.this$0 = sfa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((C44484sRn) null, (InHouseIMConversationService) null, (Set<String>) null, this);
    }
}
