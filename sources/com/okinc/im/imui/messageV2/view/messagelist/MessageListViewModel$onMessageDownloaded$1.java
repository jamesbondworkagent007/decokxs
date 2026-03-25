package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C36558odI;
import o.C36593odr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$onMessageDownloaded$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ List<OKMessage> $messages;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$onMessageDownloaded$1(MessageListViewModel messageListViewModel, List<OKMessage> list, Continuation<? super MessageListViewModel$onMessageDownloaded$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
        this.$messages = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$onMessageDownloaded$1(this.this$0, this.$messages, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$onMessageDownloaded$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x000e */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc A[Catch: all -> 0x00fd, LOOP:0: B:29:0x00b6->B:31:0x00bc, LOOP_END, TryCatch #0 {all -> 0x00fd, blocks: (B:11:0x0027, B:35:0x00f6, B:14:0x0038, B:28:0x00a7, B:29:0x00b6, B:31:0x00bc, B:32:0x00ce, B:20:0x0054, B:21:0x0063, B:23:0x0069, B:24:0x007b), top: B:44:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        MessageListViewModel messageListViewModel;
        List<OKMessage> list;
        MessageListViewModel messageListViewModel2;
        MessageListViewModel messageListViewModel3;
        Iterator<T> it;
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
            if (actionBar2 == null) {
                this.this$0.EZpvd(this.$messages);
                return Unit.INSTANCE;
            }
            MessageListViewModel messageListViewModel4 = this.this$0;
            list = this.$messages;
            Result.Application application2 = Result.Companion;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C56443yFo.KWHzl(((OKMessage) it2.next()).getSeq()));
            }
            pUU.EZpvd("MessageListViewModel", "onMessageDownloaded processing - seq:" + arrayList);
            C36593odr c36593odr = messageListViewModel4.QVAiDq;
            C36558odI c36558odIKWHzl = actionBar2.KWHzl();
            this.L$0 = list;
            this.L$1 = messageListViewModel4;
            this.L$2 = messageListViewModel4;
            this.label = 1;
            obj = c36593odr.EZpvd(c36558odIKWHzl, list, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            messageListViewModel2 = messageListViewModel4;
            messageListViewModel3 = messageListViewModel4;
            C36558odI c36558odI = (C36558odI) obj;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
            }
            pUU.EZpvd("MessageListViewModel", "onMessageDownloaded setMessageListModel - seq:" + arrayList2);
            actionBar = new MessageListViewModel.ActionBar(c36558odI, null);
            this.L$0 = messageListViewModel3;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            i = messageListViewModel3;
            if (messageListViewModel2.EZpvd(actionBar, (Continuation<? super Unit>) this) == objCopydefault) {
            }
        } else if (i == 1) {
            MessageListViewModel messageListViewModel5 = (MessageListViewModel) this.L$2;
            MessageListViewModel messageListViewModel6 = (MessageListViewModel) this.L$1;
            list = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            messageListViewModel3 = messageListViewModel5;
            messageListViewModel2 = messageListViewModel6;
            C36558odI c36558odI2 = (C36558odI) obj;
            ArrayList arrayList22 = new ArrayList(C56403yEb.AYXKKw(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList22.add(C56443yFo.KWHzl(((OKMessage) it.next()).getSeq()));
            }
            pUU.EZpvd("MessageListViewModel", "onMessageDownloaded setMessageListModel - seq:" + arrayList22);
            actionBar = new MessageListViewModel.ActionBar(c36558odI2, null);
            this.L$0 = messageListViewModel3;
            this.L$1 = null;
            this.L$2 = null;
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
        this.L$2 = null;
        this.label = 3;
        if (messageListViewModel.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
