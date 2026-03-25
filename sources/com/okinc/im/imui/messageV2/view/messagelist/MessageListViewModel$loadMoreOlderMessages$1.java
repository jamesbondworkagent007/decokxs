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
public final class MessageListViewModel$loadMoreOlderMessages$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$loadMoreOlderMessages$1(MessageListViewModel messageListViewModel, Continuation<? super MessageListViewModel$loadMoreOlderMessages$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$loadMoreOlderMessages$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$loadMoreOlderMessages$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MessageListViewModel messageListViewModel;
        MessageListViewModel.ActionBar actionBar;
        C36558odI c36558odIKWHzl;
        MessageListViewModel messageListViewModel2;
        MessageListViewModel messageListViewModel3;
        MessageListViewModel.ActionBar actionBar2;
        Object objM7377constructorimpl;
        MessageListViewModel messageListViewModel4;
        MessageListViewModel messageListViewModel5;
        MutableLiveData mutableLiveData;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MessageListViewModel.ActionBar actionBar3 = this.this$0.AkhnZx;
                if (actionBar3 != null) {
                    MessageListViewModel messageListViewModel6 = this.this$0;
                    MessageListViewModel.ActionBar value = messageListViewModel6.AhwBna().getValue();
                    if (value == null || (c36558odIKWHzl = value.KWHzl()) == null || c36558odIKWHzl.EZpvd()) {
                        MutableLiveData mutableLiveData2 = messageListViewModel6.gEmmrt;
                        Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                        this.L$0 = messageListViewModel6;
                        this.L$1 = actionBar3;
                        this.label = 2;
                        if (C36588odm.KWHzl(mutableLiveData2, boolKWHzl2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        messageListViewModel = messageListViewModel6;
                        actionBar = actionBar3;
                        try {
                            Result.Application application = Result.Companion;
                            pUU.EZpvd("MessageListViewModel", "loadMoreOlderMessages processing");
                            C36593odr c36593odr = messageListViewModel.QVAiDq;
                            C36558odI c36558odIKWHzl2 = actionBar.KWHzl();
                            this.L$0 = messageListViewModel;
                            this.L$1 = messageListViewModel;
                            this.label = 3;
                            obj = c36593odr.OLrzqt(c36558odIKWHzl2, this);
                        } catch (Throwable th) {
                            th = th;
                            messageListViewModel2 = messageListViewModel;
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        if (obj != objCopydefault) {
                            return objCopydefault;
                        }
                        messageListViewModel3 = messageListViewModel;
                        pUU.EZpvd("MessageListViewModel", "loadMoreOlderMessages setMessageListModel");
                        actionBar2 = new MessageListViewModel.ActionBar((C36558odI) obj, null);
                        this.L$0 = messageListViewModel3;
                        this.L$1 = messageListViewModel;
                        this.label = 4;
                        if (messageListViewModel3.EZpvd(actionBar2, (Continuation<? super Unit>) this) != objCopydefault) {
                            return objCopydefault;
                        }
                        messageListViewModel2 = messageListViewModel3;
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        MessageListViewModel messageListViewModel7 = messageListViewModel2;
                        messageListViewModel4 = messageListViewModel;
                        messageListViewModel5 = messageListViewModel7;
                        this.L$0 = messageListViewModel5;
                        this.L$1 = null;
                        this.label = 5;
                        if (messageListViewModel4.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                        mutableLiveData = messageListViewModel5.gEmmrt;
                        boolKWHzl = C56443yFo.KWHzl(false);
                        this.L$0 = null;
                        this.label = 6;
                        if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        pUU.EZpvd("MessageListViewModel", "loadMoreOlderMessages: hasOlderMessage = false");
                        messageListViewModel6.sSMYrx = false;
                        MutableLiveData mutableLiveData3 = messageListViewModel6.gEmmrt;
                        Boolean boolKWHzl3 = C56443yFo.KWHzl(false);
                        this.label = 1;
                        if (C36588odm.KWHzl(mutableLiveData3, boolKWHzl3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                }
                this.this$0.sSMYrx = false;
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 2:
                MessageListViewModel.ActionBar actionBar4 = (MessageListViewModel.ActionBar) this.L$1;
                MessageListViewModel messageListViewModel8 = (MessageListViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                actionBar = actionBar4;
                messageListViewModel = messageListViewModel8;
                Result.Application application3 = Result.Companion;
                pUU.EZpvd("MessageListViewModel", "loadMoreOlderMessages processing");
                C36593odr c36593odr2 = messageListViewModel.QVAiDq;
                C36558odI c36558odIKWHzl22 = actionBar.KWHzl();
                this.L$0 = messageListViewModel;
                this.L$1 = messageListViewModel;
                this.label = 3;
                obj = c36593odr2.OLrzqt(c36558odIKWHzl22, this);
                if (obj != objCopydefault) {
                }
                break;
            case 3:
                messageListViewModel = (MessageListViewModel) this.L$1;
                messageListViewModel3 = (MessageListViewModel) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    pUU.EZpvd("MessageListViewModel", "loadMoreOlderMessages setMessageListModel");
                    actionBar2 = new MessageListViewModel.ActionBar((C36558odI) obj, null);
                    this.L$0 = messageListViewModel3;
                    this.L$1 = messageListViewModel;
                    this.label = 4;
                    if (messageListViewModel3.EZpvd(actionBar2, (Continuation<? super Unit>) this) != objCopydefault) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    messageListViewModel2 = messageListViewModel3;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    break;
                }
                break;
            case 4:
                messageListViewModel = (MessageListViewModel) this.L$1;
                messageListViewModel2 = (MessageListViewModel) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    break;
                } catch (Throwable th3) {
                    th = th3;
                    Result.Application application222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                MessageListViewModel messageListViewModel72 = messageListViewModel2;
                messageListViewModel4 = messageListViewModel;
                messageListViewModel5 = messageListViewModel72;
                this.L$0 = messageListViewModel5;
                this.L$1 = null;
                this.label = 5;
                if (messageListViewModel4.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                }
                mutableLiveData = messageListViewModel5.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 6;
                if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
                }
                this.this$0.sSMYrx = false;
                return Unit.INSTANCE;
            case 5:
                messageListViewModel5 = (MessageListViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableLiveData = messageListViewModel5.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = null;
                this.label = 6;
                if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
                }
                this.this$0.sSMYrx = false;
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                this.this$0.sSMYrx = false;
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
