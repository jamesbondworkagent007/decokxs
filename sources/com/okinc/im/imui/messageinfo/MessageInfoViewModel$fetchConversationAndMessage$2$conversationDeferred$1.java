package com.okinc.im.imui.messageinfo;

import com.okinc.okimcore.model.im.CacheStrategy;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.sDZ;
import o.sGF;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageInfoViewModel$fetchConversationAndMessage$2$conversationDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OKConversation>, Object> {
    final /* synthetic */ String $channelId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageInfoViewModel$fetchConversationAndMessage$2$conversationDeferred$1(String str, Continuation<? super MessageInfoViewModel$fetchConversationAndMessage$2$conversationDeferred$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageInfoViewModel$fetchConversationAndMessage$2$conversationDeferred$1 messageInfoViewModel$fetchConversationAndMessage$2$conversationDeferred$1 = new MessageInfoViewModel$fetchConversationAndMessage$2$conversationDeferred$1(this.$channelId, continuation);
        messageInfoViewModel$fetchConversationAndMessage$2$conversationDeferred$1.L$0 = obj;
        return messageInfoViewModel$fetchConversationAndMessage$2$conversationDeferred$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OKConversation> continuation) {
        return ((MessageInfoViewModel$fetchConversationAndMessage$2$conversationDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String str = this.$channelId;
                Result.Application application = Result.Companion;
                sGF sgfAYXKKw = sDZ.AEQbTJ.AYXKKw();
                CacheStrategy cacheStrategy = CacheStrategy.CacheFirst;
                this.label = 1;
                obj = sgfAYXKKw.copydefault(str, cacheStrategy, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((OKConversation) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
