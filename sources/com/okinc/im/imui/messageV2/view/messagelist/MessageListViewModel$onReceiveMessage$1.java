package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C36558odI;
import o.C36593odr;
import o.C44467sQx;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$onReceiveMessage$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ C44467sQx $receiveEvent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$onReceiveMessage$1(MessageListViewModel messageListViewModel, C44467sQx c44467sQx, Continuation<? super MessageListViewModel$onReceiveMessage$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
        this.$receiveEvent = c44467sQx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$onReceiveMessage$1(this.this$0, this.$receiveEvent, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$onReceiveMessage$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0072 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x000f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1 A[Catch: all -> 0x015c, TryCatch #2 {all -> 0x015c, blocks: (B:37:0x00e4, B:40:0x00f2, B:46:0x0136, B:31:0x00cd, B:33:0x00d1, B:27:0x00b0), top: B:63:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2 A[Catch: all -> 0x015c, TRY_LEAVE, TryCatch #2 {all -> 0x015c, blocks: (B:37:0x00e4, B:40:0x00f2, B:46:0x0136, B:31:0x00cd, B:33:0x00d1, B:27:0x00b0), top: B:63:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136 A[Catch: all -> 0x015c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x015c, blocks: (B:37:0x00e4, B:40:0x00f2, B:46:0x0136, B:31:0x00cd, B:33:0x00d1, B:27:0x00b0), top: B:63:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017b A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r5;
        Object objM7377constructorimpl;
        ?? r4;
        MessageListViewModel.ActionBar actionBar;
        Object objKWHzl;
        C44467sQx c44467sQx;
        MessageListViewModel messageListViewModel;
        ?? r10;
        C36558odI c36558odI;
        MessageListViewModel.ActionBar actionBar2;
        C36558odI c36558odI2;
        MessageListViewModel messageListViewModel2;
        Object objEZpvd;
        MessageListViewModel messageListViewModel3;
        C44467sQx c44467sQx2;
        ?? r102;
        ?? r42;
        ?? r103;
        MessageListViewModel messageListViewModel4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        ?? r43 = 2;
        try {
        } catch (Throwable th) {
            th = th;
            r5 = r43;
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            actionBar = this.this$0.AkhnZx;
            if (actionBar != null) {
                C44467sQx c44467sQx3 = this.$receiveEvent;
                MessageListViewModel messageListViewModel5 = this.this$0;
                pUU.EZpvd("MessageListViewModel", "onReceiveMessage processing - receive msg seq:" + c44467sQx3.copydefault().getSeq() + ", clientMsgId:" + c44467sQx3.copydefault().getClientMessageId());
                try {
                    Result.Application application = Result.Companion;
                    C36593odr c36593odr = messageListViewModel5.QVAiDq;
                    C36558odI c36558odIKWHzl = actionBar.KWHzl();
                    this.L$0 = c44467sQx3;
                    this.L$1 = messageListViewModel5;
                    this.L$2 = messageListViewModel5;
                    this.L$3 = actionBar;
                    this.label = 1;
                    objKWHzl = c36593odr.KWHzl(c36558odIKWHzl, c44467sQx3, this);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    c44467sQx = c44467sQx3;
                    messageListViewModel = messageListViewModel5;
                    r10 = messageListViewModel5;
                    c36558odI = (C36558odI) objKWHzl;
                    if (c36558odI == null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r5 = messageListViewModel5;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    r4 = r5;
                }
            }
        } else if (i == 1) {
            actionBar = (MessageListViewModel.ActionBar) this.L$3;
            r5 = (MessageListViewModel) this.L$2;
            MessageListViewModel messageListViewModel6 = (MessageListViewModel) this.L$1;
            C44467sQx c44467sQx4 = (C44467sQx) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                c44467sQx = c44467sQx4;
                r10 = r5;
                objKWHzl = obj;
                messageListViewModel = messageListViewModel6;
                c36558odI = (C36558odI) objKWHzl;
                if (c36558odI == null) {
                    this.L$0 = c44467sQx;
                    this.L$1 = messageListViewModel;
                    this.L$2 = r10;
                    this.L$3 = actionBar;
                    this.label = 2;
                    objEZpvd = messageListViewModel.EZpvd(c36558odI, (Continuation<? super C36558odI>) this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    messageListViewModel3 = messageListViewModel;
                    c44467sQx2 = c44467sQx;
                    r103 = r10;
                    C36558odI c36558odI3 = (C36558odI) objEZpvd;
                    c44467sQx = c44467sQx2;
                    actionBar2 = actionBar;
                    c36558odI2 = c36558odI3;
                    messageListViewModel2 = messageListViewModel3;
                    r102 = r103;
                    if (c36558odI2 != null) {
                    }
                } else {
                    actionBar2 = actionBar;
                    c36558odI2 = null;
                    messageListViewModel2 = messageListViewModel;
                    r102 = r10;
                    if (c36558odI2 != null) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                r4 = r5;
            }
        } else if (i == 2) {
            actionBar = (MessageListViewModel.ActionBar) this.L$3;
            MessageListViewModel messageListViewModel7 = (MessageListViewModel) this.L$2;
            MessageListViewModel messageListViewModel8 = (MessageListViewModel) this.L$1;
            c44467sQx2 = (C44467sQx) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r103 = messageListViewModel7;
            objEZpvd = obj;
            messageListViewModel3 = messageListViewModel8;
            C36558odI c36558odI32 = (C36558odI) objEZpvd;
            c44467sQx = c44467sQx2;
            actionBar2 = actionBar;
            c36558odI2 = c36558odI32;
            messageListViewModel2 = messageListViewModel3;
            r102 = r103;
            if (c36558odI2 != null) {
                pUU.EZpvd("MessageListViewModel", "onReceiveMessage set message - receive msg seq:" + c44467sQx.copydefault().getSeq());
                MessageListViewModel.ActionBar actionBar3 = new MessageListViewModel.ActionBar(c36558odI2, C56443yFo.AEQbTJ(3));
                this.L$0 = c44467sQx;
                this.L$1 = messageListViewModel2;
                this.L$2 = r102;
                this.L$3 = actionBar2;
                this.L$4 = c36558odI2;
                this.label = 3;
                if (messageListViewModel2.EZpvd(actionBar3, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                r42 = r102;
                messageListViewModel4 = messageListViewModel2;
                OKMessage oKMessageAhwBna = c36558odI2.AhwBna();
                messageListViewModel4.AEQbTJ(oKMessageAhwBna);
                messageListViewModel4.EZpvd(oKMessageAhwBna);
                r43 = r42;
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                r4 = r43;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 4;
                if (r4.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                }
            } else {
                pUU.EZpvd("MessageListViewModel", "onReceiveMessage - No update with receive msg seq:" + c44467sQx.copydefault().getSeq());
                r43 = r102;
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                r4 = r43;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 4;
                if (r4.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                }
            }
        } else if (i == 3) {
            c36558odI2 = (C36558odI) this.L$4;
            MessageListViewModel messageListViewModel9 = (MessageListViewModel) this.L$2;
            MessageListViewModel messageListViewModel10 = (MessageListViewModel) this.L$1;
            C56391yDq.AEQbTJ(obj);
            r42 = messageListViewModel9;
            messageListViewModel4 = messageListViewModel10;
            OKMessage oKMessageAhwBna2 = c36558odI2.AhwBna();
            messageListViewModel4.AEQbTJ(oKMessageAhwBna2);
            messageListViewModel4.EZpvd(oKMessageAhwBna2);
            r43 = r42;
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            r4 = r43;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 4;
            if (r4.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
