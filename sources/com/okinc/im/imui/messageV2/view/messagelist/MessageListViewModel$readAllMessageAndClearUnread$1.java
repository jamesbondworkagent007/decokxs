package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C36556odG;
import o.C56391yDq;
import o.C56442yFn;
import o.oCH;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$readAllMessageAndClearUnread$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C36556odG $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$readAllMessageAndClearUnread$1(MessageListViewModel messageListViewModel, C36556odG c36556odG, Continuation<? super MessageListViewModel$readAllMessageAndClearUnread$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListViewModel;
        this.$request = c36556odG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageListViewModel$readAllMessageAndClearUnread$1 messageListViewModel$readAllMessageAndClearUnread$1 = new MessageListViewModel$readAllMessageAndClearUnread$1(this.this$0, this.$request, continuation);
        messageListViewModel$readAllMessageAndClearUnread$1.L$0 = obj;
        return messageListViewModel$readAllMessageAndClearUnread$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$readAllMessageAndClearUnread$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MessageListViewModel messageListViewModel = this.this$0;
            C36556odG c36556odG = this.$request;
            Result.Application application2 = Result.Companion;
            oCH och = messageListViewModel.aKErDB;
            String strEZpvd = c36556odG.EZpvd();
            OKMessage oKMessageCopydefault = c36556odG.copydefault();
            this.label = 1;
            if (och.EZpvd(strEZpvd, oKMessageCopydefault, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.label = 2;
        if (DelayKt.delay(300L, this) == objCopydefault) {
            return objCopydefault;
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
