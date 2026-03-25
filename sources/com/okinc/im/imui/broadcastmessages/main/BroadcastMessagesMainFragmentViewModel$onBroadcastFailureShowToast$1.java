package com.okinc.im.imui.broadcastmessages.main;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC35761oCs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BroadcastMessagesMainFragmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1(BroadcastMessagesMainFragmentViewModel broadcastMessagesMainFragmentViewModel, Continuation<? super BroadcastMessagesMainFragmentViewModel$onBroadcastFailureShowToast$1> continuation) {
        super(continuation);
        this.this$0 = broadcastMessagesMainFragmentViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((List<? extends AbstractC35761oCs>) null, (Continuation<? super List<? extends AbstractC35761oCs>>) this);
    }
}
