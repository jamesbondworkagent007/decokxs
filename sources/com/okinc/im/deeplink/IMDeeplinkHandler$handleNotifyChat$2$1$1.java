package com.okinc.im.deeplink;

import android.app.Activity;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33791nFz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class IMDeeplinkHandler$handleNotifyChat$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ OKConversation $conversation;
    final /* synthetic */ InterfaceC35180nqU $okimService;
    final /* synthetic */ String $source;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMDeeplinkHandler$handleNotifyChat$2$1$1(OKConversation oKConversation, InterfaceC35180nqU interfaceC35180nqU, Activity activity, String str, Continuation<? super IMDeeplinkHandler$handleNotifyChat$2$1$1> continuation) {
        super(2, continuation);
        this.$conversation = oKConversation;
        this.$okimService = interfaceC35180nqU;
        this.$activity = activity;
        this.$source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IMDeeplinkHandler$handleNotifyChat$2$1$1(this.$conversation, this.$okimService, this.$activity, this.$source, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IMDeeplinkHandler$handleNotifyChat$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$conversation != null) {
                pUU.KWHzl("IMDeeplinkHandler", "handleNotifyChat => conversation not null, startIMChatPage");
                this.$okimService.KWHzl(this.$activity, this.$conversation.getTargetId(), this.$conversation.getConversationType(), this.$source);
            } else {
                pUU.KWHzl("IMDeeplinkHandler", "handleNotifyChat => conversation null, start message center");
                C33791nFz.KWHzl.OLrzqt(this.$activity, ChatOrigin.DEEPLINK, false);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
