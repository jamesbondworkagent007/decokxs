package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C33129mqd;
import o.C36558odI;
import o.C36593odr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$onWebSocketConnectionStateUpdated$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$onWebSocketConnectionStateUpdated$1(MessageListViewModel messageListViewModel, Continuation<? super MessageListViewModel$onWebSocketConnectionStateUpdated$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$onWebSocketConnectionStateUpdated$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$onWebSocketConnectionStateUpdated$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x00a5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x000e */
    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd A[RETURN] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r15;
        Object objM7377constructorimpl;
        ?? r1;
        Object objReloadMessageListModel$default;
        ?? r12;
        ?? r152;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        ?? r13 = 1;
        try {
        } catch (Throwable th) {
            th = th;
            r15 = r13;
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("MessageListViewModel", "reloadMessageListModel processing");
            r15 = this.this$0;
            try {
                Result.Application application = Result.Companion;
                C36593odr c36593odr = r15.QVAiDq;
                String str = (String) r15.OLrzqt.getValue();
                Long lKWHzl = C56443yFo.KWHzl(C33129mqd.valueOf(r15.fvQaOB));
                String str2 = r15.dvKsVJ;
                this.L$0 = r15;
                this.L$1 = r15;
                this.label = 1;
                objReloadMessageListModel$default = C36593odr.reloadMessageListModel$default(c36593odr, str, lKWHzl, str2, false, this, 8, null);
                if (objReloadMessageListModel$default == objCopydefault) {
                    return objCopydefault;
                }
                r12 = r15;
                r152 = r15;
            } catch (Throwable th2) {
                th = th2;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                r1 = r15;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    pUU.KWHzl("MessageListViewModel", "reload message list: reload completed");
                    return Unit.INSTANCE;
                }
                MessageListViewModel messageListViewModel = (MessageListViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                r13 = messageListViewModel;
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                r1 = r13;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (r1.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                pUU.KWHzl("MessageListViewModel", "reload message list: reload completed");
                return Unit.INSTANCE;
            }
            MessageListViewModel messageListViewModel2 = (MessageListViewModel) this.L$1;
            MessageListViewModel messageListViewModel3 = (MessageListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r152 = messageListViewModel3;
            objReloadMessageListModel$default = obj;
            r12 = messageListViewModel2;
        }
        pUU.EZpvd("MessageListViewModel", "reloadMessageListModel setMessageListModel");
        MessageListViewModel.ActionBar actionBar = new MessageListViewModel.ActionBar((C36558odI) objReloadMessageListModel$default, C56443yFo.AEQbTJ(0));
        this.L$0 = r12;
        this.L$1 = null;
        this.label = 2;
        r13 = r12;
        if (r152.EZpvd(actionBar, (Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        r1 = r13;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (r1.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
        }
        pUU.KWHzl("MessageListViewModel", "reload message list: reload completed");
        return Unit.INSTANCE;
    }
}
