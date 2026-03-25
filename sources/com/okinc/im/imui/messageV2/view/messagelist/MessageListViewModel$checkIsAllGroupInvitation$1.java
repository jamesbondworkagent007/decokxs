package com.okinc.im.imui.messageV2.view.messagelist;

import android.content.Context;
import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel$checkIsAllGroupInvitation$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C34168nTy;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$checkIsAllGroupInvitation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $channelId;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $invitationId;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$checkIsAllGroupInvitation$1(MessageListViewModel messageListViewModel, Context context, Long l, String str, Continuation<? super MessageListViewModel$checkIsAllGroupInvitation$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListViewModel;
        this.$context = context;
        this.$channelId = l;
        this.$invitationId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListViewModel$checkIsAllGroupInvitation$1(this.this$0, this.$context, this.$channelId, this.$invitationId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$checkIsAllGroupInvitation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AYXKKw.setValue(C56443yFo.KWHzl(true));
            C34168nTy c34168nTy = this.this$0.QOLQEE;
            Context context = this.$context;
            Long l = this.$channelId;
            String strGEmmrt = l != null ? C33129mqd.gEmmrt(l) : null;
            String str = this.$invitationId;
            final MessageListViewModel messageListViewModel = this.this$0;
            Function0 function0 = new Function0() { // from class: o.omW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MessageListViewModel$checkIsAllGroupInvitation$1.invokeSuspend$lambda$0(messageListViewModel);
                }
            };
            this.label = 1;
            if (C34168nTy.check$default(c34168nTy, context, strGEmmrt, str, false, function0, this, 8, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MessageListViewModel messageListViewModel) {
        messageListViewModel.AYXKKw.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
