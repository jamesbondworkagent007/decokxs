package com.okinc.im.imui.conversationlist.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.nGA;
import o.oCD;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListViewModel$markOrbitNotificationAsRead$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $localOnly;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListViewModel$markOrbitNotificationAsRead$1(ConversationListViewModel conversationListViewModel, boolean z, Continuation<? super ConversationListViewModel$markOrbitNotificationAsRead$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListViewModel;
        this.$localOnly = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConversationListViewModel$markOrbitNotificationAsRead$1 conversationListViewModel$markOrbitNotificationAsRead$1 = new ConversationListViewModel$markOrbitNotificationAsRead$1(this.this$0, this.$localOnly, continuation);
        conversationListViewModel$markOrbitNotificationAsRead$1.L$0 = obj;
        return conversationListViewModel$markOrbitNotificationAsRead$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListViewModel$markOrbitNotificationAsRead$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ConversationListViewModel conversationListViewModel = this.this$0;
                boolean z = this.$localOnly;
                Result.Application application = Result.Companion;
                oCD ocd = conversationListViewModel.RJOkX;
                this.label = 1;
                objEZpvd = ocd.EZpvd(z, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Result.m7376boximpl(objEZpvd));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        ConversationListViewModel conversationListViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(((Result) objM7377constructorimpl).m7386unboximpl());
            if (thM7380exceptionOrNullimpl2 != null) {
                pUU.copydefault("ConversationListViewModel", "markOrbitNotificationAsRead failed: " + thM7380exceptionOrNullimpl2 + ".message");
                String message = thM7380exceptionOrNullimpl2.getMessage();
                if (message != null) {
                    conversationListViewModel2.AuCTelauCTel().setValue(new C32989mnw<>(new nGA.Dialog(message)));
                }
            }
        } else {
            String message2 = thM7380exceptionOrNullimpl.getMessage();
            if (message2 != null) {
                conversationListViewModel2.AuCTelauCTel().setValue(new C32989mnw<>(new nGA.Dialog(message2)));
            }
        }
        return Unit.INSTANCE;
    }
}
