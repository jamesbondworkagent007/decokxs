package com.okinc.im.imui.messageV2.view.messagelist;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C32989mnw;
import o.C36558odI;
import o.C36588odm;
import o.C36593odr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oEZ;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$onScrollToEndClicked$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$onScrollToEndClicked$1(MessageListViewModel messageListViewModel, Continuation<? super MessageListViewModel$onScrollToEndClicked$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$onScrollToEndClicked$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$onScrollToEndClicked$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x00d0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x000e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x002b, B:39:0x00c8, B:16:0x0034, B:31:0x0087, B:33:0x008f, B:36:0x00aa), top: B:51:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x002b, B:39:0x00c8, B:16:0x0034, B:31:0x0087, B:33:0x008f, B:36:0x00aa), top: B:51:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r8;
        ?? r1;
        MutableLiveData mutableLiveData;
        Boolean boolKWHzl;
        MessageListViewModel.ActionBar actionBar;
        ?? r12;
        oEZ.Activity activity;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r13 = this.label;
        try {
        } catch (Throwable th) {
            th = th;
            r8 = r13;
        }
        if (r13 == 0) {
            C56391yDq.AEQbTJ(obj);
            actionBar = this.this$0.AkhnZx;
            if (actionBar != null) {
                MessageListViewModel messageListViewModel = this.this$0;
                MutableLiveData mutableLiveData2 = messageListViewModel.AYXKKw;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.L$0 = messageListViewModel;
                this.L$1 = actionBar;
                this.label = 1;
                if (C36588odm.KWHzl(mutableLiveData2, boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                r8 = messageListViewModel;
                Result.Application application = Result.Companion;
                pUU.EZpvd("MessageListViewModel", "onScrollToEndClicked processing");
                C36593odr c36593odr = r8.QVAiDq;
                C36558odI c36558odIKWHzl = actionBar.KWHzl();
                this.L$0 = r8;
                this.L$1 = null;
                this.label = 2;
                obj = c36593odr.EZpvd(c36558odIKWHzl, this);
                if (obj != objCopydefault) {
                }
            }
        } else if (r13 == 1) {
            actionBar = (MessageListViewModel.ActionBar) this.L$1;
            MessageListViewModel messageListViewModel2 = (MessageListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r8 = messageListViewModel2;
            try {
                Result.Application application2 = Result.Companion;
                pUU.EZpvd("MessageListViewModel", "onScrollToEndClicked processing");
                C36593odr c36593odr2 = r8.QVAiDq;
                C36558odI c36558odIKWHzl2 = actionBar.KWHzl();
                this.L$0 = r8;
                this.L$1 = null;
                this.label = 2;
                obj = c36593odr2.EZpvd(c36558odIKWHzl2, this);
            } catch (Throwable th2) {
                th = th2;
                Result.Application application3 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                r1 = r8;
            }
            if (obj != objCopydefault) {
                return objCopydefault;
            }
            r12 = r8;
            activity = (oEZ.Activity) obj;
            if (activity.EZpvd()) {
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
            r1 = r13;
            mutableLiveData = r1.AYXKKw;
            boolKWHzl = C56443yFo.KWHzl(false);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 5;
            if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
            }
        } else if (r13 == 2) {
            MessageListViewModel messageListViewModel3 = (MessageListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r12 = messageListViewModel3;
            activity = (oEZ.Activity) obj;
            if (activity.EZpvd()) {
                pUU.EZpvd("MessageListViewModel", "onScrollToEndClicked => just scroll to end");
                MutableLiveData mutableLiveData3 = r12.EZpvd;
                C32989mnw c32989mnw = new C32989mnw(MessageListViewModel.Application.Activity.OLrzqt);
                this.L$0 = r12;
                this.label = 3;
                r13 = r12;
                if (C36588odm.KWHzl(mutableLiveData3, c32989mnw, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                pUU.EZpvd("MessageListViewModel", "onScrollToEndClicked => Update model and scroll to end");
                MessageListViewModel.ActionBar actionBar2 = new MessageListViewModel.ActionBar(activity.OLrzqt(), C56443yFo.AEQbTJ(6));
                this.L$0 = r12;
                this.label = 4;
                Object objEZpvd = r12.EZpvd(actionBar2, (Continuation<? super Unit>) this);
                r13 = r12;
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
            r1 = r13;
            mutableLiveData = r1.AYXKKw;
            boolKWHzl = C56443yFo.KWHzl(false);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 5;
            if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
            }
        } else if (r13 == 3 || r13 == 4) {
            MessageListViewModel messageListViewModel4 = (MessageListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r13 = messageListViewModel4;
            Result.m7377constructorimpl(Unit.INSTANCE);
            r1 = r13;
            mutableLiveData = r1.AYXKKw;
            boolKWHzl = C56443yFo.KWHzl(false);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 5;
            if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (r13 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
