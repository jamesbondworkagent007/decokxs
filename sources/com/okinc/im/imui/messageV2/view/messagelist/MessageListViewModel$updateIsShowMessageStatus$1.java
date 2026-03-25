package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C36558odI;
import o.C36593odr;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$updateIsShowMessageStatus$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $targetMessageId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$updateIsShowMessageStatus$1(MessageListViewModel messageListViewModel, Long l, Continuation<? super MessageListViewModel$updateIsShowMessageStatus$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
        this.$targetMessageId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$updateIsShowMessageStatus$1(this.this$0, this.$targetMessageId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$updateIsShowMessageStatus$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MessageListViewModel messageListViewModel;
        Long l;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Unit unit = null;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            messageListViewModel = this.this$0;
            Long l2 = this.$targetMessageId;
            Result.Application application2 = Result.Companion;
            MessageListViewModel.ActionBar actionBar = messageListViewModel.AkhnZx;
            if (actionBar != null) {
                pUU.EZpvd("MessageListViewModel", "updateIsShowMessageStatus processing - targetMsgId:" + l2);
                C36593odr c36593odr = messageListViewModel.QVAiDq;
                C36558odI c36558odIKWHzl = actionBar.KWHzl();
                this.L$0 = l2;
                this.L$1 = messageListViewModel;
                this.label = 1;
                Object objAEQbTJ = c36593odr.AEQbTJ(l2, c36558odIKWHzl, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                l = l2;
                obj = objAEQbTJ;
            }
            Result.m7377constructorimpl(unit);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            unit = Unit.INSTANCE;
            Result.m7377constructorimpl(unit);
            return Unit.INSTANCE;
        }
        messageListViewModel = (MessageListViewModel) this.L$1;
        l = (Long) this.L$0;
        C56391yDq.AEQbTJ(obj);
        pUU.EZpvd("MessageListViewModel", "updateIsShowMessageStatus setMessageListModel - targetMsgId:" + l);
        MessageListViewModel.ActionBar actionBar2 = new MessageListViewModel.ActionBar((C36558odI) obj, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (messageListViewModel.EZpvd(actionBar2, (Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        unit = Unit.INSTANCE;
        Result.m7377constructorimpl(unit);
        return Unit.INSTANCE;
    }
}
