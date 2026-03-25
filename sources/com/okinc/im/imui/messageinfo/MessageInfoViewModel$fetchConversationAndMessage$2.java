package com.okinc.im.imui.messageinfo;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageInfoViewModel$fetchConversationAndMessage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends OKConversation, ? extends OKMessage>>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ long $messageSeq;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessageInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageInfoViewModel$fetchConversationAndMessage$2(String str, MessageInfoViewModel messageInfoViewModel, long j, Continuation<? super MessageInfoViewModel$fetchConversationAndMessage$2> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = messageInfoViewModel;
        this.$messageSeq = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageInfoViewModel$fetchConversationAndMessage$2 messageInfoViewModel$fetchConversationAndMessage$2 = new MessageInfoViewModel$fetchConversationAndMessage$2(this.$channelId, this.this$0, this.$messageSeq, continuation);
        messageInfoViewModel$fetchConversationAndMessage$2.L$0 = obj;
        return messageInfoViewModel$fetchConversationAndMessage$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends OKConversation, ? extends OKMessage>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Pair<OKConversation, OKMessage>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Pair<OKConversation, OKMessage>> continuation) {
        return ((MessageInfoViewModel$fetchConversationAndMessage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferredAsync$default;
        Object objAwait;
        Object objAwait2;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MessageInfoViewModel$fetchConversationAndMessage$2$conversationDeferred$1(this.$channelId, null), 3, null);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new MessageInfoViewModel$fetchConversationAndMessage$2$messageDeferred$1(this.this$0, this.$channelId, this.$messageSeq, null), 3, null);
            this.L$0 = deferredAsync$default;
            this.label = 1;
            objAwait = deferredAsync$default2.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait2 = obj;
                return C56390yDp.OLrzqt(obj2, objAwait2);
            }
            deferredAsync$default = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        }
        this.L$0 = objAwait;
        this.label = 2;
        objAwait2 = deferredAsync$default.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        obj2 = objAwait;
        return C56390yDp.OLrzqt(obj2, objAwait2);
    }
}
