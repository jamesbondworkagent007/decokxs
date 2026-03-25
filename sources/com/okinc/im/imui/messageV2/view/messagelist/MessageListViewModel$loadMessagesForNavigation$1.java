package com.okinc.im.imui.messageV2.view.messagelist;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C36558odI;
import o.C36588odm;
import o.C36593odr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$loadMessagesForNavigation$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ long $navigateMessageId;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$loadMessagesForNavigation$1(MessageListViewModel messageListViewModel, long j, Continuation<? super MessageListViewModel$loadMessagesForNavigation$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
        this.$navigateMessageId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$loadMessagesForNavigation$1(this.this$0, this.$navigateMessageId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$loadMessagesForNavigation$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        MessageListViewModel messageListViewModel;
        MessageListViewModel.ActionBar actionBar;
        MessageListViewModel messageListViewModel2;
        MessageListViewModel messageListViewModel3;
        MessageListViewModel.ActionBar actionBar2;
        Object objM7377constructorimpl;
        MessageListViewModel messageListViewModel4;
        MessageListViewModel messageListViewModel5;
        MutableLiveData mutableLiveData;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MessageListViewModel.ActionBar actionBar3 = this.this$0.AkhnZx;
            if (actionBar3 != null) {
                MessageListViewModel messageListViewModel6 = this.this$0;
                long j2 = this.$navigateMessageId;
                MutableLiveData mutableLiveData2 = messageListViewModel6.AYXKKw;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.L$0 = messageListViewModel6;
                this.L$1 = actionBar3;
                this.J$0 = j2;
                this.label = 1;
                if (C36588odm.KWHzl(mutableLiveData2, boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                j = j2;
                messageListViewModel = messageListViewModel6;
                actionBar = actionBar3;
                Result.Application application = Result.Companion;
                pUU.EZpvd("MessageListViewModel", "loadMessagesForNavigation processing - navigateMessageId:" + j);
                C36593odr c36593odr = messageListViewModel.QVAiDq;
                C36558odI c36558odIKWHzl = actionBar.KWHzl();
                this.L$0 = messageListViewModel;
                this.L$1 = messageListViewModel;
                this.J$0 = j;
                this.label = 2;
                obj = c36593odr.copydefault(c36558odIKWHzl, j, this);
                if (obj != objCopydefault) {
                }
            }
        } else if (i == 1) {
            j = this.J$0;
            MessageListViewModel.ActionBar actionBar4 = (MessageListViewModel.ActionBar) this.L$1;
            MessageListViewModel messageListViewModel7 = (MessageListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            actionBar = actionBar4;
            messageListViewModel = messageListViewModel7;
            try {
                Result.Application application2 = Result.Companion;
                pUU.EZpvd("MessageListViewModel", "loadMessagesForNavigation processing - navigateMessageId:" + j);
                C36593odr c36593odr2 = messageListViewModel.QVAiDq;
                C36558odI c36558odIKWHzl2 = actionBar.KWHzl();
                this.L$0 = messageListViewModel;
                this.L$1 = messageListViewModel;
                this.J$0 = j;
                this.label = 2;
                obj = c36593odr2.copydefault(c36558odIKWHzl2, j, this);
                if (obj != objCopydefault) {
                    return objCopydefault;
                }
                messageListViewModel3 = messageListViewModel;
                pUU.EZpvd("MessageListViewModel", "loadMessagesForNavigation setMessageListModel - navigateMessageId:" + j);
                actionBar2 = new MessageListViewModel.ActionBar((C36558odI) obj, C56443yFo.AEQbTJ(2));
                this.L$0 = messageListViewModel3;
                this.L$1 = messageListViewModel;
                this.label = 3;
                if (messageListViewModel3.EZpvd(actionBar2, (Continuation<? super Unit>) this) != objCopydefault) {
                }
            } catch (Throwable th) {
                th = th;
                messageListViewModel2 = messageListViewModel;
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else if (i == 2) {
            j = this.J$0;
            messageListViewModel = (MessageListViewModel) this.L$1;
            messageListViewModel3 = (MessageListViewModel) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("MessageListViewModel", "loadMessagesForNavigation setMessageListModel - navigateMessageId:" + j);
                actionBar2 = new MessageListViewModel.ActionBar((C36558odI) obj, C56443yFo.AEQbTJ(2));
                this.L$0 = messageListViewModel3;
                this.L$1 = messageListViewModel;
                this.label = 3;
            } catch (Throwable th2) {
                th = th2;
                messageListViewModel2 = messageListViewModel3;
                Result.Application application32 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (messageListViewModel3.EZpvd(actionBar2, (Continuation<? super Unit>) this) != objCopydefault) {
                return objCopydefault;
            }
            messageListViewModel2 = messageListViewModel3;
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            MessageListViewModel messageListViewModel8 = messageListViewModel2;
            messageListViewModel4 = messageListViewModel;
            messageListViewModel5 = messageListViewModel8;
            this.L$0 = messageListViewModel5;
            this.L$1 = null;
            this.label = 4;
            if (messageListViewModel4.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
            }
            mutableLiveData = messageListViewModel5.AYXKKw;
            boolKWHzl = C56443yFo.KWHzl(false);
            this.L$0 = null;
            this.label = 5;
            if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
            }
        } else if (i == 3) {
            messageListViewModel = (MessageListViewModel) this.L$1;
            messageListViewModel2 = (MessageListViewModel) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                th = th3;
                Result.Application application322 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            MessageListViewModel messageListViewModel82 = messageListViewModel2;
            messageListViewModel4 = messageListViewModel;
            messageListViewModel5 = messageListViewModel82;
            this.L$0 = messageListViewModel5;
            this.L$1 = null;
            this.label = 4;
            if (messageListViewModel4.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
            mutableLiveData = messageListViewModel5.AYXKKw;
            boolKWHzl = C56443yFo.KWHzl(false);
            this.L$0 = null;
            this.label = 5;
            if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
            }
        } else if (i == 4) {
            messageListViewModel5 = (MessageListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            mutableLiveData = messageListViewModel5.AYXKKw;
            boolKWHzl = C56443yFo.KWHzl(false);
            this.L$0 = null;
            this.label = 5;
            if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
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
