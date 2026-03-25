package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC44292sKk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ChannelMessenger$deleteLocalAndRemoteMessage$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ AbstractC44292sKk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelMessenger$deleteLocalAndRemoteMessage$1(AbstractC44292sKk abstractC44292sKk, Continuation<? super ChannelMessenger$deleteLocalAndRemoteMessage$1> continuation) {
        super(continuation);
        this.this$0 = abstractC44292sKk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC44292sKk.AEQbTJ(this.this$0, (OKConversation) null, (OKMessage[]) null, this);
    }
}
