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
public final class MessageListViewModel$resetTargetMessage$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$resetTargetMessage$1(MessageListViewModel messageListViewModel, Continuation<? super MessageListViewModel$resetTargetMessage$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$resetTargetMessage$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$resetTargetMessage$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x000c */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        MessageListViewModel messageListViewModel;
        MessageListViewModel messageListViewModel2;
        MessageListViewModel messageListViewModel3;
        MessageListViewModel.ActionBar actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            messageListViewModel = i;
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MessageListViewModel.ActionBar actionBar2 = this.this$0.AkhnZx;
            if (actionBar2 != null) {
                MessageListViewModel messageListViewModel4 = this.this$0;
                Result.Application application2 = Result.Companion;
                pUU.EZpvd("MessageListViewModel", "resetTargetMessage processing");
                C36593odr c36593odr = messageListViewModel4.QVAiDq;
                C36558odI c36558odIKWHzl = actionBar2.KWHzl();
                this.L$0 = messageListViewModel4;
                this.L$1 = messageListViewModel4;
                this.label = 1;
                obj = c36593odr.AYXKKw(c36558odIKWHzl, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                messageListViewModel2 = messageListViewModel4;
                messageListViewModel3 = messageListViewModel4;
                pUU.EZpvd("MessageListViewModel", "resetTargetMessage setMessageListModel");
                actionBar = new MessageListViewModel.ActionBar((C36558odI) obj, null);
                this.L$0 = messageListViewModel3;
                this.L$1 = null;
                this.label = 2;
                i = messageListViewModel3;
                if (messageListViewModel2.EZpvd(actionBar, (Continuation<? super Unit>) this) == objCopydefault) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            MessageListViewModel messageListViewModel5 = (MessageListViewModel) this.L$1;
            MessageListViewModel messageListViewModel6 = (MessageListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            messageListViewModel3 = messageListViewModel5;
            messageListViewModel2 = messageListViewModel6;
            pUU.EZpvd("MessageListViewModel", "resetTargetMessage setMessageListModel");
            actionBar = new MessageListViewModel.ActionBar((C36558odI) obj, null);
            this.L$0 = messageListViewModel3;
            this.L$1 = null;
            this.label = 2;
            i = messageListViewModel3;
            if (messageListViewModel2.EZpvd(actionBar, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            MessageListViewModel messageListViewModel7 = (MessageListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            i = messageListViewModel7;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        messageListViewModel = i;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (messageListViewModel.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
