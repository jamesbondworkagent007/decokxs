package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C36558odI;
import o.C36593odr;
import o.C44469sQz;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$onReceiveReadReceipt$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ C44469sQz $readReceiptEvent;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$onReceiveReadReceipt$1(MessageListViewModel messageListViewModel, C44469sQz c44469sQz, Continuation<? super MessageListViewModel$onReceiveReadReceipt$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
        this.$readReceiptEvent = c44469sQz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$onReceiveReadReceipt$1(this.this$0, this.$readReceiptEvent, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$onReceiveReadReceipt$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:39:0x000c */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[Catch: all -> 0x00bc, TryCatch #0 {all -> 0x00bc, blocks: (B:11:0x0025, B:28:0x00b3, B:30:0x00b7, B:14:0x0036, B:23:0x007f, B:25:0x0083, B:19:0x0065), top: B:39:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        MessageListViewModel messageListViewModel;
        C44469sQz c44469sQz;
        MessageListViewModel messageListViewModel2;
        MessageListViewModel messageListViewModel3;
        C36558odI c36558odI;
        Unit unit;
        MessageListViewModel messageListViewModel4;
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
            MessageListViewModel.ActionBar actionBar = this.this$0.AkhnZx;
            if (actionBar != null) {
                c44469sQz = this.$readReceiptEvent;
                MessageListViewModel messageListViewModel5 = this.this$0;
                pUU.EZpvd("MessageListViewModel", "onReceiveReadReceipt processing - seq:" + c44469sQz.copydefault().getSeq());
                Result.Application application2 = Result.Companion;
                C36593odr c36593odr = messageListViewModel5.QVAiDq;
                C36558odI c36558odIKWHzl = actionBar.KWHzl();
                this.L$0 = c44469sQz;
                this.L$1 = messageListViewModel5;
                this.L$2 = messageListViewModel5;
                this.label = 1;
                obj = c36593odr.AEQbTJ(c36558odIKWHzl, c44469sQz, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                messageListViewModel2 = messageListViewModel5;
                messageListViewModel3 = messageListViewModel5;
                c36558odI = (C36558odI) obj;
                if (c36558odI != null) {
                }
            }
        } else if (i == 1) {
            MessageListViewModel messageListViewModel6 = (MessageListViewModel) this.L$2;
            MessageListViewModel messageListViewModel7 = (MessageListViewModel) this.L$1;
            c44469sQz = (C44469sQz) this.L$0;
            C56391yDq.AEQbTJ(obj);
            messageListViewModel3 = messageListViewModel6;
            messageListViewModel2 = messageListViewModel7;
            c36558odI = (C36558odI) obj;
            if (c36558odI != null) {
                unit = null;
                i = messageListViewModel3;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                messageListViewModel = i;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (messageListViewModel.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                }
            } else {
                pUU.EZpvd("MessageListViewModel", "onReceiveReadReceipt setMessageListModel - seq:" + c44469sQz.copydefault().getSeq());
                MessageListViewModel.ActionBar actionBar2 = new MessageListViewModel.ActionBar(c36558odI, null);
                this.L$0 = messageListViewModel3;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                messageListViewModel4 = messageListViewModel3;
                if (messageListViewModel2.EZpvd(actionBar2, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                unit = Unit.INSTANCE;
                i = messageListViewModel4;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                messageListViewModel = i;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (messageListViewModel.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                }
            }
        } else if (i == 2) {
            MessageListViewModel messageListViewModel8 = (MessageListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            messageListViewModel4 = messageListViewModel8;
            unit = Unit.INSTANCE;
            i = messageListViewModel4;
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
            messageListViewModel = i;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
            if (messageListViewModel.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
