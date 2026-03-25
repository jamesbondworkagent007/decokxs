package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C36558odI;
import o.C36593odr;
import o.C44468sQy;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$onSendMessage$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ C44468sQy $sendEvent;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$onSendMessage$1(MessageListViewModel messageListViewModel, C44468sQy c44468sQy, Continuation<? super MessageListViewModel$onSendMessage$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
        this.$sendEvent = c44468sQy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$onSendMessage$1(this.this$0, this.$sendEvent, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$onSendMessage$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x0164 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x0011 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #1 {all -> 0x0075, blocks: (B:26:0x006e, B:37:0x00d7, B:39:0x00db), top: B:69:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:21:0x0056, B:43:0x00ec, B:46:0x00f7), top: B:73:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180 A[RETURN] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r11;
        Object objM7377constructorimpl;
        ?? r3;
        C44468sQy c44468sQy;
        Object objEZpvd;
        ?? r9;
        ?? r112;
        C36558odI c36558odI;
        ?? r8;
        ?? r92;
        C44468sQy c44468sQy2;
        C36558odI c36558odI2;
        Object objEZpvd2;
        ?? r82;
        ?? r93;
        Unit unit;
        ?? r32;
        ?? r4;
        Integer error;
        ?? r33;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        ?? r34 = "MessageListViewModel";
        try {
        } catch (Throwable th) {
            th = th;
            r11 = r34;
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MessageListViewModel.ActionBar actionBar = this.this$0.AkhnZx;
            if (actionBar != null) {
                r11 = this.this$0;
                c44468sQy = this.$sendEvent;
                try {
                    Result.Application application = Result.Companion;
                    pUU.EZpvd("MessageListViewModel", "onSendMessage processing - sendEvent:" + c44468sQy.OLrzqt() + ", seq:" + c44468sQy.EZpvd().getSeq() + ", clientMsgId: " + c44468sQy.EZpvd().getClientMessageId());
                    C36593odr c36593odr = r11.QVAiDq;
                    C36558odI c36558odIKWHzl = actionBar.KWHzl();
                    this.L$0 = r11;
                    this.L$1 = c44468sQy;
                    this.L$2 = r11;
                    this.label = 1;
                    objEZpvd = c36593odr.EZpvd(c36558odIKWHzl, c44468sQy, this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    r9 = r11;
                    r112 = r11;
                    c36558odI = (C36558odI) objEZpvd;
                    if (c36558odI == null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    r3 = r11;
                }
            }
        } else if (i == 1) {
            r9 = (MessageListViewModel) this.L$2;
            C44468sQy c44468sQy3 = (C44468sQy) this.L$1;
            MessageListViewModel messageListViewModel = (MessageListViewModel) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                c44468sQy = c44468sQy3;
                objEZpvd = obj;
                r9 = r9;
                r112 = messageListViewModel;
                c36558odI = (C36558odI) objEZpvd;
                if (c36558odI == null) {
                    this.L$0 = r112;
                    this.L$1 = c44468sQy;
                    this.L$2 = r9;
                    this.label = 2;
                    objEZpvd2 = r112.EZpvd(c36558odI, (Continuation<? super C36558odI>) this);
                    if (objEZpvd2 == objCopydefault) {
                        return objCopydefault;
                    }
                    r82 = r9;
                    r93 = r112;
                    c36558odI2 = (C36558odI) objEZpvd2;
                    c44468sQy2 = c44468sQy;
                    r8 = r82;
                    r92 = r93;
                    if (c36558odI2 != null) {
                    }
                } else {
                    r8 = r9;
                    r92 = r112;
                    c44468sQy2 = c44468sQy;
                    c36558odI2 = null;
                    if (c36558odI2 != null) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r11 = r9;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                r3 = r11;
            }
        } else if (i == 2) {
            r8 = (MessageListViewModel) this.L$2;
            C44468sQy c44468sQy4 = (C44468sQy) this.L$1;
            MessageListViewModel messageListViewModel2 = (MessageListViewModel) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                c44468sQy = c44468sQy4;
                objEZpvd2 = obj;
                r82 = r8;
                r93 = messageListViewModel2;
                c36558odI2 = (C36558odI) objEZpvd2;
                c44468sQy2 = c44468sQy;
                r8 = r82;
                r92 = r93;
            } catch (Throwable th4) {
                th = th4;
                r11 = r8;
                Result.Application application222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                r3 = r11;
            }
            if (c36558odI2 != null) {
                Integer numAEQbTJ = r92.AEQbTJ(c36558odI2);
                C36558odI c36558odICopydefault = r92.copydefault(c36558odI2);
                pUU.EZpvd("MessageListViewModel", "onSendMessage set message list- sendEvent:" + c44468sQy2.OLrzqt() + ", seq:" + c44468sQy2.EZpvd().getSeq());
                MessageListViewModel.ActionBar actionBar2 = new MessageListViewModel.ActionBar(c36558odICopydefault, numAEQbTJ);
                this.L$0 = r92;
                this.L$1 = c44468sQy2;
                this.L$2 = r8;
                this.label = 3;
                if (r92.EZpvd(actionBar2, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                r32 = r8;
                r4 = r92;
                error = c44468sQy2.EZpvd().getError();
                this.L$0 = r32;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                r33 = r32;
                if (r4.EZpvd(error, (Continuation<? super Unit>) this) == objCopydefault) {
                }
                unit = Unit.INSTANCE;
                r34 = r33;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                r3 = r34;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 5;
                if (r3.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                }
            } else {
                r34 = r8;
                unit = null;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                r3 = r34;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 5;
                if (r3.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                }
            }
        } else if (i == 3) {
            MessageListViewModel messageListViewModel3 = (MessageListViewModel) this.L$2;
            c44468sQy2 = (C44468sQy) this.L$1;
            MessageListViewModel messageListViewModel4 = (MessageListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r32 = messageListViewModel3;
            r4 = messageListViewModel4;
            error = c44468sQy2.EZpvd().getError();
            this.L$0 = r32;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 4;
            r33 = r32;
            if (r4.EZpvd(error, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
            unit = Unit.INSTANCE;
            r34 = r33;
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
            r3 = r34;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 5;
            if (r3.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
            }
        } else if (i == 4) {
            MessageListViewModel messageListViewModel5 = (MessageListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r33 = messageListViewModel5;
            unit = Unit.INSTANCE;
            r34 = r33;
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
            r3 = r34;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 5;
            if (r3.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
