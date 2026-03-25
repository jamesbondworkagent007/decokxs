package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C35249nrk;
import o.C36558odI;
import o.C36593odr;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$onUpdatePlayState$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ C35249nrk $state;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$onUpdatePlayState$1(MessageListViewModel messageListViewModel, C35249nrk c35249nrk, Continuation<? super MessageListViewModel$onUpdatePlayState$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
        this.$state = c35249nrk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$onUpdatePlayState$1(this.this$0, this.$state, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$onUpdatePlayState$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C35249nrk c35249nrk;
        MessageListViewModel messageListViewModel;
        Unit unit;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MessageListViewModel.ActionBar actionBar = this.this$0.AkhnZx;
            if (actionBar != null) {
                C35249nrk c35249nrk2 = this.$state;
                MessageListViewModel messageListViewModel2 = this.this$0;
                Result.Application application2 = Result.Companion;
                pUU.EZpvd("MessageListViewModel", "onUpdatePlayState processing - state:" + c35249nrk2);
                C36593odr c36593odr = messageListViewModel2.QVAiDq;
                C36558odI c36558odIKWHzl = actionBar.KWHzl();
                this.L$0 = c35249nrk2;
                this.L$1 = messageListViewModel2;
                this.label = 1;
                obj = c36593odr.KWHzl(c36558odIKWHzl, c35249nrk2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                c35249nrk = c35249nrk2;
                messageListViewModel = messageListViewModel2;
            }
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
        c35249nrk = (C35249nrk) this.L$0;
        C56391yDq.AEQbTJ(obj);
        C36558odI c36558odI = (C36558odI) obj;
        unit = null;
        if (c36558odI != null) {
            pUU.EZpvd("MessageListViewModel", "onUpdatePlayState setMessageListModel - state:" + c35249nrk);
            MessageListViewModel.ActionBar actionBar2 = new MessageListViewModel.ActionBar(c36558odI, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (messageListViewModel.EZpvd(actionBar2, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
            unit = Unit.INSTANCE;
        }
        Result.m7377constructorimpl(unit);
        return Unit.INSTANCE;
    }
}
